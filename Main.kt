fun main() {
    try {
        var product_electonics = newElectronicsProduct()
        product_electonics.Info()
        product_electonics.Credit()
        println(product_electonics.Warranty())

        var product_tools = newToolsProduct()
        product_tools.Info()
        product_tools.Сost()
        println(product_tools.Warranty())
    }catch (e:Exception)
    {
        println("Ошибка. Попробуйте еще")
    }
}

fun newElectronicsProduct(): ElectronicsProduct {

        print("Введите имя товара ~Электроника~: ")
        var name = readLine().toString()

        print("Введите цену: ")
        var price = readLine()!!.toDouble()
        if (price < 0) println("Ошибка. Не может быть меньше нуля")

        print("Введите количество: ")
        var quantity = readLine()!!.toInt()
        if (quantity < 0) println("Ошибка. Не может быть меньше нуля")

        print("Введите год выпуска: ")
        var year = readLine()!!.toInt()
        if (year < 1991 || year > 2023) println("Увы. Только начиная с существования Российской Федерации")

        print("Введите материал: ")
        var material = readLine().toString()


        return ElectronicsProduct(name, price, quantity, year, material)
    }



fun newToolsProduct(): ToolsProduct {

        print("Введите имя товара ~Инструменты~: ")
        var name = readLine().toString()

        print("Введите цену: ")
        var price = readLine()!!.toDouble()
        if (price < 0) println("Ошибка. Не может быть меньше нуля")

        print("Введите количество: ")
        var quantity = readLine()!!.toInt()
        if (quantity < 0) println("Ошибка. Не может быть меньше нуля")

        print("Введите год выпуска: ")
        var year = readLine()!!.toInt()
        if (year < 1991 || year > 2023) println("Увы. Только начиная с существования Российской Федерации")

        print("Введите материал: ")
        var material = readLine().toString()

        return ToolsProduct(name, price, quantity, year, material)


}



