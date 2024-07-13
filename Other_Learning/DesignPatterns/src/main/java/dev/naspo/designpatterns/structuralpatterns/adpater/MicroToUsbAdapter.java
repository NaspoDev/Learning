package main.java.dev.naspo.designpatterns.structuralpatterns.adpater;

public class MicroToUsbAdapter extends UsbCable {
    private MicroUsbCable microUsbCable;

    public MicroToUsbAdapter(MicroUsbCable microUsbCable) {
        this.microUsbCable = microUsbCable;
        this.microUsbCable.plugIn();
    }
}
