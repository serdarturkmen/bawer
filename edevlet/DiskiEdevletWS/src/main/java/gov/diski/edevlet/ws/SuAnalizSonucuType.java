package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for suAnalizSonucuType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="suAnalizSonucuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numuneYeri">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="analizTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="laboratuvarBilgisi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="analizDegerleri" type="{http://belediye.turkiye.gov.tr/v2}arrayOfSuAnalizParametreType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suAnalizSonucuType", propOrder = { "numuneYeri",
		"analizTarihi", "laboratuvarBilgisi", "analizDegerleri" })
public class SuAnalizSonucuType {

	@XmlElement(required = true)
	protected String numuneYeri;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar analizTarihi;
	@XmlElement(required = true)
	protected String laboratuvarBilgisi;
	@XmlElement(required = true)
	protected ArrayOfSuAnalizParametreType analizDegerleri;

	/**
	 * Gets the value of the numuneYeri property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNumuneYeri() {
		return numuneYeri;
	}

	/**
	 * Sets the value of the numuneYeri property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setNumuneYeri(String value) {
		this.numuneYeri = value;
	}

	/**
	 * Gets the value of the analizTarihi property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getAnalizTarihi() {
		return analizTarihi;
	}

	/**
	 * Sets the value of the analizTarihi property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setAnalizTarihi(XMLGregorianCalendar value) {
		this.analizTarihi = value;
	}

	/**
	 * Gets the value of the laboratuvarBilgisi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLaboratuvarBilgisi() {
		return laboratuvarBilgisi;
	}

	/**
	 * Sets the value of the laboratuvarBilgisi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLaboratuvarBilgisi(String value) {
		this.laboratuvarBilgisi = value;
	}

	/**
	 * Gets the value of the analizDegerleri property.
	 * 
	 * @return possible object is {@link ArrayOfSuAnalizParametreType }
	 * 
	 */
	public ArrayOfSuAnalizParametreType getAnalizDegerleri() {
		return analizDegerleri;
	}

	/**
	 * Sets the value of the analizDegerleri property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfSuAnalizParametreType }
	 * 
	 */
	public void setAnalizDegerleri(ArrayOfSuAnalizParametreType value) {
		this.analizDegerleri = value;
	}

}
