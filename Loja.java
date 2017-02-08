package ClassesAbstrataEInterfaces;

// 1 - Classe Abstrata para Loja com identificador, cnpj, razão social, aberta (boolean).
public abstract class Loja implements Registro {
    protected boolean aberta;
    protected int identificador;
    protected String cnpj;
    protected String razaoSocial;
    
// 2 - Construtor da classe Loja para criar o objeto já com cnpj,
// razão social e o atributo aberta = false.
    public Loja(String cnjp, String razaoSocial){
        this.cnpj = cnjp;
        this.razaoSocial = razaoSocial;
        this.aberta = false;
    }
    
// 3 - Método para retornar a razão social, cnpj e o status da loja (se aberta ou fechada)    
    public String getRazao(){
        return this.razaoSocial;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    public boolean seAberta(){
        return this.aberta;
    }
    
    
/* 4 – Loja utiliza a interface Registro e implementar os métodos atualizando o atributo
aberta para true quando chamar o método registra_abertura_dia , ou para false quando invocado o
método registra_fechamento_dia. Uma loja aberta não pode ser aberta novamente e uma loja só
pode ser fechada se estiver aberta.    */
    public void registra_abertura_dia(){
        if(this.aberta == false)
            this.aberta = true;
    }
    public void regista_fechamento_dia(){
        if(this.aberta == true)
            this.aberta = false;
    }
}
