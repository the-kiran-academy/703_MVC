package com.jbk.service.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.jbk.dao.ProductDao;
import com.jbk.entity.ProductEntity;
import com.jbk.model.Product;
import com.jbk.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;

	@Autowired
	private ModelMapper modelMapper;


	Map<String, String> errorMap = new HashMap<String, String>();

	LinkedHashMap<String, Object> map = new LinkedHashMap<String, Object>();

	Map<Integer, Map<String, String>> rowMap = new HashMap<Integer, Map<String, String>>();
	int totalRecords = 0;

	List<Integer> alreadyExistsRows = new ArrayList<Integer>();

	@Override
	public int addProduct(Product product) {

		if (product.getProductId() == 0) {
			String productId = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date());

			product.setProductId(Long.parseLong(productId));
		}
		return dao.addProduct(modelMapper.map(product, ProductEntity.class));
	}

	@Override
	public Product getproductByName(String productName) {
		ProductEntity productEntity = dao.getProductByName(productName);
		if (productEntity != null) {
			return modelMapper.map(productEntity, Product.class);
		} else {
			return null;
		}
	}

	@Override
	public List<Product> deleteProduct(long productId) {
		List<ProductEntity> list = dao.deleteProduct(productId);
		return list.stream().map(productEntity -> modelMapper.map(productEntity, Product.class))
				.collect(Collectors.toList());
	}

	@Override
	public Product getProductById(long productId) {

		ProductEntity productEntity = dao.getProductById(productId);
		if (productEntity != null) {
			return modelMapper.map(productEntity, Product.class);
		} else {
			return null;
		}
	}

	@Override
	public List<Product> getAllProduct() {
		List<ProductEntity> list = dao.getAllProduct();
		return list.stream().map(productEntity -> modelMapper.map(productEntity, Product.class))
				.collect(Collectors.toList());
	}

	@Override
	public Product updateProduct(Product product) {
		ProductEntity updatedProduct = dao.updateProduct(modelMapper.map(product, ProductEntity.class));
		return modelMapper.map(updatedProduct, Product.class);
	}

	@Override
	public List<Product> getAllProductsByOrder(String orderType, String propertyName) {
		List<ProductEntity> list = dao.getAllProductsByOrder(orderType, propertyName);

		return list.stream().map(productEntity -> modelMapper.map(productEntity, Product.class))
				.collect(Collectors.toList());
	}

	
}
