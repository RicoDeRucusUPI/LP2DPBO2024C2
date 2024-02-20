Saya Rico Valentino 1909263 mengerjakan (LP2) dalam mata kuliah DPBO untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan.

# Alur OPP
## Membuat 3 class Products (Induk), Clothing (Anak), Shirt (Cucu)

## Konsep Multi-level Inheritance
Products
	<- Clothing
			<- Shirt

Class Products berdiri sendiri tanpa extends dari class lain
Class Clothing melakukan extends dengan Class Products
Class Shirt melakukan extends dengan Class Clothing

# Alur Program
Class Products memliki method getID(), getName(), getBrand(), getPrice()
Class Clothing memliki method getSIze(), getMaterial(), getGender()
Class Shirt memiliki method getColor(), getSleeveType()

Dikarenakan class Shirt melakukan extends (Inheritance) dengan class Clothing maka class Shirt dapat melakukan method seperti class Clothing begitu juga dengan Clothing kepada class Products

Pada Main membuat arraylist untuk melakukan array agar mengurangi pembuat variabel pada class baru

terdapat 3 data shirt lalu di print for dengan bentuk print seperti tabel