package br.com.jtsilva.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.jtsilva.domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}