package Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BigBasket implements Shop{

    private GroceryProduct groceryProduct;

    @Autowired
    @Qualifier("groceryProduct")
    public void setGroceryProduct(GroceryProduct groceryProduct) {
        this.groceryProduct = groceryProduct;
    }

    @Override
    public void getShopInformation() {
        System.out.println("SHOP ADDRESS ID PUNE ");
    }

    @Override
    public void getProductInformation() {
        groceryProduct.getProductData();

    }
}
