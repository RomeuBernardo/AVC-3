import java.util.Scanner;
public class Menu
{

  Scanner leia = new Scanner(System.in);
  Firma firma = new Firma();
  Corretor corretor = new Corretor();
  Carteira carteira = new Carteira();
  public void voltar()
   {
        
          while(true)
          {
              System.out.println("Preccione 1 Para voltar ao Menu Principal");
               int op=leia.nextInt();
              if(op==1)
                 break;

          }
          
   }

   public void fazerLogin()
   {
        
         System.out.println("=======================Fazendo O Login =============================\n ");
          int i,op;

      while(true)
      {
          System.out.println("Escolha uma Opção:\n ---------------------------------------------------------------- \n 1- Login Corrector \n ---------------------------------------------------------------- \n 2-Login Cliente \n ---------------------------------------------------------------- \n 0-Voltar \n");
            System.out.println("============================================================================================================================== \n ");
            op=leia.nextInt();
         switch(op)
         {
         
             case 1:
               if(firma.verificarCorretor())
               {
                        System.out.println("Nao existe nenho Corrector Cadastrado\n");
                        voltar();
               } 
               else
               {     
                        while(true)
                        {
                                 System.out.println("Digite o seu Nome\n ");
                                 String nome=leia.next();
                                 System.out.println("Digite a sua Senha\n ");  
                                 int senha=leia.nextInt();
                                 System.out.println("Digite o seu id\n ");  
                                 int id=leia.nextInt();
                                 if(firma.pegar(id,senha,nome))
                                 {
                                       menuCorretor();
                                       break;
                                 }
                                 else System.out.println("Dados invalidos tente novamente");
                                 System.out.println("Precione 1 para Voltar Ou qualquer outro numero para continuar a tentar");
                                 i=leia.nextInt();
                                 if(i==1)break;
                        }
            }  
            break;
            case 2: 
              if(firma.verificarCliente())
             {
                     System.out.println("Nao existe nenho cliente Cadastrado\n");
                     voltar();
            } 
            else
            {     
                     while(true)
                     {
                              System.out.println("Digite o seu Nome\n ");
                              String nome=leia.next();
                              System.out.println("Digite a sua Senha\n ");  
                              int senha=leia.nextInt();
                              System.out.println("Digite o seu id\n ");  
                              int id=leia.nextInt();
                              if(firma.pegarCliente(id,senha,nome))
                              {
                                    menuCliente();
                                    break;
                              }
                              else System.out.println("Dados invalidos tente novamente");
                              System.out.println("Precione 1 para Voltar Ou qualquer outro numero para continuar a tentar");
                              i=leia.nextInt();
                              if(i==1)break;
                     }
            }      
               break;
             case 0: break;    
             default:
                System.out.println("Opcao Invalida Escolha Outra Opcao");
                break;
                
        
         }
      
         if(op==0)break;
       
      }
   }

