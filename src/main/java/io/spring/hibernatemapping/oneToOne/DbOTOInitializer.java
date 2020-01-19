package io.spring.hibernatemapping.oneToOne;

import io.spring.hibernatemapping.oneToOne.model.Customer;
import io.spring.hibernatemapping.oneToOne.model.Profile;
import io.spring.hibernatemapping.oneToOne.repository.CustomerRepository;
import io.spring.hibernatemapping.oneToOne.repository.ProfileRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Slf4j
public class DbOTOInitializer implements CommandLineRunner {

    private final CustomerRepository customerRepository;
    private final ProfileRepository profileRepository;

    public DbOTOInitializer(CustomerRepository customerRepository, ProfileRepository profileRepository) {
        this.customerRepository = customerRepository;
        this.profileRepository = profileRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Creating test db for one to one (customer profile). START");

        Customer wendy = new Customer("Wendy", "Wallace", "wendy.wallace92@example.com");

        Profile wendyProfile = new Profile("7524 Mockingbird Hill", "Wilmar", "UK", "WI5 4NA", LocalDate.of(1980, 05, 16));
        wendy.setProfile(wendyProfile);

        profileRepository.save(wendyProfile);
        customerRepository.save(wendy);

        log.info("Creating test db for one to one (customer profile). END");
    }

}
