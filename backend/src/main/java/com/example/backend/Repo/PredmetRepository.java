package com.example.backend.Repo;

import com.example.backend.Entity.Predmet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface PredmetRepository extends JpaRepository<Predmet, Long> {
}
