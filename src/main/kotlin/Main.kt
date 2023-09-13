fun main(args: Array<String>)
    {
        val point = Point(2.5,4.7)
        println(point)

        val coloredPoint = ColoredPoint(3.8,1.2, "Черный")
        println(coloredPoint)

        val line = Line(Point(1.0, 2.0), Point(3.0, 4.0))
        line.setColor("<Белый")
        println(line)

        val coloredLine = ColoredLine(Point(5.0, 6.0), Point(7.0, 8.0), "Голубой")
        println(coloredLine)

        val polygon = Polygon(listOf(Point(2.0, 2.0), Point(4.0, 4.0), Point(6.0, 2.0)), "Лиловый")
        polygon.moveX(3.0)
        println(polygon)
    }

