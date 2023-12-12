package MusicTools;

public class Main {
    public static void main(String[] args) {

        Instrument[] arrayInstruments = new Instrument[3];
        arrayInstruments[0] = new Guiter();
        arrayInstruments[1] = new Tuba();
        arrayInstruments[2] = new Drum();

        for (Instrument i: arrayInstruments) {
            i.play();
            System.out.println();
        }






    }
}
