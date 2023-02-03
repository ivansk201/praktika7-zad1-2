fun main() {
    try {
        print("Введите k: ")
        var k = readLine()!!.toInt()
        print("Введите l: ")
        var l = readLine()!!.toInt()
        print("Введите n: ")
        var n = readLine()!!.toInt()
        print("Введите m: ")
        var m = readLine()!!.toInt()
        if ((l % k == 0.toInt()) || (n % k == 0.toInt()) || (m % k == 0.toInt()))
        {
            print("Будет делителем")
        } else
            print("Не будет делителем")
    }
    catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}