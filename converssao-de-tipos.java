public class ConverssaoDeTipos{

    public static void main(String[] args){
        //Inteiro para String
        int idade = 30;
        String valor = Integer.toString(idade);
        System.out.println(valor);

        //String para Inteiro
        String valor = "30";
        int idade = Integer.parseInt(valor);
        System.out.println(idade);

        //String para Real
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
    }
}