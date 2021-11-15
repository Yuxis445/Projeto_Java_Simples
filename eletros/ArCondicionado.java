package Projeto_Java.eletros;

public class ArCondicionado {
    Eletros[] arCondicionado = new Eletros[6];
    {
        arCondicionado[0] = new Eletros("Ar Condicionado Split 9.000 Btus Frio","Branco", "Philco", "PAS9100F1", "TIPO C unipolar 10A",
                220, 1098.90, 2.5, 0);
        arCondicionado[0].setRefrigeracao(9000);
        arCondicionado[1] = new Eletros("Ar Condicionado Split HW Inverter Daikin Advance","Branco", "DAIKIN", "PAS9100F1", "TIPO C unipolar 10A",
                220, 2514.74, 2.5, 0);
        arCondicionado[1].setRefrigeracao(12000);
        arCondicionado[2] = new Eletros("Ar Condicionado Split Digital Inverter Samsung 22000","Branco", "Samsung", "AR24NVFPCWKNAZ", "TIPO C unipolar 16A",
                220, 3695.12, 2.5, 0);
        arCondicionado[2].setRefrigeracao(22000);

        arCondicionado[3] = new Eletros("Split Hw Dual Inverter Lg 12000 Btus Frio","Branco", "LG", "S4NQ12JA3WF.EB1GAMZ", "TIPO C unipolar 15A",
                110, 2268.64, 2.5, 0);
        arCondicionado[3].setRefrigeracao(9000);
        arCondicionado[4] = new Eletros("Ar Condicionado Portátil Dual Inverter LG Voice","Branco", "LG", "LP1419IVSM. EC1AAMZ", "TIPO C unipolar 15A",
                110, 4864.85, 2.5, 0);
        arCondicionado[4].setRefrigeracao(14000);
        arCondicionado[5] = new Eletros("Ar Condicionado Split Hi Wall Fontaine 9.000 BTU/h Frio Monofásico","Branco", "Fontaine", "FONTAINE", "TIPO C unipolar 15A",
                110, 2268.64, 2.5, 0);
        arCondicionado[5].setRefrigeracao(12000);
    };

    


    void selectAr(int n){
        arCondicionado[n].verInfo();
        System.out.print("Capacidade de Refrigeracao: " + arCondicionado[n].getRefrigeracao());
    }
}
