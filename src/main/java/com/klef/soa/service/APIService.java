package com.klef.soa.service;

import java.util.List;

import com.klef.soa.DTO.ProductDTO;

public interface APIService
{
	List<ProductDTO> displayAllProducts();
	ProductDTO displayProductById(int id);

}
