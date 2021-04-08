public class Gerente extends Empregado implements Bonus {
    private double salario;
    private double bonus;

    public Gerente(String nome, String cpf, String matricula, double salario, double bonus){
        super(nome, cpf, matricula);

        this.salario = salario;
        this.bonus = bonus;
    }

    public double calcularBonus(){
        return this.salario * this.bonus;
    }
}
