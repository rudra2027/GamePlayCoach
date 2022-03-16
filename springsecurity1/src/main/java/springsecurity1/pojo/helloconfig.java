package springsecurity1.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class helloconfig  extends WebSecurityConfigurerAdapter{

@Override
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.inMemoryAuthentication().withUser("Adarsh").password("hi").roles("USER");
	auth.inMemoryAuthentication().withUser("Rudra").password("hello").roles("ADMIN");

	}
//Security for all API
	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception {
	 * http.csrf().disable();
	 * http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	 * }
	 */
//Security for URL Based
@Override protected void configure(HttpSecurity http) throws Exception {
	  http.csrf().disable();
	  http.authorizeRequests().antMatchers("/hi").hasRole("USER").and().httpBasic().and().rememberMe();
	  http.authorizeRequests().antMatchers("/heya").hasAnyRole("USER","ADMIN").and().httpBasic().and().rememberMe()
	    .tokenValiditySeconds(7* 24 * 60 * 60) // expiration time: 7 days
	    .key("AbcdefghiJklmNoPqRstUvXyz") ;  // cookies will survive if restarted;;

	  }
@Bean
public PasswordEncoder getpasswordEncoder() {
	return NoOpPasswordEncoder.getInstance();
	
}
}
