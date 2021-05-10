//CREATE A FIELD FOR USER
createField = () => {
 // Get a reference to the table
   let tableRef = document.getElementById("userTable");

   // Insert a row at the end of the table
   let newRow = tableRef.insertRow(-1);

   // Insert a cell in the row at index 0
   let newCell1 = newRow.insertCell(0);
   let newCell2 = newRow.insertCell(1);
   let newCell3 = newRow.insertCell(2);


   // Append an input field
   var newInput1 = document.createElement("input");
   newInput1.setAttribute('type', 'text');
   newInput1.name = "name";
   newInput1.className = "form-control";
   newCell1.appendChild(newInput1);

   var newInput2 = document.createElement("input");
   newInput2.type = "text";
   newInput2.name = "school";
   newInput2.className = "form-control";
   newCell2.appendChild(newInput2);

   var newInput3 = document.createElement("input");
   newInput3.type = "text";
   newInput3.name = name="bestSubject";
   newInput3.className = "form-control";
   newCell3.appendChild(newInput3);

}


//DELETE A FIELD FOR USER
 deleteField = () => {
  document.getElementById("userTable").deleteRow(-1);
};