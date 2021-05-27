package com.xyf.dao;

import com.xyf.domain.Role;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public interface RoleDao {
    public List<Role> findAll();

}
