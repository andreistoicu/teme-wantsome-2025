package org.wantsome.databases.dao_repository_domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.wantsome.databases.dao_repository_domain.entity.Student;

public interface StudentJpaRepository extends JpaRepository<Student, Long> {
}
