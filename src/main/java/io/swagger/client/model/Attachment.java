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
 * Attachment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-16T16:44:12.820Z")
public class Attachment {
  @SerializedName("FILE_NAME")
  private String FILE_NAME = null;

  @SerializedName("FILE_EXTENSION")
  private String FILE_EXTENSION = null;

  @SerializedName("FILE")
  private String FILE = null;

  @SerializedName("TICKET_ATTACHMENT_UUID")
  private Integer TICKET_ATTACHMENT_UUID = null;

  @SerializedName("COMPANY_ID")
  private String COMPANY_ID = null;

  public Attachment FILE_NAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
    return this;
  }

   /**
   * Get FILE_NAME
   * @return FILE_NAME
  **/
  @ApiModelProperty(value = "")
  public String getFILENAME() {
    return FILE_NAME;
  }

  public void setFILENAME(String FILE_NAME) {
    this.FILE_NAME = FILE_NAME;
  }

  public Attachment FILE_EXTENSION(String FILE_EXTENSION) {
    this.FILE_EXTENSION = FILE_EXTENSION;
    return this;
  }

   /**
   * Get FILE_EXTENSION
   * @return FILE_EXTENSION
  **/
  @ApiModelProperty(value = "")
  public String getFILEEXTENSION() {
    return FILE_EXTENSION;
  }

  public void setFILEEXTENSION(String FILE_EXTENSION) {
    this.FILE_EXTENSION = FILE_EXTENSION;
  }

  public Attachment FILE(String FILE) {
    this.FILE = FILE;
    return this;
  }

   /**
   * Get FILE
   * @return FILE
  **/
  @ApiModelProperty(value = "")
  public String getFILE() {
    return FILE;
  }

  public void setFILE(String FILE) {
    this.FILE = FILE;
  }

  public Attachment TICKET_ATTACHMENT_UUID(Integer TICKET_ATTACHMENT_UUID) {
    this.TICKET_ATTACHMENT_UUID = TICKET_ATTACHMENT_UUID;
    return this;
  }

   /**
   * Get TICKET_ATTACHMENT_UUID
   * @return TICKET_ATTACHMENT_UUID
  **/
  @ApiModelProperty(value = "")
  public Integer getTICKETATTACHMENTUUID() {
    return TICKET_ATTACHMENT_UUID;
  }

  public void setTICKETATTACHMENTUUID(Integer TICKET_ATTACHMENT_UUID) {
    this.TICKET_ATTACHMENT_UUID = TICKET_ATTACHMENT_UUID;
  }

  public Attachment COMPANY_ID(String COMPANY_ID) {
    this.COMPANY_ID = COMPANY_ID;
    return this;
  }

   /**
   * Get COMPANY_ID
   * @return COMPANY_ID
  **/
  @ApiModelProperty(value = "")
  public String getCOMPANYID() {
    return COMPANY_ID;
  }

  public void setCOMPANYID(String COMPANY_ID) {
    this.COMPANY_ID = COMPANY_ID;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attachment attachment = (Attachment) o;
    return Objects.equals(this.FILE_NAME, attachment.FILE_NAME) &&
        Objects.equals(this.FILE_EXTENSION, attachment.FILE_EXTENSION) &&
        Objects.equals(this.FILE, attachment.FILE) &&
        Objects.equals(this.TICKET_ATTACHMENT_UUID, attachment.TICKET_ATTACHMENT_UUID) &&
        Objects.equals(this.COMPANY_ID, attachment.COMPANY_ID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(FILE_NAME, FILE_EXTENSION, FILE, TICKET_ATTACHMENT_UUID, COMPANY_ID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attachment {\n");
    
    sb.append("    FILE_NAME: ").append(toIndentedString(FILE_NAME)).append("\n");
    sb.append("    FILE_EXTENSION: ").append(toIndentedString(FILE_EXTENSION)).append("\n");
    sb.append("    FILE: ").append(toIndentedString(FILE)).append("\n");
    sb.append("    TICKET_ATTACHMENT_UUID: ").append(toIndentedString(TICKET_ATTACHMENT_UUID)).append("\n");
    sb.append("    COMPANY_ID: ").append(toIndentedString(COMPANY_ID)).append("\n");
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
