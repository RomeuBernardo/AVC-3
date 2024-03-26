public class  Funcionario
{
    private int numero;
    private String nome;
    private int senha;
    private Data  dataDeAdmissao; 
    private Data dataDeRescisao;
    private double salarioBase;
    private int telefone;
    private int id;
    public Funcionario(){}
    public Funcionario(String nome,int numero,int senha,Data  dataDeAdmissao,Data dataDeRescisao,double salarioBase,int telefone,int id)
    {
        this.nome = nome;
        this.numero = numero;
        this.senha=senha;
        this.dataDeAdmissao = dataDeAdmissao;
        this.dataDeRescisao = dataDeRescisao;
        this.salarioBase = salarioBase;
        this.telefone = telefone;
        this.id = id;
    }
    public void setNumero(int numero)
    {
        this.numero = numero;
    }
    public int getNumero()
    {
        return this.numero;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setDataDeAdimissao(Data dataDeAdmissao)
    {
        this.dataDeAdmissao = dataDeAdmissao;
    }
    public Data getDataDeAdmissao()
    {
        return this.dataDeAdmissao;
    }
    public void setDataDeRescisao(Data dataDeRescisao )
    {
        this.dataDeRescisao = dataDeRescisao;
    }
    public Data getDataDeRescisao()
    {
        return this.dataDeRescisao;
    }
    public void setSalarioBase(double salarioBase)
    {
        this.salarioBase = salarioBase;
    }
    public double getSalarioBase()
    {
        return this.salarioBase;
    }
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
    }
    public int getTelefone()
    {
        return this.telefone;
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