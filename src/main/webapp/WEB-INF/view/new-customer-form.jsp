<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <title>New Customer Form</title>
</head>
<body>

        <form:form action="new-customer" modelAttribute="customer" method="post">

            <form:hidden path="id"/>

            <div class="form-group">
                <label for="name"> Customer Name </label>
                <form:input path="name" id="name" />
            </div>

            <div class="form-group">
                <label for="name"> Customer Salary </label>
                <form:input path="salary" id="salary"  />
            </div>

            <div>
                <button type="submit" class="btn btn-primary"> (Save / update) Customer </button>
            </div>

        </form:form>

</body>
</html>