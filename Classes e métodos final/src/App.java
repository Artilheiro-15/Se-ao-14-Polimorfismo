import entities.Account;
import entities.SavingsAccount;

public class App {

  public static void main(String[] args) throws Exception {
    // esse codigo esta instanciando 2 contas cada uma com saldo de 1000 porem
    // a conta x e uma conta comum e a conta y e uma conta poupança a conta poupança
    // nao desconta taxa de saque
    Account x = new Account(1020, "Alex", 1000.0);
    Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);

    x.withdraw(50.0);
    y.withdraw(50.0);
    //o POLIMORFISMO siginifica muitas formas eu chamei a mesma operaçao em vareaveis do msm tipo
    //mais elas tiverao comportamentos diferentes conforme os objto que elas aponta POLIMORFISMO e so isso
    // oque e POLIMORFISMO e simples agora as aplicaçoes do POLIMORFISMO que ai tem uma gama infinita de posabiladades
    // e pode fazer soluçoes muito sofisticadas elegantes e flequisiveis ultilizando esse recurso
    System.out.println(x.getBalance());
    System.out.println(y.getBalance());
  }
}
