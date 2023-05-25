package DesafiosOttimizza;

public class Desafio1 {
    public static void main(String[] args) throws Exception {
        new Desafio1();
    }

    public Desafio1() {
        try {
            System.out.println(formatarData("20220104"));
        } catch (Exception e) {
            System.out.println("erro");
        }
    }

    public String formatarData(String s) throws Exception {
        // Formata a string
        int tamanho = s.length();
        String nf = ""; // String formatada para criar data;
        switch (tamanho) {
            case 10 -> {
                // Se a string possuir 10 caracteres ela cai ou no formato xx/xx/xxxx ou
                // xxxx/xx/xx
                String[] form = s.split("[/| ]");
                if (form[0].length() == 4) {
                    nf = String.format("%s %s", form[0], form[1]);
                } else {
                    nf = String.format("%s %s", form[2], form[1]);
                }
            }

            case 8-> {
                // Se os primeiros digitos (que representariam os dias) forem maiores que 31, e
                // subsequentemente, os digitos dos meses maiores que 12, seria um indicador de
                // que os primeiros 4 digitos representam o ano
                if (Integer.parseInt(s.substring(0, 2)) > 31 || Integer.parseInt(s.substring(2, 4)) > 12) {
                    nf += s.substring(0, 4) + " " + s.substring(4, 6);
                } else {
                    nf += s.substring(2, 4) + " " + s.substring(4, 8); //SUb entende-se que o outro formato é ano/mes/dia, e não ano/dia/mes
                }
            }

            default -> {
                throw new RuntimeException();
            }
        }
        return nf;
    }

}
