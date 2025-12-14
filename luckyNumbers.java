import java.util.*;

public class luckyNumbers {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int val=matrix[i][j];
                boolean isMinRow=true,isMinCol=true;

                for(int k=0;k<n;k++){
                    if(matrix[i][k]<val){
                        isMinRow=false;
                        break;
                    }
                }
                for(int k=0;k<m;k++){
                    if(matrix[k][j]>val){
                        isMinCol=false;
                        break;
                    }
                }
                if(isMinRow && isMinCol){
                    ans.add(val);
                }


            }
            
        }
        return ans;
    }
}
