import java.util.*;
public class firstMissingPositive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        while(j<n){
            int corr=arr[j]-1;
            if(arr[j]>0 && arr[j]<=n && arr[j]!=arr[corr]){
                int tem=arr[corr];
                arr[corr]=arr[j];
                arr[j]=tem;
            }
            else{
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1){
                System.out.print(i+1);
                return;
            }
        }
        System.out.print(n+1);

    }
}
