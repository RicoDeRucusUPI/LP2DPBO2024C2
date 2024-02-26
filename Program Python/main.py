class Product:
    def __init__(self, id_product, name, brand, price):
        self.id_product = id_product
        self.name = name
        self.brand = brand
        self.price = price

    def get_id(self):
        return self.id_product

    def get_name(self):
        return self.name

    def get_brand(self):
        return self.brand

    def get_price(self):
        return self.price


class Clothing(Product):
    def __init__(self, id_product, name, brand, price, size, material, gender):
        super().__init__(id_product, name, brand, price)
        self.size = size
        self.material = material
        self.gender = gender

    def get_size(self):
        return self.size

    def get_material(self):
        return self.material

    def get_gender(self):
        return self.gender


class Shirt(Clothing):
    def __init__(self, id_product, name, brand, price, size, material, gender, color, sleeve_type):
        super().__init__(id_product, name, brand, price, size, material, gender)
        self.color = color
        self.sleeve_type = sleeve_type

    def get_color(self):
        return self.color

    def get_sleeve_type(self):
        return self.sleeve_type


if __name__ == "__main__":
    shirt_list = []

    shirt_list.append(Shirt(1, "Kemeja Naruto", "Adidas", "100000", "M", "Cotton", "Male", "Blue", "Long"))
    shirt_list.append(Shirt(2, "Shirt Batik", "Indopride", "105000", "M", "Cotton", "Male", "Red", "Short"))
    shirt_list.append(Shirt(3, "Shirt Batik New", "Indopride", "200000", "M", "Cotton", "Male", "Black", "Short"))

    print(f"{'ID':<10} {'Name':<20} {'Brand':<20} {'Price':<10} {'Size':<10} {'Material':<10} {'Gender':<10} {'Color':<10} {'Sleeve Type':<10}")

    for shirt in shirt_list:
        print(f"{shirt.get_id():<10} {shirt.get_name():<20} {shirt.get_brand():<20} {shirt.get_price():<10} {shirt.get_size():<10} {shirt.get_material():<10} {shirt.get_gender():<10} {shirt.get_color():<10} {shirt.get_sleeve_type():<10}")