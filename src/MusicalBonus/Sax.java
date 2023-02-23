package MusicalBonus;

public class Sax extends MusicalInstrument implements Tuneable, VolumeAdjustable {

    private String saxTypes;



    public Sax(String instrumentClassification, String saxTypes){
        super(instrumentClassification);
        this.saxTypes = saxTypes;
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

    public String getSaxTypes() {
        return saxTypes;
    }

    public void setSaxTypes(String saxTypes) {
        this.saxTypes = saxTypes;
    }
}
