<%--
  Created by IntelliJ IDEA.
  User: HP ENVY
  Date: 8/24/2019
  Time: 7:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags" %>
<html>
<head>

    <title>New Event Form</title>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<s:head/>
</head>
<body>
    <h1>New Event Form</h1>
    <s:form action="create-new-event" method="POST">
        <s:textfield type="date" name="event.startDate" value="event.startDate.toString()" label="When?"></s:textfield>
        <s:textfield type="time" name="event.startTime" label="Time?"></s:textfield>
        <s:textfield name="event.name" label="What are you planning?"/>
        <s:textfield name="event.place" label="Where?"/>
        <br>
        <s:textfield name="event.description" label="More info?"/>

        <s:submit value="Create Event"/>
    </s:form>


</body>
</html>
