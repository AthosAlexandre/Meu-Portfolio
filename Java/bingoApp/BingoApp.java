
import java.util.ArrayList;
import java.util.Scanner;

public class BingoApp {

    public static void main(String[] args) {
        Globo g = new Globo();
        Scanner l = new Scanner(System.in);
        int qtdCartelas;

        System.out.println("Quantas cartelas deseja ?");
        qtdCartelas = l.nextInt();

        ArrayList<Cartela> cartelas = new ArrayList<Cartela>();

        for (int c = 0; c < qtdCartelas; c++) {
            cartelas.add(new Cartela());
        }

        Cartela car = new Cartela();

        for (int c = 0; c < 75; c++) {
            g.sortearNumero();
            car.marcarNumero(g.getNumeroSorteado());
            if (car.hasBingoJanelao()) {
                System.out.println("Alguem ganhou");
                break;
            }
        }
    }
}