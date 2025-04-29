package Level1;

public class FindMissingNumberFromArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,5,6,7,8,9,10};
        int sum=0,sum2=0;
        for(int i =0;i<a.length;i++){
            sum=sum+a[i];
        }
        for(int i =1;i<=10;i++){
            sum2=sum2+i;
        }
        System.out.println(sum2-sum);
    }
}