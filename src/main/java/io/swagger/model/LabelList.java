package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Label;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * List of labels
 */
@ApiModel(description = "List of labels")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-11-03T12:15:20.805-05:00")

public class LabelList  implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("Label")
  private List<Label> label = null;

  public LabelList label(List<Label> label) {
    this.label = label;
    return this;
  }

  public LabelList addLabelItem(Label labelItem) {
    if (this.label == null) {
      this.label = new ArrayList<Label>();
    }
    this.label.add(labelItem);
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Label> getLabel() {
    return label;
  }

  public void setLabel(List<Label> label) {
    this.label = label;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelList labelList = (LabelList) o;
    return Objects.equals(this.label, labelList.label);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelList {\n");
    
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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

