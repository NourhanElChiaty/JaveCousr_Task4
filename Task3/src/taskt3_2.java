import javax.swing.JOptionPane;

import org.omg.CORBA.PUBLIC_MEMBER;

public class taskt3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []data;
		data = new String[6];
		
		String name=JOptionPane.showInputDialog(null,"Please enter your name");
		String mobile=JOptionPane.showInputDialog(null,"Please enter your Mobile");
		String email=JOptionPane.showInputDialog(null,"Please enter your email");
		String age=JOptionPane.showInputDialog(null,"Please enter your age");
		String faculty=JOptionPane.showInputDialog(null,"Please enter your faculty");
		String department=JOptionPane.showInputDialog(null,"Please enter your department");
		
	
	data[0]=name;
	data[1]= mobile;
	data[2]=email;
	data[3]=age;
	data[4]=faculty;
	data[5]=department;
		
		printData(data);
	}
	public static void printData(String [] array) {
		 System.out.println("your name is: \n"+ array[0]);
	      
	       
	       System.out.println("your mobile is: \n"+ array[1]);
	       
	       
	       System.out.println("your email is: \n" +array[2]);
	       
	       
	       System.out.println("your age is : \n"+ array[3]);
	      
	       
	       System.out.println("your faculty is : \n"+ array[4]);
	       
	       
	       System.out.println("your department is : \n" +array[5]);
	       
	}

}
