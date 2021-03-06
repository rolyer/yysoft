package net.caiban.domain.auth;

import java.util.Date;

/**
 * ParamType generated by MyEclipse Persistence Tools
 */

public class ParamType implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = -1974039040791083582L;
	private String type;
	private String names;
	private Date gmtcreate;

	// Constructors

	/** default constructor */
	public ParamType() {
	}

	/** minimal constructor */
	public ParamType(String type) {
		this.type = type;
	}

	/** full constructor */
	public ParamType(String type, String names, Date gmtcreate) {
		this.type = type;
		this.names = names;
		this.gmtcreate = gmtcreate;
	}

	// Property accessors

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNames() {
		return this.names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public Date getGmtcreate() {
		return this.gmtcreate;
	}

	public void setGmtcreate(Date gmtcreate) {
		this.gmtcreate = gmtcreate;
	}

}