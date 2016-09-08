package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SOKBasvuruYapGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruYapGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="basvuruBilgileri" type="{http://belediye.turkiye.gov.tr/v2}SOKBasvuruType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOKBasvuruYapGType", propOrder = { "basvuruBilgileri" })
public class SOKBasvuruYapGType extends KisiselSorgulamaGType {

	@XmlElement(required = true)
	protected SOKBasvuruType basvuruBilgileri;

	/**
	 * Gets the value of the basvuruBilgileri property.
	 * 
	 * @return possible object is {@link SOKBasvuruType }
	 * 
	 */
	public SOKBasvuruType getBasvuruBilgileri() {
		return basvuruBilgileri;
	}

	/**
	 * Sets the value of the basvuruBilgileri property.
	 * 
	 * @param value
	 *            allowed object is {@link SOKBasvuruType }
	 * 
	 */
	public void setBasvuruBilgileri(SOKBasvuruType value) {
		this.basvuruBilgileri = value;
	}

}
