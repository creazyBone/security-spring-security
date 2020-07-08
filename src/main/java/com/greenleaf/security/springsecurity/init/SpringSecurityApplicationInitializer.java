package com.greenleaf.security.springsecurity.init;

import com.greenleaf.security.springsecurity.config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer{

    public SpringSecurityApplicationInitializer(){
    //    super(WebSecurityConfig.class);
        System.out.printf("SpringSecurityApplicationInitializer ...");
    }
}
