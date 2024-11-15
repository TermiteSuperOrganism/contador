import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro");
        int parametroUm=terminal.nextInt();
        System.out.println("Digite o segundo parametro");
        int parametroDois=terminal.nextInt();
        try {
            contar(parametroUm, parametroDois);
        }catch(ParametrosInvalidosException e){
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }
        finally {
            terminal.close();
            System.out.println("Fim");
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if (parametroUm>parametroDois) throw new ParametrosInvalidosException();
        int contagem=parametroDois-parametroUm;
        for(int i=0;i<contagem;i++) System.out.println(parametroUm+i);
    }
    static class ParametrosInvalidosException extends Exception 
    {
        public ParametrosInvalidosException (){}
    }
}
