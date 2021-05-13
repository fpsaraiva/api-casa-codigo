package br.com.fpsaraiva.apicasacodigo.site.detalhe;

import java.math.BigDecimal;

import br.com.fpsaraiva.apicasacodigo.detalhelivro.Livro;
import br.com.fpsaraiva.apicasacodigo.shared.Markdown;


public class LivroDetalheDTO {

	private String titulo;
	private String subtitulo;
	private BigDecimal preco;
	private String conteudo;
	private String sumarioOriginal;
	private AutorLivroDetalheDTO autor;
	private int numeroPaginas;
	private String isbn; 
	private Long id;
	private String sumarioHtml;
	
	public LivroDetalheDTO(Livro livro) {
		titulo = livro.getTitulo();
		subtitulo = livro.getSubTitulo();
		preco = livro.getPreco();
		conteudo = livro.getConteudo();
		sumarioOriginal = livro.getSumario();
		sumarioHtml = Markdown.renderHtml(livro.getSumario()); 
		autor = new AutorLivroDetalheDTO(livro.getAutor());
		numeroPaginas = livro.getNumeroPaginas();
		isbn = livro.getIsbn();
		id = livro.getId();
	}

	public String getSumarioHtml() {
		return sumarioHtml;
	}
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public String getSumarioOriginal() {
		return sumarioOriginal;
	}

	public void setSumarioOriginal(String sumarioOriginal) {
		this.sumarioOriginal = sumarioOriginal;
	}

	public AutorLivroDetalheDTO getAutor() {
		return autor;
	}

	public void setAutor(AutorLivroDetalheDTO autor) {
		this.autor = autor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
}
