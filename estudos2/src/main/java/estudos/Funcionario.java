package estudos;

import java.time.LocalDate;
import java.time.Period;

public abstract class Funcionario implements SalarioFinal{
    protected String nome;
    protected LocalDate dataNascimento;
    protected Genero genero;
    protected Setor setor;
    protected double salarioBase;

    //Construtor
    public Funcionario(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.setor = setor;
        this.salarioBase = salarioBase;
    }
   
    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {    
        this.salarioBase = salarioBase;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    //toString

    @Override
    public String toString() {
        return 
               "\n Nome: " + nome +
               "\n Data Nascimento: " + dataNascimento + 
               "\n Idade: " + getIdade() +
               "\n Gênero: " + genero.texto + 
               "\n Setor: " + setor.getNome() + 
               "\n Salário Base: " + salarioBase;
    }

    
    
    
}
