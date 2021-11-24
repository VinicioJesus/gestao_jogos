package br.senai.sp.jandira.model;

public enum Fabricante {
	
	NINTENDO("Nintendo"),
	TENCENT("Tencent"),
	ACTIVISIONBLIZZARD("Blizzard"),
	NETEASE("NetEase"),
	NEXON("Nexon"),
	SQUAREENIX("Square Enix"),
	SONY("Sony"),
	NETMARBLE("Net Marble");	
	
	private String descricao;
	
	private Fabricante(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
