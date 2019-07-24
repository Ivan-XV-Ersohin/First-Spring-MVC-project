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
public class UserContoller {

    @Autowired
    private UserService userService;

  // @RequestMapping(value = "/add", method = RequestMethod.GET)

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public ModelAndView view(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userForm", new UserModel());
        modelAndView.setViewName("form");
        return modelAndView;
    }

    @RequestMapping (value = "/show", method = RequestMethod.POST)
    public @ResponseBody String userShow(@ModelAttribute("userForm")UserModel userModel){
        UserModel showUser = userService.findUser(userModel.getId());
        System.out.println(showUser.toString());
        return showUser.toString();
    }

}