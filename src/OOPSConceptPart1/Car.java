package OOPSConceptPart1;

public class Car {
    // class var
    int modal;
    int wheel;

    public static void main(String[] args) {
        Car obj = new Car();
        obj.modal = 2019;
        obj.wheel = 4;

        System.out.println(obj.modal);
        System.out.println(obj.wheel);
    }

}
