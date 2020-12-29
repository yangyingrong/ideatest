package org.sang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.sang.bean.Comment;
import org.springframework.security.access.method.P;

import java.util.List;

@Mapper
public interface CommentMapper {
    //分页检索
    List<Comment> getComments(@Param("start")Integer start, @Param("count")Integer count,@Param("keywords")String keywords);
    int getCommentsCount(@Param("keywords")String keywords);

}
