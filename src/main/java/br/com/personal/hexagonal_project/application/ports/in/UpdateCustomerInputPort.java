package br.com.personal.hexagonal_project.application.ports.in;

import br.com.personal.hexagonal_project.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
