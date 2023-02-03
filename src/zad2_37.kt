fun main()
{
    try
    {
        print("Введите x1: ")
        var x1 = readLine()!!.toDouble()
        print("Введите x2: ")
        var x2 = readLine()!!.toDouble()
        print("Введите y1: ")
        var y1 = readLine()!!.toDouble()
        print("Введите y2: ")
        var y2 = readLine()!!.toDouble()
        if ((Math.sqrt(x1) + Math.sqrt(y1)) == (Math.sqrt(x2) + Math.sqrt(y2)))
        {
            println("Лежат")
        }
        else  println("Не лежат");
    }
    catch (e:Exception)
    {
        println("Ошибка,ввода данных")
    }
}