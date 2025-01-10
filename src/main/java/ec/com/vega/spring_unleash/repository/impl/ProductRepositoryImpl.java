package ec.com.vega.spring_unleash.repository.impl;

import ec.com.vega.spring_unleash.domain.Product;
import ec.com.vega.spring_unleash.repository.ProductRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryImpl implements ProductRepository {

  private final List<Product> products;

  @Override
  public List<Product> getProducts() {
    return products;
  }
}
