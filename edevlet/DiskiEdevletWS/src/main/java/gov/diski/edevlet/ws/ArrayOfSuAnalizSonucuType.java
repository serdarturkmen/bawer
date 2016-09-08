package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfSuAnalizSonucuType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfSuAnalizSonucuType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="analizSonucListesi" type="{http://belediye.turkiye.gov.tr/v2}suAnalizSonucuType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSuAnalizSonucuType", propOrder = { "analizSonucListesi" })
public class ArrayOfSuAnalizSonucuType {

	protected List<SuAnalizSonucuType> analizSonucListesi;

	/**
	 * Gets the value of the analizSonucListesi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the analizSonucListesi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAnalizSonucListesi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SuAnalizSonucuType }
	 * 
	 * 
	 */
	public List<SuAnalizSonucuType> getAnalizSonucListesi() {
		if (analizSonucListesi == null) {
			analizSonucListesi = new ArrayList<SuAnalizSonucuType>();
		}
		return this.analizSonucListesi;
	}

}
