package Java.bingoApp;
import java.util.Random;

public class Cartela {
    //Atributos
    //private String vet="";
    private int cartelas[][] = new int[5][5];
    private String cartelaMarcada[][] = new String[5][5];
    Random aleatorio = new Random();

    public Cartela() {
        this.gerarCartela();
    }

    /* @Override
    public String toString() {
        for (int linha = 0; linha < cartelas.length; linha++) {
            for (int coluna = 0; coluna < cartelas[linha].length; coluna++) {
                vet +=" "+cartelas[linha][coluna];
            }
            vet += "\n";
        }
        return  this.vet + '}';
    }*/
    //Metodos
    public void gerarCartela() {
        int cont = 0;
        int valorAl;

        for (int x = 0; x < this.cartelas.length; x++) {
            for (int y = 0; y < this.cartelas[x].length; y++) {

                if (y == 0) {

                    int sort = aleatorio.nextInt(15) + 1;

                    if (sort != 0) {
                        this.cartelas[x][y] = sort;
                        if (x > 0) {
                            cont = x;
                        }
                        while (cont > 0) {
                            if (sort == this.cartelas[cont - 1][0]) {
                                sort = aleatorio.nextInt(15) + 1;
                                if (sort != 0) {
                                    this.cartelas[x][y] = sort;
                                    cont = x;
                                }

                            } else {
                                cont--;
                            }
                        }
                    }
                }
                if (y == 1) {

                    int sort = aleatorio.nextInt(15) + 16;
                    if (sort != 0) {
                        this.cartelas[x][y] = sort;
                        if (x > 0) {
                            cont = x;
                        }
                        while (cont > 0) {
                            if (sort == this.cartelas[cont - 1][y]) {
                                sort = aleatorio.nextInt(15) + 16;
                                if (sort != 0) {
                                    this.cartelas[x][y] = sort;
                                    cont = x;
                                }

                            } else {
                                cont--;
                            }
                        }
                    }
                }
                if (y == 2) {
                    int sort = aleatorio.nextInt(15) + 31;
                    if (sort != 0) {
                        this.cartelas[x][y] = sort;
                        if (x > 0) {
                            cont = x;
                        }
                        while (cont > 0) {
                            if (sort == this.cartelas[cont - 1][y]) {
                                sort = aleatorio.nextInt(15) + 31;
                                if (sort != 0) {
                                    this.cartelas[x][y] = sort;
                                    cont = x;
                                }

                            } else {
                                cont--;
                            }
                        }
                    }
                }
                if (y == 3) {
                    int sort = aleatorio.nextInt(15) + 46;
                    if (sort != 0) {
                        this.cartelas[x][y] = sort;
                        if (x > 0) {
                            cont = x;
                        }
                        while (cont > 0) {
                            if (sort == this.cartelas[cont - 1][y]) {
                                sort = aleatorio.nextInt(15) + 46;
                                if (sort != 0) {
                                    this.cartelas[x][y] = sort;
                                    cont = x;
                                }

                            } else {
                                cont--;
                            }
                        }
                    }
                }
                if (y == 4) {
                    int sort = aleatorio.nextInt(15) + 61;
                    if (sort != 0) {
                        this.cartelas[x][y] = sort;
                        if (x > 0) {
                            cont = x;
                        }
                        while (cont > 0) {
                            if (sort == this.cartelas[cont - 1][y]) {
                                sort = aleatorio.nextInt(15) + 61;
                                if (sort != 0) {
                                    this.cartelas[x][y] = sort;
                                    cont = x;
                                }

                            } else {
                                cont--;
                            }
                        }
                    }
                }
            }
        }
    }

    public void marcarNumero(int numero) {
        for (int x = 0; x < this.cartelas.length; x++) {
            for (int y = 0; y < this.cartelas[x].length; y++) {
                if (this.cartelas[x][y] == numero) {
                    this.cartelaMarcada[x][y] = ".";
                }
            }
        }
    }

    public boolean hasBingoJanelao() {
        int soma = 0;
        for (int x = 0; x < this.cartelas.length; x++) {
            for (int y = 0; y < this.cartelas[x].length; y++) {

                if (this.cartelaMarcada[x][0] == ".") {
                    soma++;
                } else if (y > 0 && this.cartelaMarcada[0][y] == ".") {
                    soma++;
                } else if (x > 0 && this.cartelaMarcada[x][4] == ".") {
                    soma++;
                } else if ((y > 0) && (y < 4) && this.cartelaMarcada[4][y] == ".") {
                    soma++;
                }

            }
        }

        if (soma == 16) {
            return true;
        } else {
            return false;
        }

    }

    public boolean hasBingoCartelaCheia() {
        return false;

    }

    public void resetMarcacao() {

    }
}
