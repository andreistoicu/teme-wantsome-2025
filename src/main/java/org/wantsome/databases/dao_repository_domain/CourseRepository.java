package org.wantsome.databases.dao_repository_domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wantsome.databases.dao_repository_domain.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
