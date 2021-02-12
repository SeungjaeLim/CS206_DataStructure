package jump2java;
import java.util.Scanner;

public class inc_dec_opr 
{
	public static void main(String[] args) 
	{
		int i, j;
		Scanner sc = new Scanner(System.in);
		i = sc.nextInt();
		j = i;
		System.out.println(i++);
		System.out.println(i);
		System.out.println(++j);
		System.out.println(j);
	}
}
