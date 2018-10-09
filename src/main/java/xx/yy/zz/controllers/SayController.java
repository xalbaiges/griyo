package xx.yy.zz.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/say")
public class SayController {
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "sayHi!!";
	}
   
    @RequestMapping("/bye") 
    public String sayBye() {
    	return "sayBye";
    }

}


