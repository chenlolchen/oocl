package extends_test;

/**
 * Created by CHENCO7 on 7/5/2017.
 */
public class Son extends Father {
    static {
        System.out.println("Son Loading ...");
    }

    public Son(){
        super(15);
        name = "Aaa";
    }

    //重写
    @Override
    public void earn() {
        System.out.println("aaa");
    }

    //重载
    private void earnInSon(){
        earn();
    }

    private void earnInSon(String name){
        earn();
    }

    private void earnInSon(int name){
        earn();
    }

    private static void work(Father f){
        f.earn();
    }

    public static void main(String[] args) {
        new Son().earnInSon(); //这里new的时候不会把father new出来
        Father f = new Father();
        Father father = new Son();
        father.earn();  //只能调用father里面的函数,不能调用earnInSon
        //除非使用强制类型转换:
        Son s = (Son) father;
        s.earnInSon();

        System.out.println("=========================");
        s.earn();
        father.earn();
        f.earn();
        System.out.println("**************************");
        work(f);
    }
}
