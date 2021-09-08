package OOPSConceptPart2.Interface;

public interface ICICIBank {
    int min_balance = 10000;

    public void credit();
    public void debit();
    public void transferMoney();
    // only method declaration
	// no method body - only method prototype
	// In Interface we can declare the variables, and variable are by default static in nature.
	// variables value will not changed, it's final/constant in nature
	// no static method in Interface
	// no main method in Interface
	// we can not create the object of Interface
	// Interface is abstract in nature
    
}
