import java.util.*;
public class Reverse
{
public static void main(String[] bk)
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter a string:\n");
String s=sc.nextLine();
StringBuffer sb = new StringBuffer(s);
sb.reverse();
System.out.println(sb);
}
}