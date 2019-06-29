package br.code;

import br.code.repository.primary.Customer;
import br.code.repository.primary.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @PostMapping(value = "/customer/add", produces = MediaType.APPLICATION_JSON_VALUE)
    public Customer post(@RequestBody Customer customer){
        customerRepository.save(customer);
        return customerRepository.findByFirstName(customer.firstName);
    }

}
