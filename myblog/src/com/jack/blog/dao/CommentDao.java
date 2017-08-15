package com.jack.blog.dao;

import java.util.List;

import com.jack.blog.domain.Blog;
import com.jack.blog.domain.Comment;
import com.jack.common.util.CrudDao;

public interface CommentDao extends CrudDao<Comment> {
	
	/**
	 * 根据博客查找评论
	 * @param blog
	 * @return
	 */
	List<Comment> findByBlog(Blog blog);
}
