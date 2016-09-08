package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ilceBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ilceBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ilceKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ilceAdi">
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
@XmlType(name = "ilceBilgisiType", propOrder = { "ilceKodu", "ilceAdi" })
public class IlceBilgisiType {

	@XmlElement(required = true)
	protected String ilceKodu;
	@XmlElement(required = true)
	protected String ilceAdi;

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
	 * Gets the value of the ilceAdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIlceAdi() {
		return ilceAdi;
	}

	/**
	 * Sets the value of the ilceAdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIlceAdi(String value) {
		this.ilceAdi = value;
	}

}
