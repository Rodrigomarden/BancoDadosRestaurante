package database;

public class Funcionario {
	private String nome;
	private String cpf;
	private String rg; 
	private String endereco; 
	private String datanasc; 
	private String sexo; 
	private String salario;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf=cpf;
	}
	
	public String getRg() {
		return rg;
	}
	
	public void setRg(String rg) {
		this.rg=rg;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco=endereco;
	}
	
	public String getDatanasc() {
		return datanasc;
	}
	
	public void setDatanasc(String datanasc) {
		this.datanasc=datanasc;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	
	public String getSalario() {
		return salario;
	}
	
	public void setSalario(String salario) {
		this.salario=salario;
	}
}
