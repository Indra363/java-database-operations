package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig
{
	@Bean
	public DriverManagerDataSource myDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/spring_jdbc_db_maven?useSSL=false&serverTimezone=UTC");
		dataSource.setUsername("root");
		dataSource.setPassword("Root@0808");
		
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate myJdbcTemplate() {
		 JdbcTemplate jdbcTemplate = new  JdbcTemplate();
		
		 jdbcTemplate.setDataSource(myDataSource());
		 
		return jdbcTemplate;
	}

}
