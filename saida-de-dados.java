public class TiposPrimitivos{

    public static void main(String[] args){
        String nome = "Gustavo";
        float nota = 8.5f;
        System.out.print("Sua nota é" + nota);
        System.out.println("Sua nota é" + nota);
        System.out.printf("A nota de %s é %.2f \n", nome ,nota);
        System.out.format("A nota de %s é %.1f \n", nome ,nota);
    }
}