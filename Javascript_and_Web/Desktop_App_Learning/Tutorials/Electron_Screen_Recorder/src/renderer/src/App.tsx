import "bulma/css/bulma.css"; // using bulma for styling (https://bulma.io/)

function App(): JSX.Element {
  // MediaStream object holds the video stream to be recorded.
  let stream: MediaStream;

  // Using the MediaRecorder API to record the video stream.
  let mediaRecorder: MediaRecorder;
  const recordedChunks: Blob[] = [];

  return (
    <div className="App p-3 is-flex is-flex-direction-column">
      <div className="heading-area has-text-centered">
        <h1 className="title">Screen Recorder</h1>
        <h2 className="subtitle">A simple screen recorder made with electron.</h2>
      </div>

      <video
        className="video-display is-align-self-center mt-4 mb-4"
        id="video-display"
        style={{ width: "70%", height: "50%", border: "1px solid black" }}
      ></video>

      <div className="buttons is-flex is-flex-direction-column">
        <div className="row-1">
          <button
            className="button is-success"
            id="start-button"
            onClick={() => {
              mediaRecorder.start();
            }}
          >
            Start Recording
          </button>
          <button
            className="button is-danger"
            id="stop-button"
            onClick={() => {
              mediaRecorder.stop();
            }}
          >
            Stop Recording
          </button>
        </div>
        <div className="row-2">
          <button className="button is-text" id="video-selection-button" onClick={getVideoSources}>
            Choose a video source
          </button>
        </div>
      </div>
    </div>
  );

  // Call an IPC event to get and display the available video sources.
  async function getVideoSources(): Promise<void> {
    window.electron.ipcRenderer.send("display-video-sources");

    // Listen for when a video source is selected.
    window.electron.ipcRenderer.on(
      "video-source-selected",
      async (event, sourceName: string, sourceId: string): Promise<void> => {
        const videoElement: HTMLVideoElement = document.getElementById(
          "video-display"
        ) as HTMLVideoElement;

        const videoSelectionButton: HTMLButtonElement = document.getElementById(
          "video-selection-button"
        ) as HTMLButtonElement;

        // set the video selection button text to the selected source name.
        videoSelectionButton.textContent = sourceName;

        // Define constraints for the media stream.
        const constraints: MediaStreamConstraints = {
          audio: false,
          video: {
            // @ts-ignore (property does in fact exist on type)
            mandatory: {
              chromeMediaSource: "desktop",
              chromeMediaSourceId: sourceId
            }
          }
        };

        // Create the video stream and display it.
        // (navigator is a global object in the browser, just like window, so it's available in the renderer process).
        stream = await navigator.mediaDevices.getUserMedia(constraints);
        videoElement.srcObject = stream;
        videoElement.play().catch(() => {
          // Interrupted error expected when switching video sources.
        });

        setupMediaRecorder();
      }
    );
  }

  // Setup the media recorder and its event listeners.
  function setupMediaRecorder(): void {
    const options = { mimeType: "video/webm; codecs=vp9" };
    mediaRecorder = new MediaRecorder(stream, options);

    // Captures all recorded chunks.
    mediaRecorder.ondataavailable = (event): void => {
      recordedChunks.push(event.data);
    };

    // Listener to stop the recording.
    mediaRecorder.onstop = handleStop;
  }

  // Saves the video file on stop
  async function handleStop(): Promise<void> {
    console.log(recordedChunks);

    // A blob is a data structure to handle raw data, like an image or video.
    const blob = new Blob(recordedChunks, {
      type: "video/webm; codecs=vp9"
    });

    window.electron.ipcRenderer.send("save-video", await blob.arrayBuffer());
  }
}

export default App;
