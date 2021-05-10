//CREATE A FIELD FOR USER
createField = () => {
  let tbody = document.getElementById('tableBody');
  tbody.insertAdjacentHTML(
    "afterend",
    `<tr>
      <td>
          <input type="text" class="form-control">
      </td>
      <td>
          <input type="text" class="form-control">
      </td>
      <td>
          <input type="text" class="form-control">
      </td>
    </tr>`
    )
} 

//DELETE A FIELD FOR USER
 deleteField = () => {
  document.getElementById("userTable").deleteRow(-1);
};