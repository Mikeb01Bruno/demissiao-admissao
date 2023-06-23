package estudos;

public enum Setor {
    RECURSOS_HUAMNOS("Recursos Humanos"),
    FINANCEIRO("Financeiro"),
    OPERACOES("Operações");
    
    private String nome;

    //Construtor
    
    private Setor(String nome) {
        this.nome = nome;
    }

    //Getter
    
    public String getNome() {
        return nome;
    }
    
    
    
}
