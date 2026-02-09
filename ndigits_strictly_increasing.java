import java.util.*;
public class ndigits_strictly_increasing {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> res=numberSeries(n);
        for(int num:res){
            System.out.print(num+" ");
        }
    }
    public static ArrayList<Integer> numberSeries(int n){
        ArrayList<Integer> list=new ArrayList<>();
        if(n==1){
            numb(n,0,-1,list);
        }
        else{
            numb(n,0,0,list);
        }
        return list;
    }

    public static void numb(int digitleft,int curr,int last,ArrayList<Integer> list){
        if(digitleft==0){
            list.add(curr);
            return;
        }
        for(int next=last+1;next<=9;next++){
            int newnum=curr*10+next;
            numb(digitleft-1,newnum,next,list);
        }
    }
}
