package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for mahalleSorgulamaGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="mahalleSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}sorguParametreType">
 *       &lt;sequence>
 *         &lt;element name="ilceKodu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mahalleSorgulamaGType", propOrder = { "ilceKodu" })
public class MahalleSorgulamaGType extends SorguParametreType {

	@XmlElement(required = true)
	protected String ilceKodu;

	/**
	 * Gets the value of the ilceKodu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getIlceKodu() {
		return ilceKodu;
	}

	/**
	 * Sets the value of the ilceKodu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setIlceKodu(String value) {
		this.ilceKodu = value;
	}

}
