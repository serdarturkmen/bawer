package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for daireBilgisiSorgulamaGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="daireBilgisiSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}sorguParametreType">
 *       &lt;sequence>
 *         &lt;element name="binaKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="adresSiraNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daireBilgisiSorgulamaGType", propOrder = { "binaKodu",
		"adresSiraNo" })
public class DaireBilgisiSorgulamaGType extends SorguParametreType {

	@XmlElement(required = true)
	protected String binaKodu;
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
