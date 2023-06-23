package estudos;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{
    private double PREMIO = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    public void setPREMIO(double PREMIO) {
        this.PREMIO = PREMIO;
    }

    //Salário Final
    @Override
    public double getSalarioFinal() {
        return salarioBase + (salarioBase * PREMIO);
    }
    
    //toString

    @Override
    public String toString() {
        return super.toString() + 
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
