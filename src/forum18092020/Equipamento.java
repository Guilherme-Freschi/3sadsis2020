package SistemaeEmpresaTI;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class Equipamento {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String modelo;
        private String marca;
        private String NSerie;
        private String cor;
        private Float valorConcerto;

        @OneToMany
        private List<EquipamentoManutencao> EquipamentoManutencao= new ArrayList();

        public EquipamentoManutencao(String modelo, String marca, String cor, String NSerie, float valorConcerto) {
            super();
            this.modelo = modelo;
            this.marca = marca;
            this.NSerie = NSerie;
            this.cor = cor;
            this.valorConcerto = valorConcerto;
        }

        public List<EquipamentoManutencao> getEquipamentoManutencao() {
            return EquipamentoManutencao;
        }

        public String getModelo() {
            return modelo;
        }

        public String getMarca() {
            return marca;
        }

        public String getNSerie() {
            return NSerie;
        }

        public String getCor() {
            return cor;
        }

        public float getvalorConcerto() {
            return valorConcerto;
        }

        public void addEquipamentoManutencao(EquipamentoManutencao E) {
            EquipamentoManutencao.add(E);
        }

    }


  Public void deletar(entidade identidaentidade) throus SQLException {
      Booblean temId = !Objects.isNull (entidade.getId());
      If(temId) {
          PreparedStatement psDelete =     conexaoComBanco.prepareStatement(getRemocaoEntidade());
  setRemoverParametroEntidade(psDelete , entidade.getId(), entidade);
  try {
       psDelete.conexaoComBanco();
  }  catch (Exception e) {
       e.printStackTrace();
  }  finally {
      psDelete.close();
    }
  }
}

