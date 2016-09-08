package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for islemSonucType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="islemSonucType">
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
 *         &lt;element name="sonucKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="4"/>
 *               &lt;maxLength value="4"/>
 *               &lt;pattern value="[0-9]{4}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sonucAciklamasi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="0"/>
 *               &lt;maxLength value="100"/>
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
@XmlType(name = "islemSonucType", propOrder = { "belediyeKodu", "sonucKodu",
		"sonucAciklamasi" })
public class IslemSonucType {

	@XmlElement(required = true)
	protected String belediyeKodu;
	@XmlElement(required = true)
	protected String sonucKodu;
	@XmlElement(required = true)
	protected String sonucAciklamasi;

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
	 * Gets the value of the sonucKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSonucKodu() {
		return sonucKodu;
	}

	/**
	 * Sets the value of the sonucKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSonucKodu(String value) {
		this.sonucKodu = value;
	}

	/**
	 * Gets the value of the sonucAciklamasi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSonucAciklamasi() {
		return sonucAciklamasi;
	}

	/**
	 * Sets the value of the sonucAciklamasi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSonucAciklamasi(String value) {
		this.sonucAciklamasi = value;
	}

}
