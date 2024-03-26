/**
 * Author: Romeu Bernardo
 * A classe Main é a classe principal do programa.
 * É responsável por iniciar a execução do sistema de gerenciamento imobiliário.
 */
public class Main {
    
    /**
     * O método main é o ponto de entrada do programa.
     * Inicia a execução do sistema de gerenciamento imobiliário criando instâncias de diferentes entidades.
     * 
     * @param args Os argumentos da linha de comando (não são usados neste programa).
     */
    public static void main(String[] args) {
        Imobiliária _imobiliária = new Imobiliária();
        Proprietario _proprietario = new Proprietario();
        Cliente _cliente = new Cliente();
        Funcionario _funcionario = new Funcionario();
        _imobiliária.aprovarRegistroProprietario();
    } 
}
