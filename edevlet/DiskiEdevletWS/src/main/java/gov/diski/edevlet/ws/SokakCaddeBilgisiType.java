package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sokakCaddeBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sokakCaddeBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sokakCaddeKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sokakCaddeAdi">
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
@XmlType(name = "sokakCaddeBilgisiType", propOrder = { "sokakCaddeKodu",
		"sokakCaddeAdi" })
public class SokakCaddeBilgisiType {

	@XmlElement(required = true)
	protected String sokakCaddeKodu;
	@XmlElement(required = true)
	protected String sokakCaddeAdi;

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
	 * Gets the value of the sokakCaddeAdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSokakCaddeAdi() {
		return sokakCaddeAdi;
	}

	/**
	 * Sets the value of the sokakCaddeAdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSokakCaddeAdi(String value) {
		this.sokakCaddeAdi = value;
	}

}
