
import java.util.*;
public class firstLastPosition {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int tar=sc.nextInt();
        int first=findfir(arr,tar);
        if(first==-1){
            System.out.print("not found");
        }
        int last=findlas(arr,tar);
        System.out.println(first+" "+last);
    }
    public static int findfir(int[] arr,int tar){
        int left=0,right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==tar){
                ans=mid;
                right=mid-1;
            }
            else if(arr[mid]<tar){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }
    public static int findlas(int[] arr,int tar){
        int left=0,right=arr.length-1;
        int ans=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]==tar){
                ans=mid;
                left=mid+1;
            }
            else if(arr[mid]<tar){
                left=mid+1;

            }
            else{
                right=mid-1;
            }
        }
        return ans;
    }

}
