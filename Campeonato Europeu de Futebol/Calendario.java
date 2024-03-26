
/**
 * Representa um jogo no calendário do campeonato.
 */
public class Calendario {
    private String data;
    private Cidade local;
    private Equipa equipaCasa;
    private Equipa equipaVisitante;
    private String resultado;

    /**
     * Construtor sem parâmetros.
     */
    public Calendario() {}

    /**
     * Construtor com parâmetros.
     * 
     * @param data Data do jogo.
     * @param local Cidade onde o jogo será realizado.
     * @param equipaCasa Equipe da casa.
     * @param equipaVisitante Equipe visitante.
     * @param resultado Resultado do jogo.
     */
    public Calendario(String data, Cidade local, Equipa equipaCasa, Equipa equipaVisitante, String resultado) {
        this.data = data;
        this.local = local;
        this.equipaCasa = equipaCasa;
        this.equipaVisitante = equipaVisitante;
        this.resultado = resultado;
    }

    /**
     * Obtém a data do jogo.
     * 
     * @return A data do jogo.
     */
    public String getData() {
        return this.data;
    }

    /**
     * Define a data do jogo.
     * 
     * @param data A data do jogo.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém a cidade onde o jogo será realizado.
     * 
     * @return A cidade onde o jogo será realizado.
     */
    public Cidade getLocal() {
        return this.local;
    }

    /**
     * Define a cidade onde o jogo será realizado.
     * 
     * @param local A cidade onde o jogo será realizado.
     */
    public void setLocal(Cidade local) {
        this.local = local;
    }

    /**
     * Obtém a equipe da casa.
     * 
     * @return A equipe da casa.
     */
    public Equipa getEquipaCasa() {
        return this.equipaCasa;
    }

    /**
     * Define a equipe da casa.
     * 
     * @param equipaCasa A equipe da casa.
     */
    public void setEquipaCasa(Equipa equipaCasa) {
        this.equipaCasa = equipaCasa;
    }

    /**
     * Obtém a equipe visitante.
     * 
     * @return A equipe visitante.
     */
    public Equipa getEquipaVisitante() {
        return this.equipaVisitante;
    }

    /**
     * Define a equipe visitante.
     * 
     * @param equipaVisitante A equipe visitante.
     */
    public void setEquipaVisitante(Equipa equipaVisitante) {
        this.equipaVisitante = equipaVisitante;
    }
     /**
     * Retorna uma representação em formato de string do jogo.
     * 
     * @return Representação do jogo em formato de string.
     */
    @Override
    public String toString() {
        return null;
    }
}