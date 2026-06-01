// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        int sum=0,max=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==k){
                max=i+1;
            }
            else if(map.containsKey(sum-k)){
                max=Math.max(max,i-map.get(sum-k));
            }
            if(!map.containsKey(sum))
                map.put(sum, i);
        }
        return max;
    }
}
