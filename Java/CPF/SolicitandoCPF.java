import java.util.Scanner;

public class SolicitandoCPF {
    public static void main(String[] args) {
        ValidadorDeCPF validar = new ValidadorDeCPF();
        Scanner leia = new Scanner(System.in);

        String cpf;

        System.out.println("Informe CPF");

        cpf = leia.next();

        if (cpf.charAt(3) == '.') {
            if (validar.validaCPFcomString(cpf)) {
                System.out.println("É um CPF valido");
            } else {
                System.out.println("CPF inexistente");
            }
        } else {
            if (validar.validate(cpf)) {
                System.out.println("É um CPF valido");
            } else {
                System.out.println("CPF inexistente");
            }
        }
    }
}
