package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfGunlukFaaliyet complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfGunlukFaaliyet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="faaliyetBilgisi" type="{http://belediye.turkiye.gov.tr/v2}gunlukFaaliyetType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfGunlukFaaliyet", propOrder = { "faaliyetBilgisi" })
public class ArrayOfGunlukFaaliyet {

	protected List<GunlukFaaliyetType> faaliyetBilgisi;

	/**
	 * Gets the value of the faaliyetBilgisi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the faaliyetBilgisi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getFaaliyetBilgisi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link GunlukFaaliyetType }
	 * 
	 * 
	 */
	public List<GunlukFaaliyetType> getFaaliyetBilgisi() {
		if (faaliyetBilgisi == null) {
			faaliyetBilgisi = new ArrayList<GunlukFaaliyetType>();
		}
		return this.faaliyetBilgisi;
	}

}
