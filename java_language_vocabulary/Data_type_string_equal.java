package jump2java;

public class Data_type_string_equal 
{
	public static void main(String[] args) 
	{
		String a = "hello";
		String b = "java";
		String c = "hello";
		String d = new String("hello");
		System.out.println(a.equals(b)); // false
		System.out.println(a.equals(c)); // true
		System.out.println(a==c); // true, point to same string "hello"
		System.out.println(a==d); // false, d : new String() -> different object
	}
}
