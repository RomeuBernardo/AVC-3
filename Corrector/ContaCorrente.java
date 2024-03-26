public class ContaCorrente {
    private double saldo;

    public ContaCorrente() {
        this.saldo = 0.0;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public double depositar(double valor) {
       return this.saldo += valor;
    }
    
    public boolean levantar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false; // Saldo insuficiente
        }
    }
    
    public void calcularJurosAtraso(double valorEmAtraso) {
        // Calcular juros de atraso (0.2% ao dia)
        double juros = valorEmAtraso * 0.002;
        this.saldo += juros;
    }
    
}

