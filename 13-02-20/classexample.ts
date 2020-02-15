class Rectangle{
    private length: number;
    private breadth: number;
    constructor(length,breadth){
        this.length = length;
        this.breadth = breadth;
    }
    getArea():number{
        let area = this.length*this.breadth;
        return area;
    }
    getPerimiter():number{
        return 2*(this.length+this.breadth);
    }
}
var rectangle = new Rectangle(2,5);
console.log(rectangle.getArea());
console.log(rectangle.getPerimiter());