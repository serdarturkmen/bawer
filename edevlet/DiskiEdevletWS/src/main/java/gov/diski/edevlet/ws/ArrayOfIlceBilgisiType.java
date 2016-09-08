package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfIlceBilgisiType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfIlceBilgisiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ilceBilgisi" type="{http://belediye.turkiye.gov.tr/v2}ilceBilgisiType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfIlceBilgisiType", propOrder = { "ilceBilgisi" })
public class ArrayOfIlceBilgisiType {

	protected List<IlceBilgisiType> ilceBilgisi;

	/**
	 * Gets the value of the ilceBilgisi property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the ilceBilgisi property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIlceBilgisi().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link IlceBilgisiType }
	 * 
	 * 
	 */
	public List<IlceBilgisiType> getIlceBilgisi() {
		if (ilceBilgisi == null) {
			ilceBilgisi = new ArrayList<IlceBilgisiType>();
		}
		return this.ilceBilgisi;
	}

}
