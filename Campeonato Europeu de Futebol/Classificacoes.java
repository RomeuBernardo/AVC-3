
/**
 * Representa as classificações de um grupo na fase de qualificação do campeonato.
 */
public class Classificacoes {
    private Grupo grupo;
    private Equipa[] classificadas;

    /**
     * Construtor para criar novas classificações para o grupo fornecido.
     * 
     * @param grupo O grupo associado às classificações.
     */
    public Classificacoes(Grupo grupo) {
        this.grupo = grupo;
        this.classificadas = new Equipa[10];
    }


    /**
     * @return Grupo return the grupo
     */
    public Grupo getGrupo() {
        return grupo;
    }

    /**
     * @param grupo the grupo to set
     */
    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    /**
     * @return Equipa[] return the classificadas
     */
    public Equipa[] getClassificadas() {
        return classificadas;
    }

    /**
     * @param classificadas the classificadas to set
     */
    public void setClassificadas(Equipa[] classificadas) {
        this.classificadas = classificadas;
    }

}