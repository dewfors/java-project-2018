/**
 * Created by zm on 01.08.2018.
 */
public class BagPost {
    public String productName;
    public String fotoName;
    public String fotoCode;
    public String quantity;
    public String price;
    public String retailPrice;

    // в соответствии с нашими реквизитами из Golden
    public String name;
    public String priceZakup;
    public String count; //9 В наличии
    String priceSale; //5 цена продажи


    public BagPost(String productName, String fotoName, String fotoCode, String quantity, String price, String retailPrice) {
        this.productName = productName;
        this.fotoName = fotoName;
        this.fotoCode = fotoCode;
        this.quantity = quantity;
        this.price = price;
        this.retailPrice = retailPrice;
        this.name = "\"Рюкзак Asgard "+this.productName + " " + this.fotoName+"\"";

        this.priceZakup = getPriceZakup(this.price);

//        this.count = this.quantity;
        this.count = getNewFormatStr(this.quantity);
        this.priceSale = getNewFormatStr(this.retailPrice);

    }

    private String getPriceZakup(String price){
        double priceDbl = Double.parseDouble(price);
        //priceDbl += priceDbl*0.15;
        int priceInt = (int) priceDbl;
        String priceStr = Integer.toString(priceInt);
        return priceStr;
    }

    private String getNewFormatStr(String price){
        double priceDbl = Double.parseDouble(price);
        int priceInt = (int) priceDbl;
        String priceStr = Integer.toString(priceInt);
        return priceStr;
    }



    @Override
    public String toString() {
        return "BagPost{" +
                "productName='" + productName + '\'' +
                ", fotoName='" + fotoName + '\'' +
                ", fotoCode='" + fotoCode + '\'' +
                ", quantity='" + quantity + '\'' +
                ", price='" + price + '\'' +
                ", retailPrice='" + retailPrice + '\'' +
                ", name='" + name + '\'' +
                ", priceZakup='" + priceZakup + '\'' +
                ", count='" + count + '\'' +
                ", priceSale='" + priceSale + '\'' +
                '}';
    }





}
