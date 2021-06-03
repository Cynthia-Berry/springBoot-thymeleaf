//CREATE A FIELD FOR USER
createField = () => {
  let tbody = document.getElementById('tableBody');
  tbody.insertAdjacentHTML(
    "beforeend",
    `<tr>
      <td>
          <input type="text" class="form-control" name="company" th:field="*{user.companyName}">
      </td>
      <td>
          <input type="text" class="form-control" name="fax" th:field="*{user.faxNumber}">
      </td>
      <td>
          <input type="text" class="form-control" name="location" th:field="*{user.location}">
      </td>
    </tr>`
    )
} 

//DELETE A FIELD FOR USER
 deleteField = () => {
  document.getElementById("userTable").deleteRow(-1);
};