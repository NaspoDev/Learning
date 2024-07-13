import { contextBridge } from "electron";
import { electronAPI } from "@electron-toolkit/preload";
import os from "os";
import path from "path";

/*
The render process runs web pages, and therefore does not have access to Node.js modules. 
Should we need to provide the render process with access to Node.js modules, 
we can use the preload script to bridge that gap.
*/

// Custom APIs for renderer
// Is it best practice to expose only the exact functions that you need.
// So for example, I don't expose the entire os module, just the os.homedir() method.
const api = {
  // Example: here I am exposing the os module's os.homedir() method to the renderer process.
  // I am also exposing the path module's path.join() method to the renderer process.
  homedir: (): string => os.homedir(),
  join: (...args): string => path.join(...args)
};

// Use `contextBridge` APIs to expose Electron APIs to
// renderer only if context isolation is enabled, otherwise
// just add to the DOM global.
if (process.contextIsolated) {
  try {
    contextBridge.exposeInMainWorld("electron", electronAPI);
    contextBridge.exposeInMainWorld("api", api);
  } catch (error) {
    console.error(error);
  }
} else {
  // @ts-ignore (define in dts)
  window.electron = electronAPI;
  // @ts-ignore (define in dts)
  window.api = api;
}
