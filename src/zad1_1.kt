fun main() {
    try
    {
        print("Введите первый член прогрессии: ")
        var a1 = readLine()!!.toDouble()
        print("Введите пятый член прогрессии: ")
        var a5 = readLine()!!.toDouble()
        print("Введите N член прогрессии: ")
        var n = readLine()!!.toDouble()
        var d = (a5 - a1) / 4
        var an = a1 + (n - 1) * d
        var sum = (((2 * a1 + n) / 2) * n)
        println("N член прогрессии: $an")
        println("Сумма первых n членов прогрессии: $sum")
    }
    catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}
