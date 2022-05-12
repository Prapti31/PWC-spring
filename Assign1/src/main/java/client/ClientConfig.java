package client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.dao.AccountInMemoryImpl;

@Configuration
@ComponentScan("com")
public class ClientConfig {
	@Bean
	public AccountInMemoryImpl aimi() {
		return new AccountInMemoryImpl();
	}
	
}
