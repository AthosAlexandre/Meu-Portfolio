public class ValidadorDeCPF {
    private int[] cpfNumeroVetor = new int[11];
    private int[] numeroVerificar = new int[2];
    private int somaCpf;
    private char digito;
    private float resto;
    private int restoInt ;
    int quantidadeDigitosCpf = 11;

    public boolean isValidacaoCpfSemPonto(String cpf) {
        acharPrimeiroDigito(cpf);
        acharSegundoDigito(cpf);
        return isValidacao(cpf);
    }

    public boolean isValidacaoCpfComPonto(String cpf) {
        acharPrimeiroDigito(tirarCaractereEspecial(cpf));
        acharSegundoDigito(tirarCaractereEspecial(cpf));
        return isValidacao(cpf);
    }

    private void acharPrimeiroDigito(String cpf){
        passandoCpfParaVetor(cpf);
        multiplicandoCadaNumeroDoCPFdoPrimeiroDigito();
        somandoOsValoresDoVetorCPF();
        passandoOprimeiroDigitoParaoVetorDeFerificacao();
    }

    private void acharSegundoDigito(String cpf){
        passandoCpfParaVetor(cpf);
        multiplicandoCadaNumeroDoCPFdoSegundoDigito();
        somandoOsValoresDoVetorCPFsegundaParte();
        passandoOsegundoDigitoParaoVetorDeFerificacao();
    }

    private String tirarCaractereEspecial(String cpf){
        int contador = 0;
        String cpfLimpo = "";

        for (int index = 0; index < cpfNumeroVetor.length ; index++) {
            digito = cpf.charAt(index);
            if (digito != '.' && digito != '-') {
                cpfLimpo += String.valueOf(digito);
                cpfNumeroVetor[contador] = Integer.parseInt(String.valueOf(digito));
                contador++;
            }
        }
        return  cpfLimpo;
    }

    private void passandoCpfParaVetor(String cpf){
        for (int index = 0; index < cpfNumeroVetor.length - 2; index++) {
            digito = cpf.charAt(index);
            cpfNumeroVetor[index] = Integer.parseInt(String.valueOf(digito));
        }
    }

    private void multiplicandoCadaNumeroDoCPFdoPrimeiroDigito(){
        for (int index = 0; index < cpfNumeroVetor.length - 2; index++) {
            switch (index){
                case 0:
                    cpfNumeroVetor[index] *= 10;
                    break;
                case 1:
                    cpfNumeroVetor[index] *= 9;
                    break;
                case 2:
                    cpfNumeroVetor[index] *= 8;
                    break;
                case 3:
                    cpfNumeroVetor[index] *= 7;
                    break;
                case 4:
                    cpfNumeroVetor[index] *= 6;
                    break;
                case 5:
                    cpfNumeroVetor[index] *= 5;
                    break;
                case 6:
                    cpfNumeroVetor[index] *= 4;
                    break;
                case 7:
                    cpfNumeroVetor[index] *= 3;
                    break;
                case 8:
                    cpfNumeroVetor[index] *= 2;
                    break;
            }
        }
    }

    private void multiplicandoCadaNumeroDoCPFdoSegundoDigito(){
        for (int index = 0; index < cpfNumeroVetor.length - 1; index++) {

            switch (index){
                case 0:
                    cpfNumeroVetor[index] *= 11;
                    break;
                case 1:
                    cpfNumeroVetor[index] *= 10;
                    break;
                case 2:
                    cpfNumeroVetor[index] *= 9;
                    break;
                case 3:
                    cpfNumeroVetor[index] *= 8;
                    break;
                case 4:
                    cpfNumeroVetor[index] *= 7;
                    break;
                case 5:
                    cpfNumeroVetor[index] *= 6;
                    break;
                case 6:
                    cpfNumeroVetor[index] *= 5;
                    break;
                case 7:
                    cpfNumeroVetor[index] *= 4;
                    break;
                case 8:
                    cpfNumeroVetor[index] *= 3;
                    break;
                case 9:
                    cpfNumeroVetor[index] *= 2;
                    break;
            }
        }
    }

    private void somandoOsValoresDoVetorCPF(){
        for (int index = 0; index < cpfNumeroVetor.length - 2; index++) {
            somaCpf += cpfNumeroVetor[index];
        }
    }

    private void somandoOsValoresDoVetorCPFsegundaParte(){
        somaCpf = 0;
        for (int c = 0; c < cpfNumeroVetor.length - 1; c++) {
            somaCpf += cpfNumeroVetor[c];
        }

    }

    private void passandoOprimeiroDigitoParaoVetorDeFerificacao(){
        resto = somaCpf % quantidadeDigitosCpf;
        restoInt = (int) resto;

        if (restoInt < 2) {
            numeroVerificar[0] = 0;
        } else {
            numeroVerificar[0] = quantidadeDigitosCpf - restoInt;
        }
        cpfNumeroVetor[9] = numeroVerificar[0];
    }

    private void passandoOsegundoDigitoParaoVetorDeFerificacao(){

        resto = somaCpf % quantidadeDigitosCpf;
        restoInt = (int) resto;

        if (restoInt < 2) {
            numeroVerificar[1] = 0;
        } else {
            numeroVerificar[1] = quantidadeDigitosCpf - restoInt;
        }
    }

    private boolean isValidacao(String cpf){
        int penultimoDigito = Integer.parseInt(String.valueOf(cpf.charAt(cpf.length()-2)));
        int ultimoDigito = Integer.parseInt(String.valueOf(cpf.charAt(cpf.length()-1)));

        if (penultimoDigito == numeroVerificar[0] && ultimoDigito == numeroVerificar[1]) {
            return true;
        }

        return false;
    }

}
