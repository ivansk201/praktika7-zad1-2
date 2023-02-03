fun main()
{
 try
 {
  print("Введите a: ")
  var a = readLine()!!.toInt()
  print("Введите b: ")
  var b = readLine()!!.toInt()
  print("Введите c: ")
  var c = readLine()!!.toInt()
  if (a>b && b>c)
  {
   a=a*2;
   b=b*2;
   c=c*2;
 }
  else
  {
   Math.abs(a)
   Math.abs(b)
   Math.abs(c)
  }
  println("a=$a")
  println("a=$b")
  println("a=$c")
 }
 catch (e:Exception)
 {
     println("Ошибка,ввода данных")
 }
}