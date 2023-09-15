import java.util.Scanner;
public class IntPattern8
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows to print the pattern :-");
int rows = scanner.nextInt();
for (int i = rows; i >= 1; i--)
{
for (int j = i; j <= rows; j++)
{
System.out.print(j + " ");
}
for (int k = rows-1; k >= i; k--)
{
System.out.print(k + " ");
}
System.out.println();
}
for (int i = 2; i <= rows; i++)
{
for (int j = i; j <= rows; j++)
{
System.out.print(j + " ");
}
for (int k = rows-1; k >= i; k--)
{
System.out.print(k + " ");
}
System.out.println();
}
}
}