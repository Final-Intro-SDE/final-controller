
package final1.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getGolByPidTid complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getGolByPidTid">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tid" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getGolByPidTid", propOrder = {
    "pid",
    "tid"
})
public class GetGolByPidTid {

    protected int pid;
    protected int tid;

    /**
     * Gets the value of the pid property.
     * 
     */
    public int getPid() {
        return pid;
    }

    /**
     * Sets the value of the pid property.
     * 
     */
    public void setPid(int value) {
        this.pid = value;
    }

    /**
     * Gets the value of the tid property.
     * 
     */
    public int getTid() {
        return tid;
    }

    /**
     * Sets the value of the tid property.
     * 
     */
    public void setTid(int value) {
        this.tid = value;
    }

}
