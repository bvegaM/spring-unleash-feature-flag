package ec.com.vega.spring_unleash.service.impl;

import ec.com.vega.spring_unleash.domain.Product;
import ec.com.vega.spring_unleash.repository.ProductRepository;
import ec.com.vega.spring_unleash.service.ProductService;
import ec.com.vega.spring_unleash.utils.Constant;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("productServiceWithDiscountImpl")
@RequiredArgsConstructor
public class ProductServiceWithDiscountImpl implements ProductService {

  private final ProductRepository productRepository;

  @Override
  public List<Product> getProducts() {
    List<Product> productsWithDiscount = productRepository.getProducts().stream().map(Product::new)
        .toList();
    productsWithDiscount.forEach(product -> product.setPrice(
        product.getPrice().subtract(product.getPrice().multiply(Constant.DISCOUNT))));
    return productsWithDiscount;
  }

}
