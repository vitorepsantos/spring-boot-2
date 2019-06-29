package br.code.repository.primary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "customer")
public class Customer implements Serializable {

    private static final long serialVersionUID = -3191207047785237499L;

    @Id
    public String id;
    public String firstName;
    public String lastName;

}
