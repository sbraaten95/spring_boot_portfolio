package springbootec2;
    
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController extends WebMvcConfigurerAdapter {

	@GetMapping("/")
	public String showIndex() {
		return "index";
	}

	// @RequestMapping(value= "/", method= RequestMethod.GET)
	// public Map<String, Object> index() {
	// 	// String message = "<h1>Welcome to my Portfolio!</h1><p>Here are some projects I've done</p><ul><li><a href='https://github.com/Sunk1st/FitnessApp'>Fitness App</a></li><li><a href='https://github.com/sbraaten95/BucketList'>BucketList</a></li><li><a href='https://github.com/sbraaten95/TripPlanner'>TripPlanner</a></li></ul>";
	// 	// return new ModelAndView("welcome", "message", message);
	// 	Map<String, Object> result = new HashMap<>();
	// 	result.put("go", "now");
	// 	return result;
	// }
 //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
 //    public Map<String, Object> hello(@RequestParam(value = "name", defaultValue = "Boxfuse") String name) {
 //        Map<String, Object> result = new HashMap<>();
 //        result.put("greeting", "Good morning " + name + "!");
 //        return result;
 //    }
}