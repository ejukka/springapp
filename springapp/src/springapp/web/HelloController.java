package springapp.web;

import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.io.IOException;
import java.util.Date;

public class HelloController implements Controller {

    protected final Log logger = LogFactory.getLog(getClass());

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    	logger.info("HelloController starts...");
    	
    	Date date = new Date();

    	String now = date.toString();
    	
    	logger.info("returning hello view.");
    	logger.info("...HelloController ends");
    	
        return new ModelAndView("WEB-INF/jsp/hello.jsp", "now", now);
    }
}