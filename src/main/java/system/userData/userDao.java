package system.userData;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userDao extends CrudRepository<UserModel, Long> {

}
