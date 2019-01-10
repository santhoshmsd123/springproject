package com.kce.controller;
import javax.transaction.Transactional;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kce.model.Signup;
@Controller
public class S_controller {
	@Autowired
	SessionFactory sf;
	@RequestMapping("/")
	public String do1() {
		return "Signup";
						}
	@RequestMapping("/signup")//action in form signup
	@Transactional
	public String add_detail(@ModelAttribute("signup") Signup temps) {//data from form enter in bean 
		try 
		{
		Session s=sf.getCurrentSession();
		//Signup temps1=new Signup(temps.getUsername(),temps.getRollno(),temps.getMailid(),temps.getPassword(),temps.getRole());
		//s.save(temps1);
		s.save(temps);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return "first";
		}
}
