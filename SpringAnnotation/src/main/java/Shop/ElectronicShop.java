package Shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ElectronicShop implements Shop {

    private ElectronicProduct electronicProduct;
@Autowired
@Qualifier("electronicProduct")
    public void setElectronicProduct(ElectronicProduct electronicProduct) {
        this.electronicProduct = electronicProduct;
    }

    @Override
    public void getShopInformation() {
        System.out.println("SHOP ADDRESS IS MUMBAI ");
    }

    @Override
    public void getProductInformation() {
    electronicProduct.getProductData();

    }
}
