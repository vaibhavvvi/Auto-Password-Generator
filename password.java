// Java code to explain how to generate random password
// Here we are using random() method of util class in Java 
import java.util.*; 
public class password 
{ 
	public static void main(String[] args) 
	{ 
		// Length of password as I have choosen here is 10
		int length = 10; 
		System.out.println(pass(length)); 
	}
	//The method is static so we don't need any object creation for it.
	static char[] pass(int len) 
	{
		System.out.print("Your new password is : ");
		String uc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		String lc = "abcdefghijklmnopqrstuvwxyz"; 
		String d = "0123456789"; 
		String symbols = "!@#$%^&*_=+-/.?<>)"; 
		String values = uc + lc + d + symbols;
		Random rd = new Random();
		char[] password = new char[len];
		for (int i = 0; i < len; i++) 
		{
			password[i] = values.charAt(rd.nextInt(values.length())); 

		} 
		return password; 
	} 
} 
