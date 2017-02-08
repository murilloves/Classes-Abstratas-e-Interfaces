package ClassesAbstrataEInterfaces;
/**
 *
 * @author Murillo Vieira
 */

// Classe concreta para Loja com endereço e gerente.
public class LojaConcreta extends Loja{
    protected String endereco;
    protected String gerente;
    
// Método construtor para a Loja concreta recebendo os dados dos atributos, 
// chamando o construtor da classe pai e atualizando os atributos.
    public LojaConcreta(String cnjp, String razaoSocial, String endereco, String gerente) {
        super(cnjp, razaoSocial);
        this.endereco = endereco;
        this.gerente = gerente;
    }

// Método para mostrar a Loja com todos os dados.
    public String mostraLoja(){
        return ("CNPJ: "+getCnpj()+"\nRazão Social: "+getRazao()+"\nEndereço: "+getEndereco()+"\nGerente"+getGerente());
    }
    public String getEndereco(){
        return this.endereco;
    }
    public String getGerente(){
        return this.gerente;
    }

    @Override
    public void registra_abertura_dia() {
        super.registra_abertura_dia();
    }

    @Override
    public void registra_fechamento_dia() {
        super.regista_fechamento_dia();
    }

}
