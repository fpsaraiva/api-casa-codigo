package br.com.fpsaraiva.apicasacodigo.detalhelivro;

import org.springframework.web.multipart.MultipartFile;

@FunctionalInterface
public interface Uploader {
	
	public String upload(MultipartFile file);

}
