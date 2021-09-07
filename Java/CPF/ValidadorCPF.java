public class ValidadorDeCPF {
    static int[] cpfNumeroVetor = new int[11];
    static int[] numeroFevricar = new int[2];
    static int somaCpf;
    static char ch;
    static float resto;

    public static boolean validate(String cpf) {
        //Pimeiro digito

        for (int c = 0; c < cpfNumeroVetor.length - 2; c++) {
            ch = cpf.charAt(c);
            cpfNumeroVetor[c] = Integer.parseInt(String.valueOf(ch));
        }


        for (int c = 0; c < cpfNumeroVetor.length - 2; c++) {
            if (c == 0) {
                cpfNumeroVetor[c] *= 10;
            }
            if (c == 1) {
                cpfNumeroVetor[c] *= 9;
            }
            if (c == 2) {
                cpfNumeroVetor[c] *= 8;
            }
            if (c == 3) {
                cpfNumeroVetor[c] *= 7;
            }
            if (c == 4) {
                cpfNumeroVetor[c] *= 6;
            }
            if (c == 5) {
                cpfNumeroVetor[c] *= 5;
            }
            if (c == 6) {
                cpfNumeroVetor[c] *= 4;
            }
            if (c == 7) {
                cpfNumeroVetor[c] *= 3;
            }
            if (c == 8) {
                cpfNumeroVetor[c] *= 2;
            }

        }
        for (int c = 0; c < cpfNumeroVetor.length - 2; c++) {
            somaCpf += cpfNumeroVetor[c];
        }

        resto = somaCpf % 11;
        int restoInt = (int) resto;

        if (restoInt < 2) {
            numeroFevricar[0] = 0;
        } else {
            numeroFevricar[0] = 11 - restoInt;
        }
        //Fim do primeiro digito

        //Inicio do Segundo Digito

        for (int c = 0; c < cpfNumeroVetor.length - 2; c++) {
            ch = cpf.charAt(c);
            cpfNumeroVetor[c] = Integer.parseInt(String.valueOf(ch));
        }
        cpfNumeroVetor[9] = numeroFevricar[0];
        for (int c = 0; c < cpfNumeroVetor.length - 1; c++) {
            if (c == 0) {
                cpfNumeroVetor[c] *= 11;
            }
            if (c == 1) {
                cpfNumeroVetor[c] *= 10;
            }
            if (c == 2) {
                cpfNumeroVetor[c] *= 9;
            }
            if (c == 3) {
                cpfNumeroVetor[c] *= 8;
            }
            if (c == 4) {
                cpfNumeroVetor[c] *= 7;
            }
            if (c == 5) {
                cpfNumeroVetor[c] *= 6;
            }
            if (c == 6) {
                cpfNumeroVetor[c] *= 5;
            }
            if (c == 7) {
                cpfNumeroVetor[c] *= 4;
            }
            if (c == 8) {
                cpfNumeroVetor[c] *= 3;
            }
            if (c == 9) {
                cpfNumeroVetor[c] *= 2;
            }

        }
        somaCpf = 0;
        for (int c = 0; c < cpfNumeroVetor.length - 1; c++) {
            somaCpf += cpfNumeroVetor[c];
        }

        resto = somaCpf % 11;
        restoInt = (int) resto;

        if (restoInt < 2) {
            numeroFevricar[1] = 0;
        } else {
            numeroFevricar[1] = 11 - restoInt;
        }
        int num1 = Integer.parseInt(String.valueOf(cpf.charAt(9)));
        int num2 = Integer.parseInt(String.valueOf(cpf.charAt(10)));
        if (num1 == numeroFevricar[0] && num2 == numeroFevricar[1]) {
            return true;
        }
        //Termino da Segunda parte

        return false;

    }

    public static boolean validaCPFcomString(String cpf) {
        int cont = 0;
        //Primeira parte
        for (int c = 0; c < cpfNumeroVetor.length ; c++) {
            ch = cpf.charAt(c);
            if (ch != '.' && ch != '-') {
                cpfNumeroVetor[cont] = Integer.parseInt(String.valueOf(ch));
                cont++;
            }
        }
        for (int c = 0; c < cpfNumeroVetor.length - 2; c++) {
            if (c == 0) {
                cpfNumeroVetor[c] *= 10;
            }
            if (c == 1) {
                cpfNumeroVetor[c] *= 9;
            }
            if (c == 2) {
                cpfNumeroVetor[c] *= 8;
            }
            if (c == 3) {
                cpfNumeroVetor[c] *= 7;
            }
            if (c == 4) {
                cpfNumeroVetor[c] *= 6;
            }
            if (c == 5) {
                cpfNumeroVetor[c] *= 5;
            }
            if (c == 6) {
                cpfNumeroVetor[c] *= 4;
            }
            if (c == 7) {
                cpfNumeroVetor[c] *= 3;
            }
            if (c == 8) {
                cpfNumeroVetor[c] *= 2;
            }

        }
        for (int c = 0; c < cpfNumeroVetor.length - 2; c++) {
            somaCpf += cpfNumeroVetor[c];
        }


        resto = somaCpf % 11;
        int restoInt = (int) resto;

        if (restoInt < 2) {
            numeroFevricar[0] = 0;
        } else {
            numeroFevricar[0] = 11 - restoInt;
        }

        //Fim do primeiro digito

        //Inicio do Segundo Digito
        cont = 0;
        for (int c = 0; c < cpfNumeroVetor.length ; c++) {
            ch = cpf.charAt(c);
            if (ch != '.' && ch != '-') {
                cpfNumeroVetor[cont] = Integer.parseInt(String.valueOf(ch));
                cont++;
            }
        }
        cpfNumeroVetor[9] = numeroFevricar[0];
        for (int c = 0; c < cpfNumeroVetor.length - 1; c++) {
            if (c == 0) {
                cpfNumeroVetor[c] *= 11;
            }
            if (c == 1) {
                cpfNumeroVetor[c] *= 10;
            }
            if (c == 2) {
                cpfNumeroVetor[c] *= 9;
            }
            if (c == 3) {
                cpfNumeroVetor[c] *= 8;
            }
            if (c == 4) {
                cpfNumeroVetor[c] *= 7;
            }
            if (c == 5) {
                cpfNumeroVetor[c] *= 6;
            }
            if (c == 6) {
                cpfNumeroVetor[c] *= 5;
            }
            if (c == 7) {
                cpfNumeroVetor[c] *= 4;
            }
            if (c == 8) {
                cpfNumeroVetor[c] *= 3;
            }
            if (c == 9) {
                cpfNumeroVetor[c] *= 2;
            }

        }
        somaCpf = 0;
        for (int c = 0; c < cpfNumeroVetor.length - 1; c++) {
            somaCpf += cpfNumeroVetor[c];
        }

        resto = somaCpf % 11;
        restoInt = (int) resto;

        if (restoInt < 2) {
            numeroFevricar[1] = 0;
        } else {
            numeroFevricar[1] = 11 - restoInt;
        }
        int num1 = Integer.parseInt(String.valueOf(cpf.charAt(12)));
        int num2 = Integer.parseInt(String.valueOf(cpf.charAt(13)));

        if (num1 == numeroFevricar[0] && num2 == numeroFevricar[1]) {
            return true;
        }
        return false;
        //Termino da Segunda parte
    }
}
