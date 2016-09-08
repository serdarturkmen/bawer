package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for SOKBasvuruDurumType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruDurumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="basvuruNumarasi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="basvuruDurumu">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="kisaBasvuruMetni">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOKBasvuruDurumType", propOrder = { "basvuruTarihi",
		"basvuruNumarasi", "basvuruDurumu", "kisaBasvuruMetni" })
public class SOKBasvuruDurumType {

	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar basvuruTarihi;
	@XmlElement(required = true)
	protected String basvuruNumarasi;
	@XmlElement(required = true)
	protected String basvuruDurumu;
	@XmlElement(required = true)
	protected String kisaBasvuruMetni;

	/**
	 * Gets the value of the basvuruTarihi property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getBasvuruTarihi() {
		return basvuruTarihi;
	}

	/**
	 * Sets the value of the basvuruTarihi property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setBasvuruTarihi(XMLGregorianCalendar value) {
		this.basvuruTarihi = value;
	}

	/**
	 * Gets the value of the basvuruNumarasi property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruNumarasi() {
		return basvuruNumarasi;
	}

	/**
	 * Sets the value of the basvuruNumarasi property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruNumarasi(String value) {
		this.basvuruNumarasi = value;
	}

	/**
	 * Gets the value of the basvuruDurumu property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruDurumu() {
		return basvuruDurumu;
	}

	/**
	 * Sets the value of the basvuruDurumu property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruDurumu(String value) {
		this.basvuruDurumu = value;
	}

	/**
	 * Gets the value of the kisaBasvuruMetni property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getKisaBasvuruMetni() {
		return kisaBasvuruMetni;
	}

	/**
	 * Sets the value of the kisaBasvuruMetni property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setKisaBasvuruMetni(String value) {
		this.kisaBasvuruMetni = value;
	}

}
