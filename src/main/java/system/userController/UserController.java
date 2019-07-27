package system.userController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import system.userData.UserModel;
import system.userService.UserService;

@Controller
@RequestMapping
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/showAll", method = RequestMethod.GET)
    public @ResponseBody Iterable<UserModel> showAllUsers(){
        return userService.showAllUsers();




















        эзззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззззз
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.PUT)
    public void addUser(@ModelAttribute("userForm") UserModel userModel){
        userService.addUser(userModel);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView fillUserForm(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("userForm");
        modelAndView.addObject("new", UserModel.class);
        return modelAndView;

    }

}
