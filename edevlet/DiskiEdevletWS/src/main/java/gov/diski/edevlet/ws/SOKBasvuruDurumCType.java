package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for SOKBasvuruDurumCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruDurumCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="SOKBasvuruDurumListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfSOKBasvuruDurumType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOKBasvuruDurumCType", propOrder = { "sokBasvuruDurumListesi" })
public class SOKBasvuruDurumCType extends IslemSonucType {

	@XmlElement(name = "SOKBasvuruDurumListesi", required = true)
	protected ArrayOfSOKBasvuruDurumType sokBasvuruDurumListesi;

	/**
	 * Gets the value of the sokBasvuruDurumListesi property.
	 * 
	 * @return possible object is {@link ArrayOfSOKBasvuruDurumType }
	 * 
	 */
	public ArrayOfSOKBasvuruDurumType getSOKBasvuruDurumListesi() {
		return sokBasvuruDurumListesi;
	}

	/**
	 * Sets the value of the sokBasvuruDurumListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfSOKBasvuruDurumType }
	 * 
	 */
	public void setSOKBasvuruDurumListesi(ArrayOfSOKBasvuruDurumType value) {
		this.sokBasvuruDurumListesi = value;
	}

}
