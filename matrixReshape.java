import java.util.*;
public class  matrixReshape {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int R=sc.nextInt();
        int C=sc.nextInt();
        int[][] grid=new int[R][C];
       for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            grid[i][j]=sc.nextInt();
        }
       }
       int r=sc.nextInt();
       int c=sc.nextInt();
       int[][] res=new int[r][c];
       if(R*C!=r*c){
          for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
          }
       }
       int idx=0;
       for(int i=0;i<R;i++){
         for(int j=0;j<C;j++){
            res[idx/c][idx%c]=grid[i][j];
            idx++;
         }
       }
       for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(res[i][j]+" ");
        }
        System.out.println();
       }

    }
}
