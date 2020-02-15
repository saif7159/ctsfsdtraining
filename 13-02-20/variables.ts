let a;
function vartest()
{   
    a = "hello world"
    console.log(a);
}
vartest();
function looptest(){
    for(var i=0; i<5;i++)
    {
        console.log(i);
    }
    console.log("Outside test:"+i);
}
looptest();
let x:String;
let i:Number;
let arr: any[] = [2,"Hi",true];
let numarr: Number[] = [1,2,3,4,5];
const black = "#000000";

enum Color {Red, Green, Yellow, Brown};
console.log(x+"\n"+i+"\n"+arr+"\n"+numarr+"\n"+black+"\n"+Color.Brown);