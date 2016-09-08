package gov.diski.edevlet.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sozlesmeIndirGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sozlesmeIndirGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="basvuruNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sozlesmeIndirGType", propOrder = { "basvuruNo", "aboneNo" })
public class SozlesmeIndirGType extends KisiselSorgulamaGType {

	@XmlElement(required = true)
	protected String basvuruNo;
	@XmlElementRef(name = "aboneNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> aboneNo;

	/**
	 * Gets the value of the basvuruNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruNo() {
		return basvuruNo;
	}

	/**
	 * Sets the value of the basvuruNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruNo(String value) {
		this.basvuruNo = value;
	}

	/**
	 * Gets the value of the aboneNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getAboneNo() {
		return aboneNo;
	}

	/**
	 * Sets the value of the aboneNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setAboneNo(JAXBElement<String> value) {
		this.aboneNo = ((JAXBElement<String>) value);
	}

}
