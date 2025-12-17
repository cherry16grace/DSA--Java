import java.util.*;
public class spiralMatrix{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        List<Integer> res=new ArrayList<>();
        int left=0,top=0,bottom=n-1,right=m-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                res.add(mat[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                res.add(mat[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    res.add(mat[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    res.add(mat[i][left]);
                }
                left++;
            }

        }
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
    }
}