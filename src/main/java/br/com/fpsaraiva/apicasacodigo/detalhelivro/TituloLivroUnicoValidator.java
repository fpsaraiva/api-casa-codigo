package br.com.fpsaraiva.apicasacodigo.detalhelivro;

import java.util.Optional;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class TituloLivroUnicoValidator extends CampoUnicoLivroValidator {
	
	private LivroRepository livroRepository;

	public TituloLivroUnicoValidator(LivroRepository livroRepository) {
		this.livroRepository = livroRepository;
	}

	@Override
	public Optional<Livro> buscaLivroPorCampo(NovoLivroForm novoLivroForm) {
		return livroRepository.findByTitulo(novoLivroForm.getTitulo());
	}

	@Override
	protected String getNomeCampoInvalido() {
		return "titulo";
	}
	


}
