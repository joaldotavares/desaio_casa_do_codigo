package br.com.zup.desafio.casacodigo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zup.desafio.casacodigo.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
}
