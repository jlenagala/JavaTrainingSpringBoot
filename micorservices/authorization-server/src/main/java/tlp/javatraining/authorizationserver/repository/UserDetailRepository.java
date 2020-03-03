package tlp.javatraining.authorizationserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tlp.javatraining.authorizationserver.model.User;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository <User,Integer> {
 Optional<User> findByUsername(String name);
}

