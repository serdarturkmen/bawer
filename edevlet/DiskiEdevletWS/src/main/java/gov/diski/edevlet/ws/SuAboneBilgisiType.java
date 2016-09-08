package gov.diski.edevlet.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for suAboneBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="suAboneBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tcKimlikNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aboneNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="adi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="soyadi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aboneTipi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="adres">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="abonelikDurumu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sayacNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sayacCapi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sayacYeri">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sonOkumaTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="otomatikOdemeBanka">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="aciklama">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="borcTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="gecmisBorcTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suAboneBilgisiType", propOrder = { "tcKimlikNo", "aboneNo",
		"adi", "soyadi", "aboneTipi", "adres", "abonelikDurumu", "sayacNo",
		"sayacCapi", "sayacYeri", "sonOkumaTarihi", "otomatikOdemeBanka",
		"aciklama", "borcTutari", "gecmisBorcTutari" })
public class SuAboneBilgisiType {

	@XmlElement(required = true)
	protected String tcKimlikNo;
	@XmlElement(required = true)
	protected String aboneNo;
	@XmlElement(required = true)
	protected String adi;
	@XmlElement(required = true)
	protected String soyadi;
	@XmlElement(required = true)
	protected String aboneTipi;
	@XmlElement(required = true)
	protected String adres;
	@XmlElement(required = true)
	protected String abonelikDurumu;
	@XmlElement(required = true)
	protected String sayacNo;
	@XmlElement(required = true)
	protected String sayacCapi;
	@XmlElement(required = true)
	protected String sayacYeri;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar sonOkumaTarihi;
	@XmlElement(required = true)
	protected String otomatikOdemeBanka;
	@XmlElement(required = true)
	protected String aciklama;
	@XmlElement(required = true)
	protected BigDecimal borcTutari;
	@XmlElement(required = true)
	protected BigDecimal gecmisBorcTutari;

	/**
	 * Gets the value of the tcKimlikNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	/**
	 * Sets the value of the tcKimlikNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTcKimlikNo(String value) {
		this.tcKimlikNo = value;
	}

	/**
	 * Gets the value of the aboneNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAboneNo() {
		return aboneNo;
	}

	/**
	 * Sets the value of the aboneNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAboneNo(String value) {
		this.aboneNo = value;
	}

	/**
	 * Gets the value of the adi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdi() {
		return adi;
	}

	/**
	 * Sets the value of the adi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdi(String value) {
		this.adi = value;
	}

	/**
	 * Gets the value of the soyadi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSoyadi() {
		return soyadi;
	}

	/**
	 * Sets the value of the soyadi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSoyadi(String value) {
		this.soyadi = value;
	}

	/**
	 * Gets the value of the aboneTipi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAboneTipi() {
		return aboneTipi;
	}

	/**
	 * Sets the value of the aboneTipi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAboneTipi(String value) {
		this.aboneTipi = value;
	}

	/**
	 * Gets the value of the adres property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdres() {
		return adres;
	}

	/**
	 * Sets the value of the adres property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdres(String value) {
		this.adres = value;
	}

	/**
	 * Gets the value of the abonelikDurumu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAbonelikDurumu() {
		return abonelikDurumu;
	}

	/**
	 * Sets the value of the abonelikDurumu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAbonelikDurumu(String value) {
		this.abonelikDurumu = value;
	}

	/**
	 * Gets the value of the sayacNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSayacNo() {
		return sayacNo;
	}

	/**
	 * Sets the value of the sayacNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSayacNo(String value) {
		this.sayacNo = value;
	}

	/**
	 * Gets the value of the sayacCapi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSayacCapi() {
		return sayacCapi;
	}

	/**
	 * Sets the value of the sayacCapi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSayacCapi(String value) {
		this.sayacCapi = value;
	}

	/**
	 * Gets the value of the sayacYeri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSayacYeri() {
		return sayacYeri;
	}

	/**
	 * Sets the value of the sayacYeri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSayacYeri(String value) {
		this.sayacYeri = value;
	}

	/**
	 * Gets the value of the sonOkumaTarihi property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getSonOkumaTarihi() {
		return sonOkumaTarihi;
	}

	/**
	 * Sets the value of the sonOkumaTarihi property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setSonOkumaTarihi(XMLGregorianCalendar value) {
		this.sonOkumaTarihi = value;
	}

	/**
	 * Gets the value of the otomatikOdemeBanka property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getOtomatikOdemeBanka() {
		return otomatikOdemeBanka;
	}

	/**
	 * Sets the value of the otomatikOdemeBanka property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setOtomatikOdemeBanka(String value) {
		this.otomatikOdemeBanka = value;
	}

	/**
	 * Gets the value of the aciklama property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAciklama() {
		return aciklama;
	}

	/**
	 * Sets the value of the aciklama property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAciklama(String value) {
		this.aciklama = value;
	}

	/**
	 * Gets the value of the borcTutari property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getBorcTutari() {
		return borcTutari;
	}

	/**
	 * Sets the value of the borcTutari property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setBorcTutari(BigDecimal value) {
		this.borcTutari = value;
	}

	/**
	 * Gets the value of the gecmisBorcTutari property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getGecmisBorcTutari() {
		return gecmisBorcTutari;
	}

	/**
	 * Sets the value of the gecmisBorcTutari property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setGecmisBorcTutari(BigDecimal value) {
		this.gecmisBorcTutari = value;
	}

}
