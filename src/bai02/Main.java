package bai02;

import java.util.Scanner;

public class Main {

    public static int promotionAfterMoneySum(Product[] products)
    {
        int promtionAfterSum = 0;
        for (Product promotionProduct: products)
        {
            promtionAfterSum += promotionProduct.promotionMoneyCaculator();
        }
        return promtionAfterSum;
    }
    public static int promotionAfterMoneyDiffernce(Product[] products)
    {
        int promtionAfterSum = promotionAfterMoneySum(products);

        int promotionNotSum = 0;

        for (Product promotionNotProduct: products)
        {
            promotionNotSum  += promotionNotProduct.promotionNotMoneyCaculator();
        }
        return promotionNotSum - promtionAfterSum;

    }

    public static void main(String[] args)
    {
         Product[] products = {new Product(1,"Xiaomi Redmi 9A",1790000,
                                            1,30),
                               new Product(2, "Adapter Sạc 2 cổng Type C PD QC ",200000,
                                            3, 45),
                               new Product(3,"Đồng hồ ADRIATICA 33 mm Nữ A3798.5175Q", 1380000,
                                         2,0),
                 new Product(4, "Đồng hồ thông minh BeU Sporty 1 46mm ",990000,
                         3, 0),
                 new Product(5, "Điện thoại Vivo Y35",6590000,
                         1, 35)};
         int moneyDifference = promotionAfterMoneyDiffernce(products);
         System.out.println("Money Difference : " + moneyDifference);
    }
}
