package br.com.personal.hexagonal_project.adapters.out;

import br.com.personal.hexagonal_project.adapters.out.client.FindAddressByZipCodeClient;
import br.com.personal.hexagonal_project.adapters.out.client.mapper.AddressResponseMapper;
import br.com.personal.hexagonal_project.application.core.domain.Address;
import br.com.personal.hexagonal_project.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }

}
