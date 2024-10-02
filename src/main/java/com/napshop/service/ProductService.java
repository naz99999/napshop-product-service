package com.napshop.service;

import com.napshop.dto.ProductRequest;
import com.napshop.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    ProductResponse createProduct(ProductRequest productRequest);

    List<ProductResponse> getProducts();
}
