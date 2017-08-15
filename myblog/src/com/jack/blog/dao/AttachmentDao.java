package com.jack.blog.dao;

import java.util.List;

import com.jack.blog.domain.Attachment;
import com.jack.blog.domain.Blog;
import com.jack.common.util.CrudDao;

public interface AttachmentDao extends CrudDao<Attachment> {

	/**
	 * 根据博客查找附件
	 * @param blog
	 * @return
	 */
	List<Attachment> findByBlog(Blog blog);
}
