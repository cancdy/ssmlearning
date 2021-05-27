package com.xyf.dao.impl;

import com.xyf.dao.RoleDao;
import com.xyf.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class RoleDaoImpl implements RoleDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public List<Role> findAll() {
        List<Role> roleList=jdbcTemplate.query("select * from sys_role",new BeanPropertyRowMapper<Role>(Role.class));
        return roleList;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
    }
}
