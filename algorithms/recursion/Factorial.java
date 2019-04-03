import java.math.BigInteger;

public class Factorial {

    public static void main(String args[]) {

        System.out.println(Factorial.of(BigInteger.valueOf(Long.valueOf(args[0]))));
    }

    public static BigInteger of(BigInteger n){
        
        if(n.equals(BigInteger.ONE)) return BigInteger.ONE;
        return n.multiply(of(n.subtract(BigInteger.ONE)));
    }
}
