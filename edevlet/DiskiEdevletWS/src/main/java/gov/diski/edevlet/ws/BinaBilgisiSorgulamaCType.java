package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for binaBilgisiSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="binaBilgisiSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="binaListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfBinaBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "binaBilgisiSorgulamaCType", propOrder = { "binaListesi" })
public class BinaBilgisiSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfBinaBilgisiType binaListesi;

	/**
	 * Gets the value of the binaListesi property.
	 * 
	 * @return possible object is {@link ArrayOfBinaBilgisiType }
	 * 
	 */
	public ArrayOfBinaBilgisiType getBinaListesi() {
		return binaListesi;
	}

	/**
	 * Sets the value of the binaListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfBinaBilgisiType }
	 * 
	 */
	public void setBinaListesi(ArrayOfBinaBilgisiType value) {
		this.binaListesi = value;
	}

}
