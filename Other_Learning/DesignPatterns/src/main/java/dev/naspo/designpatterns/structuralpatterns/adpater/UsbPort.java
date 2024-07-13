package main.java.dev.naspo.designpatterns.structuralpatterns.adpater;

public class UsbPort {
    private boolean portAvailable;

    public UsbPort() {
        this.portAvailable = true;
    }

    public void plug(UsbCable usbCable) {
        this.portAvailable = false;
        usbCable.plugIn();
    }

    public boolean isPortAvailable() {
        return this.portAvailable;
    }
}
