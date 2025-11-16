
 import java.util.Scanner;
 
 
public class sumpossitive_Number {
    
    public static void main(String[] args) {
    	Scanner scanner = new Scanner (System.in);
    	int sum = 0;
    	
    	while (true){
    		System.out.println("Enter a positive number: ");
    		int num = scanner.nextInt();
    		
    		if (num < 0){
    			break;
    		}
    	   sum += num;
    	
    	System.out.print("Total Sum: " +sum);
    	}
    }
}

    

