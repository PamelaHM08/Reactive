package utec.arquitectura.conciliacion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import utec.arquitectura.conciliacion.repository.ConciliacionRepository;

@EnableMongoRepositories(basePackageClasses = ConciliacionRepository.class)
@SpringBootApplication
public class ConciliacionApplication extends SpringBootServletInitializer {

	public static void main( String[] args ){
		SpringApplication.run(ConciliacionApplication.class);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ConciliacionApplication.class);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:4200/")
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.maxAge(3600);
			}

		};
	}

}
