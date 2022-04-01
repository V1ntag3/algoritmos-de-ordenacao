package geradores;

public enum EstrategiasEntrada {

	CRESCENTE("crescente"), DECRESCENTE("decrescente"), ALEATORIO("aleatorio");

	private String descricao;

	EstrategiasEntrada(String value) {
		this.descricao = value;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
