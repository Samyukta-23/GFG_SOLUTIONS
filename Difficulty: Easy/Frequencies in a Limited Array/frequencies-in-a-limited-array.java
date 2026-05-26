class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(int i=0;i<arr.length;i++){
            if(map.get(i+1)==null) list.add(0);
            else list.add(map.get(i+1));
        }
        return list;
    }
}
