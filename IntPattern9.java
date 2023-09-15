import java.util.Scanner;
public class IntPattern9
{
public static void main(String[] args)
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the number of rows to print the pattern :-");
int rows = scanner.nextInt();
for (int i = 1; i <= rows; i++)
{
for (int j = rows; j > i; j--)
{
System.out.print(" ");
}
int val1 = 1;
for (int k = 1; k <= i; k++)
{
System.out.print(val1 + " ");
val1 = val1 * 2;
}
val1 = val1 / 4;
for (int l = i - 1; l >= 1; l--)
{
System.out.print(val1 + " ");
val1 = val1 / 2;
}
System.out.println();
}
}
}