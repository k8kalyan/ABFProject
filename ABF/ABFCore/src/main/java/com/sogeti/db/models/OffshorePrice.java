package com.sogeti.db.models;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the offshore_price database table.
 * 
 */
@Entity
@Table(name="offshore_price")
@NamedQuery(name="OffshorePrice.findAll", query="SELECT o FROM OffshorePrice o")
public class OffshorePrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="offshoreprice_id", unique=true, nullable=false)
	private int offshorepriceId;

	@Column(name="band_id")
	private int bandId;

	@Column(name="businessline_id")
	private int businesslineId;

	@Column(length=256)
	private String description;

	@Column(name="last_updated_by", length=45)
	private String lastUpdatedBy;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="last_updated_timestamp")
	private Date lastUpdatedTimestamp;

	@Column(precision=10, scale=2)
	private BigDecimal price;

	@Column(name="stay_type_id")
	private int stayTypeId;

	public OffshorePrice() {
	}

	public int getOffshorepriceId() {
		return this.offshorepriceId;
	}

	public void setOffshorepriceId(int offshorepriceId) {
		this.offshorepriceId = offshorepriceId;
	}

	public int getBandId() {
		return this.bandId;
	}

	public void setBandId(int bandId) {
		this.bandId = bandId;
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

	public int getStayTypeId() {
		return this.stayTypeId;
	}

	public void setStayTypeId(int stayTypeId) {
		this.stayTypeId = stayTypeId;
	}

}