package com.example.productcrud.service;

import org.springframework.stereotype.Service;

import com.example.productcrud.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductService {
  private static List<Product> products = new ArrayList<>();
  private static AtomicLong counter = new AtomicLong();

  public Product createProduct(Product product) {
    product.setId(counter.incrementAndGet());
    products.add(product);

    return product;
  }

  public List<Product> getAllProducts() {
    return products;
  }

  public Optional<Product> getProductById(Long id) {
    return products.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst();
  }

  public Optional<Product> updateProduct(Long id, Product updatedProductDetails) {
    return getProductById(id).map(product -> {
      product.setName(updatedProductDetails.getName());
      product.setDescription(updatedProductDetails.getDescription());
      product.setPrice(updatedProductDetails.getPrice());

      return product;
    });
  }

  public boolean deleteProduct(Long id) {
    return products.removeIf(product -> product.getId().equals(id));
  }

}
