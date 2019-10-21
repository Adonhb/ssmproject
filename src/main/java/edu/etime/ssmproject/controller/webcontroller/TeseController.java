package edu.etime.ssmproject.controller.webcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: lb
 * @datetime: 2019-10-21  14:28:58
 */

@Controller
@RequestMapping("test")
public class TeseController {

    @RequestMapping("/t")
    public String test(){
        return "../index";
    }
}
