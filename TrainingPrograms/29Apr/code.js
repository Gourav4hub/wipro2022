// Array for storing the student data
var students = []

var rollBox = undefined;
var nameBox = undefined;
var branchBox = undefined;
var oopsBox = undefined;
var compilerBox = undefined;
var javaBox = undefined;

function init()
{
    rollBox = document.getElementById('roll');
    nameBox = document.getElementById('name');
    branchBox = document.getElementById('branch');
    oopsBox = document.getElementById('oops');
    compilerBox = document.getElementById('compiler');
    javaBox = document.getElementById('java');
    console.log('Initialization Done !')
}

function clearBoxes()
{
    rollBox.value='';
    nameBox.value='';
    branchBox.value='';
    oopsBox.value='';
    compilerBox.value='';
    javaBox.value='';
}

function addData()
{
    var roll_number = rollBox.value;
    var stud_name = nameBox.value;
    var branch = branchBox.value;

    var oops = parseFloat(oopsBox.value);
    var compiler = parseFloat(compilerBox.value);
    var java = parseFloat(javaBox.value);

    var ob = {
       roll_number , stud_name , branch , oops , compiler , java     
    }
    students.push(ob);
    clearBoxes();
}