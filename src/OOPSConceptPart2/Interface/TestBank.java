package OOPSConceptPart2.Interface;

public class TestBank {
    public static void main(String[] args) {
         // to call int variable which we have declared in interface  we need to call by interface name
         System.out.println(ICICIBank.min_balance);
         //ICICIBank.min_balance = 20000;// we can not change value of Interface 
         SBI sb = new SBI();
         sb.credit();
         sb.debit();
         sb.transferMoney();
         sb.homeLoan();
         sb.mutualFund();

         sb.educationLoan();
         sb.personalLoan();

         System.out.println("==========================================");

         // Dynamic Polymorphism:
		// child class object can be referred by parent interface variable
        ICICIBank ib = new SBI();
        ib.credit();
        ib.debit();
        ib.transferMoney();
    
        // now to access child class SBI method we need to create object of child class
        SBI s = new SBI();
        s.homeLoan();
        s.mutualFund();

        UCOBank ub = new SBI();
        ub.personalLoan();
        ub.educationLoan();
    }
    
}
