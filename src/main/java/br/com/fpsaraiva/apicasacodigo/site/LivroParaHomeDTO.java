package br.com.fpsaraiva.apicasacodigo.site;

import br.com.fpsaraiva.apicasacodigo.detalhelivro.Livro;

public class LivroParaHomeDTO {

	private String titulo;
	private Long id;
	private Object nomeAutor;

	public LivroParaHomeDTO(Livro livro) {
		this.titulo = livro.getTitulo();
		this.id = livro.getId();
		this.nomeAutor = livro.getAutor().getNome();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Object getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(Object nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
}
