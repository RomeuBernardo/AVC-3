public class MovimentoDeCarteira
{
    private double deposito;
    private double levantamentos;
    public MovimentoDeCarteira(){}
    public void setLevantamento(double levantamentos)
    {
        this.levantamentos = levantamentos;
    }
    public double getLevantamento()
    {
        return this.levantamentos;
    }
    public void setDeposito(double deposito)
    {
        this.deposito = deposito;
    }
    public double getDeposito()
    {
        return this.deposito;
    }

}