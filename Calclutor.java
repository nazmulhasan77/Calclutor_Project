import java.util.Scanner;

public class Calclutor {
    public static void main(String[] args) {
        Calclutor calclutor = new Calclutor();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(sum(a,b));

    }
    public static int sum(int a,int b){
        return a+b;
    }
}