 public void menuPrincipal()
 {
       int op;
       while(true) 
        {
                 System.out.println("===============================================SEJA BEM-VINDO AO MENU PRINCIPAL================================================================\n ");
                 System.out.println("Escolha uma Opção:\n ---------------------------------------------------------------- \n 1-Cadastro de corretores \n---------------------------------------------------------------- \n 2-Cadastro de Cliente\n ---------------------------------------------------------------- \n 3-Administrador\n ----------------------------------------------------------------\n 4-Fazer Login \n ----------------------------------------------------------------\n 0-Sair\n ---------------------------------------------------------------- \n");
                 System.out.println("============================================================================================================================== \n ");
                 op=leia.nextInt();
                switch(op)
                {
                     case 1:  firma.cadastrarCorretor(); 
                     voltar();
                     break;
                     case 2: firma.cadastrarCliente(); 
                     break;        
                     case 3: 
                            while(true)
                                {
                                        System.out.println("Digite  A senha do administrador");
                                        int opc = leia.nextInt();
                                        if(opc==2023)
                                        {
                                             menuAdm();
                                             break; 
                                        }        
                                }
                     voltar();
                     break;   
                     case 4: fazerLogin(); 
                     voltar();
                     break;       
                     case 0: break; 
                     default:
                                System.out.println("Opcao Invalida Escolha Outra Opcao");
                                break; 
                }
                if(op==0)break;
        }
        
   }

public void  menuAdm()
  {
     int op;
      while(true)
      {
        System.out.println("===============================================SEJA BEM-VINDO AO MENU ADMINISTRADOR================================================================\n ");
         System.out.println("Escolha uma Opção:\n ---------------------------------------------------------------- \n 1-Cadastrar Corretor \n---------------------------------------------------------------- \n 2-Consultar Corretor\n ---------------------------------------------------------------- \n 3-Imprimir Corretor\n ---------------------------------------------------------------- \n 4-Adicionar Titulo de Participacao \n ---------------------------------------------------------------- \n 5-Cadastrar Cliente \n ---------------------------------------------------------------- \n 6-Imprimir Cliente \n ---------------------------------------------------------------- \n 7-Consultar  Cliente \n ---------------------------------------------------------------- \n 8-Remover Corrector \n ---------------------------------------------------------------- \n 9-Remover Clientes\n ---------------------------------------------------------------- \n 12-Cadastro de carteiras \n ---------------------------------------------------------------- \n 13-Cálculo da comissão mensal dos corretores \n ---------------------------------------------------------------- \n 14-Efectuar Pagamentos \n ---------------------------------------------------------------- \n 15-Levantamento  \n ----------------------------------------------------------------\n 17-Valor das carteiras \n ----------------------------------------------------------------\n 16-Imprimir Titulo de Participaçao \n----------------------------------------------------------------\n 0-Voltar\n ---------------------------------------------------------------- \n");
          System.out.println("============================================================================================================================== \n ");
         op=leia.nextInt();
        switch(op)
         {
            
            case 1:  firma.cadastrarCorretor(); 
            voltar();
            break;   
            case 2: System.out.println("\nDigite o Id do Corrector  para efectuar a sua pesquisa");
                   int id = leia.nextInt();
                   while(id<0)
                   {
                      System.out.println("\nERRO: Digite Novamente o Id do Corrector  para efectuar a sua pesquisa");
                      id = leia.nextInt();
                   }
                   firma.consultar(id); 
                   voltar();
                   break;
            case 3: firma.imprimirCorrector();
            voltar();
            break;
             case 4: carteira.AddTitulo();
             voltar();
             break;
             case 5:firma.cadastrarCliente();
              voltar();
              break;
              case 6:firma.imprimirCliente();
                voltar();
                break;
                case 7: System.out.println("\nDigite o Id do Cliente  para efectuar a sua pesquisa");
                   int ID = leia.nextInt();
                   while(ID<0)
                   {
                      System.out.println("\nERRO: Digite Novamente o Id do Corrector  para efectuar a sua pesquisa");
                      ID = leia.nextInt();
                   }
                     firma.consultarCliente(ID); 
                     voltar();
                     break;
             case 8: System.out.println("Digite o ID do Corretor que pretendes remover");
                    int k = leia.nextInt();
                     firma.removerCorretor(k);
                    voltar(); 
                    break; 
            case 9: System.out.println("Digite o ID do Cliente que pretendes remover");
                     int pos = leia.nextInt();
                     firma.removerCliente(pos);
                     voltar();
                     break;
            case 13: System.out.println("Comissao Mensal:"+ corretor.calcularComissaoMensal());                  
            voltar();
            break;
            case 14:firma.pagar(); 
              voltar();
              break;     
             case 15: firma.levantamento();
             voltar();
             break;  
             case 16: carteira.imprimirTitulo();
            voltar();
            break;
            case 17: if(carteira.calcularValorCarteira()==-1)System.out.println("Nao existe carteiras disponiveis");
                     else System.out.println("Valor da carteira:"+ carteira.calcularValorCarteira());
          
            voltar();
            break;
            case 0: break;
            default:
                System.out.println("Opcao Invalida Escolha Outra Opcao");
                break;
                
        
         }
         if(op==0)break;
      
      }
  }

