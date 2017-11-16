/*
 * ngDesk_Operations
 * ngDesk_Operations
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Server
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T16:44:12.820Z")
public class Server {
  @SerializedName("ServerId")
  private Integer serverId = null;

  @SerializedName("DisplayServerName")
  private String displayServerName = null;

  public Server serverId(Integer serverId) {
    this.serverId = serverId;
    return this;
  }

   /**
   * Get serverId
   * @return serverId
  **/
  @ApiModelProperty(value = "")
  public Integer getServerId() {
    return serverId;
  }

  public void setServerId(Integer serverId) {
    this.serverId = serverId;
  }

  public Server displayServerName(String displayServerName) {
    this.displayServerName = displayServerName;
    return this;
  }

   /**
   * Get displayServerName
   * @return displayServerName
  **/
  @ApiModelProperty(value = "")
  public String getDisplayServerName() {
    return displayServerName;
  }

  public void setDisplayServerName(String displayServerName) {
    this.displayServerName = displayServerName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Server server = (Server) o;
    return Objects.equals(this.serverId, server.serverId) &&
        Objects.equals(this.displayServerName, server.displayServerName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverId, displayServerName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Server {\n");
    
    sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
    sb.append("    displayServerName: ").append(toIndentedString(displayServerName)).append("\n");
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
