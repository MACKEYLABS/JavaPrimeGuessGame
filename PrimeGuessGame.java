import java.util.Scanner; //Import scanner to accept user input.
public class test { //Defining public class as test.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
{
    Integer num1, num2, num3, sum, avg; //Using Integer as the data type
    Scanner sn = new Scanner(System.in); //
    System.out.print("The three numbers are : "); //asking the user for input
    num1 = sn.nextInt();  //inputs the first number
    num2 = sn.nextInt();   //inputs the second number
    num3 = sn.nextInt();    //inputs the third number
    
    sum = num1 + num2 + num3;   //finds the sum of the 3 numbers.
    avg = sum / 3;            //finds the average of the 3 numbers.
    System.out.println("The sum of the numbers is : " + sum); //displays the sum.
    System.out.println("The average of the numbers is : " + avg ); //displays the average of the 3 numbers.
	}
}
}
