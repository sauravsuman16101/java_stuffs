package dsaprograms;

public class SumOfNaturalNumbers
{

    public static void main(String[] args)
    {
        System.out.println(sum(7));
        //Result will be 28
    }
    
    //Method for calculating sum of n natural numbers
    //Time Complexity: O(n)
    public static int sum(int n)
    {
        int i = 1;
        int res = 0;
        while(i <= n)
        {
            res += i;
            i++;
        }
        return res;       
    }

}
