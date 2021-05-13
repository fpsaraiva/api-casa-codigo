package br.com.fpsaraiva.apicasacodigo.site.detalhe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.fpsaraiva.apicasacodigo.detalhelivro.Livro;
import br.com.fpsaraiva.apicasacodigo.detalhelivro.LivroRepository;

@RestController
public class DetalheLivroController {

	@Autowired
	private LivroRepository livroRepository;
	
	@GetMapping(value="/api/livro/{id}")
	public LivroDetalheDTO getMethodName(@PathVariable("id") Long id) {
		
		Livro livro = livroRepository.findById(id).get();
		return new LivroDetalheDTO(livro);
	}
	
}
