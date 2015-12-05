
package AnswerWS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for insertAnswerResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="insertAnswerResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NewAnswer" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insertAnswerResponse", propOrder = {
    "newAnswer"
})
public class InsertAnswerResponse {

    @XmlElement(name = "NewAnswer")
    protected int newAnswer;

    /**
     * Gets the value of the newAnswer property.
     * 
     */
    public int getNewAnswer() {
        return newAnswer;
    }

    /**
     * Sets the value of the newAnswer property.
     * 
     */
    public void setNewAnswer(int value) {
        this.newAnswer = value;
    }

}
