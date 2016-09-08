package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SOKBasvuruType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ilceKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mahalleKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sokakCaddeKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="binaNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="haneNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="acikAdres">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOKTipi">
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
 *         &lt;element name="telefonNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="eposta">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SOKDetay">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dosya" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOKBasvuruType", propOrder = { "ilceKodu", "mahalleKodu",
		"sokakCaddeKodu", "binaNo", "haneNo", "acikAdres", "sokTipi",
		"aboneNo", "adi", "soyadi", "telefonNo", "eposta", "sokDetay", "dosya" })
public class SOKBasvuruType {

	@XmlElement(required = true)
	protected String ilceKodu;
	@XmlElement(required = true)
	protected String mahalleKodu;
	@XmlElement(required = true)
	protected String sokakCaddeKodu;
	@XmlElement(required = true)
	protected String binaNo;
	@XmlElement(required = true)
	protected String haneNo;
	@XmlElement(required = true)
	protected String acikAdres;
	@XmlElement(name = "SOKTipi", required = true)
	protected String sokTipi;
	@XmlElement(required = true)
	protected String aboneNo;
	@XmlElement(required = true)
	protected String adi;
	@XmlElement(required = true)
	protected String soyadi;
	@XmlElement(required = true)
	protected String telefonNo;
	@XmlElement(required = true)
	protected String eposta;
	@XmlElement(name = "SOKDetay", required = true)
	protected String sokDetay;
	@XmlElement(required = true)
	protected byte[] dosya;

	/**
	 * Gets the value of the ilceKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIlceKodu() {
		return ilceKodu;
	}

	/**
	 * Sets the value of the ilceKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIlceKodu(String value) {
		this.ilceKodu = value;
	}

	/**
	 * Gets the value of the mahalleKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMahalleKodu() {
		return mahalleKodu;
	}

	/**
	 * Sets the value of the mahalleKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMahalleKodu(String value) {
		this.mahalleKodu = value;
	}

	/**
	 * Gets the value of the sokakCaddeKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSokakCaddeKodu() {
		return sokakCaddeKodu;
	}

	/**
	 * Sets the value of the sokakCaddeKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSokakCaddeKodu(String value) {
		this.sokakCaddeKodu = value;
	}

	/**
	 * Gets the value of the binaNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBinaNo() {
		return binaNo;
	}

	/**
	 * Sets the value of the binaNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBinaNo(String value) {
		this.binaNo = value;
	}

	/**
	 * Gets the value of the haneNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getHaneNo() {
		return haneNo;
	}

	/**
	 * Sets the value of the haneNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setHaneNo(String value) {
		this.haneNo = value;
	}

	/**
	 * Gets the value of the acikAdres property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAcikAdres() {
		return acikAdres;
	}

	/**
	 * Sets the value of the acikAdres property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAcikAdres(String value) {
		this.acikAdres = value;
	}

	/**
	 * Gets the value of the sokTipi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSOKTipi() {
		return sokTipi;
	}

	/**
	 * Sets the value of the sokTipi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSOKTipi(String value) {
		this.sokTipi = value;
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
	 * Gets the value of the telefonNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTelefonNo() {
		return telefonNo;
	}

	/**
	 * Sets the value of the telefonNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTelefonNo(String value) {
		this.telefonNo = value;
	}

	/**
	 * Gets the value of the eposta property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEposta() {
		return eposta;
	}

	/**
	 * Sets the value of the eposta property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEposta(String value) {
		this.eposta = value;
	}

	/**
	 * Gets the value of the sokDetay property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSOKDetay() {
		return sokDetay;
	}

	/**
	 * Sets the value of the sokDetay property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSOKDetay(String value) {
		this.sokDetay = value;
	}

	/**
	 * Gets the value of the dosya property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getDosya() {
		return dosya;
	}

	/**
	 * Sets the value of the dosya property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setDosya(byte[] value) {
		this.dosya = ((byte[]) value);
	}

}
