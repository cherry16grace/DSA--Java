import java.util.*;
public class jumpGame {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(i>maxIndex){
                System.out.println("false");
                return;
            }
            maxIndex=Math.max(maxIndex,i+arr[i]);
        }
        System.out.println("true");
    }
}
