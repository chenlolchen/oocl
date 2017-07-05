package play;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Piano extends Instrument {
    public Piano(){
        System.out.println("Loading Piano...");
    }

    @Override
    public void sound() {
        System.out.println("Piano sound...");
    }

}