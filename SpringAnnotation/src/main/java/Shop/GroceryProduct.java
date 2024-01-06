package Shop;

import org.springframework.stereotype.Component;

@Component
public class GroceryProduct implements Product{

    @Override
    public void getProductData() {
        System.out.println("PRODUCT TYPE IS GROCERY PRODUCT ");

    }
}
