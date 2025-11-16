import java.util.Scanner;
 
public class ActivityInteger_Sean {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);	
    int sum;
    
    System.out.print("Enter a positive integer number: ");
    sum = scanner.nextInt ();
    if(sum>=0 && sum<=100){
    }
    for(int i = 0; i <= sum; i++){
    System.out.println(i);	
    }
    
    }
}
