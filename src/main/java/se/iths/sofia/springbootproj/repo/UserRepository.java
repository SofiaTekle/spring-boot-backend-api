package se.iths.sofia.springbootproj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import se.iths.sofia.springbootproj.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
