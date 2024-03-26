/**
 * Author: Romeu Bernardo
 * A classe Venda representa uma transação de venda de um imóvel.
 */
public class Venda {
    private Agencia agencia; // Agência onde a venda foi realizada
    private Data dataVendida; // Data da venda
    private Proprietario proprietario; // Proprietário do imóvel vendido
    private Imoveis imoveis; // Imóvel vendido
    private Cliente cliente; // Cliente que comprou o imóvel

    /**
     * Construtor da classe Venda.
     * Cria uma instância de Venda com os parâmetros especificados.
     * 
     * @param agencia Agência onde a venda foi realizada.
     * @param dataVendida Data da venda.
     * @param proprietario Proprietário do imóvel vendido.
     * @param cliente Cliente que comprou o imóvel.
     * @param imoveis Imóvel vendido.
     */
    public Venda(Agencia agencia, Data dataVendida, Proprietario proprietario, Cliente cliente, Imoveis imoveis) {
        this.agencia = agencia;
        this.dataVendida = dataVendida;
        this.proprietario = proprietario;
        this.cliente = cliente;
        this.imoveis = imoveis;
    }

    /**
     * Obtém a agência onde a venda foi realizada.
     * 
     * @return Agencia A agência onde a venda foi realizada.
     */
    public Agencia getAgencia() {
        return this.agencia;
    }

    /**
     * Define a agência onde a venda foi realizada.
     * 
     * @param agencia A agência onde a venda foi realizada.
     */
    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    /**
     * Obtém a data da venda.
     * 
     * @return Data A data da venda.
     */
    public Data getDataVendida() {
        return this.dataVendida;
    }

    /**
     * Define a data da venda.
     * 
     * @param dataVendida A data da venda.
     */
    public void setDataVendida(Data dataVendida) {
        this.dataVendida = dataVendida;
    }

    /**
     * Obtém o proprietário do imóvel vendido.
     * 
     * @return Proprietario O proprietário do imóvel vendido.
     */
    public Proprietario getProprietario() {
        return this.proprietario;
    }

    /**
     * Define o proprietário do imóvel vendido.
     * 
     * @param proprietario O proprietário do imóvel vendido.
     */
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * Obtém o imóvel vendido.
     * 
     * @return Imoveis O imóvel vendido.
     */
    public Imoveis getImoveis() {
        return this.imoveis;
    }

    /**
     * Define o imóvel vendido.
     * 
     * @param imoveis O imóvel vendido.
     */
    public void setImoveis(Imoveis imoveis) {
        this.imoveis = imoveis;
    }

    /**
     * Obtém o cliente que comprou o imóvel.
     * 
     * @return Cliente O cliente que comprou o imóvel.
     */
    public Cliente getCliente() {
        return this.cliente;
    }

    /**
     * Define o cliente que comprou o imóvel.
     * 
     * @param cliente O cliente que comprou o imóvel.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
