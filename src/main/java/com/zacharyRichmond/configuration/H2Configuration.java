package com.zacharyRichmond.configuration;

import org.h2.server.web.WebServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ZXR0185 on 3/1/2017.
 */
@Configuration
public class H2Configuration {
    @Bean
    ServletRegistrationBean h2servletRegistration() {
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
        registrationBean.addUrlMappings("/console/*");
        registrationBean.addInitParameter("webAllowOthers", "true");
        return registrationBean;
    }
}
