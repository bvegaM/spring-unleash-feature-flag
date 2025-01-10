package ec.com.vega.spring_unleash.domain;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {

  private String name;
  private String description;
  private Integer quantity;
  private BigDecimal price;

  public Product(Product product) {
    this.name = product.getName();
    this.description = product.getDescription();
    this.quantity = product.getQuantity();
    this.price = product.getPrice();
  }

  public void applyDiscount(BigDecimal discount) {
    BigDecimal discountValue = price.multiply(discount);
    price = price.subtract(discountValue);
  }
}
