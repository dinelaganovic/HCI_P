package com.example.backend.Repo;

import com.example.backend.Entity.Kozmeticki;
import com.example.backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface KozmetickiRepository extends JpaRepository<Kozmeticki, Long> {
}
