package br.com.fpsaraiva.apicasacodigo.site.detalhe;

import br.com.fpsaraiva.apicasacodigo.detalhelivro.Autor;

public class AutorLivroDetalheDTO {
	
	private String nome;
	private String descricao;

	public AutorLivroDetalheDTO(Autor autor) {
		nome = autor.getNome();
		descricao = "Descricao do autor vem aqui.";
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
