package play;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Guitar extends Instrument {
    public Guitar(){
        System.out.println("Loading Guitar...");
    }

    @Override
    public void sound() {
        System.out.println("Guitar sound...");
    }
}
