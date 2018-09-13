<%--
  Created by IntelliJ IDEA.
  User: 5CLASS-184
  Date: 2018-09-12
  Time: 오후 7:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="includes/header.jsp"%>

<!-- 제목 -->
<table width="100%">
<div id="page-wrapper">
    <div class="row">
        <div class="col-lg-12">
            <h3 class="page-header">${board.title}</h3>
        </div>
    </div>
    <!-- /.row -->
    <div class="row">
        <div class="col-lg-4">
            <div class="panel panel-default">
                <div class="panel-heading">
                    <div style="height: auto; max-width: 1080px; text-align: right;">
                    no.${board.bno}&nbsp; &nbsp;by.${board.mname} &nbsp; &nbsp; at ${board.regdate}
                </div>
                </div>
            </div>
                <div class="panel-body">
                    <div class="panel panel-default">
                    <div style="height: 350px; max-width: 1080px; text-align: left">
                    <br>
                    ${board.content}
                    </div>
                </div>
                    <div class="panel-footer">
                        <div style="height: auto; max-width: 1080px; text-align: right;">
                        <form action="/modify">
                            <input type="hidden" name="bno" value="${board.bno}">
                            <input type="hidden" name="page" value="${page}">
                            <button class="btn btn-primary btn-sm">수정 혹은 삭제</button>
                        </form>
                        <a href="list?page=${page}"><button class="btn btn-outline btn-primary btn-sm">목록보기</button></a>
                    </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</table>

        <!-- 내용 끝 -->


<%--<div id="page-wrapper">--%>
    <%--<div class="row">--%>
        <%--<div class="col-lg-12">--%>
            <%--<div class="text-center">--%>
            <%--<h2 class="page-header">${board.title}</h2>--%>
        <%--</div>--%>
        <%--<!-- /.col-lg-12 -->--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<!-- /.row -->--%>
    <%--<div class="row">--%>
        <%--<div class="col-lg-4">--%>
            <%--<div class="panel panel-default">--%>
                <%--<div class="panel-body">--%>
                    <%--<div class="text-center">--%>
                    <%--${board.content}--%>
                <%--</div>--%>
                <%--<div class="panel-footer">--%>
                    <%--no.${board.bno}&nbsp; &nbsp;by.${board.mname} &nbsp; &nbsp; at ${board.regdate}--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
    <%--</div>--%>
    <%--</div>--%>
    <%--<form action="/modify">--%>
        <%--<input type="hidden" name="bno" value="${board.bno}">--%>
        <%--<input type="hidden" name="page" value="${page}">--%>
        <%--<button style="text-align: right ">수정 혹은 삭제</button>--%>
    <%--</form>--%>
    <%--<a href="list?page=${page}"><button style="text-align: right"> 목록 </button></a>--%>

<%@ include file="includes/footer.jsp"%>