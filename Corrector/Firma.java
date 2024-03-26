import java.util.Scanner;
public class Firma
{
     Cliente cliente[] = new Cliente[10];
	Scanner leia = new Scanner(System.in);
	Corretor corretor[] = new Corretor[10];
	ContaCorrente conta = new ContaCorrente();
	Data data = new Data();
	int totalCorrector=-1;
	int totalCliente = -1;
    public Firma(){}
    

    public void cadastrarCorretor() 
	{
			totalCorrector++;
				for(int i=0;i<10;i++)
					corretor[i] = new Corretor();
		
				int senha;
				System.out.println("\n[===================================|| CADASTRAR CORRETOR ||===================================]");
				
				System.out.print("Digite o seu primeiro nome: ");
				corretor[totalCorrector].setNome(leia.next());
				System.out.println("Digite uma senha para a sua conta: ");
				senha = leia.nextInt();
				while(senha<2)
				{
					System.out.println("Erro senha Invalida Digite uma senha para a sua conta: ");
					senha = leia.nextInt();
				}
				corretor[totalCorrector].setSenha(senha);
				corretor[totalCorrector].setId(totalCorrector);
		        System.out.println("\nData De Admissao");		
				corretor[totalCorrector].setDataDeAdimissao(data.CriacaoData());
			    System.out.println("\nData De Recisao");		
				corretor[totalCorrector].setDataDeRescisao(data.CriacaoData());

				System.out.println("Digite o Salario Base:");
				double salarioBase = leia.nextDouble();
				while(salarioBase<0)
				{
					System.out.println("Erro Digite novamente Salario Base:");
				    salarioBase = leia.nextDouble();
				}
				corretor[totalCorrector].setSalarioBase(salarioBase);
				System.out.println("Digite o numero de Telefone:");
				int telefone = leia.nextInt();
				while(telefone<=0)
				{
					System.out.println("Digite o numero de Telefone:");
				    telefone = leia.nextInt();
				}

				corretor[totalCorrector].setTelefone(telefone);
				
				imprimirCorrector();
	
	}
	 public void adicionarCarteira(Carteira carteira) {
			
           corretor[totalCorrector].setCarteira(carteira);
    }

 public void removerCorretor(int k)
{
   if( totalCorrector<0 || k<0 || k>totalCorrector) System.out.println("Posicao invalida");
   else
   {
         for(int i=k; i<totalCorrector;i++)
         {
            corretor[i].setNome(corretor[i+1].getNome());
            corretor[i].setId(corretor[i+1].getId());
			corretor[i].setSenha(corretor[i+1].getSenha());
            corretor[i].setDataDeAdimissao(corretor[i+1].getDataDeAdmissao());
            corretor[i].setDataDeRescisao(corretor[i+1].getDataDeRescisao());
            corretor[i].setSalarioBase(corretor[i+1].getSalarioBase());
            corretor[i].setTelefone(corretor[i+1].getTelefone());


         

         }      
         totalCorrector--;

          System.out.println("=================================Removido============================");    
              
       
   }     
}
	 public void consultar( int id) 
   {
        int i;
        boolean encontrou =false;
        if(verificarCorretor())
             System.out.println("Nao existe nenho Corretor\n"); 
        else{

                     
                  for(i=0;i<=totalCorrector;i++)
                  
                     if(this.corretor[i].getId()==id)
                     {
                        encontrou = true;
                        break;
                     }
                  if(encontrou==true)  System.out.println("=================Resultado=================:\nNome:"+ corretor[i].getNome() +"\nNumero do Contrato"+ corretor[i].getId());  
                  else System.out.println("Resultado Nao Encontrado\n");   
            }         
      
   }
	public void imprimirCorrector()
	{
		if(totalCorrector<0)System.out.println("Nao existe Nenho Corrector Cadastrado\n");
		else{
			for(int i=0;i<=totalCorrector;i++)
				System.out.println("\nNome"+ corretor[i].getNome() +"\nData de adimissao:"+ corretor[i].getDataDeAdmissao().getDia() +"/"+ corretor[i].getDataDeAdmissao().getMes() +"/"+ corretor[i].getDataDeAdmissao().getAno() +"\nData de Rescisao "+ corretor[i].getDataDeRescisao().getDia() +"/"+ corretor[i].getDataDeRescisao().getMes() + "/"+ corretor[i].getDataDeRescisao().getAno() +"\nsalario"+ corretor[i].getSalarioBase() +"\nTelefone"+ corretor[i].getTelefone() +"\nId Gerado pelo sistema:"+ corretor[i].getId());
		}
	}
	  public boolean verificarCorretor()
     {
         return (this.totalCorrector<0);
     }
  public boolean pegar(int id,int senha,String nome)
  {
          return (corretor[id].getNome().equals(nome) && corretor[id].getSenha()==senha);             
  }
  
	



