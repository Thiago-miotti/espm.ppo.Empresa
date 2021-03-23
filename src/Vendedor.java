public class Vendedor extends Empregado implements Salario{
    private double totalDeVendas;
    private double comissao;

    public Vendedor(String nome, String cpf, String matricula, double totalDeVendas, double comissao){
        super(nome, cpf, matricula);

        this.totalDeVendas = totalDeVendas;
        this.comissao = comissao;
    }

    public double calcularSalario(){
        // totalDeVendas * comissao
        return 1.1;
    }

}
