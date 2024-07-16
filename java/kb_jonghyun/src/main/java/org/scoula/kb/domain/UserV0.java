package org.scoula.kb.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class UserV0 {
    private String id;
    private String password;
    private String name;
    private String role;
}
