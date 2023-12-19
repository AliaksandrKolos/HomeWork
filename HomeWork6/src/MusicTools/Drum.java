package MusicTools;

public class Drum implements Instrument {

    private int size = 80;

    public Drum(int size) {
        this.size = size;
    }

    public Drum(){

    }


    public int getSize() {return size;}

    public void setSize(int size) {this.size = size;}



    @Override
    public void play() {
        System.out.println("Играет барабан.\nРазмер барабана = " + size);
    }
}
