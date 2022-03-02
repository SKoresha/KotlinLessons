package day_1_kotlin.langrus.assignments

// Workshop #4 - classes

object KotlinWorkshop4 {

    // Не исправляй! Дано:
    @JvmStatic
    fun main(args: Array<String>) {
        testBus()
    }



    /* Рабочая зона */

    // TODO 1: Объяви класс "Bus" который в качестве аргумента будет получать число "passengersCount".
    // ? Хорошим тоном считается объявлять классы и интерфейсы внизу файла, под функциями.
    // Здесь, и в других частях практической работы, классы и функции отсортированы по порядку выполнения заданий.
//    class ...(...) {

    // TODO 2: Добавь функцию "drive", без аргументов.
    //  Она должна выводить фразу "Driving N passengers to the destination", где N - число пассажиров.


//    }

    private fun testBus() {
        // TODO 3: Создайте экземпляр класса "Bus".
        val bus = Buss(10)

        // TODO 4: Отправь автобус к пункту назначения и проверь, что выведется в консоль.
        bus.drive()
    }

    class Buss(private val passengersCount: Int){
        fun drive() {
            println("Driving $passengersCount passengers to the destination")
        }
    }
}