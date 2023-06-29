package com.wdd.studentmanager.mapper;

import com.wdd.studentmanager.domain.Admin;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminMapper {

    Admin findByAdmin(Admin admin);//验证 账号密码 正确性


    int editPswdByAdmin(Admin admin);//修改管理员密码
}
