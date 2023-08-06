package org.cydeo;

import lombok.*;

import java.util.Objects;
//@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private String firstName;
    private String lastName;
    private String userName;
    private String emailName;
    private String password;
    private String confirmPassword;
    private final int age;

}
