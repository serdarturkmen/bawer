package gov.diski.edevlet.ws;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for barajDolulukBilgisiCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="barajDolulukBilgisiCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="tarih" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="genelDolulukOrani" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="barajListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfBarajBilgisiType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "barajDolulukBilgisiCType", propOrder = { "tarih",
		"genelDolulukOrani", "barajListesi" })
public class BarajDolulukBilgisiCType extends IslemSonucType {

	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar tarih;
	@XmlElement(required = true)
	protected BigDecimal genelDolulukOrani;
	@XmlElement(required = true)
	protected ArrayOfBarajBilgisiType barajListesi;

	/**
	 * Gets the value of the tarih property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getTarih() {
		return tarih;
	}

	/**
	 * Sets the value of the tarih property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setTarih(XMLGregorianCalendar value) {
		this.tarih = value;
	}

	/**
	 * Gets the value of the genelDolulukOrani property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getGenelDolulukOrani() {
		return genelDolulukOrani;
	}

	/**
	 * Sets the value of the genelDolulukOrani property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setGenelDolulukOrani(BigDecimal value) {
		this.genelDolulukOrani = value;
	}

	/**
	 * Gets the value of the barajListesi property.
	 * 
	 * @return possible object is {@link ArrayOfBarajBilgisiType }
	 * 
	 */
	public ArrayOfBarajBilgisiType getBarajListesi() {
		return barajListesi;
	}

	/**
	 * Sets the value of the barajListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link ArrayOfBarajBilgisiType }
	 * 
	 */
	public void setBarajListesi(ArrayOfBarajBilgisiType value) {
		this.barajListesi = value;
	}

}
