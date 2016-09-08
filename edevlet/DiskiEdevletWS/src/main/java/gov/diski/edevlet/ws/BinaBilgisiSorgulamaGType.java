package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for binaBilgisiSorgulamaGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="binaBilgisiSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}sorguParametreType">
 *       &lt;sequence>
 *         &lt;element name="sokakCaddeKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binaBilgisiSorgulamaGType", propOrder = { "sokakCaddeKodu" })
public class BinaBilgisiSorgulamaGType extends SorguParametreType {

	@XmlElement(required = true)
	protected String sokakCaddeKodu;

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

}
