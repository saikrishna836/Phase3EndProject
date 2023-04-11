package com.project.Phase3EndProject.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.Phase3EndProject.Entity.Product;
import com.project.Phase3EndProject.Entity.Reports;
import com.project.Phase3EndProject.Entity.User;
import com.project.Phase3EndProject.Repository.ProductRepository;
import com.project.Phase3EndProject.Repository.ReportRepository;
import com.project.Phase3EndProject.Repository.UserRepository;

@Controller
public class UserController {
	@Autowired
	ProductRepository p_repo;
	@Autowired
	UserRepository u_repo;
	@Autowired
	ReportRepository r_repo;

	@RequestMapping("/payment")
	public String pay(@RequestParam("id") int id, @RequestParam("u_id") String u_id, @ModelAttribute("user") User user,
			ModelMap model) {

		Optional<Product> product1 = p_repo.findById(id);
		if (!product1.isEmpty()) {
			Product product = product1.get();
		//	model.addAttribute("p_id", id);
			model.addAttribute("u_id", u_id);
			model.addAttribute("id", id);

			return "payment";
		} else {
			Iterable<Product> products = p_repo.findAll();
			System.out.println(products);
			model.addAttribute("products", products);
			model.addAttribute("message", "Invalid options!select options from above");
			return "userpage";
		}
	}

	@RequestMapping("/reports")
	public String userPage(@RequestParam("p_id") String p_id, @RequestParam("u_id1") String u_id1, ModelMap model) {
		int id = Integer.parseInt(p_id);
		// System.out.println("Hii");
		int uid = Integer.parseInt(u_id1);
		Optional<Product> product1 = p_repo.findById(id);
		if (!product1.isEmpty()) {
			Product product = product1.get();
			Optional<User> user1 = u_repo.findById(uid);
			User user = user1.get();
			System.out.println(product);
			Reports report = new Reports();
			report.setProdname(product.getProdname());
			report.setBrand(product.getBrand());
			report.setGender(product.getGender());
			report.setUsername(user.getName());
			report.setU_id(uid);
			report.setLocaldate(new Date());
			try {
				r_repo.save(report);
				model.addAttribute("message", "Payment Successfull");
				return "userlogin";
			} catch (Exception e) {
				model.addAttribute("message", "Payment unsuccessfully");
				return "userlogin";
			}
		} else {
			model.addAttribute("message", "Payment unsuccessfully");
			return "userlogin";
		}
	}

	@RequestMapping("/paymentscancel")
	public String userPage(ModelMap model) {
		Iterable<Product> products = p_repo.findAll();
		System.out.println(products);
		model.addAttribute("products", products);
		model.addAttribute("message", "Payment cancelled");
		return "userlogin";
	}

	@RequestMapping("/manageUsers")
	public String manageUsers(ModelMap model) {
		return "manageusers";
	}

	@RequestMapping("/searchusers")
	public String searchUsers(@RequestParam("id") int id, ModelMap model) {
		List<User> user = u_repo.find(id);
		if (!user.isEmpty()) {
			model.addAttribute("users", user);
			model.addAttribute("message", "User with id:" + id);
			return "userreports";
		} else {
			model.addAttribute("message", "User with id:" + id + " not found");
			return "manageusers";
		}

	}

	@RequestMapping("/getAllUsers")
	public String getAllUsers(ModelMap model) {
		Iterable<User> user = u_repo.findAll();
		model.addAttribute("users", user);
		model.addAttribute("message", "List of All Users");
		return "userreports";
	}

}
