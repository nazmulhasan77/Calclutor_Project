import java.util.Scanner;

public class Calclutor {

    public static void main(String[] args) {

        Calclutor calclutor = new Calclutor();
    }
    
    public static int sum(int a,int b){
        return a+b;
    }
    
    public static double division(double a,double b){
        if(a==0 || b==0){
            return 0;
        }else {
            return a / b;
        }
    }

    public static double multiplication(double a,double b){
        return a*b;
    }

}

