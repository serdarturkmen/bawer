package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for gunlukFaaliyetType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="gunlukFaaliyetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faaliyetTipi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ilce">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="mahalle">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="sokakCadde">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "gunlukFaaliyetType", propOrder = { "faaliyetTipi", "ilce",
		"mahalle", "sokakCadde", "aciklama" })
public class GunlukFaaliyetType {

	@XmlElement(required = true)
	protected String faaliyetTipi;
	@XmlElement(required = true)
	protected String ilce;
	@XmlElement(required = true)
	protected String mahalle;
	@XmlElement(required = true)
	protected String sokakCadde;
	@XmlElement(required = true)
	protected String aciklama;

	/**
	 * Gets the value of the faaliyetTipi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFaaliyetTipi() {
		return faaliyetTipi;
	}

	/**
	 * Sets the value of the faaliyetTipi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFaaliyetTipi(String value) {
		this.faaliyetTipi = value;
	}

	/**
	 * Gets the value of the ilce property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIlce() {
		return ilce;
	}

	/**
	 * Sets the value of the ilce property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIlce(String value) {
		this.ilce = value;
	}

	/**
	 * Gets the value of the mahalle property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMahalle() {
		return mahalle;
	}

	/**
	 * Sets the value of the mahalle property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMahalle(String value) {
		this.mahalle = value;
	}

	/**
	 * Gets the value of the sokakCadde property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSokakCadde() {
		return sokakCadde;
	}

	/**
	 * Sets the value of the sokakCadde property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSokakCadde(String value) {
		this.sokakCadde = value;
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

}
