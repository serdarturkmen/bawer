package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for suAnalizDokumanIndirCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="suAnalizDokumanIndirCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="analizAciklama">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="analizDokumanTipi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="analizDokuman" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suAnalizDokumanIndirCType", propOrder = { "analizAciklama",
		"analizDokumanTipi", "analizDokuman" })
public class SuAnalizDokumanIndirCType extends IslemSonucType {

	@XmlElement(required = true)
	protected String analizAciklama;
	@XmlElement(required = true)
	protected String analizDokumanTipi;
	@XmlElement(required = true)
	protected byte[] analizDokuman;

	/**
	 * Gets the value of the analizAciklama property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnalizAciklama() {
		return analizAciklama;
	}

	/**
	 * Sets the value of the analizAciklama property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAnalizAciklama(String value) {
		this.analizAciklama = value;
	}

	/**
	 * Gets the value of the analizDokumanTipi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAnalizDokumanTipi() {
		return analizDokumanTipi;
	}

	/**
	 * Sets the value of the analizDokumanTipi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAnalizDokumanTipi(String value) {
		this.analizDokumanTipi = value;
	}

	/**
	 * Gets the value of the analizDokuman property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getAnalizDokuman() {
		return analizDokuman;
	}

	/**
	 * Sets the value of the analizDokuman property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setAnalizDokuman(byte[] value) {
		this.analizDokuman = ((byte[]) value);
	}

}
