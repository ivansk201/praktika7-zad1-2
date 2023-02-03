fun main()
{
    try
    {
        print("Введите -k: ")
        var k1 = readLine()!!.toDouble()
        print("Введите k: ")
        var k2 = readLine()!!.toDouble()
        print("Введите a: ")
        var a = readLine()!!.toDouble()
        print("Введите b: ")
        var b = readLine()!!.toDouble()
        print("Введите k: ")
        var k = readLine()!!.toDouble()

        var resc=(b*b)-(4*a*k).toDouble()
        if (resc<0)
        {
            println("Дискриминант меньше 0")
        }
        else
        {
            var x2 =(-b+Math.sqrt(resc))/(2*a).toDouble()
            var x1 =(-b-Math.sqrt(resc))/(2*a).toDouble()
            println(String.format("x1 - %.3f ", x1))
            println(String.format("x2 - %.3f ", x2))
            if (k1<x1&&x1<k2&&k1<x1&&x1<k2)
            {
                println("Корни входят в интервал")
            }
        }
    }
    catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}