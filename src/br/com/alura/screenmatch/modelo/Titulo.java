package br.com.alura.screenmatch.modelo;

public class Filme {

    private  String nome ;
    private  int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private   int totalAvaliacoes;
    private int duracaoEmMinutos;


    public int getTotalAvaliacoes() {
        return totalAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public double getSomaDasAvaliacoes() {
        return somaDasAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setTotalAvaliacoes(int totalAvaliacoes) {
        this.totalAvaliacoes = totalAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSomaDasAvaliacoes(double somaDasAvaliacoes) {
        this.somaDasAvaliacoes = somaDasAvaliacoes;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("nome do filme é : " + nome);
        System.out.println("Ano do lançamento do br.com.alura.screenmatch.modelo.Filme é: " + anoDeLancamento);

    }

    public void avalia(double nota){

        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes/totalAvaliacoes;
    }

}
