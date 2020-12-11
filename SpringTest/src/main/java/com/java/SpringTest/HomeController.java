package com.java.SpringTest;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

	@GetMapping("/home")
	public String home() {
		return "Welcome to spring boot";
	}
	
	@GetMapping(value="/")
	public String index() {
		return "index";
	}
	
	 @RequestMapping("/list_contact")
	    public String listContact(Model model) {
	         
	        ContactBusiness business = new ContactBusiness();
	        List<Contact> contactList = business.getContactList();
	         
	        model.addAttribute("contacts", contactList);       
	         
	        return "contact";
	    }
}
