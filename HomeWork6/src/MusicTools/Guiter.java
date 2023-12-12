package MusicTools;

public class Guiter implements Instrument {

    private int countString = 6;

    public int getCountString() {
        return countString;
    }

    public void setCountString(int countString) {
        this.countString = countString;
    }


    @Override
    public void play() {
        System.out.println("Играет гитара.\nКоличество струн в гитаре = " + countString);
    }
}
