"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(firstname, lastname, salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
    }
    Employee.prototype.getEmployeeDetails = function () {
        return this.firstname + "\n" + this.lastname + "\n" + this.salary;
    };
    return Employee;
}());
exports.Employee = Employee;
