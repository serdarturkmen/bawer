package gov.diski.edevlet.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for abonelikBasvuruGType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="abonelikBasvuruGType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}kisiselSorgulamaGType">
 *       &lt;sequence>
 *         &lt;element name="aboneNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tesisatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="kurumAdresNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nviAdresNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="daskPoliceNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="daskKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mulkSahibiTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dosya" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="telefon" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="eposta" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "abonelikBasvuruGType", propOrder = { "aboneNo", "tesisatNo",
		"kurumAdresNo", "nviAdresNo", "daskPoliceNo", "daskKimlikNo",
		"mulkSahibiTCKimlikNo", "dosya", "telefon", "eposta", "detayListesi" })
public class AbonelikBasvuruGType extends KisiselSorgulamaGType {

	@XmlElementRef(name = "aboneNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> aboneNo;
	@XmlElementRef(name = "tesisatNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> tesisatNo;
	@XmlElementRef(name = "kurumAdresNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> kurumAdresNo;
	@XmlElementRef(name = "nviAdresNo", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<String> nviAdresNo;
	@XmlElement(required = true)
	protected String daskPoliceNo;
	@XmlElement(required = true)
	protected String daskKimlikNo;
	@XmlElement(required = true)
	protected String mulkSahibiTCKimlikNo;
	@XmlElement(required = true, nillable = true)
	protected byte[] dosya;
	@XmlElement(required = true)
	protected String telefon;
	@XmlElement(required = true)
	protected String eposta;
	@XmlElementRef(name = "detayListesi", namespace = "http://belediye.turkiye.gov.tr/v2", type = JAXBElement.class)
	protected JAXBElement<ArrayOfDetailType> detayListesi;

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
	 * Gets the value of the daskPoliceNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDaskPoliceNo() {
		return daskPoliceNo;
	}

	/**
	 * Sets the value of the daskPoliceNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDaskPoliceNo(String value) {
		this.daskPoliceNo = value;
	}

	/**
	 * Gets the value of the daskKimlikNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDaskKimlikNo() {
		return daskKimlikNo;
	}

	/**
	 * Sets the value of the daskKimlikNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDaskKimlikNo(String value) {
		this.daskKimlikNo = value;
	}

	/**
	 * Gets the value of the mulkSahibiTCKimlikNo property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMulkSahibiTCKimlikNo() {
		return mulkSahibiTCKimlikNo;
	}

	/**
	 * Sets the value of the mulkSahibiTCKimlikNo property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMulkSahibiTCKimlikNo(String value) {
		this.mulkSahibiTCKimlikNo = value;
	}

	/**
	 * Gets the value of the dosya property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getDosya() {
		return dosya;
	}

	/**
	 * Sets the value of the dosya property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setDosya(byte[] value) {
		this.dosya = ((byte[]) value);
	}

	/**
	 * Gets the value of the telefon property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTelefon() {
		return telefon;
	}

	/**
	 * Sets the value of the telefon property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setTelefon(String value) {
		this.telefon = value;
	}

	/**
	 * Gets the value of the eposta property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getEposta() {
		return eposta;
	}

	/**
	 * Sets the value of the eposta property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setEposta(String value) {
		this.eposta = value;
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
