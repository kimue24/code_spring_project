package org.zerock.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

}
