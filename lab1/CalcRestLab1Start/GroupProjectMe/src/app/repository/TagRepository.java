package app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Long> {
	public List<Tag> findByName(String name);
}
