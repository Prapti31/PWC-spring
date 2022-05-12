package com.examples.account;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.examples.account.domain.Account;
import com.examples.account.repository.AccountRepository;
import com.examples.account.repository.InMemoryAccountRepository;
import com.examples.account.service.TransferService;
import com.examples.account.service.TransferServiceImpl;
@Configuration
@ComponentScan("com")
public class AppConfig {
	@Bean
	public InMemoryAccountRepository accountRepository(){
		return new InMemoryAccountRepository();
	}
	@Bean
	public TransferServiceImpl transferService(){
		return new TransferServiceImpl(accountRepository());
	}
	
}
