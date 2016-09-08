package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for suAnalizParametreType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="suAnalizParametreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="parametreAdi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="parametreBirim">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="parametrelimitTS266">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="parametreLimitSB">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="parametreDeger">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="parametreAciklama">
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
@XmlType(name = "suAnalizParametreType", propOrder = { "parametreAdi",
		"parametreBirim", "parametrelimitTS266", "parametreLimitSB",
		"parametreDeger", "parametreAciklama" })
public class SuAnalizParametreType {

	@XmlElement(required = true)
	protected String parametreAdi;
	@XmlElement(required = true)
	protected String parametreBirim;
	@XmlElement(required = true)
	protected String parametrelimitTS266;
	@XmlElement(required = true)
	protected String parametreLimitSB;
	@XmlElement(required = true)
	protected String parametreDeger;
	@XmlElement(required = true)
	protected String parametreAciklama;

	/**
	 * Gets the value of the parametreAdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParametreAdi() {
		return parametreAdi;
	}

	/**
	 * Sets the value of the parametreAdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParametreAdi(String value) {
		this.parametreAdi = value;
	}

	/**
	 * Gets the value of the parametreBirim property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParametreBirim() {
		return parametreBirim;
	}

	/**
	 * Sets the value of the parametreBirim property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParametreBirim(String value) {
		this.parametreBirim = value;
	}

	/**
	 * Gets the value of the parametrelimitTS266 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParametrelimitTS266() {
		return parametrelimitTS266;
	}

	/**
	 * Sets the value of the parametrelimitTS266 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParametrelimitTS266(String value) {
		this.parametrelimitTS266 = value;
	}

	/**
	 * Gets the value of the parametreLimitSB property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParametreLimitSB() {
		return parametreLimitSB;
	}

	/**
	 * Sets the value of the parametreLimitSB property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParametreLimitSB(String value) {
		this.parametreLimitSB = value;
	}

	/**
	 * Gets the value of the parametreDeger property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParametreDeger() {
		return parametreDeger;
	}

	/**
	 * Sets the value of the parametreDeger property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParametreDeger(String value) {
		this.parametreDeger = value;
	}

	/**
	 * Gets the value of the parametreAciklama property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getParametreAciklama() {
		return parametreAciklama;
	}

	/**
	 * Sets the value of the parametreAciklama property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setParametreAciklama(String value) {
		this.parametreAciklama = value;
	}

}
