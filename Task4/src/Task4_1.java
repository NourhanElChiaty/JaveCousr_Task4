import java.util.Scanner;

public class Task4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner scan = new Scanner(System.in);
          
         //scan first number 
         System.out.println("enter first name");
         String firstName= scan.next();
         
         //change it to lower case
         firstName=firstName.toLowerCase();
         
       //scan first number 
         System.out.println("enter second name");
         String secondName= scan.next();
         
         //change it to lower case
         secondName= secondName.toLowerCase();
         
         //check if they are equal
        boolean equal = firstName.equals(secondName);
        
        System.out.println(equal); //print if it is true or false
       
	}

}
