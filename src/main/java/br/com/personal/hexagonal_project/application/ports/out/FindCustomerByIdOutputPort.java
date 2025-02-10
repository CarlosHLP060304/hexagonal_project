package br.com.personal.hexagonal_project.application.ports.out;

import br.com.personal.hexagonal_project.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);

}
