public class Jogador {
    // atributos -- incluir

    private Carta[] mao;
    private int indiceMao;
    private final int tamanhoMao = 3;

    public Jogador() {
        // implementar
        mao = new Carta[tamanhoMao];
        indiceMao = 0;
    }

//    public Carta[] getMao() {
//        // implementar
//
//    }

    public void receberCarta(Carta c) {
        // implementar
        mao[indiceMao++]=c;
    }

    // --------------- não alterar daqui para baixo -----------------------
    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i < mao.length; i++) {
            retorno += i + ": " + mao[i] + (i < mao.length - 1 ? " | " : "");
        }

        return retorno;
    }
}