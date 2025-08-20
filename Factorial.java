public class Factorial{
    public static long Compute(int n){
        if(n<0) throw new IllegealArgumentException("Number not allowed");
        long res=1;
        for(int i=2;i<=n;i++){
            res*=i;
        }
        return res;
    }
    public static void main(String args[]){
        int n=5;
        System.out.println("factorial of "+n+" is "+Compute(n));
    }
}
