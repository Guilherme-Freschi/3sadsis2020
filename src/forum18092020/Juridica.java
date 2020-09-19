package SistemaeEmpresaTI;

import javax.persistence.Entity;

@Entity
public class Juridica extends Pessoa {
    private String cnpj;
    private String nomeFantasia;

    public Juridica(String nome, String nomeFantasia, String cnpj) {
        super(nome);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

}
