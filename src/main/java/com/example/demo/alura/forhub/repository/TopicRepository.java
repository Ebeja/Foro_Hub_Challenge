package com.example.demo.alura.forhub.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.alura.forhub.model.Topic;

public interface TopicRepository extends JpaRepository<Topic, Long> {
}
