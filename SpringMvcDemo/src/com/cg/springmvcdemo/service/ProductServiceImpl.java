package com.cg.springmvcdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springmvcdemo.dao.ProductDao;
import com.cg.springmvcdemo.dto.Product;

@Service("prodservice")
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductDao proddao;

	public ProductDao getProddao() {
		return proddao;
	}

	public void setProddao(ProductDao proddao) {
		this.proddao = proddao;
	}

	@Override
	public Product addProduct(Product prod) {
		// TODO Auto-generated method stub
		return proddao.save(prod);
	}

	@Override
	public List<Product> showProduct() {
		// TODO Auto-generated method stub
		return proddao.findAll();
	}

	@Override
	public Product searchProduct(int prodId) {
		// TODO Auto-generated method stub
		return proddao.findByProductId(prodId);
	}

	@Override
	public void removeData(int prodId) {
		// TODO Auto-generated method stub
		proddao.remove(prodId);
		
	}

}
