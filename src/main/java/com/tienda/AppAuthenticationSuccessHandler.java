package com.tienda;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;

/**
 *
 * @author Jason Perez
 */
public class AppAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler{
    protected void handle(HttpServletRequest request, HttpServletResponse reponse,
            Authentication authentication) throws IOException,ServletException{

    }

}
