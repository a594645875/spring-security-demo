package com.czc.oauth2.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czc.oauth2.entity.Permission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 权限表 Mapper 接口
 * </p>
 *
 * @author jobob
 * @since 2019-06-08
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    List<Permission> selectByUserId(@Param("id") long id);
}
