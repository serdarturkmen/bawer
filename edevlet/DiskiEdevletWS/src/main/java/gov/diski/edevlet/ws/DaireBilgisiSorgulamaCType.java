package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for daireBilgisiSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="daireBilgisiSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="daireListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfDaireBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "daireBilgisiSorgulamaCType", propOrder = { "daireListesi" })
public class DaireBilgisiSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfDaireBilgisiType daireListesi;

	/**
	 * Gets the value of the daireListesi property.
	 * 
	 * @return possible object is {@link ArrayOfDaireBilgisiType }
	 * 
	 */
	public ArrayOfDaireBilgisiType getDaireListesi() {
		return daireListesi;
	}

	/**
	 * Sets the value of the daireListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfDaireBilgisiType }
	 * 
	 */
	public void setDaireListesi(ArrayOfDaireBilgisiType value) {
		this.daireListesi = value;
	}

}
