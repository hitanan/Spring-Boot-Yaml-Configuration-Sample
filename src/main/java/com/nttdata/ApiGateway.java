package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nttdata.api.v2.PetApi;


@Controller
@RequestMapping(value="/")
public class ApiGateway {

	private final PetApi api = new PetApi();
	
	@Autowired
	private ApiInfoList configuration;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("apis", configuration.getApis());
		
		try {
			System.out.println(api.getPetById(2l));
		} catch (Exception e) {
			System.out.println("no found exception");
		}
		
		return "index";
	}
}
