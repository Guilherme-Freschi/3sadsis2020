
package SistemaeEmpresaTI;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoCliente tipoCliente;

    private TipoCliente nome;

    @OneToOne
    @Column(name = "endereco_id")

    private TipoEndereco logradouro;

    private TipoEndereco numero;

    public Cliente(TipoCliente tipoCliente, TipoCliente nome, TipoEndereco logradouro, TipoEndereco numero) {
        super();
        this.tipoCliente = tipoCliente;
        this.nome = nome;
        this.logradouro = logradouro;
        this.numero = numero;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoCliente getNome() {
        return nome;
    }

    public void setNome(TipoCliente nome) {
        this.nome = nome;
    }

    public TipoEndereco getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(TipoEndereco logradouro) {
        this.logradouro = logradouro;
    }

    public TipoEndereco getNumero() {
        return numero;
    }

    public void setNumero(TipoEndereco numero) {
        this.numero = numero;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 100;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TipoEndereco other = (TipoEndereco) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Endereco [id=" + id + ", tipoEndereco=" + tipoEndereco + ", logradouro=" + logradouro + ", numero="
                + numero + "]";
    }





}
