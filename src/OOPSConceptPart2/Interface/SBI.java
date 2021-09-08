package OOPSConceptPart2.Interface;

public class SBI implements ICICIBank, UCOBank {
    // it's IS-A relationship
    // If a class is implementing any Interface, then its mandatory to define/override all the methods of Interface

    public void credit(){
        System.out.println("SBI -- credit");
    }

    public void debit(){
        System.out.println("SBI -- debit");
    }

    public void transferMoney(){
        System.out.println("SBI -- transfer money");
    }

    public void educationLoan(){
        System.out.println("SBI -- education loan");
    }

    public void personalLoan(){
        System.out.println("SBI -- personal loan");
    }

    // seperate method of SBI class

    public void homeLoan(){
        System.out.println("SBI -- home loan");
    }

    public void mutualFund(){
        System.out.println("SBI -- mutual fund");
    }
}
