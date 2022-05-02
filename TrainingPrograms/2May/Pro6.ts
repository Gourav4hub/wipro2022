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
        console.log("\nName : " , this.emp_name)
        console.log("Age : " , this.emp_age)
        console.log("Salary : ", this.emp_salary)
    }

    public getAge():number{
        return this.emp_age;
    }
}


var employees = [];
employees.push(new Employee("Vikas Parmar",34,45600));
employees.push(new Employee("Meena Gupta",25,23450));
employees.push(new Employee("Prakesh Singh",36,21000));
employees.push(new Employee("Sourabh Patidar",21,34000));
employees.push(new Employee("Reena Verma",29,32000));

// Arrow Function
var arr = employees.filter((ob:Employee)=>ob.getAge()>30);
console.log(arr)


// function filter(fun)
// {
//     var num = []
//     for(var x of this.arr)
//     {
//         var status = fun(x)
//         if(status)
//         {
//             num.push(x)
//         }
//     }
//     return num;
// }






