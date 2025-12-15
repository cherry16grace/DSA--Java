import java.util.*;
public class maximumSubarray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int curr=0;
        for(int num:arr){
            curr+=num;
            max=Math.max(curr,max);
            if(curr<0){
                curr=0;
            }
        }
        System.out.print(max);
    }
}
