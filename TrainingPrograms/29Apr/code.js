// Array for storing the student data
var students = []

var rollBox = undefined;
var nameBox = undefined;
var branchBox = undefined;
var oopsBox = undefined;
var compilerBox = undefined;
var javaBox = undefined;
var tbBox = undefined;

function init()
{
    rollBox = document.getElementById('roll');
    nameBox = document.getElementById('name');
    branchBox = document.getElementById('branch');
    oopsBox = document.getElementById('oops');
    compilerBox = document.getElementById('compiler');
    javaBox = document.getElementById('java');
    tbBox = document.getElementById('tb');
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

function addNewRow(ob)
{
    var tr = document.createElement('tr');
    var values = Object.values(ob)
    //console.log(values)
    for(var value of values)
    {
        var td = document.createElement('td');
        td.innerText = value;
        tr.appendChild(td);
    }

    var total = ob.oops + ob.compiler + ob.java
    var td1 = document.createElement('td');
    td1.innerText = total
    tr.appendChild(td1);

    var td2 = document.createElement('td');
    td2.innerText = (total/3).toFixed(2);
    tr.appendChild(td2);

    tbBox.appendChild(tr);
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
    addNewRow(ob);
}

