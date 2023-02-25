import Products.*

class ElectronicsProduct(name: String, price: Double, quantity: Int, year: Int, var material: String) : Product(name, price, quantity, year) {


    override fun Quality(): Double {
        var god = 2023
        var quality = super.Quality()
        return quality + 0.5 * (god - year)
    }

    override fun Information(): String {
        return "Информация:\nИмя: $name, Цена: $price, Количество: $quantity, Год выпуска: $year, Материал: $material"
    }

     fun Credit() {
         println("Введите количество месяцев, для оформления кредита ")
         var cred = readln()!!.toInt()
         if (cred > 12 || cred <= 0) println("Ошибка. Попробуй еще. Проверь свою запись.")

         var mescr = this.price/cred*1.1
         println("Сумма в месяц составит $mescr")

    }

}