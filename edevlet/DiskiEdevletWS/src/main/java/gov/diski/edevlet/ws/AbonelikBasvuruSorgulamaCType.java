package gov.diski.edevlet.ws;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>
 * Java class for AbonelikBasvuruSorgulamaCType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="AbonelikBasvuruSorgulamaCType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="basvuruNumarasi" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basvuruTarihi" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tesisatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kurumAdresNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nviAdresNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="acikadres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="basvuruDurumu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="basvuruCevapTarihi" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="tahakkukTutari" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="basvuruAciklama" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="detayListesi" type="{http://belediye.turkiye.gov.tr/v2}arrayOfDetailType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AbonelikBasvuruSorgulamaCType", propOrder = {
		"basvuruNumarasi", "basvuruTarihi", "aboneNo", "tesisatNo",
		"kurumAdresNo", "nviAdresNo", "acikadres", "basvuruDurumu",
		"basvuruCevapTarihi", "tahakkukTutari", "basvuruAciklama",
		"detayListesi" })
public class AbonelikBasvuruSorgulamaCType extends IslemSonucType {

	@XmlElement(required = true)
	protected String basvuruNumarasi;
	@XmlElement(required = true)
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar basvuruTarihi;
	@XmlElementRef(name = "aboneNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> aboneNo;
	@XmlElementRef(name = "tesisatNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> tesisatNo;
	@XmlElementRef(name = "kurumAdresNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> kurumAdresNo;
	@XmlElementRef(name = "nviAdresNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> nviAdresNo;
	@XmlElementRef(name = "acikadres", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> acikadres;
	@XmlElement(required = true)
	protected String basvuruDurumu;
	@XmlElement(required = true, nillable = true)
	@XmlSchemaType(name = "date")
	protected XMLGregorianCalendar basvuruCevapTarihi;
	@XmlElement(required = true, nillable = true)
	protected BigDecimal tahakkukTutari;
	@XmlElement(required = true)
	protected String basvuruAciklama;
	@XmlElementRef(name = "detayListesi", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<ArrayOfDetailType> detayListesi;

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
	 * Gets the value of the aboneNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getAboneNo() {
		return aboneNo;
	}

	/**
	 * Sets the value of the aboneNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setAboneNo(JAXBElement<String> value) {
		this.aboneNo = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the tesisatNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getTesisatNo() {
		return tesisatNo;
	}

	/**
	 * Sets the value of the tesisatNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setTesisatNo(JAXBElement<String> value) {
		this.tesisatNo = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the kurumAdresNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getKurumAdresNo() {
		return kurumAdresNo;
	}

	/**
	 * Sets the value of the kurumAdresNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setKurumAdresNo(JAXBElement<String> value) {
		this.kurumAdresNo = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the nviAdresNo property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getNviAdresNo() {
		return nviAdresNo;
	}

	/**
	 * Sets the value of the nviAdresNo property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setNviAdresNo(JAXBElement<String> value) {
		this.nviAdresNo = ((JAXBElement<String>) value);
	}

	/**
	 * Gets the value of the acikadres property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}{@link String }
	 *         {@code >}
	 * 
	 */
	public JAXBElement<String> getAcikadres() {
		return acikadres;
	}

	/**
	 * Sets the value of the acikadres property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}{@link String }
	 *            {@code >}
	 * 
	 */
	public void setAcikadres(JAXBElement<String> value) {
		this.acikadres = ((JAXBElement<String>) value);
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
	 * Gets the value of the tahakkukTutari property.
	 * 
	 * @return possible object is {@link BigDecimal }
	 * 
	 */
	public BigDecimal getTahakkukTutari() {
		return tahakkukTutari;
	}

	/**
	 * Sets the value of the tahakkukTutari property.
	 * 
	 * @param value
	 *            allowed object is {@link BigDecimal }
	 * 
	 */
	public void setTahakkukTutari(BigDecimal value) {
		this.tahakkukTutari = value;
	}

	/**
	 * Gets the value of the basvuruAciklama property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBasvuruAciklama() {
		return basvuruAciklama;
	}

	/**
	 * Sets the value of the basvuruAciklama property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBasvuruAciklama(String value) {
		this.basvuruAciklama = value;
	}

	/**
	 * Gets the value of the detayListesi property.
	 * 
	 * @return possible object is {@link JAXBElement }{@code <}
	 *         {@link ArrayOfDetailType }{@code >}
	 * 
	 */
	public JAXBElement<ArrayOfDetailType> getDetayListesi() {
		return detayListesi;
	}

	/**
	 * Sets the value of the detayListesi property.
	 * 
	 * @param value
	 *            allowed object is {@link JAXBElement }{@code <}
	 *            {@link ArrayOfDetailType }{@code >}
	 * 
	 */
	public void setDetayListesi(JAXBElement<ArrayOfDetailType> value) {
		this.detayListesi = ((JAXBElement<ArrayOfDetailType>) value);
	}

}
