package br.code.api.customer.rest.v1

import br.code.api.customer.pojo.Customer
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerEndpoint {

    @GetMapping(value = "/customer/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    Customer get(@PathVariable String id){
        Customer customer = new Customer(id,"Vitor")
        return customer
    }

}
