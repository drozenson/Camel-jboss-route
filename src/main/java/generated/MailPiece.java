
package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TargetID">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PublicationName">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="PublicationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Payment">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="TotalDue" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="LatePaymentAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *                   &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Source">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Inline" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="Ref" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Shared" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *       &lt;attribute name="AccessibleDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "targetID",
    "description",
    "publicationName",
    "payment",
    "source"
})
@XmlRootElement(name = "MailPiece")
public class MailPiece {

    @XmlElement(name = "TargetID", required = true)
    protected MailPiece.TargetID targetID;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "PublicationName", required = true)
    protected MailPiece.PublicationName publicationName;
    @XmlElement(name = "Payment", required = true)
    protected MailPiece.Payment payment;
    @XmlElement(name = "Source", required = true)
    protected MailPiece.Source source;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "Shared")
    protected Byte shared;
    @XmlAttribute(name = "AccessibleDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar accessibleDate;

    /**
     * Gets the value of the targetID property.
     * 
     * @return
     *     possible object is
     *     {@link MailPiece.TargetID }
     *     
     */
    public MailPiece.TargetID getTargetID() {
        return targetID;
    }

    /**
     * Sets the value of the targetID property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailPiece.TargetID }
     *     
     */
    public void setTargetID(MailPiece.TargetID value) {
        this.targetID = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the publicationName property.
     * 
     * @return
     *     possible object is
     *     {@link MailPiece.PublicationName }
     *     
     */
    public MailPiece.PublicationName getPublicationName() {
        return publicationName;
    }

    /**
     * Sets the value of the publicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailPiece.PublicationName }
     *     
     */
    public void setPublicationName(MailPiece.PublicationName value) {
        this.publicationName = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link MailPiece.Payment }
     *     
     */
    public MailPiece.Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailPiece.Payment }
     *     
     */
    public void setPayment(MailPiece.Payment value) {
        this.payment = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link MailPiece.Source }
     *     
     */
    public MailPiece.Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link MailPiece.Source }
     *     
     */
    public void setSource(MailPiece.Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the shared property.
     * 
     * @return
     *     possible object is
     *     {@link Byte }
     *     
     */
    public Byte getShared() {
        return shared;
    }

    /**
     * Sets the value of the shared property.
     * 
     * @param value
     *     allowed object is
     *     {@link Byte }
     *     
     */
    public void setShared(Byte value) {
        this.shared = value;
    }

    /**
     * Gets the value of the accessibleDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccessibleDate() {
        return accessibleDate;
    }

    /**
     * Sets the value of the accessibleDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccessibleDate(XMLGregorianCalendar value) {
        this.accessibleDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="TotalDue" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="LatePaymentAmount" type="{http://www.w3.org/2001/XMLSchema}float"/>
     *         &lt;element name="DueDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "accountNumber",
        "totalDue",
        "latePaymentAmount",
        "dueDate"
    })
    public static class Payment {

        @XmlElement(name = "AccountNumber")
        protected long accountNumber;
        @XmlElement(name = "TotalDue")
        protected float totalDue;
        @XmlElement(name = "LatePaymentAmount")
        protected float latePaymentAmount;
        @XmlElement(name = "DueDate", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dueDate;

        /**
         * Gets the value of the accountNumber property.
         * 
         */
        public long getAccountNumber() {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         * 
         */
        public void setAccountNumber(long value) {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the totalDue property.
         * 
         */
        public float getTotalDue() {
            return totalDue;
        }

        /**
         * Sets the value of the totalDue property.
         * 
         */
        public void setTotalDue(float value) {
            this.totalDue = value;
        }

        /**
         * Gets the value of the latePaymentAmount property.
         * 
         */
        public float getLatePaymentAmount() {
            return latePaymentAmount;
        }

        /**
         * Sets the value of the latePaymentAmount property.
         * 
         */
        public void setLatePaymentAmount(float value) {
            this.latePaymentAmount = value;
        }

        /**
         * Gets the value of the dueDate property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDueDate() {
            return dueDate;
        }

        /**
         * Sets the value of the dueDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDueDate(XMLGregorianCalendar value) {
            this.dueDate = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="PublicationID" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class PublicationName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "PublicationID")
        protected String publicationID;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the publicationID property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public String getPublicationID() {
            return publicationID;
        }

        /**
         * Sets the value of the publicationID property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setPublicationID(String value) {
            this.publicationID = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Inline" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="Ref" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Source {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "Inline")
        protected Byte inline;
        @XmlAttribute(name = "Ref")
        protected String ref;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * Gets the value of the inline property.
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getInline() {
            return inline;
        }

        /**
         * Sets the value of the inline property.
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setInline(Byte value) {
            this.inline = value;
        }

        /**
         * Gets the value of the ref property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRef() {
            return ref;
        }

        /**
         * Sets the value of the ref property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRef(String value) {
            this.ref = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>long">
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TargetID {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * Gets the value of the value property.
         * 
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
