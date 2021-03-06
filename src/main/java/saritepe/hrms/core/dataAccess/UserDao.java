package saritepe.hrms.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;
import saritepe.hrms.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
    User getByEmail(String email);
}
