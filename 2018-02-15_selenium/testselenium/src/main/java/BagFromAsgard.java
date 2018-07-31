/**
 * Created by zm on 27.07.2018.
 */
public class BagFromAsgard {


    private String ProductName; //1
    private String FotoName; //2
    private String FotoCode; //3
    private String Quantity; //4
    private String Price; //5
    private String RetailPrice; //6

    public BagFromAsgard(String productName, String fotoName, String fotoCode, String quantity, String price, String retailPrice) {
        ProductName = productName;
        FotoName = fotoName;
        FotoCode = fotoCode;
        Quantity = quantity;
        Price = price;
        RetailPrice = retailPrice;
    }

    @Override
    public String toString() {
        return "BagFromAsgard{" +
                "ProductName='" + ProductName + '\'' +
                ", FotoName='" + FotoName + '\'' +
                ", FotoCode='" + FotoCode + '\'' +
                ", Quantity='" + Quantity + '\'' +
                ", Price='" + Price + '\'' +
                ", RetailPrice='" + RetailPrice + '\'' +
                '}';
    }
}
