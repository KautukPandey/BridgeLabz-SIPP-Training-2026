class Solution {
    public int reverse(int x) {
        if(x==0) return 0;
        int num = Math.abs(x);
        int sign = x/num;
        int ans = 0;
        while(num>0){
            if(ans>Integer.MAX_VALUE/10 || ans<Integer.MIN_VALUE/10) return 0;

            int rem = num%10;
            ans = ans*10+rem;
            num/=10;
        }
        
        return ans/sign;
    }
}