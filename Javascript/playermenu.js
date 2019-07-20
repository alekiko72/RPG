var contactsTab = document.querySelector("#tabledo > tbody");

function addRow(){

    // Get all the elements the user inputs for the contacts table
    var choice1 = document.getElementById('choice1').value;
    var choice2 = document.getElementById('choice2').value;

    // Pass Table into Javascript
    var table = document.getElementsByTagName('table')[0];
    
    // Create a new row at the end of the table
    var newRow2 = table.insertRow(table.rows.length);
    newRow2.setAttribute("class", "spacer");


    var newRow = table.insertRow(table.rows.length);
    // Create all the cells needed
    var cell0 = newRow.insertCell(0);
    var cell1 = newRow.insertCell(1);
    var cell2 = newRow.insertCell(2);
    var cell3 = newRow.insertCell(3);
    var cell4 = newRow.insertCell(4);
    var cell5 = newRow.insertCell(5);
    var cell6 = newRow.insertCell(6);

    // Add the elements to each cell
    cell0.innerHTML = "-----V-----";
    cell0.setAttribute("class", "clickable");
    cell0.setAttribute("data-target", "#accordion3");
    cell0.setAttribute("data-toggle", "collapse");
    cell1.innerHTML = choice1;
    cell2.innerHTML = choice2;
    cell3.innerHTML = "Career";
    cell4.innerHTML = "53";
    cell5.innerHTML = "78";
    cell6.innerHTML = "email";

    var newRow3 = table.insertRow(table.rows.length); 
    var cell01 = newRow3.insertCell(0);
    cell01.setAttribute("colspan", "7");
    cell01.setAttribute("id", "accordion3");
    cell01.setAttribute("class", "collapse");
    var div = document.createElement("div");
    div.innerHTML = "Hello";

    cell01.appendChild(div);

    //addCharacter(choice1, choice2);
    
    //refresh();
    //loadTable();
    


}
function refresh()
{
	var contactsTable = document.querySelector("#tabledo > tbody");
	while(contactsTable.firstChild){
        contactsTable.removeChild(contactsTab.firstChild);
    }
	
}

/*function editRow(){

    // Get all the elements the user inputs for the contacts table
    var firstname = document.getElementById('FirstName').value;
    var lastname = document.getElementById('LastName').value;
    var number = document.getElementById('Number').value;
    var email = document.getElementById('Email').value;

    // Pass Table into Javascript
    var table = document.getElementById("tabledo"),rIndex,cIndex;

    for(var i = 0; i < table.rows.length; i++)
    {
        for(var j = 0; j < table.rows[i].cells.length; j++)
        {
            rIndex = this.parentElement.rowIndex;
        }
    }

    table.rows[rIndex].cells[0].innerHTML = firstname;


}*/

function addContact(first, last, num, e)
{
	
	var jsonPayload = '{ "userId" : "' + userId + '", "firstName" : "' + first + '", "lastName" : "' + last + '", "phoneNumber" : "' + num + '", "email" : "' + e + '", "userId" : ' + userId + '}';
	
	var url = urlBase + '/AddContact.' + extension;
	
	var xhr = new XMLHttpRequest();
	xhr.open("POST", url, true);
	xhr.setRequestHeader("Content-type", "application/json; charset=UTF-8");
	try
	{
		xhr.onreadystatechange = function() 
		{
		};
		xhr.send(jsonPayload);
	}
	catch(err)
	{
		
	}
	
}

function deleteContact(ident)
{
	console.log(JSON.stringify({ID: ident}));
	
	var jsonPayload = JSON.stringify({ID: ident})
	
	var url = urlBase + '/DeleteContact.' + extension;
	var xhr = new XMLHttpRequest();
	xhr.open("POST", url, true);
	
	xhr.setRequestHeader("Content-type", "application/json; charset=UTF-8");
	try
	{
		xhr.onreadystatechange = function() 
		{
		};
		xhr.send(jsonPayload);
	}
	catch(err)
	{
		console.log("not deleted");
	}
	
}


function hideOrShow( elementId, showState )
{
	var vis = "visible";
	var dis = "block";
	if( !showState )
	{
		vis = "hidden";
		dis = "none";
	}
	
	document.getElementById( elementId ).style.visibility = vis;
	document.getElementById( elementId ).style.display = dis;
}


function doLogout()
{
	userId = 0;

	hideOrShow( "loggedInDiv", false);
	hideOrShow( "accessUIDiv", false);
	hideOrShow( "loginDiv", true);
}



function loadTable() {
	const request = new XMLHttpRequest();
	
	var url = urlBase + '/TableFill.' + extension;
	
	request.open("GET", url, true);
	request.send();
	request.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
    	var data = JSON.parse(this.responseText);
    	console.log(data);
    	
    	populateTable(data);
    }
    };

}
function populateTable(json){

    // Gets rid of table that is initially there
    while(contactsTab.firstChild){
        contactsTab.removeChild(contactsTab.firstChild);
    }
    
        // create each cell and fill with database information
        for(var a = 0; a < json.length; a++) {
            var firstName = json[a].firstName;
            var lastName = json[a].lastName;
            var phoneNumber = json[a].phoneNumber;
            var email = json[a].email;
            var ID = json[a].ID;
                
            var table = document.getElementsByTagName('table')[0];
    
            // Create a new row at the end of the table
            var newRow = table.insertRow(table.rows.length);
        
            // Create all the cells needed
            var cell0 = newRow.insertCell(0);
            var cell1 = newRow.insertCell(1);
            var cell2 = newRow.insertCell(2);
            var cell3 = newRow.insertCell(3);
            var cell4 = newRow.insertCell(4);
            var cell5 = newRow.insertCell(5);
        
            // Add the elements to each cell
            cell0.innerHTML = firstName;
            cell1.innerHTML = lastName;
            cell2.innerHTML = phoneNumber;
            cell3.innerHTML = email;
        
            // Create Buttons for edit and delete
            var edito = document.createElement("IMG");
            edito.setAttribute("src", "Images/leafedit.png");
            edito.setAttribute("id", ID);
            cell4.appendChild(edito);
        ;
            
            var deleto = document.createElement("IMG");
            deleto.setAttribute("src", "Images/leafdelete.png");
            deleto.setAttribute("class", "table-remove");
            deleto.setAttribute("id", ID);
            cell5.appendChild(deleto);

        }
        
}
window.onload = loadTable;
