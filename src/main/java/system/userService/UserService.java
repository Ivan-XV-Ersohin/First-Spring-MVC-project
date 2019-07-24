package system.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.userData.UserDao;
import system.userData.UserModel;

@Service
public class UserService {

    @Autowired
    private UserDao userDAO;

    public void addUser(UserModel userModel) {
        userDAO.updateDatabase(userModel);
    }

    public void deleteUser(UserModel userModel) {
        if (userDAO.deliteUser(userModel))
            return;
        else
            System.out.println("User wasn't found");
    }

    public UserModel findUser(long id) {
        return userDAO.findUser(id);
    }
}
