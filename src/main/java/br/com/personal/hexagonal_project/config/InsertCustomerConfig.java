package br.com.personal.hexagonal_project.config;

import br.com.personal.hexagonal_project.adapters.out.FindAddressByZipCodeAdapter;
import br.com.personal.hexagonal_project.adapters.out.InsertCustomerAdapter;
import br.com.personal.hexagonal_project.adapters.out.SendCpfForValidationAdapter;
import br.com.personal.hexagonal_project.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfForValidationAdapter sendCpfForValidationAdapter
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationAdapter);
    }

}
