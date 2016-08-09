
package epost;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
    "TargetID",
    "Source",
    "PublicationID"
})
public class Epost {

    @JsonProperty("TargetID")
    private String TargetID;
    @JsonProperty("Source")
    private String Source;
    @JsonProperty("PublicationID")
    private int PublicationID;

    /**
     * 
     * @return
     *     The TargetID
     */
    @JsonProperty("TargetID")
    public String getTargetID() {
        return TargetID;
    }

    /**
     * 
     * @param TargetID
     *     The TargetID
     */
    @JsonProperty("TargetID")
    public void setTargetID(String TargetID) {
        this.TargetID = TargetID;
    }

    /**
     * 
     * @return
     *     The Source
     */
    @JsonProperty("Source")
    public String getSource() {
        return Source;
    }

    /**
     * 
     * @param Source
     *     The Source
     */
    @JsonProperty("Source")
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 
     * @return
     *     The PublicationID
     */
    @JsonProperty("PublicationID")
    public int getPublicationID() {
        return PublicationID;
    }

    /**
     * 
     * @param PublicationID
     *     The PublicationID
     */
    @JsonProperty("PublicationID")
    public void setPublicationID(int PublicationID) {
        this.PublicationID = PublicationID;
    }

}
