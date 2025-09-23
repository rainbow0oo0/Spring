package kr.co.ch06.repository;

import kr.co.ch06.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User1Repository extends JpaRepository<User1, String> { // <엔티티, 해당 엔티티의 ID 속성 자료형>



}
