class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rowSet=new HashSet<>();
        Set<Integer> colSet=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    rowSet.add(i);
                    colSet.add(j);
                }
            }
        }
        for(Integer i:rowSet){
            for(int j=0;j<matrix[0].length;j++)
            matrix[i][j]=0;
        }
        for(Integer i:colSet){
            for(int j=0;j<matrix.length;j++)
            matrix[j][i]=0;
        }
    }
}

/*First approach:
class Pair{
    int row;
    int col;
    Pair(int row, int col){
        this.row =row;
        this.col=col;
    }
    public String toString(){return row+"-"+col;}
}
class Solution {
    public void setZeroes(int[][] matrix) {
        Map<Integer, Pair> map=new HashMap<>();

        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    map.put(count,new Pair(i,j));
                    count++;
                }
            }
        }
        System.out.println(map);
        for(Integer i:map.keySet()){
            for(int j=0;j<matrix[0].length;j++)
            matrix[map.get(i).row][j]=0;
        }
        for(Integer i:map.keySet()){
            for(int j=0;j<matrix.length;j++)
            matrix[j][map.get(i).col]=0;
        }
    }
} */