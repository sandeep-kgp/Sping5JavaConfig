package nc.dhhs.nccss.acts.ecsts.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;
import org.springframework.ws.client.core.WebServiceTemplate;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "nc.dhhs.nccss.acts.ecsts")
public class AppConfig implements WebMvcConfigurer    {

@Bean
public InternalResourceViewResolver viewResolver(){
	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
	internalResourceViewResolver.setSuffix(".jsp");
	return internalResourceViewResolver;
		
	}
 
 
@Bean 
     Jaxb2Marshaller jaxb2Marshaller() { 
	
      Jaxb2Marshaller jaxb2Marshaller = new Jaxb2Marshaller(); 
      jaxb2Marshaller.setContextPath("gov.nc.ncidng.ncidngwebservice.schemas"); 
      return jaxb2Marshaller; 
    } 

@Bean
public WebServiceTemplate webServiceTemplate() {
	WebServiceTemplate template = new WebServiceTemplate();
	//template.setDefaultUri("https://idpdncid.nc.gov/ncidwebservice/ncidws.wsdl"); 
	//template.setDefaultUri("https://idpdncid.nc.gov/ncidwebservice/ncidws-prod.wsdl");
	template.setMarshaller(jaxb2Marshaller());
	template.setUnmarshaller(jaxb2Marshaller());
	return template;
	
}
 @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
	registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	registry.addResourceHandler("/resources/css/**").addResourceLocations("/resources/css/");
	registry.addResourceHandler("/resources/images/**").addResourceLocations("/resources/images/");
} 
}