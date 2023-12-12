package MusicTools;

public class Tuba implements Instrument {

    private int diameter = 100;

    public int getDiameter() {return diameter;}

    public void setDiameter(int diameter) {this.diameter = diameter;}

    @Override
    public void play() {
        System.out.println("Играет туба.\nДиаметр тубы = " + diameter);
    }
}
