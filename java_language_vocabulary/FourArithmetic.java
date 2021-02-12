package jump2java;

import java.util.Scanner;

public class FourArithmetic 
{
	public static void main(String[] args) 
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
	}
}
