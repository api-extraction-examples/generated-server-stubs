package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.KidsAgeBand;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * AgeRatingDeclarationAttributes
 */

@JsonTypeName("AgeRatingDeclaration_attributes")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:43:20.254092-04:00[America/Lower_Princes]")
public class AgeRatingDeclarationAttributes {

  /**
   * Gets or Sets alcoholTobaccoOrDrugUseOrReferences
   */
  public enum AlcoholTobaccoOrDrugUseOrReferencesEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    AlcoholTobaccoOrDrugUseOrReferencesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AlcoholTobaccoOrDrugUseOrReferencesEnum fromValue(String value) {
      for (AlcoholTobaccoOrDrugUseOrReferencesEnum b : AlcoholTobaccoOrDrugUseOrReferencesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AlcoholTobaccoOrDrugUseOrReferencesEnum alcoholTobaccoOrDrugUseOrReferences;

  /**
   * Gets or Sets contests
   */
  public enum ContestsEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    ContestsEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ContestsEnum fromValue(String value) {
      for (ContestsEnum b : ContestsEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ContestsEnum contests;

  private Boolean gambling;

  @Deprecated
  private Boolean gamblingAndContests;

  /**
   * Gets or Sets gamblingSimulated
   */
  public enum GamblingSimulatedEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    GamblingSimulatedEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GamblingSimulatedEnum fromValue(String value) {
      for (GamblingSimulatedEnum b : GamblingSimulatedEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private GamblingSimulatedEnum gamblingSimulated;

  /**
   * Gets or Sets horrorOrFearThemes
   */
  public enum HorrorOrFearThemesEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    HorrorOrFearThemesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HorrorOrFearThemesEnum fromValue(String value) {
      for (HorrorOrFearThemesEnum b : HorrorOrFearThemesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private HorrorOrFearThemesEnum horrorOrFearThemes;

  private KidsAgeBand kidsAgeBand;

  /**
   * Gets or Sets matureOrSuggestiveThemes
   */
  public enum MatureOrSuggestiveThemesEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    MatureOrSuggestiveThemesEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MatureOrSuggestiveThemesEnum fromValue(String value) {
      for (MatureOrSuggestiveThemesEnum b : MatureOrSuggestiveThemesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MatureOrSuggestiveThemesEnum matureOrSuggestiveThemes;

  /**
   * Gets or Sets medicalOrTreatmentInformation
   */
  public enum MedicalOrTreatmentInformationEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    MedicalOrTreatmentInformationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MedicalOrTreatmentInformationEnum fromValue(String value) {
      for (MedicalOrTreatmentInformationEnum b : MedicalOrTreatmentInformationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private MedicalOrTreatmentInformationEnum medicalOrTreatmentInformation;

  /**
   * Gets or Sets profanityOrCrudeHumor
   */
  public enum ProfanityOrCrudeHumorEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    ProfanityOrCrudeHumorEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ProfanityOrCrudeHumorEnum fromValue(String value) {
      for (ProfanityOrCrudeHumorEnum b : ProfanityOrCrudeHumorEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ProfanityOrCrudeHumorEnum profanityOrCrudeHumor;

  private Boolean seventeenPlus;

  /**
   * Gets or Sets sexualContentGraphicAndNudity
   */
  public enum SexualContentGraphicAndNudityEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    SexualContentGraphicAndNudityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexualContentGraphicAndNudityEnum fromValue(String value) {
      for (SexualContentGraphicAndNudityEnum b : SexualContentGraphicAndNudityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SexualContentGraphicAndNudityEnum sexualContentGraphicAndNudity;

  /**
   * Gets or Sets sexualContentOrNudity
   */
  public enum SexualContentOrNudityEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    SexualContentOrNudityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SexualContentOrNudityEnum fromValue(String value) {
      for (SexualContentOrNudityEnum b : SexualContentOrNudityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private SexualContentOrNudityEnum sexualContentOrNudity;

  private Boolean unrestrictedWebAccess;

  /**
   * Gets or Sets violenceCartoonOrFantasy
   */
  public enum ViolenceCartoonOrFantasyEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    ViolenceCartoonOrFantasyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViolenceCartoonOrFantasyEnum fromValue(String value) {
      for (ViolenceCartoonOrFantasyEnum b : ViolenceCartoonOrFantasyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ViolenceCartoonOrFantasyEnum violenceCartoonOrFantasy;

  /**
   * Gets or Sets violenceRealistic
   */
  public enum ViolenceRealisticEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    ViolenceRealisticEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViolenceRealisticEnum fromValue(String value) {
      for (ViolenceRealisticEnum b : ViolenceRealisticEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ViolenceRealisticEnum violenceRealistic;

  /**
   * Gets or Sets violenceRealisticProlongedGraphicOrSadistic
   */
  public enum ViolenceRealisticProlongedGraphicOrSadisticEnum {
    NONE("NONE"),
    
    INFREQUENT_OR_MILD("INFREQUENT_OR_MILD"),
    
    FREQUENT_OR_INTENSE("FREQUENT_OR_INTENSE");

    private String value;

    ViolenceRealisticProlongedGraphicOrSadisticEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ViolenceRealisticProlongedGraphicOrSadisticEnum fromValue(String value) {
      for (ViolenceRealisticProlongedGraphicOrSadisticEnum b : ViolenceRealisticProlongedGraphicOrSadisticEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private ViolenceRealisticProlongedGraphicOrSadisticEnum violenceRealisticProlongedGraphicOrSadistic;

  public AgeRatingDeclarationAttributes alcoholTobaccoOrDrugUseOrReferences(AlcoholTobaccoOrDrugUseOrReferencesEnum alcoholTobaccoOrDrugUseOrReferences) {
    this.alcoholTobaccoOrDrugUseOrReferences = alcoholTobaccoOrDrugUseOrReferences;
    return this;
  }

  /**
   * Get alcoholTobaccoOrDrugUseOrReferences
   * @return alcoholTobaccoOrDrugUseOrReferences
  */
  
  @Schema(name = "alcoholTobaccoOrDrugUseOrReferences", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("alcoholTobaccoOrDrugUseOrReferences")
  public AlcoholTobaccoOrDrugUseOrReferencesEnum getAlcoholTobaccoOrDrugUseOrReferences() {
    return alcoholTobaccoOrDrugUseOrReferences;
  }

  public void setAlcoholTobaccoOrDrugUseOrReferences(AlcoholTobaccoOrDrugUseOrReferencesEnum alcoholTobaccoOrDrugUseOrReferences) {
    this.alcoholTobaccoOrDrugUseOrReferences = alcoholTobaccoOrDrugUseOrReferences;
  }

  public AgeRatingDeclarationAttributes contests(ContestsEnum contests) {
    this.contests = contests;
    return this;
  }

  /**
   * Get contests
   * @return contests
  */
  
  @Schema(name = "contests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contests")
  public ContestsEnum getContests() {
    return contests;
  }

  public void setContests(ContestsEnum contests) {
    this.contests = contests;
  }

  public AgeRatingDeclarationAttributes gambling(Boolean gambling) {
    this.gambling = gambling;
    return this;
  }

  /**
   * Get gambling
   * @return gambling
  */
  
  @Schema(name = "gambling", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gambling")
  public Boolean getGambling() {
    return gambling;
  }

  public void setGambling(Boolean gambling) {
    this.gambling = gambling;
  }

  public AgeRatingDeclarationAttributes gamblingAndContests(Boolean gamblingAndContests) {
    this.gamblingAndContests = gamblingAndContests;
    return this;
  }

  /**
   * Get gamblingAndContests
   * @return gamblingAndContests
   * @deprecated
  */
  
  @Schema(name = "gamblingAndContests", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gamblingAndContests")
  @Deprecated
  public Boolean getGamblingAndContests() {
    return gamblingAndContests;
  }

  /**
   * @deprecated
  */
  @Deprecated
  public void setGamblingAndContests(Boolean gamblingAndContests) {
    this.gamblingAndContests = gamblingAndContests;
  }

  public AgeRatingDeclarationAttributes gamblingSimulated(GamblingSimulatedEnum gamblingSimulated) {
    this.gamblingSimulated = gamblingSimulated;
    return this;
  }

  /**
   * Get gamblingSimulated
   * @return gamblingSimulated
  */
  
  @Schema(name = "gamblingSimulated", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("gamblingSimulated")
  public GamblingSimulatedEnum getGamblingSimulated() {
    return gamblingSimulated;
  }

  public void setGamblingSimulated(GamblingSimulatedEnum gamblingSimulated) {
    this.gamblingSimulated = gamblingSimulated;
  }

  public AgeRatingDeclarationAttributes horrorOrFearThemes(HorrorOrFearThemesEnum horrorOrFearThemes) {
    this.horrorOrFearThemes = horrorOrFearThemes;
    return this;
  }

  /**
   * Get horrorOrFearThemes
   * @return horrorOrFearThemes
  */
  
  @Schema(name = "horrorOrFearThemes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("horrorOrFearThemes")
  public HorrorOrFearThemesEnum getHorrorOrFearThemes() {
    return horrorOrFearThemes;
  }

  public void setHorrorOrFearThemes(HorrorOrFearThemesEnum horrorOrFearThemes) {
    this.horrorOrFearThemes = horrorOrFearThemes;
  }

  public AgeRatingDeclarationAttributes kidsAgeBand(KidsAgeBand kidsAgeBand) {
    this.kidsAgeBand = kidsAgeBand;
    return this;
  }

  /**
   * Get kidsAgeBand
   * @return kidsAgeBand
  */
  @Valid 
  @Schema(name = "kidsAgeBand", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("kidsAgeBand")
  public KidsAgeBand getKidsAgeBand() {
    return kidsAgeBand;
  }

  public void setKidsAgeBand(KidsAgeBand kidsAgeBand) {
    this.kidsAgeBand = kidsAgeBand;
  }

  public AgeRatingDeclarationAttributes matureOrSuggestiveThemes(MatureOrSuggestiveThemesEnum matureOrSuggestiveThemes) {
    this.matureOrSuggestiveThemes = matureOrSuggestiveThemes;
    return this;
  }

  /**
   * Get matureOrSuggestiveThemes
   * @return matureOrSuggestiveThemes
  */
  
  @Schema(name = "matureOrSuggestiveThemes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("matureOrSuggestiveThemes")
  public MatureOrSuggestiveThemesEnum getMatureOrSuggestiveThemes() {
    return matureOrSuggestiveThemes;
  }

  public void setMatureOrSuggestiveThemes(MatureOrSuggestiveThemesEnum matureOrSuggestiveThemes) {
    this.matureOrSuggestiveThemes = matureOrSuggestiveThemes;
  }

  public AgeRatingDeclarationAttributes medicalOrTreatmentInformation(MedicalOrTreatmentInformationEnum medicalOrTreatmentInformation) {
    this.medicalOrTreatmentInformation = medicalOrTreatmentInformation;
    return this;
  }

  /**
   * Get medicalOrTreatmentInformation
   * @return medicalOrTreatmentInformation
  */
  
  @Schema(name = "medicalOrTreatmentInformation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("medicalOrTreatmentInformation")
  public MedicalOrTreatmentInformationEnum getMedicalOrTreatmentInformation() {
    return medicalOrTreatmentInformation;
  }

  public void setMedicalOrTreatmentInformation(MedicalOrTreatmentInformationEnum medicalOrTreatmentInformation) {
    this.medicalOrTreatmentInformation = medicalOrTreatmentInformation;
  }

  public AgeRatingDeclarationAttributes profanityOrCrudeHumor(ProfanityOrCrudeHumorEnum profanityOrCrudeHumor) {
    this.profanityOrCrudeHumor = profanityOrCrudeHumor;
    return this;
  }

  /**
   * Get profanityOrCrudeHumor
   * @return profanityOrCrudeHumor
  */
  
  @Schema(name = "profanityOrCrudeHumor", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("profanityOrCrudeHumor")
  public ProfanityOrCrudeHumorEnum getProfanityOrCrudeHumor() {
    return profanityOrCrudeHumor;
  }

  public void setProfanityOrCrudeHumor(ProfanityOrCrudeHumorEnum profanityOrCrudeHumor) {
    this.profanityOrCrudeHumor = profanityOrCrudeHumor;
  }

  public AgeRatingDeclarationAttributes seventeenPlus(Boolean seventeenPlus) {
    this.seventeenPlus = seventeenPlus;
    return this;
  }

  /**
   * Get seventeenPlus
   * @return seventeenPlus
  */
  
  @Schema(name = "seventeenPlus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("seventeenPlus")
  public Boolean getSeventeenPlus() {
    return seventeenPlus;
  }

  public void setSeventeenPlus(Boolean seventeenPlus) {
    this.seventeenPlus = seventeenPlus;
  }

  public AgeRatingDeclarationAttributes sexualContentGraphicAndNudity(SexualContentGraphicAndNudityEnum sexualContentGraphicAndNudity) {
    this.sexualContentGraphicAndNudity = sexualContentGraphicAndNudity;
    return this;
  }

  /**
   * Get sexualContentGraphicAndNudity
   * @return sexualContentGraphicAndNudity
  */
  
  @Schema(name = "sexualContentGraphicAndNudity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sexualContentGraphicAndNudity")
  public SexualContentGraphicAndNudityEnum getSexualContentGraphicAndNudity() {
    return sexualContentGraphicAndNudity;
  }

  public void setSexualContentGraphicAndNudity(SexualContentGraphicAndNudityEnum sexualContentGraphicAndNudity) {
    this.sexualContentGraphicAndNudity = sexualContentGraphicAndNudity;
  }

  public AgeRatingDeclarationAttributes sexualContentOrNudity(SexualContentOrNudityEnum sexualContentOrNudity) {
    this.sexualContentOrNudity = sexualContentOrNudity;
    return this;
  }

  /**
   * Get sexualContentOrNudity
   * @return sexualContentOrNudity
  */
  
  @Schema(name = "sexualContentOrNudity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sexualContentOrNudity")
  public SexualContentOrNudityEnum getSexualContentOrNudity() {
    return sexualContentOrNudity;
  }

  public void setSexualContentOrNudity(SexualContentOrNudityEnum sexualContentOrNudity) {
    this.sexualContentOrNudity = sexualContentOrNudity;
  }

  public AgeRatingDeclarationAttributes unrestrictedWebAccess(Boolean unrestrictedWebAccess) {
    this.unrestrictedWebAccess = unrestrictedWebAccess;
    return this;
  }

  /**
   * Get unrestrictedWebAccess
   * @return unrestrictedWebAccess
  */
  
  @Schema(name = "unrestrictedWebAccess", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("unrestrictedWebAccess")
  public Boolean getUnrestrictedWebAccess() {
    return unrestrictedWebAccess;
  }

  public void setUnrestrictedWebAccess(Boolean unrestrictedWebAccess) {
    this.unrestrictedWebAccess = unrestrictedWebAccess;
  }

  public AgeRatingDeclarationAttributes violenceCartoonOrFantasy(ViolenceCartoonOrFantasyEnum violenceCartoonOrFantasy) {
    this.violenceCartoonOrFantasy = violenceCartoonOrFantasy;
    return this;
  }

  /**
   * Get violenceCartoonOrFantasy
   * @return violenceCartoonOrFantasy
  */
  
  @Schema(name = "violenceCartoonOrFantasy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("violenceCartoonOrFantasy")
  public ViolenceCartoonOrFantasyEnum getViolenceCartoonOrFantasy() {
    return violenceCartoonOrFantasy;
  }

  public void setViolenceCartoonOrFantasy(ViolenceCartoonOrFantasyEnum violenceCartoonOrFantasy) {
    this.violenceCartoonOrFantasy = violenceCartoonOrFantasy;
  }

  public AgeRatingDeclarationAttributes violenceRealistic(ViolenceRealisticEnum violenceRealistic) {
    this.violenceRealistic = violenceRealistic;
    return this;
  }

  /**
   * Get violenceRealistic
   * @return violenceRealistic
  */
  
  @Schema(name = "violenceRealistic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("violenceRealistic")
  public ViolenceRealisticEnum getViolenceRealistic() {
    return violenceRealistic;
  }

  public void setViolenceRealistic(ViolenceRealisticEnum violenceRealistic) {
    this.violenceRealistic = violenceRealistic;
  }

  public AgeRatingDeclarationAttributes violenceRealisticProlongedGraphicOrSadistic(ViolenceRealisticProlongedGraphicOrSadisticEnum violenceRealisticProlongedGraphicOrSadistic) {
    this.violenceRealisticProlongedGraphicOrSadistic = violenceRealisticProlongedGraphicOrSadistic;
    return this;
  }

  /**
   * Get violenceRealisticProlongedGraphicOrSadistic
   * @return violenceRealisticProlongedGraphicOrSadistic
  */
  
  @Schema(name = "violenceRealisticProlongedGraphicOrSadistic", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("violenceRealisticProlongedGraphicOrSadistic")
  public ViolenceRealisticProlongedGraphicOrSadisticEnum getViolenceRealisticProlongedGraphicOrSadistic() {
    return violenceRealisticProlongedGraphicOrSadistic;
  }

  public void setViolenceRealisticProlongedGraphicOrSadistic(ViolenceRealisticProlongedGraphicOrSadisticEnum violenceRealisticProlongedGraphicOrSadistic) {
    this.violenceRealisticProlongedGraphicOrSadistic = violenceRealisticProlongedGraphicOrSadistic;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgeRatingDeclarationAttributes ageRatingDeclarationAttributes = (AgeRatingDeclarationAttributes) o;
    return Objects.equals(this.alcoholTobaccoOrDrugUseOrReferences, ageRatingDeclarationAttributes.alcoholTobaccoOrDrugUseOrReferences) &&
        Objects.equals(this.contests, ageRatingDeclarationAttributes.contests) &&
        Objects.equals(this.gambling, ageRatingDeclarationAttributes.gambling) &&
        Objects.equals(this.gamblingAndContests, ageRatingDeclarationAttributes.gamblingAndContests) &&
        Objects.equals(this.gamblingSimulated, ageRatingDeclarationAttributes.gamblingSimulated) &&
        Objects.equals(this.horrorOrFearThemes, ageRatingDeclarationAttributes.horrorOrFearThemes) &&
        Objects.equals(this.kidsAgeBand, ageRatingDeclarationAttributes.kidsAgeBand) &&
        Objects.equals(this.matureOrSuggestiveThemes, ageRatingDeclarationAttributes.matureOrSuggestiveThemes) &&
        Objects.equals(this.medicalOrTreatmentInformation, ageRatingDeclarationAttributes.medicalOrTreatmentInformation) &&
        Objects.equals(this.profanityOrCrudeHumor, ageRatingDeclarationAttributes.profanityOrCrudeHumor) &&
        Objects.equals(this.seventeenPlus, ageRatingDeclarationAttributes.seventeenPlus) &&
        Objects.equals(this.sexualContentGraphicAndNudity, ageRatingDeclarationAttributes.sexualContentGraphicAndNudity) &&
        Objects.equals(this.sexualContentOrNudity, ageRatingDeclarationAttributes.sexualContentOrNudity) &&
        Objects.equals(this.unrestrictedWebAccess, ageRatingDeclarationAttributes.unrestrictedWebAccess) &&
        Objects.equals(this.violenceCartoonOrFantasy, ageRatingDeclarationAttributes.violenceCartoonOrFantasy) &&
        Objects.equals(this.violenceRealistic, ageRatingDeclarationAttributes.violenceRealistic) &&
        Objects.equals(this.violenceRealisticProlongedGraphicOrSadistic, ageRatingDeclarationAttributes.violenceRealisticProlongedGraphicOrSadistic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alcoholTobaccoOrDrugUseOrReferences, contests, gambling, gamblingAndContests, gamblingSimulated, horrorOrFearThemes, kidsAgeBand, matureOrSuggestiveThemes, medicalOrTreatmentInformation, profanityOrCrudeHumor, seventeenPlus, sexualContentGraphicAndNudity, sexualContentOrNudity, unrestrictedWebAccess, violenceCartoonOrFantasy, violenceRealistic, violenceRealisticProlongedGraphicOrSadistic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgeRatingDeclarationAttributes {\n");
    sb.append("    alcoholTobaccoOrDrugUseOrReferences: ").append(toIndentedString(alcoholTobaccoOrDrugUseOrReferences)).append("\n");
    sb.append("    contests: ").append(toIndentedString(contests)).append("\n");
    sb.append("    gambling: ").append(toIndentedString(gambling)).append("\n");
    sb.append("    gamblingAndContests: ").append(toIndentedString(gamblingAndContests)).append("\n");
    sb.append("    gamblingSimulated: ").append(toIndentedString(gamblingSimulated)).append("\n");
    sb.append("    horrorOrFearThemes: ").append(toIndentedString(horrorOrFearThemes)).append("\n");
    sb.append("    kidsAgeBand: ").append(toIndentedString(kidsAgeBand)).append("\n");
    sb.append("    matureOrSuggestiveThemes: ").append(toIndentedString(matureOrSuggestiveThemes)).append("\n");
    sb.append("    medicalOrTreatmentInformation: ").append(toIndentedString(medicalOrTreatmentInformation)).append("\n");
    sb.append("    profanityOrCrudeHumor: ").append(toIndentedString(profanityOrCrudeHumor)).append("\n");
    sb.append("    seventeenPlus: ").append(toIndentedString(seventeenPlus)).append("\n");
    sb.append("    sexualContentGraphicAndNudity: ").append(toIndentedString(sexualContentGraphicAndNudity)).append("\n");
    sb.append("    sexualContentOrNudity: ").append(toIndentedString(sexualContentOrNudity)).append("\n");
    sb.append("    unrestrictedWebAccess: ").append(toIndentedString(unrestrictedWebAccess)).append("\n");
    sb.append("    violenceCartoonOrFantasy: ").append(toIndentedString(violenceCartoonOrFantasy)).append("\n");
    sb.append("    violenceRealistic: ").append(toIndentedString(violenceRealistic)).append("\n");
    sb.append("    violenceRealisticProlongedGraphicOrSadistic: ").append(toIndentedString(violenceRealisticProlongedGraphicOrSadistic)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

