package br.senai.sp.jandira.model;

public enum Console {
	
	NINTENDO("Nintendo"),
	PLAYSTATION3("Playstation 3" + "1000"),
	PLAYSTATION4("Playstation 4"), 
	PLAYSTATION5("Playstation 5"),
	XBOX360("Xbox 360"),
	XBOXONE("Xbox One"),
	XBOXONES("Xbox One"),
	XBOXONEX("Xbox One X"),
	XBOXONESERIESS("Xbox Series S"),
	XBOXONESERIESX("Xbox Series X"),
	ANDROID("Android"), 
	IOS("iOS"),
	COMPUTADOR("PC");	
	
	private String descricao;
	
	private Console(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	

}
