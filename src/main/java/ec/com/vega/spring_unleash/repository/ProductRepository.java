package ec.com.vega.spring_unleash.repository;

import ec.com.vega.spring_unleash.domain.Product;
import java.util.List;

public interface ProductRepository {

  List<Product> getProducts();

}
