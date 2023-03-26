package ex.allimplements.exampleimplementation.dto;

import ex.allimplements.exampleimplementation.model.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * @author "Noverry Ambo"
 * @start 3/25/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SignUpRequest {

    private String username;
    private String password;
    private String email;
    private Set<String> roles;
}
