/**
 * Author: Romeu Bernardo
 * A classe Imobiliaria representa uma imobiliária que possui funcionários e agências.
 */
public class Imobiliária {
    private Funcionario funcionario[];
    private Agencia agencia[];

    /**
     * Construtor padrão da classe Imobiliaria.
     * Cria uma instância de Imobiliaria sem parâmetros.
     */
    public Imobiliária() {}

    /**
     * Construtor da classe Imobiliaria.
     * Cria uma instância de Imobiliaria com os funcionários e agências especificados.
     * 
     * @param funcionario Um array contendo os funcionários da imobiliária.
     * @param agencia Um array contendo as agências da imobiliária.
     */
    public Imobiliária(Funcionario[] funcionario, Agencia[] agencia) {
        this.funcionario = funcionario;
        this.agencia = agencia;
    }

    /**
     * Obtém os funcionários da imobiliária.
     * 
     * @return Funcionario[] Um array contendo os funcionários da imobiliária.
     */
    public Funcionario[] getFuncionario() {
        return this.funcionario;
    }

    /**
     * Define os funcionários da imobiliária.
     * 
     * @param funcionario Um array contendo os funcionários da imobiliária a ser definido.
     */
    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    /**
     * Obtém as agências da imobiliária.
     * 
     * @return Agencia[] Um array contendo as agências da imobiliária.
     */
    public Agencia[] getAgencia() {
        return this.agencia;
    }

    /**
     * Define as agências da imobiliária.
     * 
     * @param agencia Um array contendo as agências da imobiliária a ser definido.
     */
    public void setAgencia(Agencia[] agencia) {
        this.agencia = agencia;
    }

    /**
     * Método para realizar pesquisa no sistema imobiliário.
     */
    public void realizarPesquisa() {}

    /**
     * Método para aprovar o registro de um proprietário no sistema.
     */
    public void aprovarRegistroProprietario() {
    }

    /**
     * Método para registrar uma venda de imóvel.
     */
    public void registrarVenda() {}
}
