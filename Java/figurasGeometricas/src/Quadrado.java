import java.lang.Math;
import java.util.Scanner;

public class Quadrado extends FiguraGeometrica {
    int lado;
    float ar;

    public Quadrado() {
        adicionarQuadrado();
    }

    @Override
    public float getArea(){
        ar = (float) Math.pow(lado, 2);
        return ar;
    }

    @Override
    public float getPerimetro(){
        return lado*4;
    }

    public void adicionarQuadrado() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o lado do QUADRADO");
        setLado(leia.nextInt());
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                '}';
    }



    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
}
