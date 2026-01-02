import java.util.*;
public class sortColors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            switch(arr[mid]){
                case 0:
                    int temp0=arr[mid];
                    arr[mid]=arr[low];
                    arr[low]=temp0;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp2=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp2;
                    high--;
                    break;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
