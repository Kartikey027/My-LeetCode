/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int ans=0;
        int i=0;
        while(i<=n){
            int mid=i+(n-i)/2;
            if(isBadVersion(mid)){
                ans=mid;
                n=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return ans;
    }
}