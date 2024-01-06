package Shop;

import org.springframework.stereotype.Component;

@Component
public class ElectronicProduct  implements Product{

    @Override
    public void getProductData() {
        System.out.println("PRODUCT TYPE IS ELECTRONIC PRODUCT ");
    }
}
