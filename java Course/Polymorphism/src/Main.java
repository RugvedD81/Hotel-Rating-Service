class Calculator{
    public int add(int a,int b){
        return a+b;
    }
     int substraction(int a,int b){
        return a-b;
    }

    int multiply(int a,int b){
        return a*b;
    }
    int divide(int a,int b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return 0;
        }else{
            return a/b;
        }
    }

}
public class Main {
    public static void main(String[] args) {

    }
}