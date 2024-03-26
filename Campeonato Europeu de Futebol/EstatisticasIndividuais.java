/**
 * Representa as estatísticas individuais de um jogador.
 */
public class EstatisticasIndividuais {
    private int passes;
    private int assistencias;
    private int remates;
    private int minutosJogados;

    /**
     * Construtor para criar novas estatísticas individuais.
     * 
     * @param passes Número de passes realizados pelo jogador.
     * @param assistencias Número de assistências feitas pelo jogador.
     * @param remates Número de remates efetuados pelo jogador.
     * @param minutosJogados Número de minutos jogados pelo jogador.
     */
    public EstatisticasIndividuais(int passes, int assistencias, int remates, int minutosJogados) {
        this.passes = passes;
        this.assistencias = assistencias;
        this.remates = remates;
        this.minutosJogados = minutosJogados;
    }

    /**
     * Obtém o número de passes realizados pelo jogador.
     * 
     * @return O número de passes realizados pelo jogador.
     */
    public int getPasses() {
        return passes;
    }

    /**
     * Obtém o número de assistências feitas pelo jogador.
     * 
     * @return O número de assistências feitas pelo jogador.
     */
    public int getAssistencias() {
        return assistencias;
    }

    /**
     * Obtém o número de remates efetuados pelo jogador.
     * 
     * @return O número de remates efetuados pelo jogador.
     */
    public int getRemates() {
        return remates;
    }

    /**
     * Obtém o número de minutos jogados pelo jogador.
     * 
     * @return O número de minutos jogados pelo jogador.
     */
    public int getMinutosJogados() {
        return minutosJogados;
    }
}
