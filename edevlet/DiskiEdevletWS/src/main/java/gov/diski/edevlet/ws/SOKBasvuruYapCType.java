package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SOKBasvuruYapCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruYapCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="basvuruTakipNo">
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
@XmlType(name = "SOKBasvuruYapCType", propOrder = { "basvuruTakipNo" })
public class SOKBasvuruYapCType extends IslemSonucType {

	@XmlElement(required = true)
	protected String basvuruTakipNo;

	/**
	 * Gets the value of the basvuruTakipNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruTakipNo() {
		return basvuruTakipNo;
	}

	/**
	 * Sets the value of the basvuruTakipNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruTakipNo(String value) {
		this.basvuruTakipNo = value;
	}

}
