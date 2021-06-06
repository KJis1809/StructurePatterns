public class Main {

    public static void main(String[] args) {

        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(5, 10));
        System.out.println(intsCalc.mult(5, 10));
        System.out.println(intsCalc.pow(2, 2));
    }
}
