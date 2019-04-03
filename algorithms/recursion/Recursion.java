public class Recursion {

    public static void main(String args[]) {

        System.out.println("Tail recusion");
        countWithTailRecursion(Integer.valueOf(args[0]));
        System.out.println("Head recursion");
        countWithHeadRecursion(Integer.valueOf(args[0]));
    }

    public static void countWithTailRecursion(int n) {

        if(n == 0) return;
        System.out.println(n);
        countWithTailRecursion(n-1);
    }

    public static void countWithHeadRecursion(int n) {

        if(n == 0) return;
        countWithHeadRecursion(n-1);
        System.out.println(n);
    }
}