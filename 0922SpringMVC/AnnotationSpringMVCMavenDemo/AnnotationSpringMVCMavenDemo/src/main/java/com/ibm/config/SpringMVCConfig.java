package com.ibm.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.*;
import java.text.SimpleDateFormat;
import java.util.List;
@Configuration
@EnableWebMvc //���ע�������� <mvc:annotation-driven/>
public class SpringMVCConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("/index");
    }
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        //spring4 Ĭ�ϲ���jsp������Thymeleaf
        registry.jsp().prefix("/jsp").suffix(".jsp");
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //��̬��Դ����
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //����jackson ��֧�֣�jsonת������֧��@RequestBody��
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder()
            .dateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        converters.add(new MappingJackson2HttpMessageConverter(builder.build()));
    }
}
