package class_test;

public class TestClass {
    private String name;
    SubClass subClass;
    public class SubClass{
        private int age;
        int number = 100;

        private void work(){
            System.out.println("age = " + age);
            System.out.println("name = " + name);
            System.out.println("number = " + number);
        }
    }

    public void work(){
        final int tt = 100;
        class SubClass2{
            private int count;
            public void work(){
                System.out.println("name = " + name);
                System.out.println("number = " + tt);
            }
        }

        SubClass2 subClass2 = new SubClass2();
        subClass2.work();

        Object o = new Object(){
            public void out(){
                System.out.println("This is nimi");
            }
        };
    }

    public TestClass(){
        this.subClass = new SubClass();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
//        testClass.subClass.work();
//        testClass.work().subClass2;
    }

}
