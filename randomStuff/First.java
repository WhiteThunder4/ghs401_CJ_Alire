

public class First
{
    public static void main()
    {
        for(int i = 0; i < 5; i++)
      {
        //cast a random number to an integer
        double age = (int)(Math.random()*8+367);
        
        System.out.println("The number is " + age + "!");
      }
    }
}
