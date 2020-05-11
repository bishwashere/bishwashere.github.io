import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(
    dispatcherTypes = {
        DispatcherType.REQUEST,
        DispatcherType.FORWARD
    },

    urlPatterns = {
        "/",
        "/*"
    }
)

public class hitCounterFilter implements Filter {
    
    public hitCounterFilter(){
        //
    }

    public void destroy(){
        // 
    }

    public void init(FilterConfig fConfig) throws ServletException{

        System.out.println("HitCountFilter is initialized " + fConfig.getFilterName());
        int totalHitCount = 0;
        fConfig.getServletContext().setAttribute("totalHitCount", 0);
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{

        System.out.println("Filter Intercepted. ");
        Integer totalHitCount = (Integer) request.getServletContext().getAttribute("totalHitCount");
        totalHitCount++;
        request.getServletContext().setAttribute("totalHitCount", totalHitCount);
        
        // auto
        chain.doFilter(request, response);
    }
}