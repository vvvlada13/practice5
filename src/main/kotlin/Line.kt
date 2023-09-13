    open class Line(val startPoint: Point, val endPoint: Point) {
        var color3: String = "Красный"

        constructor(startPoint: Point, endPoint: Point, color: String) : this(startPoint, endPoint) {
            this.color3 = color
        }

        fun getColor(): String {
            return color3
        }

        fun setColor(color: String) {
            this.color3 = color
        }

        override fun toString(): String {
            return "Линия: от (${startPoint.x}, ${startPoint.y}) до (${endPoint.x}, ${endPoint.y}), Цвет: $color3"
        }
    }

