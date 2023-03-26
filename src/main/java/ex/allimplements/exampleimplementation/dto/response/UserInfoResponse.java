package ex.allimplements.exampleimplementation.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author "Noverry Ambo"
 * @start 3/25/2023
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserInfoResponse {

    private Long id;
    private String username;
    private String email;
    private List<String> role;
}
