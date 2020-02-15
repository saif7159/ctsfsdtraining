var Rectangle = /** @class */ (function () {
    function Rectangle(length, breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    Rectangle.prototype.getArea = function () {
        var area = this.length * this.breadth;
        return area;
    };
    Rectangle.prototype.getPerimiter = function () {
        return 2 * (this.length + this.breadth);
    };
    return Rectangle;
}());
var rectangle = new Rectangle(2, 5);
console.log(rectangle.getArea());
console.log(rectangle.getPerimiter());
