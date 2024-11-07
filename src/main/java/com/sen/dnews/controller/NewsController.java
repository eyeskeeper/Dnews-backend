package com.sen.dnews.controller;


import cn.hutool.core.bean.BeanUtil;
import com.sen.dnews.common.BaseResponse;
import com.sen.dnews.common.ErrorCode;
import com.sen.dnews.common.ResultUtils;
import com.sen.dnews.exception.BusinessException;
import com.sen.dnews.model.dto.news.NewsAddRequest;
import com.sen.dnews.model.entity.NewsInfo;
import com.sen.dnews.service.NewsInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/news")
public class NewsController {
    @Resource
    private NewsInfoService newsInfoService;

    @PostMapping("/add")
    public BaseResponse<Long> addNewsInfo(@RequestBody NewsAddRequest newsAddRequest){

        NewsInfo newsInfo = new NewsInfo();
        BeanUtil.copyProperties(newsAddRequest,newsInfo);
        boolean result = newsInfoService.save(newsInfo);
        if(result){
            return ResultUtils.success(newsInfo.getId());
        }else{
            throw new BusinessException(ErrorCode.SYSTEM_ERROR);
        }

    }
}
