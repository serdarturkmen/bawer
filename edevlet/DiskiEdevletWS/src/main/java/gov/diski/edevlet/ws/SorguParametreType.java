package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sorguParametreType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sorguParametreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="belediyeKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="5"/>
 *               &lt;pattern value="[0-9]{5}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kullaniciAdi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sifre">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="5"/>
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ipAdresi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sorguParametreType", propOrder = { "belediyeKodu",
		"kullaniciAdi", "sifre", "ipAdresi" })
public class SorguParametreType {

	@XmlElement(required = true)
	protected String belediyeKodu;
	@XmlElement(required = true)
	protected String kullaniciAdi;
	@XmlElement(required = true)
	protected String sifre;
	@XmlElement(required = true)
	protected String ipAdresi;

	/**
	 * Gets the value of the belediyeKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBelediyeKodu() {
		return belediyeKodu;
	}

	/**
	 * Sets the value of the belediyeKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBelediyeKodu(String value) {
		this.belediyeKodu = value;
	}

	/**
	 * Gets the value of the kullaniciAdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKullaniciAdi() {
		return kullaniciAdi;
	}

	/**
	 * Sets the value of the kullaniciAdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKullaniciAdi(String value) {
		this.kullaniciAdi = value;
	}

	/**
	 * Gets the value of the sifre property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSifre() {
		return sifre;
	}

	/**
	 * Sets the value of the sifre property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSifre(String value) {
		this.sifre = value;
	}

	/**
	 * Gets the value of the ipAdresi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIpAdresi() {
		return ipAdresi;
	}

	/**
	 * Sets the value of the ipAdresi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIpAdresi(String value) {
		this.ipAdresi = value;
	}

}
