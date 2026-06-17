import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=s.nextInt();
            }
        }
        HashMap<Integer,ArrayList<Integer>> row=new HashMap<>();
        for(int i=0;i<n;i++){
            row.put(i,new ArrayList<>());
            int min=Integer.MAX_VALUE;
            int col=-1;
            for(int j=0;j<n;j++){
                if(arr[i][j]<min) {
                    min=arr[i][j];
                    col=j;
                }
            }
            row.get(i).add(min);
            row.get(i).add(col);
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            if(isMaximum(i,row.get(i).get(1),row.get(i).get(0),arr)){
                System.out.println("Saddle point is in ("+i+","+row.get(i).get(1)+") and the value is "+row.get(i).get(0));  
                found=true;
            }
        }
        if(!found)
        System.out.print("No saddle point");
        
        
    }
    
    static boolean isMaximum(int i,int j,int ele,int[][] arr){
        for(int m=0;m<arr.length;m++){
            if(arr[m][j]>ele) return false;
        }
        return true;
    }
}
