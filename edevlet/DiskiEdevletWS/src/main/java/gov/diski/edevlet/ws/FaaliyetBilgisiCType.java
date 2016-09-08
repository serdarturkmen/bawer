package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for faaliyetBilgisiCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="faaliyetBilgisiCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="faaliyetListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfGunlukFaaliyet"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faaliyetBilgisiCType", propOrder = { "faaliyetListesi" })
public class FaaliyetBilgisiCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfGunlukFaaliyet faaliyetListesi;

	/**
	 * Gets the value of the faaliyetListesi property.
	 * 
	 * @return possible object is {@link ArrayOfGunlukFaaliyet }
	 * 
	 */
	public ArrayOfGunlukFaaliyet getFaaliyetListesi() {
		return faaliyetListesi;
	}

	/**
	 * Sets the value of the faaliyetListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfGunlukFaaliyet }
	 * 
	 */
	public void setFaaliyetListesi(ArrayOfGunlukFaaliyet value) {
		this.faaliyetListesi = value;
	}

}
