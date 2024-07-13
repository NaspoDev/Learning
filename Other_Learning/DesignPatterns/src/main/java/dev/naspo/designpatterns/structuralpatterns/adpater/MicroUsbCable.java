package main.java.dev.naspo.designpatterns.structuralpatterns.adpater;

public class MicroUsbCable {
    private boolean isPluggedIn;

    public MicroUsbCable() {
        this.isPluggedIn = false;
    }

    public void plugIn() {
        this.isPluggedIn = true;
    }

    public boolean isPluggedIn() {
        return this.isPluggedIn;
    }
}
