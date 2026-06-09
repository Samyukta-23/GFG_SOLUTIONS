class Solution {
    public List<Integer> matrixDiagonally(int[][] mat) {
        HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<=mat.length+mat.length-2;i++){
            map.put(i,new ArrayList<>());
        }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                map.get(i+j).add(mat[i][j]);
            }
        }
        boolean flag=false;
        ans.add(map.get(0).get(0));
        for(int key=1;key<=mat.length+mat.length-2;key++){
            if(!flag){
                flag=true;
            }
            else{
                flag=false;
                Collections.reverse(map.get(key));
            }
            for(int n:map.get(key)){
                ans.add(n);
            }
        }
        return ans;
    }
}