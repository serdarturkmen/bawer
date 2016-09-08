package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SOKTipiBilgisiCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKTipiBilgisiCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="SOKTipiListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfSOKTipiBilgisi"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOKTipiBilgisiCType", propOrder = { "sokTipiListesi" })
public class SOKTipiBilgisiCType extends IslemSonucType {

	@XmlElement(name = "SOKTipiListesi", required = true)
	protected ArrayOfSOKTipiBilgisi sokTipiListesi;

	/**
	 * Gets the value of the sokTipiListesi property.
	 * 
	 * @return possible object is {@link ArrayOfSOKTipiBilgisi }
	 * 
	 */
	public ArrayOfSOKTipiBilgisi getSOKTipiListesi() {
		return sokTipiListesi;
	}

	/**
	 * Sets the value of the sokTipiListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfSOKTipiBilgisi }
	 * 
	 */
	public void setSOKTipiListesi(ArrayOfSOKTipiBilgisi value) {
		this.sokTipiListesi = value;
	}

}
