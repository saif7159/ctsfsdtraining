import { Calculator } from "./calculator.component";

describe('Calculator Test', function(){
    it('addtest', function(){
        var calc = new Calculator();
        const sum = calc.addNumbers(5,15);
        const expectedsum = 20;
        expect(sum).toBe(expectedsum); 
    });
    it('subtest', function(){
        var calc = new Calculator();
        const difference = calc.subtractNumbers(15,10);
        const expecteddiff = 5;
        expect(difference).toBe(expecteddiff); 
    });
});