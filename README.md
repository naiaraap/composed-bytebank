## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

The Conta class is a Java class that represents a bank account. It has the following attributes:

saldo: a double that represents the balance of the account.
agencia: an integer that represents the agency where the account was created.
numero: an integer that represents the account number.
titular: a string that represents the account holder's name.
It also has the following methods:

deposita(double valor)
This method receives a valor parameter and adds it to the account balance:
Copy
Insert

The CriaConta class is a Java class that contains the main method. It creates two instances of Conta, sets their balances, and prints them to the console:
Copy
Insert

New
public class CriaConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 200;
    System.out.println(primeiraConta.saldo);

    primeiraConta.saldo += 100;
    System.out.println(primeiraConta.saldo);

    Conta segundaConta = new Conta();
    segundaConta.saldo = 50;

    System.out.println("Primeira conta tem " + primeiraConta.saldo);
    System.out.println("Segunda conta tem " + segundaConta.saldo);

    if (primeiraConta == segundaConta) {
        System.out.println("São a mesma conta");
    } else {
        System.out.println("São contas diferentes");
    }

    System.out.println(primeiraConta);
    System.out.println(segundaConta);
  }
}
The output of this code will be:

Copy
Insert
New
200
300
Primeira conta tem 300
Segunda conta tem 50
São contas diferentes
Conta@2a139a55
Conta@15db9742
which shows the balance of both accounts and that they are different. It also prints the references to these objects.

