package gov.diski.edevlet.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for daskKontrolCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="daskKontrolCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daskKontrolCType", propOrder = { "detayListesi" })
public class DaskKontrolCType extends IslemSonucType {

	@XmlElementRef(name = "detayListesi", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<ArrayOfDetailType> detayListesi;

	/**
	 * Gets the value of the detayListesi property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfDetailType }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfDetailType> getDetayListesi() {
		return detayListesi;
	}

	/**
	 * Sets the value of the detayListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfDetailType }{@code >}
	 * 
	 */
	public void setDetayListesi(JAXBElement<ArrayOfDetailType> value) {
		this.detayListesi = ((JAXBElement<ArrayOfDetailType>) value);
	}

}
