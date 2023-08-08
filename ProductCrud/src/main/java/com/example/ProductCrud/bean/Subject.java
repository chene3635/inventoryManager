package com.example.ProductCrud.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	private String ccid;
	
	private String name;
	
	private String page_url;
	
	private String parent_ccid;
	
	private String seo_name;
	
	private String title;
	
	private String description;
	
	private String meta_desc;
	
	private String meta_keywords;
	
	private String breadcrumbs;
	
	private String image_url;
	
	private String is_active;
	
	

	public Subject() {
		super();
	}

	public Subject(String ccid, String name, String page_url, String parent_ccid, String seo_name, String title,
			String description, String meta_desc, String meta_keywords, String breadcrumbs, String image_url,
			String is_active) {
		super();
		this.ccid = ccid;
		this.name = name;
		this.page_url = page_url;
		this.parent_ccid = parent_ccid;
		this.seo_name = seo_name;
		this.title = title;
		this.description = description;
		this.meta_desc = meta_desc;
		this.meta_keywords = meta_keywords;
		this.breadcrumbs = breadcrumbs;
		this.image_url = image_url;
		this.is_active = is_active;
	}

	public String getCcid() {
		return ccid;
	}

	public void setCcid(String ccid) {
		this.ccid = ccid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPage_url() {
		return page_url;
	}

	public void setPage_url(String page_url) {
		this.page_url = page_url;
	}

	public String getParent_ccid() {
		return parent_ccid;
	}

	public void setParent_ccid(String parent_ccid) {
		this.parent_ccid = parent_ccid;
	}

	public String getSeo_name() {
		return seo_name;
	}

	public void setSeo_name(String seo_name) {
		this.seo_name = seo_name;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

	public String getMeta_desc() {
		return meta_desc;
	}

	public void setMeta_desc(String meta_desc) {
		this.meta_desc = meta_desc;
	}

	public String getMeta_keywords() {
		return meta_keywords;
	}

	public void setMeta_keywords(String meta_keywords) {
		this.meta_keywords = meta_keywords;
	}

	public String getBreadcrumbs() {
		return breadcrumbs;
	}

	public void setBreadcrumbs(String breadcrumbs) {
		this.breadcrumbs = breadcrumbs;
	}

	public String getImage_url() {
		return image_url;
	}

	public void setImage_url(String image_url) {
		this.image_url = image_url;
	}

	public String getIs_active() {
		return is_active;
	}

	public void setIs_active(String is_active) {
		this.is_active = is_active;
	}
	
}
