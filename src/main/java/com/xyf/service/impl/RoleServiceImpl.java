package com.xyf.service.impl;

import com.xyf.dao.RoleDao;
import com.xyf.domain.Role;
import com.xyf.service.RoleService;

import java.util.List;

public class RoleServiceImpl implements RoleService {
    private RoleDao roleDao;

    public RoleDao getRoleDao() {
        return roleDao;
    }

    public void setRoleDao(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public List<Role> list(){
        List<Role> roleList= roleDao.findAll();
        return roleList;
    }
}
