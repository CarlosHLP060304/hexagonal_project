package br.com.personal.hexagonal_project.adapters.out.repository;

import br.com.personal.hexagonal_project.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String>  {
}
