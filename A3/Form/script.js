//Name 
function focusFunction(elemt)
{
    elemt.style.background="#61b3ff";
}

function blurFunction(elemt) {
    elemt.style.background="#a9ff88";
  }

function nInvalidFunc() {
    alert("Name is required");
}

//address
function selectFunc(){
    alert("Text selected!");
}

//Age
function okpFunc(){
    document.getElementById("age").style.color="red";
}

//Gender
function genValue(){
        var ele = document.getElementsByName("sex"); 
        for(i = 0; i < ele.length; i++) { 
            if(ele[i].checked) 
            {
                return ele[i].value;
            }
}
}

//Marital Status
function msFunc(elemt){
    if(elemt.id=="ms1"){
        alert("You are married");
    }
    else{
        alert("You are Unmarried");
    }
}

function msValue(){
    var ms = document.getElementsByName("ms"); 
    for(i = 0; i < ms.length; i++) { 
        if(ms[i].checked) 
        {
            return ms[i].value;
        }
}
}


//phno
function phInvalidFunc() {
    alert("Contact Number is required");
}

//Addiction
document.addEventListener('dragstart', function (event) {
    event.dataTransfer.setData('text/plain', event.target.innerHTML);
  });

//Clock
function startTime() {
    var today = new Date();
    var h = today.getHours();
    var m = today.getMinutes();
    var s = today.getSeconds();
    m = checkTime(m);
    s = checkTime(s);
    document.getElementById('clock').innerHTML =
    h + ":" + m + ":" + s;
    var t = setTimeout(startTime, 500);
  }
  function checkTime(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
  }

//Submit
function submitFunc(){
    var name= document.getElementById("name").value;
    localStorage.setItem("name", name);

    var add= document.getElementById("add").value;
    localStorage.setItem("add", add);

    var age= document.getElementById("age").value;
    localStorage.setItem("age", age);

    var dob= document.getElementById("dob").value;
    localStorage.setItem("dob", dob);

    var sex= genValue();
    localStorage.setItem("sex", sex);

    var ms= msValue();
    localStorage.setItem("ms", ms);

    var phno= document.getElementById("phno").value;
    localStorage.setItem("phno", phno);

    var addic=document.getElementById("addic").value;
    localStorage.setItem("addic", addic);

    window.open("display.html");
}

//Reset
function resetFunc(){
    alert("The Form has been reset");
}


