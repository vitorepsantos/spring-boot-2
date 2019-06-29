package br.code.api.customer.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements Serializable {

    private static final long serialVersionUID = 1523864032891019127L;

    private String id;
    private String name;

}
