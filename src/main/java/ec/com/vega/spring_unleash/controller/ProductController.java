package ec.com.vega.spring_unleash.controller;

import ec.com.vega.spring_unleash.domain.Product;
import ec.com.vega.spring_unleash.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
  private final ProductService productService;

  public ProductController(@Qualifier("productServiceImpl") ProductService productService) {
    this.productService = productService;
  }

  @GetMapping()
  public ResponseEntity<List<Product>> getProducts(){
    return ResponseEntity.ok().body(productService.getProducts());
  }
}
