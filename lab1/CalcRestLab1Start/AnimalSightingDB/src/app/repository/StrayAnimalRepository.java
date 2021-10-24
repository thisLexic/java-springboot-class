package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.StrayAnimal;

@Repository
public interface StrayAnimalRepository extends JpaRepository<StrayAnimal, Long> {
	public List<StrayAnimal> findByType(String type);
	public List<StrayAnimal> findByNeutered(boolean neutered);
}