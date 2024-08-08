package org.scoula.config;
// DispatcherServlet을 설정하는 파일

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

// ??
@EnableWebMvc
// 컨트롤러를 찾는 주석. 컨트롤러가 위치하는 패키지를 넣어준다.
@ComponentScan(basePackages={"org.scoula.controller","org.scoula.board.controller", "org.scoula.exception"})
public class ServletConfig implements WebMvcConfigurer {
    // 정적인 파일은 Dispatcher에서 관리하지 않겠다.
    // 그런 파일들은 resources 폴더에서 관리하겠다.
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
                .addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
    // 컨트롤러에게 jsp파일 이름으로 보냈다.
    // jsp 파일 이름으로 보낼 수도 있고, 다른 것을 통해서 보낼 수도 있다. 어떤 것을 기준으로 보낼지 설정하는 것이다.
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        InternalResourceViewResolver bean = new InternalResourceViewResolver();

        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");
        bean.setSuffix(".jsp");

        registry.viewResolver(bean);
    }
    @Bean
    public MultipartResolver multipartResolver() {
        StandardServletMultipartResolver resolver = new StandardServletMultipartResolver();
        return resolver;
    }
}
