package org.zerock.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfig {
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {RootConfig.class};
	}

}
