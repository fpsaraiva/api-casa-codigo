package br.com.fpsaraiva.apicasacodigo.detalhelivro;

import java.util.Optional;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class IsbnUnicoValidator extends CampoUnicoLivroValidator {

	private LivroRepository livroRepository;
	
	public IsbnUnicoValidator(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	@Override
	public Optional<Livro> buscaLivroPorCampo(NovoLivroForm novoLivroForm) {
		return livroRepository.findByIsbn(novoLivroForm.getIsbn());
	}

	@Override
	protected String getNomeCampoInvalido() {
		return "isbn";
	}

}
