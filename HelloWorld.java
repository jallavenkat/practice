import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {

        // Creates a reader instance which takes
        // input from standard input - keyboard
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");

        // nextInt() reads the next integer from the keyboard
        int number = reader.nextInt();

        // println() prints the following line to the output screen

        System.out.println("Please enter the number :" + number);
        System.out.println("You enter :" + number);

    }

	
	public void getSquare(int x)
	{
		float sqr=x*x;
		System.out.println("Square of the "+x+" :" + sqr);
	}
	
	public void getAdd(int x,int y)
	{
		int sqr=x+y;
		System.out.println("Addition of "+x+" and "+y+" is " + sqr);
	}
}
