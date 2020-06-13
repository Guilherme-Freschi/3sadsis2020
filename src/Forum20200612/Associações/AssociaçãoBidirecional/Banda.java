package forum20200612.associacao0Para1;

public class Banda {
	
	public String nome;
	public int numAlbum;
        public Pais pais;
	
	
	public Banda(String nome, Pais pais, int numAlbuns) {
		this.nome = nome;
		this.numAlbum = numAlbum;
                this.pais = pais;
                
		
	}
	
	public String getNome() {
		return nome;
	}
	public int numAlbuns() {
		return numAlbum;
	}	
        public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

   
    }
