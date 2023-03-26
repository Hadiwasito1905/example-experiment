package ex.allimplements.exampleimplementation.repository;

import ex.allimplements.exampleimplementation.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author "Noverry Ambo"
 * @start 3/25/2023
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(Role.ERole name);
}
