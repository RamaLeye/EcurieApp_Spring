package com.spring.ecurieApp.security;


import com.spring.ecurieApp.models.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Collection;

@Component
public class CustomSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
                                        Authentication authentication) throws IOException, ServletException {

        //String redirectUrl = null;

        String redirectUrl = "/menu";

            /*    if(hasRole("PALEFRENIER")){
                    System.out.println(" c'est un palefrenier");

                    redirectUrl = "/palefrenier/indexPalefrenier";


                }

                if(hasRole("SECRETARY")) {
                    System.out.println("c'est un secretary");
                    redirectUrl = "/secretary/indexSecretary";
                }*/
        HttpSession session = request.getSession();
        session.setAttribute( "connectedUser" , getUserPrincipal().getUser() );
        session.setAttribute( "role" , getUserPrincipal().getUser().getRole().getRole_name() );


        //response.sendRedirect(redirectUrl);


     /*   Collection<? extends GrantedAuthority> authorities = authentication.getAuthorities();
        for (GrantedAuthority grantedAuthority : authorities) {
            System.out.println("role " + grantedAuthority.getAuthority());
            if (grantedAuthority.getAuthority().equals("PALEFRENIER")) {
                redirectUrl = "/palefrenier/indexPalefrenier";
                break;
            } else if (grantedAuthority.getAuthority().equals("SECRETARY")) {
                redirectUrl = "/secretary/indexSecretary";
                break;
            }
        }
        System.out.println("redirectUrl " + redirectUrl);
        if (redirectUrl == null) {
            throw new IllegalStateException();
        }


      */
        new DefaultRedirectStrategy().sendRedirect(request, response, redirectUrl);
    }

    public static boolean hasRole (String roleName)
    {
        return SecurityContextHolder.getContext().getAuthentication().getAuthorities().stream()
                .anyMatch(grantedAuthority -> grantedAuthority.getAuthority().equals(roleName));
    }

    public UserDetailsImpl getUserPrincipal(){
        UserDetailsImpl springSecurityUser = (UserDetailsImpl) (SecurityContextHolder.getContext().getAuthentication().getPrincipal());

        return springSecurityUser;
    }
}