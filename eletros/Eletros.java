package Projeto_Java.eletros;

public class Eletros {
    private String nome, cor, marca, modelo, disjuntor;
    private int tensao, potencia;
    private double preco, fio, kwhMes, refrigeracao;

    // construtor
    Eletros(String nome, String cor, String marca, String modelo, String disjuntor,
            int tensao, double preco, double fio, double kwhMes)
            {
                this.nome = nome;
                this.cor = cor;
                this.marca = marca;
                this.modelo = modelo;
                this.disjuntor = disjuntor;
                this.tensao = tensao;
                this.preco = preco;
                this.fio = fio;
                this.kwhMes = kwhMes;
            }

    //setters
    public void setCor(String cor) {
        this.cor = cor;
    }
    public void setDisjuntor(String disjuntor) {
        this.disjuntor = disjuntor;
    }
    public void setFio(double fio) {
        this.fio = fio;
    }
    public void setKwhMes(double kwhMes) {
        this.kwhMes = kwhMes;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void setTensao(int tensao) {
        this.tensao = tensao;
    }
    public void setRefrigeracao(double refrigeracao) {
        this.refrigeracao = refrigeracao;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //getters

    public String getCor() {
        return cor;
    }
    public String getDisjuntor() {
        return disjuntor;
    }
    public double getFio() {
        return fio;
    }
    public double getKwhMes() {
        return kwhMes;
    }
    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getTensao() {
        return tensao;
    }
    public double getRefrigeracao() {
        return refrigeracao;
    }
    public double getPotencia() {
        return potencia;
    }
    //metodos

    public void verInfo()
    { 
        System.out.println("As informacoes do modelo indicado e: ");
        System.out.println("Nome: "+ getNome() + ", cor: " + getCor() + ", marca: " 
                            + getMarca() +"\n"+ "modelo: " + getModelo() + ", Disjuntor " + getDisjuntor()
                            + ", tensao: " +getTensao() +"\n"+  "preco: " + getPreco() +  ", fio " + getFio() 
                            + ", gasto por mes " + getKwhMes());
    }
}
