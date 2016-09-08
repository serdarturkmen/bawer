package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfSuAboneBilgisi complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfSuAboneBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suAboneBilgisi" type="{http://belediye.turkiye.gov.tr/v2}suAboneBilgisiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSuAboneBilgisi", propOrder = { "suAboneBilgisi" })
public class ArrayOfSuAboneBilgisi {

	protected List<SuAboneBilgisiType> suAboneBilgisi;

	/**
	 * Gets the value of the suAboneBilgisi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the suAboneBilgisi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSuAboneBilgisi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SuAboneBilgisiType }
	 * 
	 * 
	 */
	public List<SuAboneBilgisiType> getSuAboneBilgisi() {
		if (suAboneBilgisi == null) {
			suAboneBilgisi = new ArrayList<SuAboneBilgisiType>();
		}
		return this.suAboneBilgisi;
	}

}
