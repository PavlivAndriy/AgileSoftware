<%--
  User: ihorlt
  Date: 21.07.16
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
        <div class="row">
            <div class="col-sm-12"><h2></h2></div>
        </div>

        <%--Login Form--%>
        <div class="row">
            <div class="col-sm-5 col-md-3">
                <form name="loginForm" action="/login" class="reg-page" method="POST">
                    <div class="reg-header">
                        <h4>Login to your account</h4>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-user"></i></span>
                        <input name="email" type="email" placeholder="Email" class="form-control"/>
                    </div>
                    <div class="input-group">
                        <span class="input-group-addon"><i class="fa fa-lock"></i></span>
                        <input name="password" type="password" placeholder="Password" class="form-control"/>
                    </div>
                    <div class="row">
                        <div class="col-sm-6 pull-right">
                            <input class="btn-u pull-right" type="submit" value="Submit"/>
                        </div>
                    </div>
                </form>
            </div>
        </div>

    </tiles:putAttribute>
</tiles:insertDefinition>