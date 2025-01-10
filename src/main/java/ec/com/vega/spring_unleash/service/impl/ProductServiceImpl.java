package ec.com.vega.spring_unleash.service.impl;

import ec.com.vega.spring_unleash.domain.Product;
import ec.com.vega.spring_unleash.repository.ProductRepository;
import ec.com.vega.spring_unleash.service.ProductService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("productServiceImpl")
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public List<Product> getProducts() {
    return productRepository.getProducts();
  }
}
