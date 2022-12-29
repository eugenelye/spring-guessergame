package com.accenture;

import java.util.Scanner;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {
	@Bean()
	@Scope (value=BeanDefinition.SCOPE_PROTOTYPE)
	public Player player() {
		return new Player();
	}
	
	@Bean()
	public Guesser guesser() {
		return new Guesser();
	}
	
	@Bean()
	public Umpire umpire() {
		return new Umpire(player(),player(),player(),guesser());
	}
	

	



}
