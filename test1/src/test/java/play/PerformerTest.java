package play;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class PerformerTest {
    private static Performer performer;

    @BeforeClass
    public static void init(){
        performer = new Performer();
    }

    @Test
    public void play() throws Exception {
        Instrument guitar = new Guitar();
        Instrument violin = new Violin();
        Instrument piano = new Piano();
        performer.play(guitar);
        performer.play(violin);
        performer.play(piano);
    }

}