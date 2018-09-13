package org.gonnys.web;

import org.gonnys.dao.MemberDAO;
import org.gonnys.domain.MemberVO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signup")
public class MemberController extends HttpServlet {

    //회원가입
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/singup.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        MemberDAO memberDAO = new MemberDAO();

        MemberVO vo = new MemberVO();
        String mid = req.getParameter("mid");
        String mpw = req.getParameter("mpw");
        String mname = req.getParameter("mname");
        System.out.println("-------------------------------------8");
        System.out.println(vo);

        vo.setMid(mid);
        vo.setMpw(mpw);
        vo.setMname(mname);

        MemberDAO.signUp(vo);

        resp.sendRedirect("/index.jsp");
    }
    }


//로그인이라고 가정
//    @WebServlet(urlPatterns = "/index")
//    public class ReadController extends HttpServlet {
//
//        @Override
//        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//            MemberDAO dao = new MemberDAO();
//            MemberVO vo = dao.singIn(Integer.parseInt(req.getParameter("mno")));
//            req.setAttribute("singin", vo);
//
//            RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
//            dispatcher.forward(req, resp);
//        }
//
//
//    }

