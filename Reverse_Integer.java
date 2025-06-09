import java.util.Scanner;

public class Reverse_Integer 
{
    public static int reverse(int x) 
    {
        int rem = 0;
        int rev = 0;

        while(x!=0)
        {
            rem = x%10;
            x /= 10;

            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && rem>7)) return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && rem<-8)) return 0;

            rev = rev*10+rem;
        }

        if(x<0) 
        return 0-rev;
        else
        return rev;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(reverse(x));
    }
}