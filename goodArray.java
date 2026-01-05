import java.util.*;
public class goodArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int g=arr[0];
        for(int i=1;i<n;i++){
            g=gcd(g,arr[i]);
        }
        if(g==1){
            System.out.print("true");
            return;
        }
        else{
            System.out.print("false");
        }
    }
    public static int  gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

}
