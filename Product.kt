package Products

abstract class Product(var name: String, var price: Double, var quantity: Int, var year: Int) : Infs {

    var god = 2023


    open fun Quality(): Double {
        return price / quantity
    }


    open fun Info() {
        println(Information())
        println("Качество: ${Quality()}")
        if (Vozrast() == 0) println("Товар на склад привезен в этом году")
        else
        println("Товар на складе уже  : ${Vozrast()} год-а(лет)")

    }
    override fun Information(): String {
        return "Информация: Имя: $name, Цена: $price, Количество: $quantity, Год выпуска: $year"
    }
    override fun Vozrast(): Int {
        return god - year
    }
    override fun Warranty(): String {
        return if (Vozrast() < 3) "Гарантия будет"
        else "Гарантии не будет"
    }
}

interface Infs{
    fun Information(): String
    fun Vozrast(): Int
    fun Warranty(): String
}