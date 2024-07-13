function PathDisplay(): JSX.Element {
  return (
    <div className="path-display">
      <p>{window.api.homedir()}</p>
    </div>
  );
}

export default PathDisplay;
