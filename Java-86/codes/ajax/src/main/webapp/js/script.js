var xhr;

function getEmployeeDetails(empno)
{
	xhr = new XMLHttpRequest();
	
	xhr.open("GET", "search?eno="+empno, true); //true - asynchronous communication
	
	xhr.onreadystatechange=stateChanged;
	
	xhr.send();
}

function stateChanged(){
	if(xhr.readyState==4 && xhr.status==200){
		var response = xhr.responseText;
		var empObj = JSON.parse(response);
		
		var name = empObj.empname;
		var sal = empObj.empsal;
		
		document.getElementById("emp-name").innerHTML = name;
		document.getElementById("emp-sal").innerHTML = sal;
	}
}