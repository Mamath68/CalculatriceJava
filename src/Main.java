public class Main {
    public static void main(String[] args) {

        Calculatrice addition = new Calculatrice(10, 10, 5);
        Calculatrice soustraction = new Calculatrice(77777, 66666, 5);
        Calculatrice multiplication = new Calculatrice(12, 12, 5);
        Calculatrice division = new Calculatrice(6, 5, 5);

        System.out.println(addition.addition());
        System.out.println(soustraction.soustraction());
        System.out.println(multiplication.multiplication());
        System.out.println(division.division());
    }
}
