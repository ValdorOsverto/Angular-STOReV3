package com.storebv3.controller;

import com.storebv3.model.Product;
import com.storebv3.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
  @Autowired
  private ProductRepository productRepository;

  @GetMapping
  public List<Product> getAllProducts() {
    return productRepository.findAll();
  }

  @GetMapping("/{id}")
  public ResponseEntity<Product> getProductById(@PathVariable long id) {
    Optional<Product> product = productRepository.findById(id);
    return product.map(ResponseEntity::new).orElseGet(() -> ResponseEntity.notFound().build());
  }

  @PostMapping
  public Product createProduct(@RequestBody Product product) {
    return productRepository.save(product);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
    Optional<Product> product = productRepository.findById(id);
    if (product.isPresent()) {
      Product updatedProduct = product.get();
      updatedProduct.setProducto(productDetails.getProducto());
      updatedProduct.setCodigobarras(productDetails.getCodigobarras());
      updatedProduct.setMarca(productDetails.getMarca());
      updatedProduct.setCosto(productDetails.getCosto());
      updatedProduct.setEstatus(productDetails.getEstatus());
      return ResponseEntity.ok(productRepository.save(updatedProduct));
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @DeleteMapping("/{id}")
  public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
    Optional<Product> product = productRepository.findById(id);
    if (product.isPresent()) {
      productRepository.deleteById(id);
      return ResponseEntity.ok().build();
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}