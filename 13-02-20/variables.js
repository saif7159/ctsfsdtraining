var a;
function vartest() {
    a = "hello world";
    console.log(a);
}
vartest();
function looptest() {
    for (var i = 0; i < 5; i++) {
        console.log(i);
    }
    console.log("Outside test:" + i);
}
looptest();
var x;
var i;
var arr = [2, "Hi", true];
var numarr = [1, 2, 3, 4, 5];
var black = "#000000";
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Yellow"] = 2] = "Yellow";
    Color[Color["Brown"] = 3] = "Brown";
})(Color || (Color = {}));
;
console.log(x + "\n" + i + "\n" + arr + "\n" + numarr + "\n" + black + "\n" + Color.Brown);
