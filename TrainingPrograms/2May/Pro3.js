var Employee = /** @class */ (function () {
    function Employee(emp_name, emp_age, emp_salary) {
        if (emp_salary === void 0) { emp_salary = 0; }
        this.emp_name = emp_name;
        this.emp_age = emp_age;
        this.emp_salary = emp_salary;
    }
    Employee.prototype.show = function () {
        console.log("\nName : ", this.emp_name);
        console.log("Age : ", this.emp_age);
        console.log("Salary : ", this.emp_salary);
    };
    return Employee;
}());
var employees = [];
employees.push(new Employee("Vikas Parmar", 34, 45600));
employees.push(new Employee("Meena Gupta", 25, 23450));
employees.push(new Employee("Prakesh Singh", 36, 21000));
employees.push(new Employee("Sourabh Patidar", 21, 34000));
employees.push(new Employee("Reena Verma", 29, 32000));
for (var _i = 0, employees_1 = employees; _i < employees_1.length; _i++) {
    var ob = employees_1[_i];
    ob.show();
}
