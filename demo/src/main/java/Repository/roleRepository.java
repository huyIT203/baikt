package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

public abstract class roleRepository implements JpaRepository<User, Long> {
}
