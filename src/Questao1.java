public class Questao1 {
    public static void main(String[] args) {
        String frase = "Janeiro: 1543, Fevereiro: 1222, Março: 1234";

        String fraseJaneiro = frase.split(", ")[0];
        String fraseFevereiro = frase.split(", ")[1];
        String fraseMarco = frase.split(", ")[2];

        System.out.println(fraseJaneiro);
        System.out.println(fraseFevereiro);
        System.out.println(fraseMarco);

        String numeroJaneiro = frase.substring(9,13);
        String numeroFevereiro = frase.substring(26,30);
        String numeroMarco = frase.substring(39,43);

        int numero1 = Integer.parseInt(numeroJaneiro);
        int numero2 = Integer.parseInt(numeroFevereiro);
        int numero3 = Integer.parseInt(numeroMarco);

        Integer soma = numero1 + numero2 + numero3;
        System.out.println("Total: " + soma);

    }
}
