/* 
    ==========================================================================
    Saya Rico Valentino 1909263 mengerjakan (LP2)
    dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak
    melakukan kecurangan seperti yang telah dispesifikasikan.
    ==========================================================================
*/


import java.util.ArrayList; // import the ArrayList class

class Product {
    int id_product;
    String name, brand, price;

    Product(int id_product, String name, String brand, String price) {
        this.id_product = id_product;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

   int getID(){
   	return this.id_product;
   }

   String getName(){
   	return this.name;
   }

   String getBrand(){
   	return this.brand;
   }

   String getPrice(){
   	return this.price;
   }


}

class Clothing extends Product {
    String size, material, gender;

    Clothing(int id_product, String name, String brand, String price,
              String size, String material, String gender) {
        super(id_product, name, brand, price);
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    String getSize(){
    	return this.size;
    }

    String getMaterial(){
    	return this.material;
    }

    String getGender(){
    	return this.gender;
    }
}

class Shirt extends Clothing {
    String color, sleeve_type;

    Shirt(int id_product, String name, String brand, String price,
          String size, String material, String gender,
          String color, String sleeve_type) {
        super(id_product, name, brand, price, size, material, gender);
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    String getColor(){
    	return this.color;
    }

    String getSleeveType(){
    	return this.sleeve_type;
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Shirt> shirtList = new ArrayList<Shirt>();

        shirtList.add(new Shirt(1, "Kemeja Naruto", "Adidas", "100.000",
                "M", "Cotton", "Male",
                "Blue", "Long"));

        shirtList.add(new Shirt(2, "Shirt Batik", "Indopride", "105.000",
                "M", "Cotton", "Male",
                "Red", "Short"));

        shirtList.add(new Shirt(3, "Shirt Batik New", "Indopride", "200.000",
                "M", "Cotton", "Male",
                "black", "Short"));


        System.out.printf("%-10s %-20s %-20s %-10s %-10s %-10s %-10s %-10s %-10s%n",
                "ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");

        for (int i = 0; i < shirtList.size(); i++) {
            System.out.printf("%-10s %-20s %-20s %-10s %-10s %-10s %-10s %-10s %-10s%n",
            shirtList.get(i).getID(), shirtList.get(i).getName(), shirtList.get(i).getBrand(), shirtList.get(i).getPrice(),
            shirtList.get(i).getSize(), shirtList.get(i).getMaterial(), shirtList.get(i).getGender(),
            shirtList.get(i).getColor(), shirtList.get(i).getSleeveType());
        }
    }
}