public class Calculatrice {

    private final float num1;
    private final float num2;
    private final float num3;

    public Calculatrice(float num1, float num2, float num3) {

        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public String addition() {
        float operation = this.num1 + this.num2;
        return this.num1 + " + " + this.num2 + " = " + operation;
    }

    public String additionEtSoustraction() {
        float operation = this.num1 + this.num2 - this.num3;
        return this.num1 + " + " + this.num2 + " - " + this.num3 + " = " + operation;
    }

    public String additionEtDivision() {
        float operation = this.num1 + (this.num2 / this.num3);
        return this.num1 + " + (" + this.num2 + " / " + this.num3 + ") = " + operation;
    }

    public String additionEtMultiplication() {
        float operation = this.num1 + (this.num2 * this.num3);
        return this.num1 + " + (" + this.num2 + " * " + this.num3 + ") = " + operation;
    }

    public String soustraction() {
        float operation = this.num1 - this.num2;
        return this.num1 + " - " + this.num2 + " = " + operation;
    }

    public String soustractionEtAddition() {
        float operation = this.num1 - this.num2 +  this.num3;
        return this.num1 + " - " + this.num2 + " + " + this.num3 + " = " + operation;
    }
    public String soustractionEtDivision() {
        float operation = this.num1 - (this.num2 / this.num3);
        return this.num1 + " - (" + this.num2 + " / " + this.num3 + ") = " + operation;
    }
    public String soustractionEtMultiplication() {
        float operation = this.num1 - (this.num2 * this.num3);
        return this.num1 + " - (" + this.num2 + " * " + this.num3 + ") = " + operation;
    }

    public String multiplication() {
        float operation = this.num1 * this.num2;
        return this.num1 + " * " + this.num2 + " = " + operation;
    }

    public String multiplicationEtAddition() {
        float operation = (this.num1 * this.num2) + this.num3;
        return "(" + this.num1 + " * " + this.num2 + ") + " + this.num3 + " = " + operation;
    }

    public String multiplicationEtSoustraction() {
        float operation = (this.num1 * this.num2) - this.num3;
        return "(" + this.num1 + " * " + this.num2 + ") - " + this.num3 + " = " + operation;
    }

    public String multiplicationEtDivision() {
        float operation = (this.num1 * this.num2) / this.num3;
        return "(" + this.num1 + " * " + this.num2 + ") / " + this.num3 + " = " + operation;
    }

    public String division() {
        float operation = this.num1 / this.num2;
        return this.num1 + " / " + this.num2 + " = " + operation;
    }

    public String divisionEtAddition() {
        float operation = (this.num1 / this.num2) + this.num3;
        return "(" + this.num1 + " / " + this.num2 + ") + " + this.num3 + " = " + operation;
    }

    public String divisionEtSoustraction() {
        float operation = (this.num1 / this.num2) - this.num3;
        return "(" + this.num1 + " / " + this.num2 + ") - " + this.num3 + " = " + operation;
    }

    public String divisionEtMultiplication() {
        float operation = (this.num1 / this.num2) * this.num3;
        return "(" + this.num1 + " / " + this.num2 + ") * " + this.num3 + " = " + operation;
    }

}
