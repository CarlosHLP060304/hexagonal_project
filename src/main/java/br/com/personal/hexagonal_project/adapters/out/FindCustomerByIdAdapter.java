package br.com.personal.hexagonal_project.adapters.out;

import br.com.personal.hexagonal_project.adapters.out.repository.CustomerRepository;
import br.com.personal.hexagonal_project.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.personal.hexagonal_project.application.core.domain.Customer;
import br.com.personal.hexagonal_project.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        var customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }

}
