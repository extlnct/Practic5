open class Point
{
    var coordinatX : Int
    var coordinatY : Int
    constructor(_x:Int,_y:Int)
    {
        coordinatX = _x
        coordinatY = _y
    }
}
class ColoredPoint:Point
{
    var color: String = "White"
    constructor(_x: Int, _y: Int, _color: String) : super(_x, _y)
    {
        color = _color
    }
}
open class Line : Point
{
    var coordinatX2: Int
    var coordinatY2: Int
    constructor(_x: Int,_y: Int,_x2:Int,_y2:Int):super(_x,_y)
    {
        coordinatX2=_x2
        coordinatY2 =_y2
    }
}
class ColoredLine: Line
{
    var colorLine: String = "White"
    constructor(_x: Int, _y: Int, _x2: Int, _y2: Int, _colorLine: String) : super(_x, _y,_x2,_y2)
    {
        colorLine = _colorLine
    }
}
//class Polygone () : Line
//{
//
//}
fun main()
{
    print("Enter your favorite color for Point : ")
    var intColorToPoint = readLine().toString()
    print("\nEnter coordinate(X) for Point : ")
    var coorXForPoint  = (readLine().toString()).toInt()
    print("\nEnter coordinate(Y) for Point : ")
    var coorYForPoint  = (readLine().toString()).toInt()
    print("\nEnter your favorite color for Line : ")
    var intColorToLine = readLine().toString()
    print("\nEnter coordinate(X2) for Line: ")
    var coorX2ForLine  = (readLine().toString()).toInt()
    print("\nEnter coordinate(Y2) for Line : \n")
    var coorY2ForLine  = (readLine().toString()).toInt()
    val point  = ColoredPoint(coorXForPoint,coorYForPoint, intColorToPoint)
    if (intColorToPoint=="Black" || intColorToPoint=="Red")
    {
        println("Point ---> Coordinates : (${point.coordinatX}  ; ${point.coordinatY}) \t Color : ${point.color} \t -//How cool, I like this color too//- ")
    }
    else
    println("Point ---> Coordinates : (${point.coordinatX}  ; ${point.coordinatY}) \t Color : ${point.color}")
    val line = ColoredLine(coorXForPoint,coorYForPoint,coorX2ForLine,coorY2ForLine,intColorToLine)
    if (intColorToLine=="Black" || intColorToLine=="Red" )
    {
        println("Line ---> Coordinates : (${line.coordinatX}  ; ${line.coordinatY}) (${line.coordinatX2}  ; ${line.coordinatY2}) \t Color : ${line.colorLine}\t -//How cool, I like this color too//- ")
    }
    else
    println("Line ---> Coordinates : (${line.coordinatX}  ; ${line.coordinatY}) (${line.coordinatX2}  ; ${line.coordinatY2}) \t Color : ${line.colorLine}")
}
