import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
       //TODO: Conhecer e importar a classe Scanner
       //Exibir as mensagem para o nosso usuário
       //Obter pela Scanner os valor digitados no temrinal
       //Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        String resposta;
        int numeroContaCorrente;
        String agencia;
        String nomeCliente;
        float saldoDisponivel;

        System.out.println("Olá !");
        System.out.println("Seja bem vindo ao nosso sistema interno de criação de contas Bancarias.");
        System.out.println(" ");
        
        do {
            System.out.println("Gostaria de criar uma conta ? (s/n): ");
            resposta = sc.nextLine().toLowerCase();
            System.out.println(" ");
            
            switch (resposta) {
                case "s":
                System.out.println("Por favor, digite o seu nome: ");
                nomeCliente = sc.nextLine();
                System.out.println(" ");
                
                System.out.println("Por favor, digite o número de sua conta corrente: ");
                numeroContaCorrente = sc.nextInt();
                sc.nextLine(); // Quebra de linha pendente no buffer de entrada
                System.out.println(" ");
    
                System.out.println("Por favor, digite o número da Agência ! ");
                agencia = sc.next();
                System.out.println(" ");
    
                System.out.println("Por favor, digite a quantia de Salto Disponivel: ");
                saldoDisponivel =sc.nextFloat();
                sc.nextLine();
                System.out.println(" ");
                
                String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque",nomeCliente,agencia,numeroContaCorrente,saldoDisponivel);

                System.out.println(mensagem);
                     break;           
                default:
                    break;
            }
        } while (!resposta.equals("n"));

        //encerrar programa
        System.out.println("Obrigado pela sua atenção. Programa Encerrado. ");
        sc.close();
    }
}
