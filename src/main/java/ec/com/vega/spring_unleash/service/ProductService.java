package ec.com.vega.spring_unleash.service;

import ec.com.vega.spring_unleash.domain.Product;
import java.util.List;
import org.unleash.features.annotation.Toggle;

public interface ProductService {

  @Toggle(name = "featureFlagExample", alterBean = "productServiceWithDiscountImpl")
  List<Product> getProducts();

}
