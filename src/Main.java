public class Main {
    public static void main(String[] args) {
        System.out.println("Test - home work");
        System.out.println("Hello User!");
        var calculateSimple = new CalculateSimple();
        System.out.println("Sum = " + calculateSimple.sum(2, 3));
        System.out.println("Division = " + calculateSimple.division(10, 0));
        System.out.println("Спасибо, что не делите на ноль;)\n"
                + "Division = " + calculateSimple.division(10, 5));
        System.out.println("Muitiplication = " + calculateSimple.multiplication(5, 5));

    }
}