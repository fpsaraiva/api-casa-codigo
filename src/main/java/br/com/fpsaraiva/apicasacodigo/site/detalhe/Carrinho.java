package br.com.fpsaraiva.apicasacodigo.site.detalhe;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.fpsaraiva.apicasacodigo.detalhelivro.Livro;

public class Carrinho {
	
	private List<LivroCarrinhoDTO> livros = new ArrayList<>();

	@Deprecated
	public Carrinho() {}
	
	public void adiciona(Livro livro) {
		livros.add(new LivroCarrinhoDTO(livro));		
	}

	@Override
	public String toString() {
		return "Carrinho [livros=" + livros + "]";
	}
	
	public List<LivroCarrinhoDTO> getLivros() {
		return livros;
	}
	
	public static Carrinho cria(Optional<String> jsonCarrinho) {
		return jsonCarrinho.map(json -> {
			try {
				return new ObjectMapper().readValue(json, Carrinho.class);
			} catch(JsonProcessingException e) {
				throw new RuntimeException(e);
			}
		}).orElse(new Carrinho());	
	}

}