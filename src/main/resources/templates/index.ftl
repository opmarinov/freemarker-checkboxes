<!DOCTYPE html>
<#import "/spring.ftl" as spring />
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <title>Spring Boot FreeMarker example</title>
</head>
<body>

    <p>
        This is the root title: ${root.title}
    </p>

    <@spring.bind "root"></@spring.bind>

    <form action="/add" method="post">

        <@spring.formInput "root.title"/>

        <@spring.formCheckbox path="root.checked"/>

        <br>
        <br>

        <#list root.checkboxes as checkbox >
            <hr>
            <div class="checkbox-style">
                <label> ${checkbox.label} </label>
                <@spring.formCheckbox path="root.checkboxes[${checkbox?index}].checked"/>

            </div>

            <#list checkbox.childCheckboxes as childbox>
                <label> ${childbox.title} </label>
                <@spring.formCheckbox path="root.checkboxes[${checkbox?index}].childCheckboxes[${childbox?index}].checked"/>
            </#list>

            <br>
            <br>
        </#list>
        <br>
        <hr>

        <input type="submit" value="submit"/>
    </form>
</body>
</html>
