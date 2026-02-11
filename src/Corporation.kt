fun main() {
    print("Enter name: ")
    val name = readln()
    print("Enter brand: ")
    val brand = readln()
    print("Enter size: ")
    val size = readln().toFloat()
    print("Enter price: ")
    val price = readln().toInt()
    val productCard = ProductCard()
    productCard.init(brand = brand, name = name, size = size, price = price)
    productCard.printInfo()
}