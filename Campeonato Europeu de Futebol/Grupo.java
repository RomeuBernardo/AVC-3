/**
 * Representa um grupo na fase de qualificação do campeonato.
 */
public class Grupo {
    private String nome;
    private Equipa[] equipas;
    /**
     * Construtor para criar um novo grupo com o nome fornecido.
     * 
     * @param nome O nome do grupo.
     * @param numEquipas O número de equipas no grupo.
     */
    public Grupo(String nome, int numEquipas) {
        this.nome = nome;
        this.equipas = new Equipa[10];
    }

    /**
     * Obtém o nome do grupo.
     * 
     * @return O nome do grupo.
     */
    public String getNome() {
        return nome;
    }


    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return Equipa[] return the equipas
     */
    public Equipa[] getEquipas() {
        return equipas;
    }

    /**
     * @param equipas the equipas to set
     */
    public void setEquipas(Equipa[] equipas) {
        this.equipas = equipas;
    }

}
