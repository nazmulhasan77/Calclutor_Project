import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(sum(a,b));

    }
    public static int sum(int a,int b){
        return a+b;
    }
}

