package com.example.interfacetest;

public class Main {
public static void main(String[] args)
{
 ProductInterface[] pi = new ProductInterface[5];
 pi[0] = new Book(500, "Penguin", 1997);
 pi[1] = new TV(42, 50000, "Sony");
 pi[2] = new MP3(3000, "Apple", "White");
 pi[3] = new TV(53, 80000, "Samsung");
 pi[4] = new Book(600,"Websters",2000);

 double totalRegularPrice = 0;
 double totalSalePrice = 0;

 for (int i=0; i<pi.length; i++){
	 totalRegularPrice += pi[i].getRegularPrice();
     totalSalePrice += pi[i].computeSalesPrice();
     System.out.println("Item number " + i +
             ": Type = " + pi[i] +
             ", Regular price = " + pi[i].getRegularPrice() +
             ", Sale price = " + pi[i].computeSalesPrice());

 }

 System.out.println("totalRegularPrice = " + totalRegularPrice);
 System.out.println("totalSalePrice = " + totalSalePrice);

}
}

