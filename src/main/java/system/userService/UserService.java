package system.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.userData.UserModel;
import system.userData.userDao;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private userDao userDAO;

    public void addUser(UserModel userModel) {
        userDAO.save(userModel);
    }

    @Transactional
    public void deleteUser(UserModel userModel) {
        userDAO.delete(userModel);
    }

    public UserModel findUser(long id) {
        Optional<UserModel> optionalUser = userDAO.findById(id);
        return optionalUser.orElse(null);
    }
}
