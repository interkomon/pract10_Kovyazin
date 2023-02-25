import Products.*

class ToolsProduct(name: String, price: Double, quantity: Int, year: Int, var material: String) : Product(name, price, quantity, year) {


    override fun Quality(): Double {
        var todayyear = 2023
        var quality = super.Quality()
        return quality + 0.5 * (todayyear - year)
    }

    override fun Information(): String {
        return "Информация:\nИмя товара: $name, Цена: $price, Количество: $quantity, Год выпуска: $year, Материал: $material"
    }

    fun Сost() {
        var stoimost = this.price * this.quantity
        println("Общая стоимоть товаров: $stoimost")
    }
}