package ec.com.vega.spring_unleash.config;

import ec.com.vega.spring_unleash.domain.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringUnleashFeatureFlagConfiguration {

  @Bean
  public List<Product> initProducts(){
    final List<Product> products = new ArrayList<>();
    products.add(new Product("Product 1", "Description 1", 10, new BigDecimal(50)));
    products.add(new Product("Product 2", "Description 2", 30, new BigDecimal(40)));
    products.add(new Product("Product 3", "Description 3", 5, new BigDecimal(30)));
    return products;
  }
}
