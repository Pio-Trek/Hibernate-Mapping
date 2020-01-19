package io.spring.hibernatemapping.oneToOne.repository;

import io.spring.hibernatemapping.oneToOne.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
