package bai02;

public class Product {

    private int productId;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private int productPromotion;


    public Product(int productId, String productName, double productPrice, int productQuantity, int productPromotion) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productPromotion = productPromotion;
    }

    public int getProductId() {
        return this.productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice()
    {
        return this.productPrice;
    }

    public void setProductPrice(double productPrice)
    {
        this.productPrice = productPrice;
    }

    public int getProductQuantity()
    {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity)
    {
        this.productQuantity = productQuantity;
    }

    public int getProductPromotion()
    {
        return this.productPromotion;
    }

    public void setProductPromotion(int productPromotion)
    {
        this.productPromotion = productPromotion;
    }

    public double promotionNotMoneyCaculator()
    {
        return productQuantity * productPrice;
    }
    public double promotionMoneyCaculator()
    {
        return productPrice - (productPrice *((100-productPromotion)/100));
    }

}
