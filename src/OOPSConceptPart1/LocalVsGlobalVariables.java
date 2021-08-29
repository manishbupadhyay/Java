package OOPSConceptPart1;

public class LocalVsGlobalVariables {
    // global variable
    String name = "Manish";
    int age = 29;

    public static void main(String[] args) {
        int i = 10; // local variable

        // to access global variables we need to create obeject of class
        LocalVsGlobalVariables obje = new LocalVsGlobalVariables();
        System.out.println(obje.name);
        System.out.println(obje.age);

    }

    public void test() {
        int i = 5; // scope of this variable is oly within this test method
        int j = 7;
        int age = 29; // we can use age here but scope of this variable is oly within this test method
    }

}
