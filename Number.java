public class Number
{
public static void main(String[] args) 
{
int count = 0, num = 123456789;
while (num != 0) 
{
num /= 10;
++count;
}
System.out.println("Number of digits: " + count);
}
}