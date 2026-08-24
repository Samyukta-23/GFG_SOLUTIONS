class Solution {
    ArrayList<String> ans;
    public ArrayList<String> ratInMaze(int[][] maze) {
        ans=new ArrayList<>();
        helper(maze,0,0,new StringBuilder());
        Collections.sort(ans);
        return ans;
    }
    
    public void helper(int[][] maze,int i,int j,StringBuilder res){
        if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || maze[i][j]==0) return;
        if(i==maze.length-1 && j==maze[0].length-1){
            ans.add(new String(res.toString()));
            return;
        }
        int temp=maze[i][j];
        maze[i][j]=0;
        res.append('D');
        helper(maze,i+1,j,res);
        res.deleteCharAt(res.length()-1);
        res.append('U');
        helper(maze,i-1,j,res);
        res.deleteCharAt(res.length()-1);
        res.append('L');
        helper(maze,i,j-1,res);
        res.deleteCharAt(res.length()-1);
        res.append('R');
        helper(maze,i,j+1,res);
        res.deleteCharAt(res.length()-1);
        maze[i][j]=temp;
    }
}