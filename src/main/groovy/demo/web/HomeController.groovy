package demo.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class HomeController {
	@RequestMapping('/')
	@ResponseBody
	String index() {
		String name = 'Rod'
		return "Hola ${name}"
	}
}