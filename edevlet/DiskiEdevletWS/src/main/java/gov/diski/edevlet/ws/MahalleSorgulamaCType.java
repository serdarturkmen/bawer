package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for mahalleSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="mahalleSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="mahalleListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfMahalleBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "mahalleSorgulamaCType", propOrder = { "mahalleListesi" })
public class MahalleSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfMahalleBilgisiType mahalleListesi;

	/**
	 * Gets the value of the mahalleListesi property.
	 * 
	 * @return possible object is {@link ArrayOfMahalleBilgisiType }
	 * 
	 */
	public ArrayOfMahalleBilgisiType getMahalleListesi() {
		return mahalleListesi;
	}

	/**
	 * Sets the value of the mahalleListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfMahalleBilgisiType }
	 * 
	 */
	public void setMahalleListesi(ArrayOfMahalleBilgisiType value) {
		this.mahalleListesi = value;
	}

}
