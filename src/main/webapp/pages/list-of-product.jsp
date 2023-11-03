
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.1.3/dist/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">Product Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Product QTY</th>
      <th scope="col">Product Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${list}" var="prd">
  <tr>
      <th><c:out value="${prd.productId}"></c:out></th>
       <th><c:out value="${prd.productName}"></c:out></th>
       <th><c:out value="${prd.productQty}"></c:out></th>
       <th><c:out value="${prd.productPrice}"></c:out></th>
       <th><a class="btn btn-danger" href="delete-product?pid=<c:out value="${prd.productId}"></c:out>">Delete</a></th>
        <th><a class="btn btn-success" href="get-product-by-id?pid=<c:out value="${prd.productId}"></c:out>">Edit</a></th>
    </tr>
  </c:forEach>	
  
  
    
    
  </tbody>
</table>