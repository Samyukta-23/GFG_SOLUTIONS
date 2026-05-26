
class Solution {
    public boolean isSubset(int a[], int b[]) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:a){
            map.putIfAbsent(n,0);
            map.put(n,map.get(n)+1);
        }
        for(int n:b){
            if(!map.containsKey(n) || map.get(n)<=0) return false;
            else{
               map.put(n,map.get(n)-1);
            }
        }
        return true;
    }
}
