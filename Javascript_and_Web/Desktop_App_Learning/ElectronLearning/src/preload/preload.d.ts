import { ElectronAPI } from "@electron-toolkit/preload";

/*
 Because we're making our Electron app with Typescript, you'll want to 
 add types to your APIs exposed over the context bridge. The renderer's 
 window object won't have the correct typings unless you extend 
 the types with a declaration file.
*/
declare global {
  interface Window {
    electron: ElectronAPI;
    api: {
      homedir: () => string;
      join: (...args: string[]) => string;
    };
  }
}
