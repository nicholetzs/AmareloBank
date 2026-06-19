public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String sexo;
    private Double saldoCliente;

    public Cliente(String nome, String cpf, int idade, String sexo, Double saldoCliente) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.sexo = sexo;
        this.saldoCliente = saldoCliente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getSaldoCliente() {
        return saldoCliente;
    }

    public void setSaldoCliente(Double saldoCliente) {
        this.saldoCliente = saldoCliente;
    }

    @Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", sexo=" + sexo + ", saldoCliente="
				+ saldoCliente + "]";
	}


}
