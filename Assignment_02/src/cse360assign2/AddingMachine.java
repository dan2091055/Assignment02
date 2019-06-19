/**Name: Daniel Martinez
 *Assignment #: 2
 *Description: this assignment is a calculator
 *
 */
package cse360assign2;

public class AddingMachine {

	
	private int total;//this variable is going to be storing the the total value of the calculator.
	
	
	private String CalcHistory = "0";//this is the string where the calculation history is going to be stored.
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * this function is just going to be returning the total value.
	 * @return
	 */
	
	public int getTotal () {//this is going to be getting the total
		return total;
	}
	/**
	 * this function is going to be to adding to the total.
	 * @param value
	 */
	public void add (int value) {//this is the add function
		CalcHistory += " + " + Integer.toString(value);
		
		total = total += value;
		
		
	}
	/**
	 * this function is going to be subtracting from the total value.
	 * @param value
	 */
	
	public void subtract (int value) {//this is the subtract function
		
		CalcHistory += " - " + Integer.toString(value);
		
		total = total-= value;
	
	}
	/**
	 * this function is going to be returning the total.
	 */
		
	public String toString () {
	
		return CalcHistory;
	}

	/**
	 * this function is going to be clearing the total and the history
	 */
	public void clear() {
		
		CalcHistory = "";
		total = 0;
	
	}
}


