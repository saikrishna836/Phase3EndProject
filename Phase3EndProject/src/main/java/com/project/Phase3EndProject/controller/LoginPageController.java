package com.project.Phase3EndProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Phase3EndProject.Entity.Admin;
import com.project.Phase3EndProject.Entity.Product;
import com.project.Phase3EndProject.Entity.User;
import com.project.Phase3EndProject.Repository.AdminRepository;
import com.project.Phase3EndProject.Repository.ProductRepository;
import com.project.Phase3EndProject.Repository.UserRepository;

@Controller
@ComponentScan("com.project.Phase3EndProject")
public class LoginPageController {
	@Autowired
	public AdminRepository a_repo;
	@Autowired
	public ProductRepository p_repo;
	@Autowired
	public UserRepository u_repo;

	@RequestMapping("/welcomepage")
	public String welcomePage() {
		return "welcome";
	}

	@RequestMapping("/adminlogin")
	public String adminLoginPage() {
		return "adminlogin";
	}

	@RequestMapping("/userlogin")
	public String userLoginPage() {
		return "userlogin";
	}

	@RequestMapping("/signuppage")
	public String signUpPage() {
		return "usersignup";
	}
	@RequestMapping("/adduser")
	public String userSignUp(@ModelAttribute("user") User user, ModelMap model) {
		List<User> result = u_repo.findByEmail(user.getEmail());
		System.out.println(result.isEmpty());
		if (result.isEmpty()) {
			User result1 = u_repo.save(user);
			if (result1 != null && user.getName() != null && user.getPassword() != null) {
				model.addAttribute("message", "User SignUp successfull");
				return "userlogin";
			} else {
				model.addAttribute("message", "User SignUp unsuccessfull");
				return "usersignup";
			}
		} else {
			model.addAttribute("message", "User SignUp unsuccessfull as Mail Already Exists or entered null values");
			return "usersignup";
		}
	}
	@RequestMapping("/adminvalidation")
	public String adminPage(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap model) {
		List<Admin> admin = a_repo.find(email, password);

		if (admin.isEmpty()) {
			model.addAttribute("message", "Invalid Admin Credentials");
			return "adminlogin";
		} else {
			model.addAttribute("name", admin.get(0).getName());
			return "adminpage";

		}

	}
	@RequestMapping("/uservalidation")
	public String userPage(@RequestParam("email") String email, @RequestParam("password") String password,
			ModelMap model) {
		List<User> user = u_repo.findByEmail(email);

		if (user.isEmpty()) {
			model.addAttribute("message", "Invalid User Credentials");
			return "userlogin";
		} else {
			if (user.get(0).getPassword().equals(password)) {

				Iterable<Product> result = p_repo.findAll();
				System.out.println(user.get(0));
				model.addAttribute("user", user.get(0));
				model.addAttribute("products", result);
				return "userpage";
			} else {
				model.addAttribute("message", "Invalid User Credentials");
				return "userlogin";
			}
		}

	}

	@RequestMapping("/password")
	public String PasswordChange(@RequestParam("email") String email, @RequestParam("old_password") String op,
			@RequestParam("new_password") String np, @RequestParam("c_new_password") String cnp, ModelMap model) {
		List<Admin> admin = a_repo.find(email, op);
		if (!admin.isEmpty()) {
			if (np.equals(cnp)) {

				String pw = admin.get(0).getPassword();
				if (pw.equals(op)) {
					admin.get(0).setPassword(np);
					Admin a=admin.get(0);
					a_repo.save(a);
					model.addAttribute("message", "Password Change Successfull");
					return "adminlogin";
				} else {
					model.addAttribute("message", " Old Password Wrong");
					return "password";
				}
			} else {
				model.addAttribute("message", "Both new Passwords are not same");
				return "password";
			}
		} else {
			model.addAttribute("message", "Wrong Email");
			return "password";
		}

	}

	@RequestMapping("/passwordpage")
	public String PasswordPage() {
		return "password";

	}
}
