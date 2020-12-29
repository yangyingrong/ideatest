package org.sang.controller;

import org.sang.bean.Comment;
import org.sang.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommentController {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    CommentService commentService;

    public Map<String ,Object> getComments(@RequestParam(value = "page",defaultValue ="1" )Integer page,@RequestParam(value = "count",defaultValue = "5")Integer count,String keywords){
            //得到满足条件的记录数
        int totalCount = commentService.getCommentsCount(keywords);
        //实际数据
        List<Comment> comments = commentService.getComments(page,count,keywords);
        Map<String,Object> map = new HashMap<>();
        //将总记录数，存在map中
        map.put("totalCount",totalCount);
        //将返回集合，也存储map
        map.put("comments",comments);
        return map;
    }
}
