package org.gonnys.web;

import org.gonnys.dao.BoardDAO;
import org.gonnys.domain.BoardVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/read")
public class ReadController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        BoardDAO dao = new BoardDAO();
        BoardVO vo = dao.readContent(Integer.parseInt(req.getParameter("bno")));

        int page = Integer.parseInt(req.getParameter("page"));

        req.setAttribute("page",page);
        req.setAttribute("board",vo);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/read.jsp");
        dispatcher.forward(req,resp);
    }
}
