class Solution {
    public int reverseExponentiation(int n) {
        int rev=0;
        int num=n;
        while(num!=0){
            rev=(rev*10)+(num%10);
            num/=10;
        }
        
        return (int)Math.pow(n,rev);
    }
}
