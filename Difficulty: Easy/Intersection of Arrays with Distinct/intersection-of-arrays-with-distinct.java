class Solution {
    public static int intersectSize(int a[], int b[]) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:a){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int n:b){
            if(map.containsKey(n) && map.get(n)>0){
                cnt++;
                map.put(n,map.get(n)-1);
            }
        }
        return cnt;
    }
}