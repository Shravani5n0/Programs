import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> separateNegativeAndPositive(ArrayList<Integer> nums) {
        // Write your code here.
		int l=0,h=nums.size()-1;
		while(l<=h)
		{
			if(nums.get(l)<0 && nums.get(h)>0)
			{
				l++;
				h--;
			}
			else if(nums.get(l)>0 && nums.get(h)<0)
			{
				int temp=nums.get(l);
				nums.set(l,nums.get(h));
				nums.set(h,temp);
				l++;
				h--;
			}
			else if(nums.get(l)<0 && nums.get(h)<0)
			{
				l++;
			}
			else
			{
				h--;
			}
		}
		return nums;
    }
}