package Dados;

public class Usuarios
{
    private String id;
    private String nome;
    private String data;
    private String endereco;
    private String cpf;
    private String sexo;
    private String celular;
    private String email;
    private String senha;
    
    
    public Usuarios()
    {
        
    }

    
    public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
 
	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
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
        
        public String getData (){
            return data;
        }
        
        public void setData (String data){
            this.data = data;
        }
        
        public String getSexo (){
            return sexo;
        }
        
        public void setSexo (String sexo){
            this.sexo = sexo;
        }
        
	
}
