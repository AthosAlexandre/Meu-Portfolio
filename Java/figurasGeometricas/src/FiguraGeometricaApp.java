import java.util.Scanner;

public class FiguraGeometricaApp {
    public static void main(String[] args) {

        FiguraGeometrica[] f = new FiguraGeometrica[10];

        Scanner leia = new Scanner(System.in);

        int valor = 0;
        int menu;
        float raio;
        int contador = 0;
        do {

            System.out.println("1 - ADICIONAR TRIANGULO");
            System.out.println("2 - ADICIONAR QUADRADO");
            System.out.println("3 - ADICIONAR RETANGULO");
            System.out.println("4 - ADICIONAR CIRCULO");
            System.out.println("5 - LISTAR");
            System.out.println("6 - SAIR");

            menu = leia.nextInt();
            if (contador < 9) {
                switch (menu) {
                    case 1:
                        f[contador] = new Triangulo();
                        contador++;
                        break;

                    case 2:

                        f[contador] = new Quadrado();
                        contador++;
                        break;

                    case 3:
                        f[contador] = new Retangulo();
                        contador++;
                        break;

                    case 4:
                        f[contador] = new Circulo();
                        contador++;
                        break;

                    case 5:
                        for (int c = 0; c < contador; c++) {
                            f[c].getArea();
                            System.out.println("A figura " + f[c].toString() + " A area é: " + f[c].getArea() +
                                    " Perimetro é: " + f[c].getPerimetro());
                        }
                }

            } else {
                menu = 6;
            }
        } while (menu != 6);
    }
}
