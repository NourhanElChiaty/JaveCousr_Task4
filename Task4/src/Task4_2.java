import java.util.Scanner;

public class Task4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name");
        String First_name = sc.nextLine();
        System.out.println("Enter Second name");
        String Second_name = sc.next();
        
        //If First name contain second name
        
        boolean result = First_name.contains(Second_name);             
        System.out.println(result);      

	}

}
