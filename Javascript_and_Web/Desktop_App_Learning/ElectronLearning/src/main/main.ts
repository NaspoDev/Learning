// main.ts is the entry point to our main process

// app is used to control the lifecycle of our app, and it uses an event-based api.
// BrowserWindow is used to create and control browser windows.
// shell is used to manage files and URLs using their default applications.
// ipcMain is used to communicate asynchronously from the main process to renderer processes.
import { app, shell, BrowserWindow, ipcMain } from "electron";
// import join method from the path module. The join method joins paths.
import { join } from "path";
// Import the electron-toolkit/utils package. This package contains utilities for working with Electron.
import { electronApp, optimizer, is } from "@electron-toolkit/utils";
import icon from "../../resources/icon.png?asset";

// The createWindow function creates a new browser window.
function createWindow(): void {
  // Create the browser window.
  // mainWindow is our application's main window.
  const mainWindow = new BrowserWindow({
    width: 900,
    height: 670,
    show: false,
    autoHideMenuBar: true,
    ...(process.platform === "linux" ? { icon } : {}),
    webPreferences: {
      preload: join(__dirname, "../preload/preload.js"),
      sandbox: false
    }
  });

  // Load the index.html of the app.
  // We are waiting until everything is rendered before showing the window, to avoid flickering.
  // This provides a better user experience, especially for native apps.
  // https://www.electronjs.org/docs/latest/api/browser-window#showing-the-window-gracefully
  mainWindow.on("ready-to-show", () => {
    mainWindow.show();
  });

  // webContents manages web pages in a BrowserWindow.
  // Here we are setting the windowOpenHandler to open external URLs in the default browser.
  // We are intercepting the window.open event and using the shell module to open the URL in the default browser.
  // (details is an object that contains the URL that is trying to be opened).
  mainWindow.webContents.setWindowOpenHandler((details) => {
    shell.openExternal(details.url);
    return { action: "deny" };
  });

  // HMR for renderer base on electron-vite cli.
  // Load the remote URL for development or the local html file for production.
  if (is.dev && process.env["ELECTRON_RENDERER_URL"]) {
    mainWindow.loadURL(process.env["ELECTRON_RENDERER_URL"]);
  } else {
    mainWindow.loadFile(join(__dirname, "../renderer/index.html"));
  }
}

// This method will be called when Electron has finished
// initialization and is ready to create browser windows.
// Some APIs can only be used after this event occurs.
app.whenReady().then(() => {
  // Set app user model id for windows
  electronApp.setAppUserModelId("com.electron");

  // Default open or close DevTools by F12 in development
  // and ignore CommandOrControl + R in production.
  // see https://github.com/alex8088/electron-toolkit/tree/master/packages/utils
  app.on("browser-window-created", (_, window) => {
    optimizer.watchWindowShortcuts(window);
  });

  // IPC test
  ipcMain.on("ping", () => console.log("pong"));

  createWindow();

  // Triggered when the application is activated (macOS only).
  // If no windows are open, we create a new one.
  app.on("activate", function () {
    // On macOS it's common to re-create a window in the app when the
    // dock icon is clicked and there are no other windows open.
    if (BrowserWindow.getAllWindows().length === 0) createWindow();
  });
});

// Quit when all windows are closed, except on macOS. There, it's common
// for applications and their menu bar to stay active until the user quits
// explicitly with Cmd + Q.
app.on("window-all-closed", () => {
  // "darwin" is the platform value for macOS.
  if (process.platform !== "darwin") {
    app.quit();
  }
});

// In this file you can include the rest of your app"s specific main process
// code. You can also put them in separate files and require them here.
