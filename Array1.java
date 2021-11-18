public class Array1 {

	public static void main(String[] args) {
		Array1 obj = new Array1();
		obj.array_int();
		System.out.println("=================");
		obj.array_float();
		System.out.println("=================");
		obj.array_double();
		System.out.println("=================");
		obj.array_boolean();
		System.out.println("=================");
		obj.array_char();
		System.out.println("=================");
		obj.array_string();
		System.out.println("=================");

	}

	public void array_string() {
		String array[] = new String[3];
		System.out.println("String Array - default values are");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}

	}

	public void array_char() {
		char array[] = new char[3];
		System.out.println("Char Array - default values are");
		for (int i = 0; i < array.length; i++)
		{

			System.out.println(array[i]);
		}

	}

	public void array_boolean() {
		boolean array[] = new boolean[3];
		System.out.println("Boolean Array - default values are");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}

	}

	public void array_double() {
		double array[] = new double[3];
		System.out.println("Double Array - default values are");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}

	}

	public void array_float() {
		float array[] = new float[3];
		System.out.println("Float Array - default values are");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}

	}

	public void array_int() {
		int array[] = new int[3];
		System.out.println("Int Array - default values are");
		for (int i = 0; i < array.length; i++) 
		{
			System.out.println(array[i]);
		}
	}
}

//---------------------------------------------------------------------

Output:
OUTPUT:

Int Array - default values are
0
0
0
=================
Float Array - default values are
0.0
0.0
0.0
=================
Double Array - default values are
0.0
0.0
0.0
=================
Boolean Array - default values are
false
false
false
=================
Char Array - default values are



=================
String Array - default values are
null
null
null
=================
------------------------------------------------------------------
