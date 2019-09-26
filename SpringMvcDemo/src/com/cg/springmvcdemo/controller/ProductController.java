package com.cg.springmvcdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.springmvcdemo.dto.Product;
import com.cg.springmvcdemo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService prodservice;
	@RequestMapping(value = "/homes", method = RequestMethod.GET)
	public String homePage() {
		return "home";
	}
	
	@RequestMapping(value = "/addpage", method = RequestMethod.GET)
	public String addProduct(@ModelAttribute("product") Product pro) {
		return "AddProduct";
	}
	
	@RequestMapping(value = "/pagesubmit", method = RequestMethod.POST)
	public String addData(@ModelAttribute("product") Product pro) {
		prodservice.addProduct(pro);
		prodservice.showProduct().forEach(prod ->{
			System.out.println(prod);
		});
		return "home";
	}
	@RequestMapping(value="/showpage", method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Product> myList=prodservice.showProduct();
		return new ModelAndView("ShowProduct", "data",myList);
		
	}
	@RequestMapping(value="/delete",method=RequestMethod.GET)
	public String deletePage() {
		
		return "DeleteProduct";
		
	}
	@RequestMapping(value="/deletedata", method=RequestMethod.POST)
	public String deleteData(@RequestParam("pid") int prodId) {
		System.out.println(prodId);
		return "redirect:/showpage";
	}

}
