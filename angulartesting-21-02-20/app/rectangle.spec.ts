import { Rectangle } from "./rectangle.component";

describe('Rectangle Test' , function(){
    it('Area Test' , function(){
        var rectangle = new Rectangle();
        const area = rectangle.getArea(10,5);
        expect(area).toBe(50);

    });
    it('Perimeter Test' , function(){
        var rectangle = new Rectangle();
        const perim = rectangle.getPerimeter(10,5);
        expect(perim).toBe(30);

    });
});