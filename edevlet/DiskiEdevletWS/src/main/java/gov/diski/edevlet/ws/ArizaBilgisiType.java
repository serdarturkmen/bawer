package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for arizaBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arizaBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arizaIlce">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="arizaYeri">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="arizaZamani" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="etkilenenYerler">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tahminiOnarimZamani" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
@XmlType(name = "arizaBilgisiType", propOrder = { "arizaIlce", "arizaYeri",
		"arizaZamani", "etkilenenYerler", "tahminiOnarimZamani", "aciklama" })
public class ArizaBilgisiType {

	@XmlElement(required = true)
	protected String arizaIlce;
	@XmlElement(required = true)
	protected String arizaYeri;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar arizaZamani;
	@XmlElement(required = true)
	protected String etkilenenYerler;
	@XmlElement(required = true, nillable = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar tahminiOnarimZamani;
	@XmlElement(required = true)
	protected String aciklama;

	/**
	 * Gets the value of the arizaIlce property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArizaIlce() {
		return arizaIlce;
	}

	/**
	 * Sets the value of the arizaIlce property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArizaIlce(String value) {
		this.arizaIlce = value;
	}

	/**
	 * Gets the value of the arizaYeri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getArizaYeri() {
		return arizaYeri;
	}

	/**
	 * Sets the value of the arizaYeri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setArizaYeri(String value) {
		this.arizaYeri = value;
	}

	/**
	 * Gets the value of the arizaZamani property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getArizaZamani() {
		return arizaZamani;
	}

	/**
	 * Sets the value of the arizaZamani property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setArizaZamani(XMLGregorianCalendar value) {
		this.arizaZamani = value;
	}

	/**
	 * Gets the value of the etkilenenYerler property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEtkilenenYerler() {
		return etkilenenYerler;
	}

	/**
	 * Sets the value of the etkilenenYerler property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEtkilenenYerler(String value) {
		this.etkilenenYerler = value;
	}

	/**
	 * Gets the value of the tahminiOnarimZamani property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTahminiOnarimZamani() {
		return tahminiOnarimZamani;
	}

	/**
	 * Sets the value of the tahminiOnarimZamani property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTahminiOnarimZamani(XMLGregorianCalendar value) {
		this.tahminiOnarimZamani = value;
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
