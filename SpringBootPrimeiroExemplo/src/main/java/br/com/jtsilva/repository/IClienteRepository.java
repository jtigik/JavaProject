package br.com.jtsilva.repository;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}