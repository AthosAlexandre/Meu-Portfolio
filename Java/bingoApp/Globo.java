

import java.util.Random;

public class Globo {
    int salve = 0;
    int cont;
    private int sortGlo;
    private int numeroSorteado = 0;
    Random aleatorio = new Random();
    private int globo[] = new int[75];

    //Metodos
    public int sortearNumero() {
        for (int x = salve; x < globo.length; x++) {
            sortGlo = aleatorio.nextInt(75) + 1;
            globo[x] = sortGlo;
            if (x > 0) {
                cont = x;
                while (cont > 0) {
                    if (sortGlo == this.globo[cont - 1]) {
                        sortGlo = aleatorio.nextInt(75) + 1;
                        this.globo[x] = sortGlo;
                        cont = x;
                    } else {
                        cont--;
                    }
                }
            }
            salve = x;
            this.setNumeroSorteado(globo[x]);
            break;
        }

        return this.getNumeroSorteado();
    }

    public void resetGlobo() {

    }

    //Metodos Especiais
    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    public void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;

    }
}
