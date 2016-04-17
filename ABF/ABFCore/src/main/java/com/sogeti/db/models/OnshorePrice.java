package com.sogeti.db.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the onshore_price database table.
 * 
 */
@Entity
@Table(name="onshore_price")
@NamedQuery(name="OnshorePrice.findAll", query="SELECT o FROM OnshorePrice o")
public class OnshorePrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="onshoreprice_id", unique=true, nullable=false)
	private int onshorepriceId;

	@Column(name="businessline_id", nullable=false)
	private int businesslineId;

	@Column(length=256)
	private String description;

	@Column(name="grade_id", nullable=false)
	private int gradeId;

	@Column(name="last_updated_by", length=45)
	private String lastUpdatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated_timestamp")
	private Date lastUpdatedTimestamp;

	@Column(nullable=false, precision=10, scale=2)
	private BigDecimal price;

	@Column(name="role_id", nullable=false)
	private int roleId;

	public OnshorePrice() {
	}

	public int getOnshorepriceId() {
		return this.onshorepriceId;
	}

	public void setOnshorepriceId(int onshorepriceId) {
		this.onshorepriceId = onshorepriceId;
	}

	public int getBusinesslineId() {
		return this.businesslineId;
	}

	public void setBusinesslineId(int businesslineId) {
		this.businesslineId = businesslineId;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getGradeId() {
		return this.gradeId;
	}

	public void setGradeId(int gradeId) {
		this.gradeId = gradeId;
	}

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Date getLastUpdatedTimestamp() {
		return this.lastUpdatedTimestamp;
	}

	public void setLastUpdatedTimestamp(Date lastUpdatedTimestamp) {
		this.lastUpdatedTimestamp = lastUpdatedTimestamp;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

}