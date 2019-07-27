package system.userData;

import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserModel, Long> {

}
