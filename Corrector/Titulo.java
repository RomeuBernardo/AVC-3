public class Titulo
{
    private String designacao;
    private Data dataEmissao;
    private int valorFacial;
    private String nome;
    public Titulo(){}
        public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setDesignacao(String designacao)
    {
        this.designacao = designacao;
    }
    public String getDesignacao()
    {
       return this.designacao;
    }
    public void setDataEmissao(Data dataEmissao)
    {
        this.dataEmissao = dataEmissao;
    }
    public Data getDataDeEmissao()
    {
        return this.dataEmissao;
    }
    public void setValorFacial(int valorFacial)
    {
        this.valorFacial = valorFacial;
    } 
    public int getValorFacial()
    {
        return this.valorFacial;
    }

}