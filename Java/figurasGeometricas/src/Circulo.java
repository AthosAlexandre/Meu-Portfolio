import java.util.Scanner;

public class Circulo extends FiguraGeometrica {

    float raio;
    float A;
    public Circulo() {
        adicionarCirculo();
    }

    @Override
    public float getArea(){
        A = ((float) Math.PI * (float) Math.pow(raio, 2));
        return A;
    }

    @Override
    public float getPerimetro(){
        return (2f*3.14f)*raio;
    }

    public void adicionarCirculo() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Solicite o raio do CIRCULO");
        setRaio(leia.nextFloat());
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}

