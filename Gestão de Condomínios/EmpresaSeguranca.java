/**
 * Romeu Bernardo
 * Classe que representa uma empresa de segurança.
 */
public class EmpresaSeguranca extends EmpresaDeServico implements InterfaceEmpresaServico {
    private String tipoSeguranca; // Tipo de serviço de segurança oferecido pela empresa
    public EmpresaSeguranca(){
        super();
    }
    /**
     * Construtor da classe EmpresaSeguranca.
     * @param nome Nome da empresa.
     * @param tipoDeServico Tipo de serviço oferecido pela empresa.
     * @param contato Informações de contato da empresa.
     * @param tipoSeguranca Tipo de serviço de segurança oferecido pela empresa.
     */
    public EmpresaSeguranca(String nome, String tipoDeServico, String contato, String tipoSeguranca) {
        super(nome, tipoDeServico, contato);
        this.tipoSeguranca = tipoSeguranca;
    }

    /**
     * Obtém o tipo de serviço de segurança oferecido pela empresa.
     * @return O tipo de serviço de segurança.
     */
    public String getTipoSeguranca() {
        return this.tipoSeguranca;
    }

    /**
     * Define o tipo de serviço de segurança oferecido pela empresa.
     * @param tipoSeguranca O tipo de serviço de segurança.
     */
    public void setTipoSeguranca(String tipoSeguranca) {
        this.tipoSeguranca = tipoSeguranca;
    }

    @Override
    public void gerenciarContratosServico() {
        // Implementação para gerenciar contratos de serviço
    }

    @Override
    public void manterRegistrosPagamentos() {
        // Implementação para manter registros de pagamentos
    }
}
