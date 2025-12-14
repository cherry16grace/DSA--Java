import java.util.*;
public class sumUptoZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int index=0;
        for(int i=1;i<=n/2;i++){
            arr[index++]=i;
            arr[index++]=-i;
        }
        if(n%2==1){
           arr[index++]=0;
        }
        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" ");

        }
    }
}