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
        float operation = this.num1 + (this.num2 * this.num3);
        return this.num1 + " + (" + this.num2 + " * " + this.num3 + ") = " + operation;
    }

    public String soustraction() {
        float operation = this.num1 - (this.num2 / this.num3);
        return this.num1 + " - (" + this.num2 + " / " + this.num3 + ") = " + operation;
    }

    public String multiplication() {
        float operation = (this.num1 * this.num2) + this.num3;
        return "(" + this.num1 + " * " + this.num2 + ") + " + this.num3 + " = " + operation;
    }

    public String division() {
        float operation = (this.num1 / this.num2) - this.num3;
        return "(" + this.num1 + " / " + this.num2 + ") - " + this.num3 + " = " + operation;
    }

}
