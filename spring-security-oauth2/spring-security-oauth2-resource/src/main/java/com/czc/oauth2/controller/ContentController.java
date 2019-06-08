package com.czc.oauth2.controller;


import com.czc.oauth2.entity.Content;
import com.czc.oauth2.service.IContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author jobob
 * @since 2019-06-08
 */
@RestController
@RequestMapping("/")
public class ContentController {
    @Autowired
    private IContentService contentService;

    @GetMapping
    public List<Content> showAll(){
        return contentService.list();
    }

}
