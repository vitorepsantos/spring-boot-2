package br.code.api.customer.pojo

import groovy.transform.TupleConstructor

@TupleConstructor
class Customer implements Serializable {

    private static final long serialVersionUID = 1L

    String id
    String name

}
