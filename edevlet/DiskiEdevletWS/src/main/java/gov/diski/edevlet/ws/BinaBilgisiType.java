package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for binaBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="binaBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="binaKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="binaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresSiraNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binaBilgisiType", propOrder = { "binaKodu", "binaAdi",
		"adresSiraNo" })
public class BinaBilgisiType {

	@XmlElement(required = true)
	protected String binaKodu;
	@XmlElement(required = true)
	protected String binaAdi;
	@XmlElement(required = true)
	protected String adresSiraNo;

	/**
	 * Gets the value of the binaKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBinaKodu() {
		return binaKodu;
	}

	/**
	 * Sets the value of the binaKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBinaKodu(String value) {
		this.binaKodu = value;
	}

	/**
	 * Gets the value of the binaAdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBinaAdi() {
		return binaAdi;
	}

	/**
	 * Sets the value of the binaAdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBinaAdi(String value) {
		this.binaAdi = value;
	}

	/**
	 * Gets the value of the adresSiraNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAdresSiraNo() {
		return adresSiraNo;
	}

	/**
	 * Sets the value of the adresSiraNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAdresSiraNo(String value) {
		this.adresSiraNo = value;
	}

}
