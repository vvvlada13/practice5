open class Point (val x: Double, val y: Double) {
    //первычный конструктор
    constructor (x:Double, y: Double, color: String) : this(x,y)
    {
        this.color4 = color
    }
    //вторичный конструктор
    constructor(point: Point): this (point.x, point.y) {
        this.color4 = point.color4
    }
    var color4: String = "Желтый"
    fun getColor (): String {
        return color4
    }
    open  fun moveX(distance: Double) {
        println ("Перемещение по оси OX на $distance")
    }
    open  fun moveY(distance: Double) {
        println ("Перемещение по оси OY на $distance")
    }
    override fun toString():
            String {
        return "Точка: ($x , $y) , Цвет: $color4"
    }
}