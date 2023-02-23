package MusicalBonus;

public class Piano extends MusicalInstrument implements Tuneable, VolumeAdjustable{

    private int numberOfKeys;

    public Piano(String instrumentClassification, int numberOfKeys) {
        super(instrumentClassification);
        this.numberOfKeys = numberOfKeys;
    }


    @Override
    public void startMusic() {
        System.out.println("Music start");
    }

    @Override
    public void stopMusic() {
        System.out.println("Music stop");
    }

    @Override
    public void tuneInstrument() {
        System.out.println("Tune up");
    }

    @Override
    public void detuneInstrument() {
        System.out.println("Tune down");
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up");
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down");
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }
}
