package br.com.fpsaraiva.apicasacodigo.detalhelivro;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroAutoresController {
	
	@PersistenceContext
	private EntityManager manager;

	@PostMapping(value="/api/autor")
	@Transactional
	public void novo(@Valid @RequestBody NovoAutorForm form) {
		Autor novoAutor = form.novoAutor();
		//System.out.println(novoAutor);
		manager.persist(novoAutor);
	}
}
