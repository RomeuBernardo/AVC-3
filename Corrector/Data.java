import java.util.Scanner;
public class Data 
{
    private int dia;
    private int ano;
    private String mes;
    public Data(){}
    Scanner leia = new Scanner(System.in);
    public void setDia(int dia)
    {
        this.dia = dia;
    }
    public int getDia()
    {
        return this.dia;
    }
    public void setAno(int ano)
    {
        this.ano = ano;
    }
    public int getAno()
    {
        return this.ano;
    }
    public void setMes(String mes)
    {
        this.mes = mes;
    }
    public String getMes()
    {
        return this.mes;
    }
    
	             public Data CriacaoData()
                {
                    Data novadata= new Data();
                    System.out.println("\nDigite o dia");
                    novadata.dia = leia.nextInt();
                    while(novadata.dia<=0 || novadata.dia>31)
				    {
                        System.out.println("\nErro Digite o dia novamente");
                        novadata.dia = leia.nextInt();
			    	}
                     System.out.println("\nDigite o Mes ");
                     novadata.mes = leia.next();
                     
                      System.out.println("\nDigite o ano ");
                     novadata.ano = leia.nextInt();
                    while(novadata.ano<=0)
			    	{
                        System.out.println("\nErro Digite o mes novamente");
                        novadata.ano = leia.nextInt();
                        
				    }
                   
                    return novadata;

                }

}