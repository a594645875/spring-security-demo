package com.czc.oauth2.service;

import com.czc.oauth2.entity.Permission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 权限表 服务类
 * </p>
 *
 * @author jobob
 * @since 2019-06-08
 */
public interface IPermissionService extends IService<Permission> {

    List<Permission> selectByUserId(long id);
}
