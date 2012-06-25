package net.caiban.domain.eshop;

import java.util.Date;

/**
 * Eshop generated by MyEclipse Persistence Tools
 */

public class Eshop implements java.io.Serializable {
	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String siteUrl;
	private String remark;
	private Date gmtcreate;

	// Constructors

	/** default constructor */
	public Eshop() {
	}

	/** minimal constructor */
	public Eshop(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Eshop(Integer id, String name, String siteUrl, String remark,
			Date gmtcreate) {
		this.id = id;
		this.name = name;
		this.siteUrl = siteUrl;
		this.remark = remark;
		this.gmtcreate = gmtcreate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSiteUrl() {
		return this.siteUrl;
	}

	public void setSiteUrl(String siteUrl) {
		this.siteUrl = siteUrl;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getGmtcreate() {
		return this.gmtcreate;
	}

	public void setGmtcreate(Date gmtcreate) {
		this.gmtcreate = gmtcreate;
	}

}