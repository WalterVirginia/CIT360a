package TRE_examples;
import java.util.*;
import java.text.*;

public class thread_ex {
	
	public static void main(String[]args) {

		new firstExample();
	}


}


class firstExample extends Thread {
	
	public void run() {
		
		/**
		 * This method creates a loop that prints the alphabet
		 */
		char abc;
		
		for (abc = 'a'; abc <= 'z'; abc++) {
			System.out.println(abc);
		}
	}
	
	/**
	 * This will start the thread. 
	 */
	public firstExample() {
		this.start();
	}
  }

