import java.util.Scanner;

public class Triangulo extends FiguraGeometrica {
    int lado1, lado2, lado3, altura;

    public Triangulo() {
        adicionarTriangulo();
    }

    @Override
    public float getArea(){
       return ((lado3 * altura)/2);
    }

    @Override
    public float getPerimetro(){
        return lado1+lado2+lado3;
    }

    public void adicionarTriangulo() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Informe o lado1 do TRIANGULO");
        setLado1(leia.nextInt());
        System.out.println("Informe o lado2 do TRIANGULO");
        setLado2(leia.nextInt());
        System.out.println("Informe o lado3 do TRIANGULO");
        setLado3(leia.nextInt());
        System.out.println("Informe a Altura do TRIANGULO");
        setAltura(leia.nextInt());
    }


    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                ", altura=" + altura +
                '}';
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
