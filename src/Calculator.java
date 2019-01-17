import java.util.Scanner;

public class Calculator{
	public static void main(String args[]){
		float a,b,res;
		char choice, ch;
		Scanner scan=new Scanner(System.in);
		do{
			System.out.print("Add two number: ");
			System.out.println("Exit");
			System.out.println("Enter your choice: ");
			choice =scan.next().charAt(0);
			switch(choice) {
			case '1': System.out.println("Enter two number: ");
					a=scan.nextFloat();
					b=scan.nextFloat();
					res=a+b;
					System.out.println("Result: "+res);
			case '2':
				System.out.println(0);
				break;
				
			default:System.out.println("Invalid Choice.!!");		
			}
			System.out.println("\n--------------------------------------\n");
		}while(choice!=2);
}
}