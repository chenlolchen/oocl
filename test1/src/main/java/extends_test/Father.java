package extends_test;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Father extends Object {
    static {
        System.out.println("Father Loading ...");
    }

    public String name;
    public int age;

    public Father() {

    }

    public Father(int age) {
        this.age = age;
    }

    public void earn() {
        System.out.println("father earn ...");
    }

}
