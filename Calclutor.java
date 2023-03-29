public class Calclutor {
    public static void main(String[] args) {

        //Calclutor calclutor = new Calclutor();
        System.out.println(division(4,2));
    }
    public static double division(double a,double b){
        if(a==0 || b==0){
            return 0;
        }else {
            return a / b;
        }
    }
}
