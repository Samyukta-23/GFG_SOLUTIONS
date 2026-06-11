class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int rows) {
        List<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<rows;i++){
            ArrayList<Integer> row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
            }
            if(i>0) row.add(1);
            list.add(row);
        }
        return list.get(list.size()-1);
    }
}