package io.spring.hibernatemapping.oneToOne.repository;

import io.spring.hibernatemapping.oneToOne.domain.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
