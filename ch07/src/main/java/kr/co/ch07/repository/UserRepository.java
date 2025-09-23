package kr.co.ch07.repository;

import kr.co.ch07.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, String> {
}
