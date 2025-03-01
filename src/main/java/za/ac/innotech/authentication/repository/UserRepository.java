package za.ac.innotech.authentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.innotech.authentication.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
