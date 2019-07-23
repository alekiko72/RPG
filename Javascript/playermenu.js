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

    var newRow0 = table.insertRow(table.rows.length);
    // Create all the cells needed
    var cel0 = newRow0.insertCell(0);
    var cel1 = newRow0.insertCell(1);
    var cel2 = newRow0.insertCell(2);
    var cel3 = newRow0.insertCell(3);
    var cel4 = newRow0.insertCell(4);
    var cel5 = newRow0.insertCell(5);
    var cel6 = newRow0.insertCell(6);

    // Add the elements to each cell
    cel0.innerHTML = "";
    cel1.innerHTML = "Name";
    cel1.setAttribute("class", "headcopy");
    cel2.innerHTML = "Race";
    cel2.setAttribute("class", "headcopy");
    cel3.innerHTML = "Career";
    cel3.setAttribute("class", "headcopy");
    cel4.innerHTML = "Current HP";
    cel4.setAttribute("class", "headcopy");
    cel5.innerHTML = "Max HP";
    cel5.setAttribute("class", "headcopy");
    cel6.innerHTML = " ";
    cel6.setAttribute("colspan", "3");

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
    cell0.setAttribute("class", "cell");
    cell1.innerHTML = choice1;
    cell1.setAttribute("class", "cell");
    cell2.innerHTML = choice2;
    cell2.setAttribute("class", "cell");
    cell3.innerHTML = "Career";
    cell3.setAttribute("class", "cell");
    cell4.innerHTML = "53";
    cell4.setAttribute("class", "cell");
    cell5.innerHTML = "78";
    cell5.setAttribute("class", "cell");
    cell6.innerHTML = " ";
    cell6.setAttribute("colspan", "3");


    // Accordion
    var newRow3 = table.insertRow(table.rows.length); 
    newRow3.setAttribute("id", "accordion3");
    var spot0 = newRow3.insertCell(0);
    var spot1 = newRow3.insertCell(1);
    spot1.setAttribute("class", "headcopy");
    var spot2 = newRow3.insertCell(2);
    spot2.setAttribute("class", "headcopy");
    var spot3 = newRow3.insertCell(3);
    spot3.setAttribute("class", "headcopy");
    var spot4 = newRow3.insertCell(4);
    spot4.setAttribute("class", "headcopy");
    var spot5 = newRow3.insertCell(5);
    spot5.setAttribute("class", "headcopy");
    var spot6 = newRow3.insertCell(6);
    spot6.setAttribute("class", "headcopy");
    var spot7 = newRow3.insertCell(7);
    spot7.setAttribute("class", "headcopy");
    var spot8 = newRow3.insertCell(8);
    spot8.setAttribute("class", "headcopy");

    spot0.innerHTML = " ";
    spot1.innerHTML = "WS";
    spot2.innerHTML = "BS";
    spot3.innerHTML = "S";
    spot4.innerHTML = "T";
    spot5.innerHTML = "Ag";
    spot6.innerHTML = "Int";
    spot7.innerHTML = "WP";
    spot8.innerHTML = "Fel";


    // create a new row that will have the stat boxes
    var newRow4 = table.insertRow(table.rows.length); 
    newRow4.setAttribute("id", "accordion3");
    var spott0 = newRow4.insertCell(0);
    var spott1 = newRow4.insertCell(1);
    spott1.setAttribute("class", "headcopy");
    var spott2 = newRow4.insertCell(2);
    spott2.setAttribute("class", "headcopy");
    var spott3 = newRow4.insertCell(3);
    spott3.setAttribute("class", "headcopy");
    var spott4 = newRow4.insertCell(4);
    spott4.setAttribute("class", "headcopy");
    var spott5 = newRow4.insertCell(5);
    spott5.setAttribute("class", "headcopy");
    var spott6 = newRow4.insertCell(6);
    spott6.setAttribute("class", "headcopy");
    var spott7 = newRow4.insertCell(7);
    spott7.setAttribute("class", "headcopy");
    var spott8 = newRow4.insertCell(8);
    spott8.setAttribute("class", "headcopy");


    //create stat boxes
    var input = document.createElement("input");
    input.type = "number";
    input.setAttribute("class", "boxy");
    input.setAttribute("min", "1");
    input.setAttribute("max", "100");
    var input2 = document.createElement("input");
    input2.type = "number";
    input2.setAttribute("class", "boxy");
    input2.setAttribute("min", "1");
    input2.setAttribute("max", "100");
    var input3 = document.createElement("input");
    input3.type = "number";
    input3.setAttribute("class", "boxy");
    input3.setAttribute("min", "1");
    input3.setAttribute("max", "100");
    var input4 = document.createElement("input");
    input4.type = "number";
    input4.setAttribute("class", "boxy");
    input4.setAttribute("min", "1");
    input4.setAttribute("max", "100");
    var input5 = document.createElement("input");
    input5.type = "number";
    input5.setAttribute("class", "boxy");
    input5.setAttribute("min", "1");
    input5.setAttribute("max", "100");
    var input6 = document.createElement("input");
    input6.type = "number";
    input6.setAttribute("class", "boxy");
    input6.setAttribute("min", "1");
    input6.setAttribute("max", "100");
    var input7 = document.createElement("input");
    input7.type = "number";
    input7.setAttribute("class", "boxy");
    input7.setAttribute("min", "1");
    input7.setAttribute("max", "100");
    var input8 = document.createElement("input");
    input8.type = "number";
    input8.setAttribute("class", "boxy");
    input8.setAttribute("min", "1");
    input8.setAttribute("max", "100");

    //Add stat boxes to new row
    spott0.innerHTML = "Current:";
    spott1.appendChild(input);
    spott2.appendChild(input2);
    spott3.appendChild(input3);
    spott4.appendChild(input4);
    spott5.appendChild(input5);
    spott6.appendChild(input6);
    spott7.appendChild(input7);
    spott8.appendChild(input8);

    var newRow3 = table.insertRow(table.rows.length); 
    newRow3.setAttribute("id", "accordion3");
    var spot0 = newRow3.insertCell(0);
    var spot1 = newRow3.insertCell(1);
    spot1.setAttribute("class", "headcopy");
    var spot2 = newRow3.insertCell(2);
    spot2.setAttribute("class", "headcopy");
    var spot3 = newRow3.insertCell(3);
    spot3.setAttribute("class", "headcopy");
    var spot4 = newRow3.insertCell(4);
    spot4.setAttribute("class", "headcopy");
    var spot5 = newRow3.insertCell(5);
    spot5.setAttribute("class", "headcopy");
    var spot6 = newRow3.insertCell(6);
    spot6.setAttribute("class", "headcopy");
    var spot7 = newRow3.insertCell(7);
    spot7.setAttribute("class", "headcopy");
    var spot8 = newRow3.insertCell(8);
    spot8.setAttribute("class", "headcopy");

    spot0.innerHTML = " ";
    spot1.innerHTML = "A";
    spot2.innerHTML = "W";
    spot3.innerHTML = "SB";
    spot4.innerHTML = "TB";
    spot5.innerHTML = "M";
    spot6.innerHTML = "MAG";
    spot7.innerHTML = "IP";
    spot8.innerHTML = "FPP";


    // create a new row that will have the stat boxes
    var newRow4 = table.insertRow(table.rows.length); 
    newRow4.setAttribute("id", "accordion3");
    var spott0 = newRow4.insertCell(0);
    var spott1 = newRow4.insertCell(1);
    spott1.setAttribute("class", "headcopy");
    var spott2 = newRow4.insertCell(2);
    spott2.setAttribute("class", "headcopy");
    var spott3 = newRow4.insertCell(3);
    spott3.setAttribute("class", "headcopy");
    var spott4 = newRow4.insertCell(4);
    spott4.setAttribute("class", "headcopy");
    var spott5 = newRow4.insertCell(5);
    spott5.setAttribute("class", "headcopy");
    var spott6 = newRow4.insertCell(6);
    spott6.setAttribute("class", "headcopy");
    var spott7 = newRow4.insertCell(7);
    spott7.setAttribute("class", "headcopy");
    var spott8 = newRow4.insertCell(8);
    spott8.setAttribute("class", "headcopy");

    //create stat boxes
    var input = document.createElement("input");
    input.type = "number";
    input.setAttribute("class", "boxy");
    input.setAttribute("min", "1");
    input.setAttribute("max", "100");
    var input2 = document.createElement("input");
    input2.type = "number";
    input2.setAttribute("class", "boxy");
    input2.setAttribute("min", "1");
    input2.setAttribute("max", "100");
    var input3 = document.createElement("input");
    input3.type = "number";
    input3.setAttribute("class", "boxy");
    input3.setAttribute("min", "1");
    input3.setAttribute("max", "100");
    var input4 = document.createElement("input");
    input4.type = "number";
    input4.setAttribute("class", "boxy");
    input4.setAttribute("min", "1");
    input4.setAttribute("max", "100");
    var input5 = document.createElement("input");
    input5.type = "number";
    input5.setAttribute("class", "boxy");
    input5.setAttribute("min", "1");
    input5.setAttribute("max", "100");
    var input6 = document.createElement("input");
    input6.type = "number";
    input6.setAttribute("class", "boxy");
    input6.setAttribute("min", "1");
    input6.setAttribute("max", "100");
    var input7 = document.createElement("input");
    input7.type = "number";
    input7.setAttribute("class", "boxy");
    input7.setAttribute("min", "1");
    input7.setAttribute("max", "100");
    var input8 = document.createElement("input");
    input8.type = "number";
    input8.setAttribute("class", "boxy");
    input8.setAttribute("min", "1");
    input8.setAttribute("max", "100");


    //Add stat boxes to new row
    spott0.innerHTML = "Current:";
    spott1.appendChild(input);
    spott2.appendChild(input2);
    spott3.appendChild(input3);
    spott4.appendChild(input4);
    spott5.appendChild(input5);
    spott6.appendChild(input6);
    spott7.appendChild(input7);
    spott8.appendChild(input8);
    
    var x = document.createElement("TEXTAREA");
    x.setAttribute("class", "myTextArea");

    var newRow5 = table.insertRow(table.rows.length); 
    newRow5.setAttribute("id", "accordion3");
    var ce0 = newRow5.insertCell(0);
    ce0.innerHTML = "Skills:";

    var ce1 = newRow5.insertCell(1);
    ce1.setAttribute("colspan", "8");
    ce1.appendChild(x);

    //Talents row
    var y = document.createElement("TEXTAREA");
    y.setAttribute("class", "myTextArea");

    var newRow6 = table.insertRow(table.rows.length); 
    newRow6.setAttribute("id", "accordion3");
    var c0 = newRow6.insertCell(0);
    c0.innerHTML = "Talents:";

    var c1 = newRow6.insertCell(1);
    c1.setAttribute("colspan", "8");
    c1.appendChild(y);

    //Items row
    var z = document.createElement("TEXTAREA");
    z.setAttribute("class", "myTextArea");

    var newRow7 = table.insertRow(table.rows.length); 
    newRow7.setAttribute("id", "accordion3");
    var cc0 = newRow7.insertCell(0);
    cc0.innerHTML = "Items:";

    var cc1 = newRow7.insertCell(1);
    cc1.setAttribute("colspan", "8");
    cc1.appendChild(z);



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
