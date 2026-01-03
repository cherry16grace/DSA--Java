import java.util.*;

public class setMatrixZero {
    public static void main(String[] args){
        Scanner  sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] grid=new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                grid[i][j]=sc.nextInt();
            }
        }
        boolean[] row=new boolean[R];
        boolean[] col=new boolean[C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(row[i]==true || col[j]==true){
                    grid[i][j]=0;
                }
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.println(grid[i][j]+" ");
            }
            System.out.println();
        }

    }
}
