<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: HP ENVY
  Date: 8/24/2019
  Time: 7:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List Event</title>
</head>
<body>
    <h1>List Event:</h1>
    <div>
        <h2>Upcoming Events</h2>
        <ul>
            <s:iterator value="events" status="stat">
                <s:if test="isUpcomingEvent()">
                    <li style="margin-bottom: 20px">
                        <b>Event name: <s:property value="name"></s:property></b>

                        <s:url var="editUrl" action="edit-event">
                            <s:param name="editIndex" value="%{#stat.index}"/>
                        </s:url>
                        <button style="margin-left: 10px"><s:a href="%{editUrl}">Edit</s:a></button>
                        <s:url var="deleteUrl" action="delete-event">
                            <button style="margin-left: 10px"><s:a href="%{deleteUrl}">Detele</s:a></button>
                        </s:url>
                        <br>
                        Start time: <s:date format="dd/MM/yyyy, hh:mm a" name="getStartDateTime()"/>
                        <br>
                        Place: <s:property value="place"></s:property>
                        <br>
                        Description: <s:property value="description"></s:property>
                    </li>
                </s:if>
            </s:iterator>
        </ul>
        <hr>
        <h2>Other Events</h2>
        <ul>
            <s:iterator value="events">
                <s:if test="!isUpcomingEvent()">
                    <li style="margin-bottom: 20px">
                        <b>Event name: <s:property value="name"></s:property></b>
                        <br>
                        Start time: <s:date format="dd/MM/yyyy, hh:mm a" name="getStartDateTime()"/>
                        <br>
                        Place: <s:property value="place"></s:property>
                        <br>
                        Description: <s:property value="description"></s:property>
                    </li>
                </s:if>
            </s:iterator>
        </ul>
    </div>
</body>
</html>
