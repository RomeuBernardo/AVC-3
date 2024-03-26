public class Cliente
{
    private String nome;
    private  int telefone;
    private Data dataCompra;
    private Carteira carteira;
    private int id ;
    private int senha;
    private ContaCorrente conta;
    public Cliente(){}
    public void setNome(String nome)
    {
        this.nome = nome;
        this.conta =new ContaCorrente();
    }
    public void setConta(ContaCorrente conta)
    {
        this.conta=conta;
    }
     public ContaCorrente getConta()
    {
       return this.conta;
    }
    public String getNome()
    {
       return this.nome;
    }
        public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    public int getTelefone()
    {
        return this.telefone;
    }
    public void setCompra(Data dataCompra)
    {
        this.dataCompra = dataCompra;
    }
    public Data getCompra()
    {
        return this.dataCompra;
    }
    public void setCarteira(Carteira carteira)
    {
        this.carteira=carteira;
    }
    public Carteira getCarteira()
    {
        return this.carteira;
    }
     public void setSenha( int senha)
  {
    this.senha=senha;
  }
  public int getSenha()
  {
    return this.senha;
  }
    public void setId( int id)
  {
    this.id=id;
  }
   public int getId()
  {
    return this.id;
  }
}