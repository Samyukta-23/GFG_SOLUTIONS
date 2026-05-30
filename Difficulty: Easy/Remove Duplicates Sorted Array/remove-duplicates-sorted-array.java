class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int num=arr[i];
            list.add(num);
            while(i+1<arr.length && arr[i+1]==num){
                i++;
            }
            i++;
        }
        return list;
    }
}
