package gov.diski.edevlet.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for barajBilgiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="barajBilgiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="barajAdi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="barajKapasite">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="barajDolulukOran" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="barajAciklama">
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
@XmlType(name = "barajBilgiType", propOrder = { "barajAdi", "barajKapasite",
		"barajDolulukOran", "barajAciklama" })
public class BarajBilgiType {

	@XmlElement(required = true)
	protected String barajAdi;
	@XmlElement(required = true)
	protected String barajKapasite;
	@XmlElement(required = true)
	protected BigDecimal barajDolulukOran;
	@XmlElement(required = true)
	protected String barajAciklama;

	/**
	 * Gets the value of the barajAdi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBarajAdi() {
		return barajAdi;
	}

	/**
	 * Sets the value of the barajAdi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBarajAdi(String value) {
		this.barajAdi = value;
	}

	/**
	 * Gets the value of the barajKapasite property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBarajKapasite() {
		return barajKapasite;
	}

	/**
	 * Sets the value of the barajKapasite property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBarajKapasite(String value) {
		this.barajKapasite = value;
	}

	/**
	 * Gets the value of the barajDolulukOran property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getBarajDolulukOran() {
		return barajDolulukOran;
	}

	/**
	 * Sets the value of the barajDolulukOran property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setBarajDolulukOran(BigDecimal value) {
		this.barajDolulukOran = value;
	}

	/**
	 * Gets the value of the barajAciklama property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBarajAciklama() {
		return barajAciklama;
	}

	/**
	 * Sets the value of the barajAciklama property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBarajAciklama(String value) {
		this.barajAciklama = value;
	}

}
