package com.herbalife.springbootrestapi.repository;

import com.herbalife.springbootrestapi.model.Topic;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer> {
    Optional<Topic> findByTitle(String title);

    @Modifying
    @Query(value = "delete from Topic t where t.title=:title")
    void deleteTopic(@Param("title") String title);

    @Modifying
    @Query(value = "update Topic t set t.duration=:duration where t.title=:title")
    void updateDuration(@Param("title") String title, @Param("duration") int duration);
}
