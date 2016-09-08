package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfArizaBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfArizaBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="arizaBilgisi" type="{http://belediye.turkiye.gov.tr/v2}arizaBilgisiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfArizaBilgisiType", propOrder = { "arizaBilgisi" })
public class ArrayOfArizaBilgisiType {

	protected List<ArizaBilgisiType> arizaBilgisi;

	/**
	 * Gets the value of the arizaBilgisi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the arizaBilgisi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getArizaBilgisi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ArizaBilgisiType }
	 * 
	 * 
	 */
	public List<ArizaBilgisiType> getArizaBilgisi() {
		if (arizaBilgisi == null) {
			arizaBilgisi = new ArrayList<ArizaBilgisiType>();
		}
		return this.arizaBilgisi;
	}

}
