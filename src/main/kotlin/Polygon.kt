
    class Polygon(private val points: List<Point>, color: String) : Line(points.first(), points.last(), color)
    {
        // Перемещение по оси OX
        fun moveX(distance: Double) {

            for (point in points) {
                point.moveX(distance)
            }
        }

        // Перемещение по оси OY
        fun moveY(distance: Double) {
            for (point in points) {
                point.moveY(distance)
            }
        }
    }
