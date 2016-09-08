package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arizaBilgisiCtype complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arizaBilgisiCtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="arizaListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfArizaBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arizaBilgisiCtype", propOrder = { "arizaListesi" })
public class ArizaBilgisiCtype extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfArizaBilgisiType arizaListesi;

	/**
	 * Gets the value of the arizaListesi property.
	 * 
	 * @return possible object is {@link ArrayOfArizaBilgisiType }
	 * 
	 */
	public ArrayOfArizaBilgisiType getArizaListesi() {
		return arizaListesi;
	}

	/**
	 * Sets the value of the arizaListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfArizaBilgisiType }
	 * 
	 */
	public void setArizaListesi(ArrayOfArizaBilgisiType value) {
		this.arizaListesi = value;
	}

}
