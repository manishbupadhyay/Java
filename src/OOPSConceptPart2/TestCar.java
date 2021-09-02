package OOPSConceptPart2;

public class TestCar {

    // method overriding - when same method is present in parent class as well as in child with same name and same number of arguments is called method overriding 
    public static void main(String[] args) {
        // this is called static polymorphism or compile time polymorphism 
        BMW b = new BMW();
        b.start(); // it will call start method from BMW class because preference given to child class
        b.stop();
        b.refuel();
        b.theftSafety();
        b.engine();

        System.out.println("===========================================");
        Car c = new Car();
        c.start();
        c.stop();
        c.refuel();

        // top casting 
        System.out.println("===========================================");
         Car c1 = new BMW(); // child class object can be refferred by parent class reference variable . This is called dyamic polymorphism or run time polymorphism 
         c1.start();
         c1.stop();
         c1.refuel();

         // down casting is not allow 
         BMW b1 = (BMW) new Car(); // the program will compile successfully but in run time it will throw ClassCastException

    }
    
}
