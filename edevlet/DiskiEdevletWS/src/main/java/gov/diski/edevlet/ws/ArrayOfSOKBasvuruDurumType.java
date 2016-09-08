package gov.diski.edevlet.ws;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for arrayOfSOKBasvuruDurumType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="arrayOfSOKBasvuruDurumType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SOKBasvuruDurum" type="{http://belediye.turkiye.gov.tr/v2}SOKBasvuruDurumType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "arrayOfSOKBasvuruDurumType", propOrder = { "sokBasvuruDurum" })
public class ArrayOfSOKBasvuruDurumType {

	@XmlElement(name = "SOKBasvuruDurum")
	protected List<SOKBasvuruDurumType> sokBasvuruDurum;

	/**
	 * Gets the value of the sokBasvuruDurum property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a
	 * snapshot. Therefore any modification you make to the returned list will
	 * be present inside the JAXB object. This is why there is not a
	 * <CODE>set</CODE> method for the sokBasvuruDurum property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getSOKBasvuruDurum().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link SOKBasvuruDurumType }
	 * 
	 * 
	 */
	public List<SOKBasvuruDurumType> getSOKBasvuruDurum() {
		if (sokBasvuruDurum == null) {
			sokBasvuruDurum = new ArrayList<SOKBasvuruDurumType>();
		}
		return this.sokBasvuruDurum;
	}

}
