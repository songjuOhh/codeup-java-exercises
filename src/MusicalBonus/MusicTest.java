package MusicalBonus;

public class MusicTest {

    public static void detuneRetune(Tuneable tuneableObj) {
        tuneableObj.detuneInstrument();
        tuneableObj.tuneInstrument();
    }
    public static void makeTwoStaccatoSounds(VolumeAdjustable va) {
        va.volumeUp();
        va.volumeDown();
        va.volumeUp();
        va.volumeDown();
    }

    public static void main(String[] args) {
        MusicalInstrument instrument = new Piano("classification", 10);
        instrument.startMusic();
        instrument.stopMusic();

//        detuneRetune(instrument.setInstrumentClassification());


    }
}
