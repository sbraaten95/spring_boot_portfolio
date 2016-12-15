package springbootec2;
    
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {
	@RequestMapping(value= "/", method= RequestMethod.GET)
	public Map<String, Object> index() {
		Map<String, Object> result = new HashMap<>();
		result.put("Temp", "Will update and turn into portfolio soon.");
		return result;
	}
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public Map<String, Object> hello(@RequestParam(value = "name", defaultValue = "Boxfuse") String name) {
        Map<String, Object> result = new HashMap<>();
        result.put("greeting", "Good morning " + name + "!");
        return result;
    }
}