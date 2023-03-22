public class App {
    public static void main(String[] args) throws Exception {
        Conta contaDaMarcela = new Conta(123, 456);
        Conta contaDaNaiara = new Conta(123, 457);
        System.out.println(contaDaMarcela.getTotal());

        Cliente marcela = new Cliente();
        marcela.setNome("Marcela");
        contaDaMarcela.setTitular(marcela);
    }
}
