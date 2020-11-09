package com.tts.springboothomework;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.tts.springboothomework.domain.Swimmers;
import com.tts.springboothomework.repository.SwimmerRepository;
@SpringBootApplication
public class H2 {
    private static final Logger log = LoggerFactory.getLogger(H2.class);
    public static void main(String[] args) {
        SpringApplication.run(H2.class, args);
    }
    @Bean
    public CommandLineRunner demo(SwimmerRepository repository) {
        return (args) -> {
            // save a couple of Swimmers
            repository.save(new Swimmers("alex", 25, "smith"));
            repository.save(new Swimmers("sam", 25, "johnson"));
            repository.save(new Swimmers("sarah", 44,"rice"));
            repository.save(new Swimmers("kenny",62, "rodgers"));
            repository.save(new Swimmers("carol",77, "robbins"));
            // read all Swimmers
            log.info("Swimmers found with findAll():");
            log.info("-------------------------------");
            for (Swimmers swimmers : repository.findAll()) {
                log.info(swimmers.toString());
            }
            log.info("");
            // read an individual swimmer by ID
            repository.findById(1L)
                    .ifPresent(swimmers -> {
                        log.info("Swimmer found with findById(1L):");
                        log.info("--------------------------------");
                        log.info(swimmers.toString());
                        log.info("");
                    });
            // read swimmer by lap time
            log.info("Swimmer found with findByLapTime(77):");
            log.info("--------------------------------------------");
            repository.findByLapTime(77).forEach(bauer -> {
                log.info(bauer.toString());
            });
            log.info("");
        };
    }
}
