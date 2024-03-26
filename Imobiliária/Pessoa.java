/**
 * Author: Romeu Bernardo
 * Classe abstrata que representa uma pessoa.
 */
public abstract class Pessoa {
    private String nome; // Nome da pessoa
    private String endereco; // Endereço da pessoa
    private String email; // E-mail da pessoa
    private int telefone; // Telefone da pessoa
    private String password; // Senha da pessoa

    /**
     * Construtor padrão da classe Pessoa.
     */
    public Pessoa() {}

    /**
     * Construtor da classe Pessoa.
     * 
     * @param nome Nome da pessoa.
     * @param endereco Endereço da pessoa.
     * @param email E-mail da pessoa.
     * @param telefone Telefone da pessoa.
     * @param password Senha da pessoa.
     */
    public Pessoa(String nome, String endereco, String email, int telefone, String password) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.password = password;
    }

    // Getters

    /**
     * Obtém o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */
    public String getName() {
        return this.nome;
    }

    /**
     * Obtém o endereço da pessoa.
     * 
     * @return O endereço da pessoa.
     */
    public String getEndereco() {
        return this.endereco;
    }

    /**
     * Obtém o e-mail da pessoa.
     * 
     * @return O e-mail da pessoa.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Obtém o telefone da pessoa.
     * 
     * @return O telefone da pessoa.
     */
    public int getTelefone() {
        return this.telefone;
    }

    /**
     * Obtém a senha da pessoa.
     * 
     * @return A senha da pessoa.
     */
    public String getPassword() {
        return this.password;
    }

    // Setters

    /**
     * Define o nome da pessoa.
     * 
     * @param name O nome da pessoa.
     */
    public void setName(String name) {
        this.nome = name;
    }

    /**
     * Define o endereço da pessoa.
     * 
     * @param endereco O endereço da pessoa.
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * Define o e-mail da pessoa.
     * 
     * @param email O e-mail da pessoa.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Define o telefone da pessoa.
     * 
     * @param telefone O telefone da pessoa.
     */
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    /**
     * Define a senha da pessoa.
     * 
     * @param password A senha da pessoa.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Método abstrato para realizar login.
     */
    public abstract void login(); 

    /**
     * Método abstrato para realizar logout.
     */
    public abstract void logout();

    /**
     * Método abstrato para realizar o cadastro.
     */
    public abstract void cadastrar();
}
