package com.czc.oauth2.config.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.czc.oauth2.entity.Permission;
import com.czc.oauth2.entity.User;
import com.czc.oauth2.service.IPermissionService;
import com.czc.oauth2.service.IUserService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author czc
 * @date 2019/6/8 10:15
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    @Autowired
    private IUserService tbUserService;

    @Autowired
    private IPermissionService tbPermissionService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // 查询用户信息
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.lambda().eq(User::getUsername, username);
        User tbUser = tbUserService.getOne(wrapper);
        List<GrantedAuthority> grantedAuthorities = Lists.newArrayList();
        if (tbUser != null) {
            // 获取用户授权
            List<Permission> tbPermissions = tbPermissionService.selectByUserId(tbUser.getId());

            // 声明用户授权
            tbPermissions.forEach(tbPermission -> {
                if (tbPermission != null && tbPermission.getEnname() != null) {
                    GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(tbPermission.getEnname());
                    grantedAuthorities.add(grantedAuthority);
                }
            });
        }

        // 由框架完成认证工作
        return new org.springframework.security.core.userdetails.User(tbUser.getUsername(), tbUser.getPassword(), grantedAuthorities);
    }
}