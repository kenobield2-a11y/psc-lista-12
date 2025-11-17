/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TesteEncapsulamento {
    public static void main(String[] args) {
        // 1. Criar uma nova instância de ContaBancaria
        ContaBancaria conta = new ContaBancaria("123", ""); // titular vazio para testar validação

        // 2. Tentar acessar e modificar os atributos diretamente
        // Isso NÃO compila, pois os atributos são privados:
        // conta.saldo = 500;   // ERRO de compilação
        // conta.numeroConta = "999"; // ERRO de compilação
        // conta.titular = "João";    // ERRO de compilação

        // 3. Usar os Setters para inicializar numeroConta e titular
        conta.setNumeroConta("98765");
        conta.setTitular("Maria Oliveira");

        // 4. Chamar os métodos depositar() e sacar()
        conta.depositar(1000);   // sucesso
        conta.sacar(300);        // sucesso
        conta.sacar(800);        // erro: saldo insuficiente
        conta.depositar(-50);    // erro: valor inválido

        // 5. Usar o Getter de saldo para imprimir o saldo final
        System.out.println("Saldo final: R$" + conta.getSaldo());
    }

  
}

