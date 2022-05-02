var Employee = /** @class */ (function () {
    function Employee(emp_name, emp_age, emp_salary) {
        if (emp_salary === void 0) { emp_salary = 0; }
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_salary = emp_salary;
    }
    Employee.prototype.show = function () {
        console.log(this.emp_name);
        console.log(this.emp_age);
        console.log(this.emp_salary);
    };
    return Employee;
}());
var ob1 = new Employee("Vikas", 34, 14500);
var ob2 = new Employee("Meena", 29, 12500);
var ob3 = new Employee("Mohan", 34);
ob1.show();
ob2.show();
ob3.show();
