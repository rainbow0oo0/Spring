package kr.co.ch09.repository;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<kr.co.ch09.entity.User, String> {
}
