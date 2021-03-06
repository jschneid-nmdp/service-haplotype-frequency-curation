package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ScopeElement;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ScopeData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-03T12:15:20.805-05:00")

public class ScopeData  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ScopeElement")
  private List<ScopeElement> scopeElement = new ArrayList<ScopeElement>();

  public ScopeData scopeElement(List<ScopeElement> scopeElement) {
    this.scopeElement = scopeElement;
    return this;
  }

  public ScopeData addScopeElementItem(ScopeElement scopeElementItem) {
    this.scopeElement.add(scopeElementItem);
    return this;
  }

   /**
   * Additional Information on genotype
   * @return scopeElement
  **/
  @ApiModelProperty(required = true, value = "Additional Information on genotype")
  @NotNull

  @Valid

  public List<ScopeElement> getScopeElement() {
    return scopeElement;
  }

  public void setScopeElement(List<ScopeElement> scopeElement) {
    this.scopeElement = scopeElement;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScopeData scopeData = (ScopeData) o;
    return Objects.equals(this.scopeElement, scopeData.scopeElement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scopeElement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScopeData {\n");
    
    sb.append("    scopeElement: ").append(toIndentedString(scopeElement)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

