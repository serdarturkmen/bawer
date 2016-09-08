package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for ilceBilgisiSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="ilceBilgisiSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="ilceListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfIlceBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilceBilgisiSorgulamaCType", propOrder = { "ilceListesi" })
public class IlceBilgisiSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfIlceBilgisiType ilceListesi;

	/**
	 * Gets the value of the ilceListesi property.
	 * 
	 * @return possible object is {@link ArrayOfIlceBilgisiType }
	 * 
	 */
	public ArrayOfIlceBilgisiType getIlceListesi() {
		return ilceListesi;
	}

	/**
	 * Sets the value of the ilceListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfIlceBilgisiType }
	 * 
	 */
	public void setIlceListesi(ArrayOfIlceBilgisiType value) {
		this.ilceListesi = value;
	}

}
