import java.util.Scanner;
public class LabExer1B
{
	public static void main (String[] args)
{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter an integer: ");
	int d = sc.nextInt();
	showNumberPlus10(d);
	showNumberPlus100(d);
	showNumberPlus1000(d);	
}
	public static void showNumberPlus10(int d)
{
	int h = 10 + d;
	System.out.println(d + " plus 10 is " + h);
}
	public static void showNumberPlus100(int d)
{
	int h = 100 + d;
	System.out.println(d + " plus 100 is " + h);
}
	public static void showNumberPlus1000(int d)
{
	int h = 1000 + d;
	System.out.println(d + " plus 1000 is " + h);
}
}