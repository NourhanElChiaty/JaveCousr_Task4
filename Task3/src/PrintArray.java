import java.util.Scanner;

public class PrintArray {
	static int []numbers ;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
       numbers = new int[5];
       Scanner sc = new Scanner(System.in);
       System.out.println("please Enter your first number");
       int firstNumber= sc.nextInt();
       
       System.out.println("please Enter your second number");
       int secondNumber=sc.nextInt();
       
       System.out.println("please Enter your Third number");
       int thirdNumber=sc.nextInt();
       
       System.out.println("please Enter your fourth number");
       int fourthNumber=sc.nextInt();
       
       System.out.println("please Enter your fifth number");
       int fifthNumber=sc.nextInt();
       
       numbers[0]= firstNumber;
       numbers[1]= secondNumber;
       numbers[2]= thirdNumber;
       numbers[3]= fourthNumber;
       numbers[4]= fifthNumber;
       System.out.println("first number:"+ numbers[0]);
       System.out.println("second number:"+numbers[1]);
       System.out.println("third number:"+numbers[2]);
       System.out.println("fourth number:" +numbers[3]);
       System.out.println("fifth number:" + numbers[4]);
       
      
       
	}

}
