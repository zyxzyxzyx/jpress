package io.jpress.module.article.model.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseArticleCategoryMapping<M extends BaseArticleCategoryMapping<M>> extends JbootModel<M> implements IBean {

	public void setArticleId(java.lang.Long articleId) {
		set("article_id", articleId);
	}
	
	public java.lang.Long getArticleId() {
		return getLong("article_id");
	}

	public void setCategoryId(java.lang.Long categoryId) {
		set("category_id", categoryId);
	}
	
	public java.lang.Long getCategoryId() {
		return getLong("category_id");
	}

}