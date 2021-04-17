public class Cilindro {
    private double altura;
    private Circulo base;


    public Cilindro() {
        this.base = new Circulo();
        altura = 1;
    }

    public Circulo getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
}
