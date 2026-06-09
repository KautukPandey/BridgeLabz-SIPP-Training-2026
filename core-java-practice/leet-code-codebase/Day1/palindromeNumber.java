package Day1;
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int copy = x;
        int rev = 0;
        while(copy>0){
            int rem = copy%10;
            rev = rev*10 + rem;
            copy/=10;
        }
        if(rev==x) return true;
        return false;
    }
}