/**
 * Romeu Bernardo
 * A interface InterfacePessoa define os métodos básicos que uma pessoa pode executar em um sistema.
 */
public interface InterfacePessoa {
    
    /**
     * Método para realizar login no sistema.
     */
    public abstract void login();

    /**
     * Método para realizar logout do sistema.
     */
    public abstract void logout();

    /**
     * Método para cadastrar informações no sistema.
     */
    public abstract void cadastrar();
}
