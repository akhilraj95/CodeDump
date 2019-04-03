import java.math.BigInteger;

public class Factorial {

    public static void main(String args[]) {

        System.out.println(Factorial.of(BigInteger.valueOf(Long.valueOf(args[0]))));
    }

    public static BigInteger of(BigInteger n){
        
        return of(BigInteger.ONE, n);
    }

    public static BigInteger of(BigInteger accumulator, BigInteger n) {
        
        if(n.equals(BigInteger.ONE)) return accumulator;
        return of(n.multiply(accumulator), n.subtract(BigInteger.ONE));
    }
}
