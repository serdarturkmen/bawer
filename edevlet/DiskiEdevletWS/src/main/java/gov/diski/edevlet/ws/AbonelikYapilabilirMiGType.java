package gov.diski.edevlet.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abonelikYapilabilirMiGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abonelikYapilabilirMiGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tesisatNumarasi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daireNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nviAdresNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "abonelikYapilabilirMiGType", propOrder = { "aboneNo",
		"tesisatNumarasi", "daireNo", "nviAdresNo" })
public class AbonelikYapilabilirMiGType extends KisiselSorgulamaGType {

	@XmlElementRef(name = "aboneNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> aboneNo;
	@XmlElementRef(name = "tesisatNumarasi", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> tesisatNumarasi;
	@XmlElementRef(name = "daireNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> daireNo;
	@XmlElementRef(name = "nviAdresNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> nviAdresNo;

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

	/**
	 * Gets the value of the tesisatNumarasi property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getTesisatNumarasi() {
		return tesisatNumarasi;
	}

	/**
	 * Sets the value of the tesisatNumarasi property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setTesisatNumarasi(JAXBElement<String> value) {
		this.tesisatNumarasi = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the daireNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getDaireNo() {
		return daireNo;
	}

	/**
	 * Sets the value of the daireNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setDaireNo(JAXBElement<String> value) {
		this.daireNo = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the nviAdresNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getNviAdresNo() {
		return nviAdresNo;
	}

	/**
	 * Sets the value of the nviAdresNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setNviAdresNo(JAXBElement<String> value) {
		this.nviAdresNo = ((JAXBElement<String>) value);
	}

}
