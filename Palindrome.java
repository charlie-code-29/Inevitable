import java.util.*;
public class Palindrome
{
public static void main(String[] bk)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string:\n");
StringBuffer s=sc.nextLine();
StringBuffer sb = new StringBuffer(s);
StringBuffer a=sb.reverse();
if(a==s)
{
System.out.println("It is a Palindrome string");
}
else
{
System.out.println("It is not a palindrome string");
}
}
}