package com.example.SoulWorkerPracticeStudent.Repos;

import com.example.SoulWorkerPracticeStudent.Models.CharactersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface CharactersRepo extends JpaRepository<CharactersModel, Long> {
}
