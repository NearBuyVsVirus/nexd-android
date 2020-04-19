/*
 * Nexd API
 * Swagger API description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.nexd.android.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * CreateOrUpdateHelpRequestArticleDto
 */

public class CreateOrUpdateHelpRequestArticleDto {
  public static final String SERIALIZED_NAME_ARTICLE_COUNT = "articleCount";
  @SerializedName(SERIALIZED_NAME_ARTICLE_COUNT)
  private Long articleCount;

  public static final String SERIALIZED_NAME_ARTICLE_DONE = "articleDone";
  @SerializedName(SERIALIZED_NAME_ARTICLE_DONE)
  private Boolean articleDone;


  public CreateOrUpdateHelpRequestArticleDto articleCount(Long articleCount) {
    
    this.articleCount = articleCount;
    return this;
  }

   /**
   * Number of items
   * minimum: 1
   * @return articleCount
  **/
  @ApiModelProperty(required = true, value = "Number of items")

  public Long getArticleCount() {
    return articleCount;
  }


  public void setArticleCount(Long articleCount) {
    this.articleCount = articleCount;
  }


  public CreateOrUpdateHelpRequestArticleDto articleDone(Boolean articleDone) {
    
    this.articleDone = articleDone;
    return this;
  }

   /**
   * Get articleDone
   * @return articleDone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getArticleDone() {
    return articleDone;
  }


  public void setArticleDone(Boolean articleDone) {
    this.articleDone = articleDone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrUpdateHelpRequestArticleDto createOrUpdateHelpRequestArticleDto = (CreateOrUpdateHelpRequestArticleDto) o;
    return Objects.equals(this.articleCount, createOrUpdateHelpRequestArticleDto.articleCount) &&
        Objects.equals(this.articleDone, createOrUpdateHelpRequestArticleDto.articleDone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleCount, articleDone);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateOrUpdateHelpRequestArticleDto {\n");
    sb.append("    articleCount: ").append(toIndentedString(articleCount)).append("\n");
    sb.append("    articleDone: ").append(toIndentedString(articleDone)).append("\n");
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

