export interface Info{
    getFullName():String;
}
export class Employee implements Info{
    getFullName(): String {
        let a = "Saif Haque";
        return a;
        throw new Error("Method not implemented.");
        
    }
    
}