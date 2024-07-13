// Handles all IPC for the main process.

import { ipcMain, desktopCapturer, Menu, dialog } from "electron";
import { writeFile } from "fs";

// Initialize IPC event listeners and handlers.
export default function initializeListeners(): void {
  // Get and display the available video sources by
  // creating a Menu from them.
  ipcMain.on("display-video-sources", async (event: Electron.IpcMainEvent): Promise<void> => {
    let videoSources: Electron.DesktopCapturerSource[] = [];

    // Get the available video sources.
    await desktopCapturer
      .getSources({ types: ["window", "screen"] })
      .then((sources) => (videoSources = sources))
      .catch((error) => console.error(error));

    // Create a Menu from the video sources.
    const videoSourcesMenu = Menu.buildFromTemplate(
      videoSources.map((source) => {
        // buildFromTemplate expects an array of MenuItem objects.
        // A MenuItem is an object with a click property, and
        // we've also given a label property.
        return {
          label: source.name,
          click: (): void => {
            // When a video source is selected, send back the source name.
            event.sender.send("video-source-selected", source.name, source.id);
          }
        };
      })
    );

    // Display the Menu.
    videoSourcesMenu.popup();
  });

  ipcMain.on("save-video", async (event, arrayBuffer: ArrayBuffer): Promise<void> => {
    // A buffer is also a data structure to handle raw data.
    const buffer: Buffer = Buffer.from(await arrayBuffer);

    const { filePath } = await dialog.showSaveDialog({
      buttonLabel: "Save Video",
      defaultPath: `vid-${Date.now()}.webm`
    });

    console.log(filePath);

    // If filePath is defined, write the file.
    if (filePath) {
      writeFile(filePath, buffer, () => console.log("Video successfully saved!"));
    }
  });
}
