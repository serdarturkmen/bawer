package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sokakCaddeSorgulamaGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sokakCaddeSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}sorguParametreType">
 *       &lt;sequence>
 *         &lt;element name="mahalleKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sokakCaddeSorgulamaGType", propOrder = { "mahalleKodu" })
public class SokakCaddeSorgulamaGType extends SorguParametreType {

	@XmlElement(required = true)
	protected String mahalleKodu;

	/**
	 * Gets the value of the mahalleKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMahalleKodu() {
		return mahalleKodu;
	}

	/**
	 * Sets the value of the mahalleKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMahalleKodu(String value) {
		this.mahalleKodu = value;
	}

}
