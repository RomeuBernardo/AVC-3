/**
 * Author: Romeu Bernardo
 * Classe que representa uma empresa de manutenção de elevadores.
 * Estende a classe abstrata EmpresaDeServico e implementa a interface InterfaceEmpresaServico.
 */
public class EmpresaManutencaoElevadores extends EmpresaDeServico implements InterfaceEmpresaServico {
    private String tipoElevador; // Tipo de elevador que a empresa realiza manutenção
    public EmpresaManutencaoElevadores(){
        super();
    }
    /**
     * Construtor da classe EmpresaManutencaoElevadores.
     * @param nome Nome da empresa.
     * @param tipoDeServico Tipo de serviço oferecido pela empresa.
     * @param contato Informações de contato da empresa.
     * @param tipoElevador Tipo de elevador que a empresa realiza manutenção.
     */
    public EmpresaManutencaoElevadores(String nome, String tipoDeServico, String contato, String tipoElevador) {
        super(nome, tipoDeServico, contato);
        this.tipoElevador = tipoElevador;
    }

    /**
     * Obtém o tipo de elevador que a empresa realiza manutenção.
     * @return O tipo de elevador que a empresa realiza manutenção.
     */
    public String getTipoElevador() {
        return this.tipoElevador;
    }

    /**
     * Define o tipo de elevador que a empresa realiza manutenção.
     * @param tipoElevador O tipo de elevador que a empresa realiza manutenção.
     */
    public void setTipoElevador(String tipoElevador) {
        this.tipoElevador = tipoElevador;
    }

    /**
     * Implementação do método abstrato gerenciarContratosServico da classe pai EmpresaDeServico.
     * Aqui você pode adicionar a lógica específica para gerenciar contratos de serviço da empresa de manutenção de elevadores.
     */
    @Override
    public void gerenciarContratosServico() {
        // Implementação para gerenciar contratos de serviço
    }

    /**
     * Implementação do método abstrato manterRegistrosPagamentos da classe pai EmpresaDeServico.
     * Aqui você pode adicionar a lógica específica para manter registros de pagamentos da empresa de manutenção de elevadores.
     */
    @Override
    public void manterRegistrosPagamentos() {
        // Implementação para manter registros de pagamentos
    }
}
