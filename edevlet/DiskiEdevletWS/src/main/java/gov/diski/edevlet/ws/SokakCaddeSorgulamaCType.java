package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sokakCaddeSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sokakCaddeSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="sokakCaddeListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfSokakCaddeBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sokakCaddeSorgulamaCType", propOrder = { "sokakCaddeListesi" })
public class SokakCaddeSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfSokakCaddeBilgisiType sokakCaddeListesi;

	/**
	 * Gets the value of the sokakCaddeListesi property.
	 * 
	 * @return possible object is {@link ArrayOfSokakCaddeBilgisiType }
	 * 
	 */
	public ArrayOfSokakCaddeBilgisiType getSokakCaddeListesi() {
		return sokakCaddeListesi;
	}

	/**
	 * Sets the value of the sokakCaddeListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfSokakCaddeBilgisiType }
	 * 
	 */
	public void setSokakCaddeListesi(ArrayOfSokakCaddeBilgisiType value) {
		this.sokakCaddeListesi = value;
	}

}
