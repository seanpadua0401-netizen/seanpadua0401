
import java.util.Scanner;
public class GradesAndPoints {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);	
    	
    	System.out.println("Enter Grades");
    	double grade = scanner.nextDouble ();
    
     if (grade
     	 < 0){
   	System.out.println("imposible!");
    	
    }
    else if (grade <= 59){
    System.out.println ("F");
    }
     
   else if (grade <= 69){
    System.out.println ("D");
    }
    
     else if (grade <= 79){
    System.out.println ("C");
    }
    
    else if (grade <= 89){
    System.out.println ("B");
  
    }
    
    else if (grade <= 100){
    System.out.println ("A");
  
    }
    else{
    	System.out.println("incredible!");
    }	
    }
}
