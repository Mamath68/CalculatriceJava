public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println(" --------Additions--------- ");
        Calculatrice addition = new Calculatrice(10, 10, 5);
        System.out.println(addition.addition());
        System.out.println(addition.additionEtMultiplication());
        System.out.println(addition.additionEtSoustraction());
        System.out.println(addition.additionEtDivision());

        System.out.println(" ");
        System.out.println(" --------Soustractions--------- ");
        Calculatrice soustraction = new Calculatrice(77777, 66666, 5);
        System.out.println(soustraction.soustraction());
        System.out.println(soustraction.soustractionEtAddition());
        System.out.println(soustraction.soustractionEtDivision());
        System.out.println(soustraction.soustractionEtMultiplication());

        System.out.println(" ");
        System.out.println(" --------Multiplications--------- ");
        Calculatrice multiplication = new Calculatrice(12, 12, 5);
        System.out.println(multiplication.multiplication());
        System.out.println(multiplication.multiplicationEtAddition());
        System.out.println(multiplication.multiplicationEtDivision());
        System.out.println(multiplication.multiplicationEtSoustraction());

        System.out.println(" ");
        System.out.println(" --------Divisions--------- ");
        Calculatrice division = new Calculatrice(110, 50, 2);
        System.out.println(division.division());
        System.out.println(division.divisionEtAddition());
        System.out.println(division.divisionEtMultiplication());
        System.out.println(division.divisionEtSoustraction());

    }
}
