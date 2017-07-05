package play;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Violin extends Instrument {
    public Violin(){
        System.out.println("Loading Violin...");
    }

    @Override
    public void sound() {
        System.out.println("Violin sound...");
    }
}