package app;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import model.Item;

public class App {
	@Bean
	 public JedisConnectionFactory jedisConnectionFactory(){
		JedisConnectionFactory connectionFactory = new JedisConnectionFactory();
		  connectionFactory.setHostName("hostname");
		  connectionFactory.setPort(9001);
		  connectionFactory.afterPropertiesSet();
		  return connectionFactory;
	  }

	  @Bean
	 public RedisTemplate<String, Item> redisTemplate(){
	    RedisTemplate<String,Item> redisTemplate = new RedisTemplate<String, Item>();
	    redisTemplate.setConnectionFactory(jedisConnectionFactory());
	    return redisTemplate;
	  }

	  public static void main(String[] args) {
	    SpringApplication.run(App.class, args);
	  }
}