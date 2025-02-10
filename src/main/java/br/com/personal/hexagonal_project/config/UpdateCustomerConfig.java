package br.com.personal.hexagonal_project.config;

import br.com.personal.hexagonal_project.adapters.out.FindAddressByZipCodeAdapter;
import br.com.personal.hexagonal_project.adapters.out.UpdateCustomerAdapter;
import br.com.personal.hexagonal_project.application.core.usecase.FindCustomerByIdUseCase;
import br.com.personal.hexagonal_project.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
