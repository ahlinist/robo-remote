package robo.remote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class RoboRemoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoboRemoteApplication.class, args);
	}
}
