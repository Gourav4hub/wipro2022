class Employee
{
    // Data Members / Instance Variables
    private emp_name:string;
    private emp_age:number;
    private emp_salary:number;

    public constructor(emp_name,emp_age,emp_salary=0)
    {
        this.emp_name = emp_name
        this.emp_age = emp_age
        this.emp_salary = emp_salary
    }

    public show():void
    {
        console.log(this.emp_name)
        console.log(this.emp_age)
        console.log(this.emp_salary)
    }
}

var ob1 = new Employee("Vikas",34,14500);
var ob2 = new Employee("Meena",29,12500);
var ob3 = new Employee("Mohan",34);

ob1.show()
ob2.show()
ob3.show()