import java.util.ArrayList;
import java.util.Collections;
public class Solution {
	public static int maximumProduct(ArrayList<Integer> arr, int n) {
		// Write your code here.
		ArrayList<Integer> al=new ArrayList<>();
		int lft=1,rght=1,res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(lft==0) lft=1;
            if(rght==0) rght=1;
            lft*=arr.get(i);
            rght*=arr.get(n-1-i);
            res=Math.max(res,Math.max(lft,rght));
        }
        return res;
	}
}