package com.example.lesson2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

  @RequestMapping("/")
// An object named model, of class Model, is being passed as an argument to the
// homePage method. This will create a container that can hold as many objects
// that you put in it for use by your template.
  public String homepage(Model model){
// The objects that the model holds are called attributes
// This is why you add attributes to the model, using the
// model.addAttributes method. The arguments passed are the name you want
// the object to have
    model.addAttribute("myvar", "Say hello to the people");
    return "hometemplate";
  }


}
