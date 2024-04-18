package Dados;

import javax.swing.table.DefaultTableModel;

public class CadastroPets
{
    private int id;
    private String especie;
    private String outro;
    private String raca;
    private String cor;
    private String idade;
    private String tipoidade;
    private String porte;
    private String sexo;
    private String doador;
    private String contato;
    private String email;

    
    public CadastroPets()
    {
        
    }
   
   
    public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

        public String getEspecie(){
                return especie;
        }
        
        public void setEspecie(String especie){
                this.especie = especie;
        }
        
        public String getOutro(){
                return outro;
        }
        
        public void setOutro(String outro){
                this.outro = outro;
        }
        
        public String getRaca(){
                return raca;
        }
        
        public void setRaca(String raca){
                this.raca = raca;
        }
        
        public String getCor(){
                return cor;
        }
        
        public void setCor(String cor){
                this.cor = cor;
        }
        
        public String getIdade (){
            return idade;
        }
        
        public void setIdade (String idade){
            this.idade = idade;
        }
        
         public String getTipoIdade (){
            return tipoidade;
        }
        
        public void setTipoIdade (String tipoidade){
            this.tipoidade = tipoidade;
        }
        
        public String getPorte(){
            return porte;
        }
        
        public void setPorte(String porte){
            this.porte = porte;
        }
        
        public String getSexo (){
            return sexo;
        }
        
        public void setSexo (String sexo){
            this.sexo = sexo;
        }
        
        public String getDoador(){
                return doador;
        }
        
        public void setDoador(String doador){
                this.doador = doador;
        }
        
        public String getContato(){
                return contato;
        }
        
        public void setContato(String contato){
                this.contato = contato;
        }
        public String getEmail(){
                return email;
        }
        
        public void setEmail(String email){
                this.email = email;
        }
	
}
