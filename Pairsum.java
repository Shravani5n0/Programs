public class Solution {
    public static int pairSum(int arr[], int n, int target) {
        // Write your code here.
		int c=0;
		int i=0;
		int j=n-1;
		while(i<j)
		{
			if((arr[i]+arr[j])==target)
			{
				c++;
				i++;
				j--;
			}
			else if((arr[i]+arr[j])<target)
			{
				i++;
			}
			else
			{
				j--;
			}
		}
		if(c!=0)
		{
			return c;
		}
		return -1;
    }
}