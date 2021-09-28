import java.util.Scanner;

public class Retangulo extends FiguraGeometrica {
    int base, altura;

    public Retangulo() {
        adicionarRetangulo();
    }

    @Override
    public float getArea(){
        return base*altura;
    }

    @Override
    public float getPerimetro(){
        return (2*(base+altura));
    }

    public void adicionarRetangulo() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Solicite base do RETANGULO");
        setBase(leia.nextInt());
        System.out.println("Solicite altura do RETANGULO");
        setAltura(leia.nextInt());
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
