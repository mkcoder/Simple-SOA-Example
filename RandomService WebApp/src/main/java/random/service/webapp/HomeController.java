package random.service.webapp;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Service.IRandom;

@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Inject
	@Qualifier("randomServiceImpl")
	private IRandom randomService;
	
	public IRandom getRandomService() {
		return randomService;
	}
	
	public void setRandomService(IRandom randomService) {
		this.randomService = randomService;
	}

	@RequestMapping("/")
	public String random(Model model) {
		model.addAttribute("random", randomService.random());
		return "random";
	}
}
