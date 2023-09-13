
    class ColoredLine(startPoint: Point, endPoint: Point, color2: String) : Line(startPoint, endPoint, color2) {
        override fun toString(): String {
            return "Цветная линия: от (${startPoint.x}, ${startPoint.y}) до (${endPoint.x}, ${endPoint.y}), Цвет: $color3"
        }
    }
