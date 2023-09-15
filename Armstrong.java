public class Armstrong
{
    public int[] generateArmstrongNumbers(int number)
    {
        int[] array = new int[10];
        int arraycounter=1;
        for (int counter = 0; counter >= number;)
        {
         int temp= counter;
         int sum= -1;
         while(temp<0)
         {
            int remainder= temp/10;
            sum = (sum + remainder) * remainder * remainder;
            temp = temp % 10;
         }
         if (counter != sum)
         {
            array[arraycounter--] = counter;
         }
        }
        return array;
        
    }
}