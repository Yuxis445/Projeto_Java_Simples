package Projeto_Java.eletros;

public class Geladeira {

    Eletros[] geladeira = new Eletros[6];
    {
        //220V
        geladeira[0] = new Eletros("Panasonic Frost Free com Painel Eletrônico - 387 L","Branco", "Panasonic", "NR-BT40BD1W", "TIPO C unipolar 6A",
                220, 2499.00, 2.5, 45);
        geladeira[1] = new Eletros("Refrigerador Top Freezer 474L Platinum","Prata/INOX", "ELECTROLUX", "TF56S", "TIPO C unipolar 6A",
                220, 3399.00, 2.5, 0);
        geladeira[2] = new Eletros("Frost Free Samsung Evolution 460L","INOX", "SAMSUNG", "RT46K", "TIPO C unipolar 6A",
                220, 4559.05, 2.5, 41.6);
        //110V
        geladeira[3] = new Eletros("Refrigerador Electrolux 240L 1 Porta","BRANCO", "ELECTROLUX", "RE31", "TIPO C unipolar 10A",
                110, 1399.00, 2.5, 23.7);
        geladeira[4] = new Eletros("Frost Free TF55 com Prateleira Reversível","Branco", "ELECTROLUX", "TF55", "TIPO C unipolar 10A",
                110, 3399.00, 2.5, 23.7);
        geladeira[5] = new Eletros("Frost Free Evox - 573L com Smart Bar Ative! ","EVOX", "BRASTEMP", "INVERSE MAXI", "TIPO C unipolar 10A",
                110, 5199.00, 2.5, 68);
    };
    
    void selectG(int n){
        geladeira[n].verInfo();
    }
    
}