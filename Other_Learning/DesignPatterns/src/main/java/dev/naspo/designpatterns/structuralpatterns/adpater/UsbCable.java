package main.java.dev.naspo.designpatterns.structuralpatterns.adpater;

public class UsbCable {
    private boolean isPluggedIn;

    public UsbCable() {
        this.isPluggedIn = false;
    }

    public void plugIn() {
        this.isPluggedIn = true;
    }

    public boolean isPluggedIn() {
        return this.isPluggedIn;
    }
}
