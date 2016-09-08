package gov.diski.edevlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class DiskiEdevletWSApplication extends SpringBootServletInitializer implements
		WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(
			SpringApplicationBuilder application) {
		return application.sources(DiskiEdevletWSApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DiskiEdevletWSApplication.class, args);
	}

}
