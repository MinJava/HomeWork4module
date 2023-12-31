package org.example.vebinarcrud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring6.SpringTemplateEngine;
import org.thymeleaf.spring6.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring6.view.ThymeleafViewResolver;


@Configuration
@ComponentScan("org.example.vebinarcrud.notes")
@EnableWebMvc
public class NotesConfig implements WebMvcConfigurer {
    private final ApplicationContext applicationContext;
    @Autowired
    public NotesConfig(ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    @Bean
    public SpringResourceTemplateResolver templateResolver(){ //Создаёт правила находждение и распохнание HTML шаблонов
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/views/");//локальный путь нахождение
        templateResolver.setSuffix(".html");// указываем расширение файлов
        return templateResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(){ //Обработка HTML шаблонов
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver(templateResolver()); //получение шаблонов
        templateEngine.setEnableSpringELCompiler(true); //Запуск компилятора
        return templateEngine;
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry resolverRegistry){ //Сообщаем движок для отображения страниц
        ThymeleafViewResolver resolver = new ThymeleafViewResolver();
        resolver.setTemplateEngine(templateEngine());
        resolverRegistry.viewResolver(resolver);
    }
}