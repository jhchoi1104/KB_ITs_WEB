package org.scoula.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.servlet.MultipartConfigElement;
import javax.servlet.ServletRegistration;

//web.xml을 대체하는 친구
@Slf4j
@Configuration
public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    final String LOCATION = "c:/upload";
    final long MAX_FILE_SIZE = 1024*1024*10L;
    final long MAX_REQUEST_SIZE = 1024*1024*20L;
    final int FILE_SIZE_THRESHOLD = 1024*1024*5;

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
    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("throwExceptionIfNoHandlerFound", "true");

        MultipartConfigElement multipartConfig = new MultipartConfigElement(
                LOCATION, // 업로드 처리 디렉토리 경로
                MAX_FILE_SIZE, // 업로드 가능한 파일 하나의 최대 크기
                MAX_REQUEST_SIZE, // 업로드 가능한 전체 최대 크기(여러 파일)
                FILE_SIZE_THRESHOLD // 메모리 파일의 최대 크기(이보다 작으면 메모리에서만 작업)
        );
        registration.setMultipartConfig(multipartConfig);
    }
}
