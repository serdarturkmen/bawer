package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for SOKBasvuruDetaySorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="SOKBasvuruDetaySorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="basvuruNumarasi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="basvuruIstek">
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
 *         &lt;element name="basvuruCevapTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="basvuruCevapMetin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SOKBasvuruDetaySorgulamaCType", propOrder = {
		"basvuruNumarasi", "basvuruTarihi", "basvuruIstek", "basvuruDurumu",
		"basvuruCevapTarihi", "basvuruCevapMetin" })
public class SOKBasvuruDetaySorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected String basvuruNumarasi;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar basvuruTarihi;
	@XmlElement(required = true)
	protected String basvuruIstek;
	@XmlElement(required = true)
	protected String basvuruDurumu;
	@XmlElement(required = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar basvuruCevapTarihi;
	@XmlElement(required = true)
	protected String basvuruCevapMetin;

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
	 * Gets the value of the basvuruIstek property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruIstek() {
		return basvuruIstek;
	}

	/**
	 * Sets the value of the basvuruIstek property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruIstek(String value) {
		this.basvuruIstek = value;
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
	 * Gets the value of the basvuruCevapTarihi property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getBasvuruCevapTarihi() {
		return basvuruCevapTarihi;
	}

	/**
	 * Sets the value of the basvuruCevapTarihi property.
	 * 
	 * @param value
	 *            allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setBasvuruCevapTarihi(XMLGregorianCalendar value) {
		this.basvuruCevapTarihi = value;
	}

	/**
	 * Gets the value of the basvuruCevapMetin property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruCevapMetin() {
		return basvuruCevapMetin;
	}

	/**
	 * Sets the value of the basvuruCevapMetin property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruCevapMetin(String value) {
		this.basvuruCevapMetin = value;
	}

}
