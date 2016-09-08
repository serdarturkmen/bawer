package gov.diski.edevlet.model;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Abone implements Serializable{
	private static final long serialVersionUID = 3949904305724156654L;
	
	@Id
	@Column(name = "abone_no", nullable = false)
	private Integer aboneNo;
	private String adi;
	private String soyadi;
	private Integer defter_no;
	private Integer sayfa_no;
	private Integer taksim;
	public Abone(){
	}
	
	public Integer getDefter_no() {
		return defter_no;
	}
	public void setDefter_no(Integer defterNo) {
		defter_no = defterNo;
	}
	public Integer getSayfa_no() {
		return sayfa_no;
	}
	public void setSayfa_no(Integer sayfaNo) {
		sayfa_no = sayfaNo;
	}
	public Integer getTaksim() {
		return taksim;
	}
	public void setTaksim(Integer taksim) {
		this.taksim = taksim;
	}

	public Integer getAbone_no() {
		return aboneNo;
	}
	public void setAbone_no(Integer aboneNo) {
		aboneNo = aboneNo;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

}