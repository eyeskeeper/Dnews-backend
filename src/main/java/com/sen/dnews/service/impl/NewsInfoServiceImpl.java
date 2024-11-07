package com.sen.dnews.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sen.dnews.mapper.NewsInfoMapper;
import com.sen.dnews.model.entity.NewsInfo;
import com.sen.dnews.service.NewsInfoService;
import org.springframework.stereotype.Service;

/**
* @author ransen
* @description 针对表【news_info】的数据库操作Service实现
* @createDate 2024-08-22 16:40:24
*/
@Service
public class NewsInfoServiceImpl extends ServiceImpl<NewsInfoMapper, NewsInfo>
    implements NewsInfoService {

}




