package Projeto_Java.eletros;

public class Chuveiro {
    Eletros[] chuveiro = new Eletros[6];
    {
        chuveiro[0] = new Eletros("Ducha Top Banho 4t","Branco", "Sintex", "DT265 – 4 TEMPERATURAS", "TIPO B bipolar 35A",
                220, 78.00, 4, 0);
        chuveiro[0].setPotencia(6500);
        chuveiro[1] = new Eletros("Lorenzetti Acqua Ultra Storm","Preto","Lorenzetti", "ACQUA STORM ULTRA – 4 TEMPERATURAS", "TIPO B bipolar 40A",
                220, 287.91, 6, 0);
        chuveiro[1].setPotencia(7800);
        chuveiro[2] = new Eletros("Acqua Duo Ultra","Preto e Cromado", "Lorenzetti", "ACQUA DUO ULTRA – 4 TEMPERATURAS", "TIPO B bipolar 40A",
                220, 474.21, 6, 0);
        chuveiro[2].setPotencia(7800);

        chuveiro[3] = new Eletros("BELLA DUCHA 4T ","Branco", "Lorenzetti", "7531200 – 4 TEMPERATURAS", "TIPO B unipolar 50A",
                110, 59.99, 10, 0);
        chuveiro[3].setPotencia(5500);
        chuveiro[4] = new Eletros("DUCHA ELETRONICA SINTEX","Branco","Sintex", "ELETRONICO – 4 TEMPERATURAS", "TIPO B unipolar 50A",
                110, 151.91, 10, 0);
        chuveiro[4].setPotencia(5400);
        chuveiro[5] = new Eletros("HYDRA DPQD DP 551BR, DUCHA DIGITAL QUADRATTA PLUS","Branco", "HYDRA", "DPQD.DP.551BR– 4 TEMPERATURAS", "TIPO B unipolar 50A",
                110, 319.00, 10, 0);
        chuveiro[5].setPotencia(5500);
    }

    void selectC(int n)
    {
        chuveiro[n].verInfo();
        System.out.println("Potencia: " + chuveiro[n].getPotencia());
    }
}
