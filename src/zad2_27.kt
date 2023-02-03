import kotlin.math.sqrt

fun main()
{
    try
    {
        print("Введите a: ")
        var a= readLine()!!.toDouble()
        print("Введите b: ")
        var b = readLine()!!.toDouble()
        print("Введите c: ")
        var c = readLine()!!.toDouble()
        if ((a+b>c) && (b+c>a) && (a+c>b))
        {
            var p = a + b + c
            var h = p / 2
            var s = Math.sqrt(h * (h - a) * (h - b) * (h - c))
            println("Периметр: $p")
            println("Площадь: $s")
        }
        else
        {
            println("Построить невозможно")
        }


    }
    catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}