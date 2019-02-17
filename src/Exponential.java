public class Exponential {
     public static double power(double x,int n){
        if(n == 1){
            return x;
        }
        return x * power(x,n-1);
    }
}
