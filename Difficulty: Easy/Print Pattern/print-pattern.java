class Solution {
    ArrayList<Integer> list=new ArrayList<>();
    public ArrayList<Integer> pattern(int n) {
        if(n<=0){
            list.add(n);
            return list;
        } 
        int temp=n;
        while(temp>0){
            list.add(temp);
            temp-=5;
        }
        while(temp<=n){
            list.add(temp);
            temp+=5;
            
        }
        return list;
    }
}