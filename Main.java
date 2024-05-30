import java.util.Scanner;
import java.util.Random;
class number
{
    public static int getrandomnumber()
    {
        int random_int = (int)Math.floor(Math.random()*(100-1+1)+1);
        return random_int;
    }
   public static void guess()
   {
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number between 1 to 100");
        int userguess=sc.nextInt();
        int generatednumber=getrandomnumber();
       System.out.println(generatednumber);
        int score=10;
        int maxrrounds=5;
        if(generatednumber==userguess && maxrrounds==3)
        {
            System.out.println("correct"+" "+score);
            return;
        }
        else {
      while(generatednumber!=userguess)
      {   maxrrounds--;
          score-=2;
          if(maxrrounds==0)
          {
              System.out.println(" TO RESTART ENTER 1 ");
              int ag=sc.nextInt();
              if(ag==1)
              {
                  guess();
              }
else {
                  System.out.println("correct guess"+" "+" Score:"+score);
              }
          }
          System.out.println("oops! Incoorect TRY AGAIN");
          System.out.println("enter the number again");
          userguess=sc.nextInt();
      }
            if(generatednumber==userguess)
            {
                System.out.println("correct guess"+" "+" Score:"+score);
            }

    }
}
    public static void main(String[] args) {
        guess();
    }
}