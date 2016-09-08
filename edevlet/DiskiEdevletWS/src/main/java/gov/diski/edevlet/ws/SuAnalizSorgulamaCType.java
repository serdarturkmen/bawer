package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for suAnalizSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="suAnalizSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="analizListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfSuAnalizSonucuType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suAnalizSorgulamaCType", propOrder = { "analizListesi" })
public class SuAnalizSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected ArrayOfSuAnalizSonucuType analizListesi;

	/**
	 * Gets the value of the analizListesi property.
	 * 
	 * @return possible object is {@link ArrayOfSuAnalizSonucuType }
	 * 
	 */
	public ArrayOfSuAnalizSonucuType getAnalizListesi() {
		return analizListesi;
	}

	/**
	 * Sets the value of the analizListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfSuAnalizSonucuType }
	 * 
	 */
	public void setAnalizListesi(ArrayOfSuAnalizSonucuType value) {
		this.analizListesi = value;
	}

}
