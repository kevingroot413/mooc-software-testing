package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Arrays;
import java.util.List;

public class DiscountApplierTest {
    @Test
    void discount() {

        Product product_home = new Product("Product_HOME", 20.0, "HOME");
        Product product_business = new Product("Product_BUSINESS", 20.0, "BUSINESS");

        ProductDao dao = Mockito.mock(ProductDao.class);

        List<Product> input = Arrays.asList(product_home, product_business);
        Mockito.when(dao.all()).thenReturn(input);

        DiscountApplierSolution discountApplier = new DiscountApplierSolution(dao);
        discountApplier.setNewPrices();

        Assertions.assertEquals((20*0.9), product_home.getPrice());
        Assertions.assertEquals((20*1.1), product_business.getPrice());
    }
}
