package Day1;
class Solution {
    public int subtractProductAndSum(int n) {
        int copy = n;
        int prod = 1;
        int sum = 0;
        while(copy>0){
            int rem = copy%10;
            prod*=rem;
            sum+=rem;
            copy/=10;
        }
        return prod-sum;
    }
}