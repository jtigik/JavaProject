/**
 * 
 */

package main.java.br.com.jtsilva.repository;

import org.springframework.data.repository.CrudRepository;

import main.java.br.com.jtsilva.domain.Cliente;

public interface IClienteRepository extends CrudRepository<Cliente, Long> {

}