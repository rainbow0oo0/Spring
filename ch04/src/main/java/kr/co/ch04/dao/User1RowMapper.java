package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class User1RowMapper implements RowMapper<User1DTO> {

    @Override
    public User1DTO mapRow(ResultSet rs, int rowNum) throws SQLException {

        User1DTO sadfaswedfs = new User1DTO();
        sadfaswedfs.setUid(rs.getString("uid"));
        sadfaswedfs.setName(rs.getString("name"));
        sadfaswedfs.setBirth(rs.getString(3));
        sadfaswedfs.setAge(rs.getInt(4));

        return sadfaswedfs;
    }
}
