package com.cg.springmvcdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.springmvcdemo.dto.Product;

@Repository("proddao")
public class ProductDaoImpl implements ProductDao {

	List<Product> prodList = new ArrayList<Product>();

	@Override
	public Product save(Product prod) {
		prodList.add(prod);
		return prod;
	}

	@Override
	public List<Product> findAll() {
		return prodList;
	}

	@Override
	public Product findByProductId(int prodId) {
		for (Product prod : prodList) {
			if (prodId == prod.getProdId()) {
				return prod;
			}
		}
		return null;
	}

	@Override
	public void remove(int prodId) {
		// TODO Auto-generated method stub
		
		for(Product product: prodList) {
			if(product.getProdId()==prodId) {
				prodList.remove(product);
				break;
			}
		}
		
	}

}
