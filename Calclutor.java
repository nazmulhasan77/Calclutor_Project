import java.util.Scanner;

public class Calclutor {
    public static void main(String[] args) {
        Calclutor calclutor = new Calclutor();
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println(multiplication(a,b));

    }

    public static double multiplication(double a,double b){
        return a*b;
    }

}


