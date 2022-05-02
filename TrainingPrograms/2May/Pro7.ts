class ABC
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
class XYZ extends ABC
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
                      
var ob = new XYZ(32,21,67);
ob.show();
