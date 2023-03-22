class Conta {
  private double saldo;
  // private int agencia;
  private int numero;
  private Cliente titular;
  private static int total = 0;

  public Conta(int agencia, int numero) {
    this.saldo = 100;
    // this.agencia = agencia;
    this.numero = numero;
    Conta.total++;
    System.out.println("Estou criando uma conta: " + this.numero);
  }

  public double getSaldo() {
    return this.saldo;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public void deposita(double valor) {
    this.saldo += valor;
  }

  public boolean saca(double valor) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public boolean transfere(double valor, Conta destino) {
    if (this.saldo >= valor) {
      this.saldo -= valor;
      destino.deposita(valor);
      return true;
    }
    return false;
  }

  public Cliente getTitular() {
    return this.titular;
  }

  public void setTitular(Cliente titular) {
    this.titular = new Cliente();
    this.titular = titular;
  }

  // public void setAgencia(int agencia) {
  // this.agencia = agencia;
  // }

  public int getNumero() {
    return this.numero;
  }

  public static int getTotal() {
    return Conta.total;
  }
}
