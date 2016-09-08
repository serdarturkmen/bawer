package gov.diski.edevlet.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for sozlesmeIndirCtype complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="sozlesmeIndirCtype">
 *   &lt;complexContent>
 *     &lt;extension base="{http://belediye.turkiye.gov.tr/v2}islemSonucType">
 *       &lt;sequence>
 *         &lt;element name="sozlesmeDosya" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sozlesmeIndirCtype", propOrder = { "sozlesmeDosya" })
public class SozlesmeIndirCtype extends IslemSonucType {

	@XmlElement(required = true, nillable = true)
	protected byte[] sozlesmeDosya;

	/**
	 * Gets the value of the sozlesmeDosya property.
	 * 
	 * @return possible object is byte[]
	 */
	public byte[] getSozlesmeDosya() {
		return sozlesmeDosya;
	}

	/**
	 * Sets the value of the sozlesmeDosya property.
	 * 
	 * @param value
	 *            allowed object is byte[]
	 */
	public void setSozlesmeDosya(byte[] value) {
		this.sozlesmeDosya = ((byte[]) value);
	}

}