		//Area de Manipulacao do cliente
    public void cadastrarCliente() 
	{
			totalCliente++;
				for(int i=0;i<10;i++)
					cliente[i] = new Cliente();
		
				int senha;
				System.out.println("\n[===================================|| CADASTRAR CLIENTE ||===================================]");
				
				System.out.print("Digite o seu  nome: ");
				cliente[totalCliente].setNome(leia.next());
				System.out.println("Digite uma senha para a sua conta: ");
				senha = leia.nextInt();
				while(senha<2)
				{
					System.out.println("Erro senha Invalida Digite uma senha para a sua conta: ");
					senha = leia.nextInt();
				}
				cliente[totalCliente].setSenha(senha);
				cliente[totalCliente].setId(totalCliente);
		        System.out.println("\nData De Compra");		
				cliente[totalCliente].setCompra(data.CriacaoData());
			    
				
				System.out.println("Digite o numero de Telefone:");
				int telefone = leia.nextInt();
				while(telefone<=0)
				{
					System.out.println("Digite o numero de Telefone:");
				    telefone = leia.nextInt();
				}
				cliente[totalCliente].setTelefone(telefone);
				imprimirCliente();
	
	}
	public void imprimirCliente()
	{
		if(totalCliente<0)System.out.println("Nao existe Nenho Cliente Cadastrado\n");
		else{
			for(int i=0;i<=totalCliente;i++)
				System.out.println("\nNome"+ cliente[i].getNome() +"\nData de De compra "+ cliente[i].getCompra().getDia() +"/"+ cliente[i].getCompra().getMes() +"/"+ cliente[i].getCompra().getAno() +"\nTelefone"+ cliente[i].getTelefone() +"\nId Gerado pelo sistema:"+ cliente[i].getId());
		}
	}


	public void removerCliente(int k)
{
   if( totalCliente<0 || k<0 || k>totalCliente) System.out.println("Posicao invalida");
   else
   {
         for(int i=k; i<totalCorrector;i++)
         {
            cliente[i].setNome(cliente[i+1].getNome());
            cliente[i].setId(cliente[i+1].getId());
			cliente[i].setSenha(cliente[i+1].getSenha());
            cliente[i].setCompra(cliente[i+1].getCompra());
            cliente[i].setTelefone(cliente[i+1].getTelefone());
         }      
         totalCliente--;

          System.out.println("=================================Removido============================");    
              
       
   }     
}
	 public void consultarCliente( int id) 
   {
        int i;
        boolean encontrou =false;
        if(verificarCliente())
             System.out.println("Nao existe nenho Cliente\n"); 
        else{

                  for(i=0;i<=totalCliente;i++)
                  
                     if(cliente[i].getId()==id)
                     {
                        encontrou = true;
                        break;
                     }
                  if(encontrou==true)  System.out.println("=================Resultado=================:\nNome:"+ cliente[i].getNome() +"\nNumero do Contrato"+ cliente[i].getId());  
                  else System.out.println("Resultado Nao Encontrado\n");   
            }         
      
   }
	public boolean verificarCliente()
    {
         return (this.totalCliente<0);
     }
  public boolean pegarCliente(int id,int senha,String nome)
  {
          return (cliente[id].getNome().equals(nome) && cliente[id].getSenha()==senha);             
  }
   public void pagar()
   {
		 
           if(verificarCliente())
                     System.out.println("Nao existe nenho cliente Cadastrado\n");
            else
            {     
                     
                              System.out.println("Digite o seu Nome  Para efectuar o deposito\n ");
                              String nome=leia.next();
                              System.out.println("Digite a sua Senha\n ");  
                              int senha=leia.nextInt();
                              System.out.println("Digite o seu id\n ");  
                              int id=leia.nextInt();
                              if(pegarCliente(id,senha,nome))
                              {
									System.out.println("Digite o valor a depositar");
									double valor = leia.nextDouble();
									while(valor<0.0)
									{
										System.out.println("Erro Digite o valor a depositar");
										valor = leia.nextDouble();
                     				}
								    cliente[id].getConta().setSaldo(valor);
                 			  
							    System.out.println("Valor depositado"+ conta.depositar(valor)+"\nPelo Cliente :"+ cliente[id].getNome()+"Id do cliente:"+ cliente[id].getId()); 
								System.out.println("Saldo Actual:"+ conta.getSaldo());

							  }    
                              else System.out.println("Dados invalidos tente novamente");
                              
                     
            }      

        
                    
    }
	public void levantamento()
	{
		    if(verificarCliente())
                    System.out.println("Nao existe nenho cliente Cadastrado\n");
            else
            {     
                     
                              System.out.println("Digite o seu Nome  Para efectuar o deposito\n ");
                              String nome=leia.next();
                              System.out.println("Digite a sua Senha\n ");  
                              int senha=leia.nextInt();
                              System.out.println("Digite o seu id\n ");  
                              int id=leia.nextInt();
                              if(pegarCliente(id,senha,nome))
                              {
									System.out.println("Digite o valor a levantar");
									double valor = leia.nextDouble();

									while(valor<0.0)
									{
										System.out.println("Erro Digite o valor a depositar");
										valor = leia.nextDouble();
                     				}
								    cliente[id].getConta().setSaldo(valor-conta.getSaldo());
									if(conta.levantar(valor))System.out.println("\nValor levantado com sucesso Pelo Cliente :"+ cliente[id].getNome()+"Id do cliente:"+ cliente[id].getId()+ "\nQuantia levantada"+ valor); 
							  		else System.out.println("\nImpossivel levantar saldo insuficiente");
									System.out.println("Saldo Actual:"+ conta.getSaldo());
							  }    
                              else System.out.println("Dados invalidos tente novamente");
                         
			}
	}
 }

	
