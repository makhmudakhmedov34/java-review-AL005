package org.cydeo.functionalinterfaces;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

//@AllArgsConstructor
@Data
@Builder
public class User {
    private String firstName;
    private String lastName;
    private int age;

}
