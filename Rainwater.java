import java.util.Scanner;
public class Rainwater 
{
    public static int trap(int[] height) 
    {
        int[] left_max = new int[height.length];
        int[] right_max = new int[height.length];
        int vol = 0;

        left_max[0] = height[0];
        right_max[height.length-1] = height[height.length-1];

        for(int i=1; i<height.length; i++)
        {
            left_max[i] = Math.max(left_max[i-1], height[i]);
            right_max[height.length-i-1] = Math.max(right_max[height.length-i], height[height.length-i-1]);
        }

        for(int i=0; i<height.length; i++)
        {
            vol = vol+(Math.min(left_max[i], right_max[i])-height[i]);
        }

        return vol;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] height = new int[size];
        for(int i=0; i<height.length; i++)
        {
            height[i] = sc.nextInt();
        }
        System.out.println(trap(height));
    }
}