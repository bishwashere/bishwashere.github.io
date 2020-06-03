package edu.mum.cs.cs472.lab13.filters;

import java.io.IOException;
import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class ApplicationHitcountFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD
		}
					, description = "ApplicationHitcountFilter", urlPatterns = { "/","/*" })
public class ApplicationHitcountFilter implements Filter {

    /**
     * Default constructor. 
     */
    public ApplicationHitcountFilter() {
        
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("AppInfo-Log: Called doFilter via " + ((HttpServletRequest)request).getRequestURI());
        Integer totalHitCount = (Integer) request.getServletContext().getAttribute("totalHitCount");
        request.getServletContext().setAttribute("totalHitCount", ++totalHitCount);
        chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
        System.out.println("AppInfo-Log: Initializing " + fConfig.getFilterName());
        int totalHitCount = 0;
        fConfig.getServletContext().setAttribute("totalHitCount", totalHitCount);
	}

}
