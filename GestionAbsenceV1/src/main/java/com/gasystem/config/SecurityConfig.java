package com.gasystem.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Override
		protected void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.jdbcAuthentication().dataSource(dataSource).usersByUsernameQuery("select username as principal, password as credentials, true from user where username=?")
		/*
		 * .authoritiesByUsernameQuery("select username as principal, role_name as role from user_roles where username=?"
		 * )
		 */
			;
		}


@Override
protected void configure(HttpSecurity http) throws Exception {

		
		  http.authorizeRequests().antMatchers("/", "/css/**",
		  "/webjars/**").permitAll().anyRequest().authenticated().and().formLogin()
		  .loginPage("/").permitAll().defaultSuccessUrl("/profile").and().logout().
		  logoutSuccessUrl("/");
		 
		
}
	
}
