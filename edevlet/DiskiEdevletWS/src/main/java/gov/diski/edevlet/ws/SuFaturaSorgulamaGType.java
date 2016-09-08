package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for suFaturaSorgulamaGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="suFaturaSorgulamaGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="aboneNo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="yil">
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
@XmlType(name = "suFaturaSorgulamaGType", propOrder = { "aboneNo", "yil" })
public class SuFaturaSorgulamaGType extends KisiselSorgulamaGType {

	@XmlElement(required = true)
	protected String aboneNo;
	@XmlElement(required = true)
	protected String yil;

	/**
	 * Gets the value of the aboneNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getAboneNo() {
		return aboneNo;
	}

	/**
	 * Sets the value of the aboneNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setAboneNo(String value) {
		this.aboneNo = value;
	}

	/**
	 * Gets the value of the yil property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getYil() {
		return yil;
	}

	/**
	 * Sets the value of the yil property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setYil(String value) {
		this.yil = value;
	}

}
