export class Employee{
    constructor(
        public firstname:String,
        public lastname:String,
        public salary:number
    ){}
    getEmployeeDetails():String
    {
        return this.firstname+"\n"+this.lastname+"\n"+this.salary;
    }
}