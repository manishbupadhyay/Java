package OOPSConceptPart1;

public class FunctionInJava {

    public static void main(String[] args) {

        // to call non static method we need to create object of class
        FunctionInJava obj = new FunctionInJava(); // obj is reference variable of object new FunctionInJava()
        obj.test();
        int adr = obj.add();
        System.out.println(adr);
        String str = obj.qa();
        System.out.println(str);
        int div = obj.division(10, 2);
        System.out.println(div);

    }

    // non static methods
    public void test() {
        System.out.println("I'm inside test method");
    }

    public int add() {
        System.out.println("I'm inside add method");
        int a = 2;
        int b = 5;
        int c = a + b;
        return c;
    }

    public String qa() {
        System.out.println("I'm inside qa method");
        String s = "Selenium";
        return s;
    }

    public int division(int x, int y) {
        System.out.println("I'm inside division method");
        int d = x / y;
        return d;
    }
}
