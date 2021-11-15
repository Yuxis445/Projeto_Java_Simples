package Projeto_Java.eletros;

public class EletrosTest {
    public static void main(String[] args)
    {
        new Geladeira().selectG(5);
        new Geladeira().selectG(4);
        
        System.out.println("\n");
        
        new ArCondicionado().selectAr(2);
        new ArCondicionado().selectAr(0);
        
        System.out.println("\n");

        new Chuveiro().selectC(3);
        new Chuveiro().selectC(1);
        System.out.println();

        
    }
}
