package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SOKBasvuruDetaySorgulaGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruDetaySorgulaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="basvuruNumarasi">
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
@XmlType(name = "SOKBasvuruDetaySorgulaGType", propOrder = { "basvuruNumarasi" })
public class SOKBasvuruDetaySorgulaGType extends KisiselSorgulamaGType {

	@XmlElement(required = true)
	protected String basvuruNumarasi;

	/**
	 * Gets the value of the basvuruNumarasi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruNumarasi() {
		return basvuruNumarasi;
	}

	/**
	 * Sets the value of the basvuruNumarasi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruNumarasi(String value) {
		this.basvuruNumarasi = value;
	}

}
