package org.scoula.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;

//web.xml을 대체하는 친구
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    // 여러군데에서 쓸 수 있는 것들
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }
    // 컨트롤러에서 쓰는 것들
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ServletConfig.class};
    }

    // @WebServlet("/")와 같은 역할
    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    protected Filter[] getServletFilters() {
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();

        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);

        return new Filter[] {characterEncodingFilter};
    }
}
