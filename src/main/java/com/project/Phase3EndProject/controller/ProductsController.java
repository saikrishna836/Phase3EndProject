package com.project.Phase3EndProject.controller;
import java.util.List;
import java.util.Optional;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.OrderBy;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.project.Phase3EndProject.Entity.Product;
import com.project.Phase3EndProject.Repository.ProductRepository;
@Controller
@ComponentScan("com.project.Phase3EndProject")
public class ProductsController {
	@Autowired
	private ProductRepository p_repo;

	@RequestMapping("/productsmanage")
	public String manageProduct() {
		return "addanddelete";
	}

	@RequestMapping("/addProduct")
	public String addProduct() {
		return "addproducts";
	}
	@RequestMapping("/delproduct")
	public String delProduct(ModelMap model) {
		Iterable<Product> products = p_repo.findAll();
		System.out.println(products);
		model.addAttribute("products", products);
		return "delproducts";
	}
	@RequestMapping("/productaddition")
	public String addtoDb(@ModelAttribute("product") Product product, ModelMap model) {
		Product result = p_repo.save(product);
		if (result.equals(null)) {
			model.addAttribute("message", "Product Addition Unsuccessfull!!!\n Please enter again");
			return "addproducts";
		} else {
			model.addAttribute("message", "Product Added Successfully");
			return "adminpage";
		}
	}
	@RequestMapping("/productdeletion")
	public String delfromDb(@RequestParam("Id") int Id, ModelMap model) {
		if (!p_repo.findById(Id).isEmpty()) {
			p_repo.deleteById(Id);
			model.addAttribute("message", "Product Deleted Successfully");
			return "adminpage";
		} else {
			model.addAttribute("message", "Product Deletion Unsuccessfull");
			return "adminpage";
		}
	}

	@RequestMapping("/getbyname")
	public String getbyProductName(ModelMap model) {
		List<Product> products = p_repo.orderbyname();
		System.out.println(products);
		model.addAttribute("heading", "Categorized by Product Name");
		model.addAttribute("products", products);
		return "productscategory";
	}

	@RequestMapping("/getbybrand")
	public String getbyProductBrand(ModelMap model) {
		List<Product> products = p_repo.orderbybrand();
		System.out.println(products);
		model.addAttribute("heading", "Categorized by Product Brand");
		model.addAttribute("products", products);
		return "productscategory";
	}

	@RequestMapping("/getbygender")
	public String getbyGender(ModelMap model) {
		List<Product> products = p_repo.orderbygender();
		System.out.println(products);
		model.addAttribute("heading", "Categorized by Gender of People who uses product");
		model.addAttribute("products", products);
		return "productscategory";
	}

	@RequestMapping("/getbysize")
	public String getbyProductSize(ModelMap model) {
		List<Product> products = p_repo.orderbysize();
		System.out.println(products);
		model.addAttribute("heading", "Categorized by Product Size");
		model.addAttribute("products", products);
		return "productscategory";
	}

}
