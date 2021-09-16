package dsaprograms;

public class LinearSearch
{

    public static void main(String[] args)
    {
        int arr[] = { 2, 0, 5, 124, 6, 7, 3 };
        System.out.println(linearSerach(arr, 3)); //Time Complexity: O(n)  
        System.out.println(linearSerach(arr, 67)); //Time Complexity: O(n)
        System.out.println(linearSerach(arr, 2)); //Time Complexity: O(1) 
    }

    public static boolean linearSerach(int arr[], int item)
    {
        int n = arr.length;
        for (int i = 0; i < n; i++)
        {
            if (item == arr[i])
            {
                return true;
            }
        }
        return false;
    }
}
