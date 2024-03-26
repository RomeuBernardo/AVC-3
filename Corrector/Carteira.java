import java.util.Scanner;
public class Carteira
{
    private Titulo titulo[];
    int totalTitulo=0;
    Data data = new Data();
    Scanner leia = new Scanner(System.in);
    public Carteira(){
        this.titulo = new Titulo[10];
    }
 
    public void AddTitulo()
    {
        		for(int i=0;i<10;i++)
					this.titulo[i] = new Titulo();
		
				System.out.println("\n[===================================|| CADASTRAR Titulos ||===================================]");
				
				System.out.print("Digite o  nome da Empresa: ");
				this.titulo[totalTitulo].setNome(leia.nextLine());
				
		        System.out.println("\nData De Emissao");		
				this.titulo[totalTitulo].setDataEmissao(data.CriacaoData());

                System.out.println("\nDigite a  Designacao");		
				this.titulo[totalTitulo].setDesignacao(leia.next());
				System.out.println("Digite o valor facial");
                int valor = leia.nextInt();
                while(valor<0.0)
                {
                    System.out.println(" ERRO:Digite o valor facial");
                     valor = leia.nextInt();
                }
            	this.titulo[totalTitulo].setValorFacial(valor);
			   totalTitulo++;
				imprimirTitulo();
	
    }
     public void  imprimirTitulo()
    {
        
        if(totalTitulo<=0)System.out.println("Nao existe Nenho Titulo  Cadastrado\n");
		else
			for(int i=0;i<totalTitulo;i++)
				System.out.println("\nEmpresa"+ this.titulo[i].getNome() +"\nData de De Emissao "+ this.titulo[i].getDataDeEmissao().getDia() +"/"+ this.titulo[i].getDataDeEmissao().getMes() +"/"+ this.titulo[i].getDataDeEmissao().getAno() +"\nValor facial"+ this.titulo[i].getValorFacial() +"\n Designaçao:"+ this.titulo[i].getDesignacao());
		
    }
    public double calcularValorCarteira()
     {
           
        if(totalTitulo<=0){
            return -1.0;
        }    
        else
        {    
            double valorTotal = 0.0;
            for(int i=0;i<totalTitulo;i++)      
                 valorTotal +=  this.titulo[i].getValorFacial()*totalTitulo;
            return  valorTotal;
        }
     }    

       public int total()
        {
            return totalTitulo;
        }
    
}



