/**
 * Author: Romeu Bernardo
 * Classe abstrata que representa uma empresa de serviço.
 */
public abstract class EmpresaDeServico {
    protected String nome; // Nome da empresa
    protected String tipoDeServico; // Tipo de serviço oferecido pela empresa
    protected String contato; // Informações de contato da empresa
    public EmpresaDeServico(){}
    /**
     * Construtor da classe EmpresaDeServico.
     * @param nome Nome da empresa.
     * @param tipoDeServico Tipo de serviço oferecido pela empresa.
     * @param contato Informações de contato da empresa.
     */
    public EmpresaDeServico(String nome, String tipoDeServico, String contato) {
        this.nome = nome;
        this.tipoDeServico = tipoDeServico;
        this.contato = contato;
    }

    /**
     * Obtém o nome da empresa.
     * @return O nome da empresa.
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Define o nome da empresa.
     * @param nome O nome da empresa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o tipo de serviço oferecido pela empresa.
     * @return O tipo de serviço oferecido pela empresa.
     */
    public String getTipoDeServico() {
        return this.tipoDeServico;
    }

    /**
     * Define o tipo de serviço oferecido pela empresa.
     * @param tipoDeServico O tipo de serviço oferecido pela empresa.
     */
    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    /**
     * Obtém as informações de contato da empresa.
     * @return As informações de contato da empresa.
     */
    public String getContato() {
        return this.contato;
    }

    /**
     * Define as informações de contato da empresa.
     * @param contato As informações de contato da empresa.
     */
    public void setContato(String contato) {
        this.contato = contato;
    }

    /**
     * Método abstrato para gerenciar contratos de serviço.
     * Este método deve ser implementado pelas subclasses.
     */
    public abstract void gerenciarContratosServico();

    /**
     * Método abstrato para manter registros de pagamentos.
     * Este método deve ser implementado pelas subclasses.
     */
    public abstract void manterRegistrosPagamentos();
}
