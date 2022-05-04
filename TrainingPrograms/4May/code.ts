export class ABC
{
    private a:number;
    private b:number;

    public constructor(a:number,b:number)
    {
        this.a = a
        this.b = b
    }
    public show():void
    {
        console.log("\nA : ",this.a, " B : ", this.b)
    }
}

// mention export default only once in a file
export default class XYZ extends ABC
{
    private x:number;
    public constructor(a:number,b:number,x:number)
    {
        super(a,b); // Parent Class Constructor
        this.x = x
    }

    // Override
    public show():void
    {
        super.show();
        console.log("X : ",this.x)
    }
}

export var arr = [34,56,45,45,43,543,5,43,5,435]
