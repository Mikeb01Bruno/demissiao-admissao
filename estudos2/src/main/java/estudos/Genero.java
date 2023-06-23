
package estudos;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    protected String texto;

    //Construtor 
    private Genero(String texto) {
        this.texto = texto;
    }

    //Getter
    public String getTexto() {
        return texto;
    }
    
    
}
