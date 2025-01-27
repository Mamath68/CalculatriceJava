public class Main {
    public static void main(String[] args) {

        Calculatrice addition = new Calculatrice(10, 10, 5);
        System.out.println(addition.addition());

        Calculatrice soustraction = new Calculatrice(77777, 66666, 5);
        System.out.println(soustraction.soustraction());

        Calculatrice multiplication = new Calculatrice(12, 12, 5);
        System.out.println(multiplication.multiplication());

        Calculatrice division = new Calculatrice(110, 50, 2);
        System.out.println(division.division());

    }
}
