public abstract class Operaciones {
    public double num1;
    public double num2;

    Operaciones(double num1, double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract void operar();
}
