package net.caiban.domain.orders;

import java.util.Date;

/**
 * LogisticsDetails generated by MyEclipse Persistence Tools
 */

public class LogisticsDetails implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer orderId;
	private Integer logisticsId;
	private String expressNo;
	private Float costs;
	private Date gmtReceive;
	private Date gmtSend;
	private Integer uid;
	private Integer eid;
	private Date gmtcreate;

	// Constructors

	/** default constructor */
	public LogisticsDetails() {
	}

	/** minimal constructor */
	public LogisticsDetails(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public LogisticsDetails(Integer id, Integer orderId, Integer logisticsId,
			String expressNo, Float costs, Date gmtReceive, Date gmtSend,
			Integer uid, Integer eid, Date gmtcreate) {
		this.id = id;
		this.orderId = orderId;
		this.logisticsId = logisticsId;
		this.expressNo = expressNo;
		this.costs = costs;
		this.gmtReceive = gmtReceive;
		this.gmtSend = gmtSend;
		this.uid = uid;
		this.eid = eid;
		this.gmtcreate = gmtcreate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderId() {
		return this.orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getLogisticsId() {
		return this.logisticsId;
	}

	public void setLogisticsId(Integer logisticsId) {
		this.logisticsId = logisticsId;
	}

	public String getExpressNo() {
		return this.expressNo;
	}

	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}

	public Float getCosts() {
		return this.costs;
	}

	public void setCosts(Float costs) {
		this.costs = costs;
	}

	public Date getGmtReceive() {
		return this.gmtReceive;
	}

	public void setGmtReceive(Date gmtReceive) {
		this.gmtReceive = gmtReceive;
	}

	public Date getGmtSend() {
		return this.gmtSend;
	}

	public void setGmtSend(Date gmtSend) {
		this.gmtSend = gmtSend;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public Date getGmtcreate() {
		return this.gmtcreate;
	}

	public void setGmtcreate(Date gmtcreate) {
		this.gmtcreate = gmtcreate;
	}

}