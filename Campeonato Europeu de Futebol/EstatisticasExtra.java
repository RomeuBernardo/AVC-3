/**
 * Representa as estatísticas extras de um jogo.
 */
public class EstatisticasExtra {
    private int rematesEquipaCasa;
    private int rematesEquipaVisitante;
    // Outras estatísticas extras do jogo

    /**
     * Construtor sem parâmetros.
     */
    public EstatisticasExtra() {}

    /**
     * Construtor com parâmetros.
     * 
     * @param rematesEquipaCasa Quantidade de remates da equipa da casa.
     * @param rematesEquipaVisitante Quantidade de remates da equipa visitante.
     */
    public EstatisticasExtra(int rematesEquipaCasa, int rematesEquipaVisitante) {
        this.rematesEquipaCasa = rematesEquipaCasa;
        this.rematesEquipaVisitante = rematesEquipaVisitante;
    }

    /**
     * Obtém a quantidade de remates da equipa da casa.
     * 
     * @return A quantidade de remates da equipa da casa.
     */
    public int getRematesEquipaCasa() {
        return rematesEquipaCasa;
    }

    /**
     * Define a quantidade de remates da equipa da casa.
     * 
     * @param rematesEquipaCasa A quantidade de remates da equipa da casa.
     */
    public void setRematesEquipaCasa(int rematesEquipaCasa) {
        this.rematesEquipaCasa = rematesEquipaCasa;
    }

    /**
     * Obtém a quantidade de remates da equipa visitante.
     * 
     * @return A quantidade de remates da equipa visitante.
     */
    public int getRematesEquipaVisitante() {
        return rematesEquipaVisitante;
    }

    /**
     * Define a quantidade de remates da equipa visitante.
     * 
     * @param rematesEquipaVisitante A quantidade de remates da equipa visitante.
     */
    public void setRematesEquipaVisitante(int rematesEquipaVisitante) {
        this.rematesEquipaVisitante = rematesEquipaVisitante;
    }

    // Outros métodos para estatísticas extras, como assistências, faltas, etc., podem ser adicionados conforme necessário
}
