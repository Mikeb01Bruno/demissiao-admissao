package estudos;

import java.time.LocalDate;

public class Motoboy extends Funcionario implements Contratacao{
    private String carteiraDeHabilitacao;

    //Construtor
    
    public Motoboy(String carteiraDeHabilitacao, String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    //Getter & Setter

    public String getCarteiraDeHabilitacao() {
        return carteiraDeHabilitacao;
    }

    public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
        this.carteiraDeHabilitacao = carteiraDeHabilitacao;
    }
    
    
    //Salário Final
    @Override
    public double getSalarioFinal() {
        return salarioBase;
    }

    
    //toString
    @Override
    public String toString() {
        return super.toString() +
                "\n Carteira de Habilitacão: " + carteiraDeHabilitacao +
                "\n Salário Final: " + getSalarioFinal();
        
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nFuncionário contratado: " +funcionario);
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nFuncionário demitido: " +funcionario);
    }

    
}
