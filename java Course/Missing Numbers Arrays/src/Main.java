//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr={1,2,3,5};
        int n=arr.length+1;
        int sum=0;

        int total=n * (n+1)/2;

        for(int num: arr){
            sum=sum+num;
        }

        int missing=total-sum;
        System.out.println(missing);


    }
}