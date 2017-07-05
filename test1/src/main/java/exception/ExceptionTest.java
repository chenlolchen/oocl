package exception;

import java.io.FileInputStream;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        Object o = 12;
        if(o != null){  // NullPointerException
            o.toString();
        }

        int a = 8;
        int[] m = new int[8];
        if(a < m.length){  // ArrayIndexOutOfBoundsException
            int x = m[a];
        }

        try {
            if(o instanceof String){   // ClassCastException
                String s = (String) o;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("aaa");
        }

    }
}
