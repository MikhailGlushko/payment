
package au.com.payments.validation.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FinInstnId"
})
public class CdtrAgt {

    @JsonProperty("FinInstnId")
    private FinInstnId___ finInstnId;

    @JsonProperty("FinInstnId")
    public FinInstnId___ getFinInstnId() {
        return finInstnId;
    }

    @JsonProperty("FinInstnId")
    public void setFinInstnId(FinInstnId___ finInstnId) {
        this.finInstnId = finInstnId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("finInstnId", finInstnId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(finInstnId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CdtrAgt) == false) {
            return false;
        }
        CdtrAgt rhs = ((CdtrAgt) other);
        return new EqualsBuilder().append(finInstnId, rhs.finInstnId).isEquals();
    }

}