  public void  menuCorretor()
  {
  
     int op;
      while(true)
      {
        System.out.println("===============================================SEJA BEM-VINDO AO MENU Menu Corrector================================================================\n ");
         System.out.println("Escolha uma Opção:\n ---------------------------------------------------------------- \n 1-Cadastrar Corretor \n---------------------------------------------------------------- \n 2-Consultar Corretor\n ---------------------------------------------------------------- \n 3-Imprimir Corretor\n ---------------------------------------------------------------- \n 4-Adicionar Titulo de Participacao \n ----------------------------------------------------------------   \n 5-Imprimir Cliente \n ---------------------------------------------------------------- \n 6-Consultar  Cliente \n ---------------------------------------------------------------- \n 7-Cálculo da comissão mensal dos corretores  \n ---------------------------------------------------------------- \n 8-Imprimir Titulo de Participaçao \n----------------------------------------------------------------\n 0-Voltar\n ---------------------------------------------------------------- \n");
          System.out.println("============================================================================================================================== \n ");
         op=leia.nextInt();
        switch(op)
         {
            
            case 1:  firma.cadastrarCorretor(); 
            voltar();
            break;   
            case 2: System.out.println("\nDigite o Id do Corrector  para efectuar a sua pesquisa");
                   int id = leia.nextInt();
                   while(id<0)
                   {
                      System.out.println("\nERRO: Digite Novamente o Id do Corrector  para efectuar a sua pesquisa");
                      id = leia.nextInt();
                   }
                   firma.consultar(id); 
                   voltar();
                   break;
            case 3: firma.imprimirCorrector();
            voltar();
            break;
             case 4: carteira.AddTitulo();
             voltar();
             break;
              case 5:firma.imprimirCliente();
                voltar();
                break;
                case 6: System.out.println("\nDigite o Id do Cliente  para efectuar a sua pesquisa");
                   int ID = leia.nextInt();
                   while(ID<0)
                   {
                      System.out.println("\nERRO: Digite Novamente o Id do Corrector  para efectuar a sua pesquisa");
                      ID = leia.nextInt();
                   }
                     firma.consultarCliente(ID); 
                     voltar();
                     break;
             
            case 7: System.out.println("Comissao Mensal:"+ corretor.calcularComissaoMensal());                  
            voltar();
            break;    
            case 8: carteira.imprimirTitulo();
            case 0: break;
            default:
                System.out.println("Opcao Invalida Escolha Outra Opcao");
                break;
                
         }
         if(op==0)break;
      
      }
  

   }
   public void  menuCliente()
   {
         int op;
      while(true)
      {
        System.out.println("===============================================SEJA BEM-VINDO AO MENU CLIENTE================================================================\n ");
         System.out.println("Escolha uma Opção:\n ---------------------------------------------------------------- \n 1-Consultar Corretor\n ---------------------------------------------------------------- \n 2-Imprimir Corretor\n ---------------------------------------------------------------- \n 3-Cadastrar Cliente \n ---------------------------------------------------------------- \n 4-Imprimir Cliente \n ---------------------------------------------------------------- \n 5-Consultar  Cliente \n ---------------------------------------------------------------- \n 6-Cálculo da comissão mensal dos corretores \n ---------------------------------------------------------------- \n 7-Efectuar Pagamentos \n ---------------------------------------------------------------- \n 8-Levantamento  \n ----------------------------------------------------------------\n  9-Imprimir Titulo de Participaçao \n----------------------------------------------------------------\n 0-Voltar\n ---------------------------------------------------------------- \n");
          System.out.println("============================================================================================================================== \n ");
         op=leia.nextInt();
        switch(op)
         {
               
            case 1: System.out.println("\nDigite o Id do Corrector  para efectuar a sua pesquisa");
                   int id = leia.nextInt();
                   while(id<0)
                   {
                      System.out.println("\nERRO: Digite Novamente o Id do Corrector  para efectuar a sua pesquisa");
                      id = leia.nextInt();
                   }
                   firma.consultar(id); 
                   voltar();
                   break;
            case 2: firma.imprimirCorrector();
            voltar();
            break;
             case 3:firma.cadastrarCliente();
              voltar();
              break;
              case 4:firma.imprimirCliente();
                voltar();
                break;
                case 5: System.out.println("\nDigite o Id do Cliente  para efectuar a sua pesquisa");
                   int ID = leia.nextInt();
                   while(ID<0)
                   {
                      System.out.println("\nERRO: Digite Novamente o Id do Corrector  para efectuar a sua pesquisa");
                      ID = leia.nextInt();
                   }
                     firma.consultarCliente(ID); 
                     voltar();
                     break;
             
            case 6: System.out.println("Comissao Mensal:"+ corretor.calcularComissaoMensal());                  
            voltar();
            break;
            case 7:firma.pagar(); 
              voltar();
              break;     
             case 8: firma.levantamento();
             voltar();
             break;  
             case 9: carteira.imprimirTitulo();
            voltar();
            break;
            case 0: break;
            default:
                System.out.println("Opcao Invalida Escolha Outra Opcao");
                break;
                
        
         }
         if(op==0)break;
      
      }
   }

   

}