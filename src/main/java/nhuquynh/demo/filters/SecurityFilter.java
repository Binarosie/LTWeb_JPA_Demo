package nhuquynh.demo.filters;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import nhuquynh.demo.entity.User;

import java.io.IOException;

@WebFilter(urlPatterns="/admin/*")
public class SecurityFilter implements Filter {

    //khởi tạo filter
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Filter.super.init(filterConfig);
    }
    //thực thi filter cho entity
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse resq = (HttpServletResponse) response;
        HttpSession session = req.getSession();
        Object obj = session.getAttribute("account");
        User user = (User) obj;

        if(user != null && user.getRoleid()==1) {
            chain.doFilter(request, response);
            return;
        } else {
            resq.sendRedirect(req.getContextPath() + "/logout");
        }
    }
    //phương thức kết thúc của filter
    @Override
    public void destroy() {
    }

}
