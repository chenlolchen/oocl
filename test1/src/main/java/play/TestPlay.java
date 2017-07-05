package play;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class TestPlay {
    public static void main(String[] args) {
        Instrument piano = new Piano();
        Instrument guitar = new Guitar();
        Instrument violin = new Violin();

        Performer performer = new Performer();

        performer.play(piano);
        performer.play(guitar);
        performer.play(violin);
    }
}
