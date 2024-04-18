package Dados;

public class centroDeAdoção
{
    private int id;
    private String nomeFantasia;
    private String endereco;
    private String cnpj;
    private String celular;
    private String instagram;
    private String email;
    private String senha;
    
    
    public centroDeAdoção()
    {
        
    }

    
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNomeFantasia() {
		return nomeFantasia;
	}


	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
 
	public String getCnpj() {
		return cnpj;
	}


	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}
        
        public String getInstagram(){
                return instagram;
        }
        
        public void setInstagram(String instagram){
                this.instagram = instagram;
        }
        
        public String getEmail(){
                return email;
        }
        
        public void setEmail(String email){
                this.email = email;
        }
        
        public String getSenha(){
                return senha;
        }
        
        public void setSenha(String senha){
                this.senha = senha;
        }

    public void exibirDados(centroDeAdoção centroDeAdoção) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
	
}
