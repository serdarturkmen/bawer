package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfSuFaturaBilgisi complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfSuFaturaBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="suFaturaBilgisi" type="{http://belediye.turkiye.gov.tr/v2}suFaturaBilgisiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSuFaturaBilgisi", propOrder = { "suFaturaBilgisi" })
public class ArrayOfSuFaturaBilgisi {

	protected List<SuFaturaBilgisiType> suFaturaBilgisi;

	/**
	 * Gets the value of the suFaturaBilgisi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the suFaturaBilgisi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSuFaturaBilgisi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SuFaturaBilgisiType }
	 * 
	 * 
	 */
	public List<SuFaturaBilgisiType> getSuFaturaBilgisi() {
		if (suFaturaBilgisi == null) {
			suFaturaBilgisi = new ArrayList<SuFaturaBilgisiType>();
		}
		return this.suFaturaBilgisi;
	}

}
