package dsaprograms;

public class SumOfNaturalNumbers
{

    public static void main(String[] args)
    {
        System.out.println(sum(7));
        System.out.println(sumalgebra(7));
        //Result will be 28
    }
    
    //Methods for calculating sum of n natural numbers
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
    
    //Time Complexity: O(1)
    public static int sumalgebra(int n)
    {
        int res = 0;
        res = n*(n+1)/2;
        return res;
    }

}
