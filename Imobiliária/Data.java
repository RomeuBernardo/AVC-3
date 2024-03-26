/**
 * Author: ROmeu Bernardo
 * A classe Data representa uma data composta por dia, mês e ano.
 */
public class Data {
    private int dia; // Dia da data
    private String mes; // Mês da data
    private int ano; // Ano da data

    /**
     * Construtor da classe Data.
     * Cria uma instância de Data com os parâmetros especificados.
     * 
     * @param dia O dia da data.
     * @param mes O mês da data.
     * @param ano O ano da data.
     */
    public Data(int dia, String mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    /**
     * Obtém o dia da data.
     * 
     * @return int O dia da data.
     */
    public int getDia() {
        return dia;
    }

    /**
     * Define o dia da data.
     * 
     * @param dia O dia da data.
     */
    public void setDia(int dia) {
        this.dia = dia;
    }

    /**
     * Obtém o mês da data.
     * 
     * @return String O mês da data.
     */
    public String getMes() {
        return this.mes;
    }

    /**
     * Define o mês da data.
     * 
     * @param mes O mês da data.
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * Obtém o ano da data.
     * 
     * @return int O ano da data.
     */
    public int getAno() {
        return this.ano;
    }

    /**
     * Define o ano da data.
     * 
     * @param ano O ano da data.
     */
    public void setAno(int ano) {
        this.ano = ano;
    }
}
