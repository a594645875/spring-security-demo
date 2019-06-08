package com.czc.oauth2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czc.oauth2.entity.ContentCategory;
import com.czc.oauth2.mapper.ContentCategoryMapper;
import com.czc.oauth2.service.IContentCategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 内容分类 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2019-06-08
 */
@Service
public class ContentCategoryServiceImpl extends ServiceImpl<ContentCategoryMapper, ContentCategory> implements IContentCategoryService {

}
