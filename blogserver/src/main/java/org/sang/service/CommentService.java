package org.sang.service;


import org.apache.ibatis.annotations.Param;
import org.sang.bean.Comment;
import org.sang.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentMapper commentMapper;

    public List<Comment> getComments(Integer page, Integer count, String keywords){
        int start = (page-1)*count;
        return commentMapper.getComments(start,count,keywords);
    }

    public int getCommentsCount(String keywords){
        return commentMapper.getCommentsCount(keywords);
    }
}
