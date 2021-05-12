package br.com.fpsaraiva.apicasacodigo.detalhelivro;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class LocalUploader implements Uploader {

	@Override
	public String upload(MultipartFile file) {
		System.out.println("Enviando o arquivo");
		return "http://fpsaraiva/"+file.getOriginalFilename();
	}
	
}
