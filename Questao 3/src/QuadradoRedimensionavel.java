public class QuadradoRedimensionavel extends Quadrado implements Redimensionavel {

    public QuadradoRedimensionavel(double lado) {
        super(lado);
    }

    @Override
    public void redimensionar(int percentual) {
        lado += lado * percentual / 100;
    }

}