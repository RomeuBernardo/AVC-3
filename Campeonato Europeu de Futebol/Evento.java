/**
 * Representa um evento durante um jogo.
 */
abstract class Evento {
    private int minuto;

    /**
     * Construtor para criar um novo evento com o minuto fornecido.
     * 
     * @param minuto O minuto em que o evento ocorreu.
     */
    public Evento(int minuto) {
        this.minuto = minuto;
    }

    /**
     * Obtém o minuto em que o evento ocorreu.
     * 
     * @return O minuto do evento.
     */
    public int getMinuto() {
        return this.minuto;
    }
}
