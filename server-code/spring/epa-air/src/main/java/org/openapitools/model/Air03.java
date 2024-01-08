package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Facilities Object
 */

@Schema(name = "air03", description = "Facilities Object")
@JsonTypeName("air03")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-01-06T13:50:47.778831-04:00[America/Lower_Princes]")
public class Air03 {

  private String aiR3yrComplQtrsHistory;

  private String aiRCaseIDs;

  private String aiRCity;

  private String aiRClassification;

  private String aiRComplStatus;

  private String aiRCounty;

  private String aiRDaysLastEval;

  private String aiREPARegion;

  private String aiREvalCnt;

  private String aiRFIPSCode;

  private String aiRFacilityTypeCode;

  private String aiRFacilityTypeDesc;

  private String aiRFeaCnt;

  private String aiRHpvStatus;

  private String aiRIDs;

  private String aiRIeaCnt;

  private String aiRIndianCntryFlg;

  private String aiRLastEvalDate;

  private String aiRLastEvalDateEPA;

  private String aiRLastEvalDateState;

  private String aiRLastFeaDate;

  private String aiRLastFeaDateEPA;

  private String aiRLastFeaDateState;

  private String aiRLastIeaDate;

  private String aiRLastIeaDateEPA;

  private String aiRLastIeaDateState;

  private String aiRLastPenaltyDate;

  private String aiRLastStckDateEPA;

  private String aiRLastStckDateState;

  private String aiRLastStckTestDate;

  private String aiRLastStckTestResults;

  private String aiRLastViolDate;

  private String aiRMacts;

  private String aiRMajorFlag;

  private String aiRMnthsWithHpv;

  private String AIRNAICS;

  private String aiRName;

  private String aiRNsps;

  private String aiRNspsm;

  private String aiRPenalties;

  private String aiRPollRecentViol;

  private String aiRPrograms;

  private String aiRQtrsWithHpv;

  private String aiRQtrsWithViol;

  private String aiRRecentViolCnt;

  private String aiRStackTest5YrAll;

  private String aiRStackTest5YrFail;

  private String aiRState;

  private String aiRStatus;

  private String aiRStreet;

  private String aiRTRIbalEPAids;

  private String aiRTRIbalNames;

  private String aiRUniverse;

  private String aiRZip;

  private String activeLower48;

  private String cwAIDs;

  private String calculatedAccuracyMeters;

  private String camdIDs;

  private String censusBlockGroup;

  private String chesapeakeBayFlag;

  private String collectionMethod;

  private String currSvFlag;

  private String currVioFlag;

  private String epASystem;

  private String ea5yrFlag;

  private String eisIDs;

  private String ejscreenFlag;

  private String ejscreenFlagUs;

  private String facCamdReporter;

  private String facCountyName;

  private String facDerivedHuc;

  private String facDerivedTRIbes;

  private String facDerivedWBD;

  private String facDerivedWBDName;

  private String facEisAIRReleases;

  private String facEisReporter;

  private String facFIPSCode;

  private String facFederalAgencyCode;

  private String facFederalAgencyName;

  private String facGHGCO2Releases;

  private String facGHGReporter;

  private String facIndianCntryFlg;

  private String facIndianSpatialFlg;

  private String facLat;

  private String facLong;

  private String facMapFlg;

  private String facMapIcon;

  private String facNaaFlag;

  private String facPercentMinority;

  private String facPopulationDensity;

  private String facSICCodes;

  private String facStdCountyName;

  private String facTRIAIRReleases;

  private String facTRICarcAIRReleases;

  private String facTRIHapsReleases;

  private String facTRIReporter;

  private String facUsMexBorderFlg;

  private String ghGIDs;

  private String hasPollRpt;

  private String infea5yrFlag;

  private String insp5yrFlag;

  private String lastDatePce;

  private String lastDatePceEPA;

  private String lastDatePceSta;

  private String localControlRegionCode;

  private String localControlRegionName;

  private String lower48;

  private String maintPollutantsNaa;

  private String maintStandardsNaa;

  private String maintStatusNaa;

  private String map;

  private String maxPctileUs;

  private String maxScore;

  private String naPollutantsNaa;

  private String naStandardsNaa;

  private String naStatusNaa;

  private String naaCategories;

  private String naaPollutants;

  private String otherPermitIDs;

  private String over80CountUs;

  private String pctileCancerUs;

  private String pctileDpmUs;

  private String pctileO3Us;

  private String pctilePctpre1960Us;

  private String pctilePmUs;

  private String pctileProximityNPDESUs;

  private String pctileProximityNplUs;

  private String pctileProximityRmpUs;

  private String pctileProximityTsdfUs;

  private String pctileRespUs;

  private String pctileTrafficScoreUs;

  private String rcRAIDs;

  private String referencePoint;

  private String registryID;

  private String rmpIDs;

  private String sdWAIDs;

  private String score;

  private String sourceID;

  private String statute;

  private String trIIDs;

  private String trIbalFlag;

  private String violFlag;

  private String webDocs;

  public Air03() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Air03(String aiR3yrComplQtrsHistory, String aiRCaseIDs, String aiRCity, String aiRClassification, String aiRComplStatus, String aiRCounty, String aiRDaysLastEval, String aiREPARegion, String aiREvalCnt, String aiRFIPSCode, String aiRFacilityTypeCode, String aiRFacilityTypeDesc, String aiRFeaCnt, String aiRHpvStatus, String aiRIDs, String aiRIeaCnt, String aiRIndianCntryFlg, String aiRLastEvalDate, String aiRLastEvalDateEPA, String aiRLastEvalDateState, String aiRLastFeaDate, String aiRLastFeaDateEPA, String aiRLastFeaDateState, String aiRLastIeaDate, String aiRLastIeaDateEPA, String aiRLastIeaDateState, String aiRLastPenaltyDate, String aiRLastStckDateEPA, String aiRLastStckDateState, String aiRLastStckTestDate, String aiRLastStckTestResults, String aiRLastViolDate, String aiRMacts, String aiRMajorFlag, String aiRMnthsWithHpv, String AIRNAICS, String aiRName, String aiRNsps, String aiRNspsm, String aiRPenalties, String aiRPollRecentViol, String aiRPrograms, String aiRQtrsWithHpv, String aiRQtrsWithViol, String aiRRecentViolCnt, String aiRStackTest5YrAll, String aiRStackTest5YrFail, String aiRState, String aiRStatus, String aiRStreet, String aiRTRIbalEPAids, String aiRTRIbalNames, String aiRUniverse, String aiRZip, String activeLower48, String cwAIDs, String calculatedAccuracyMeters, String camdIDs, String censusBlockGroup, String chesapeakeBayFlag, String collectionMethod, String currSvFlag, String currVioFlag, String epASystem, String ea5yrFlag, String eisIDs, String ejscreenFlag, String ejscreenFlagUs, String facCamdReporter, String facCountyName, String facDerivedHuc, String facDerivedTRIbes, String facDerivedWBD, String facDerivedWBDName, String facEisAIRReleases, String facEisReporter, String facFIPSCode, String facFederalAgencyCode, String facFederalAgencyName, String facGHGCO2Releases, String facGHGReporter, String facIndianCntryFlg, String facIndianSpatialFlg, String facLat, String facLong, String facMapFlg, String facMapIcon, String facNaaFlag, String facPercentMinority, String facPopulationDensity, String facSICCodes, String facStdCountyName, String facTRIAIRReleases, String facTRICarcAIRReleases, String facTRIHapsReleases, String facTRIReporter, String facUsMexBorderFlg, String ghGIDs, String hasPollRpt, String infea5yrFlag, String insp5yrFlag, String lastDatePce, String lastDatePceEPA, String lastDatePceSta, String localControlRegionCode, String localControlRegionName, String lower48, String maintPollutantsNaa, String maintStandardsNaa, String maintStatusNaa, String map, String maxPctileUs, String maxScore, String naPollutantsNaa, String naStandardsNaa, String naStatusNaa, String naaCategories, String naaPollutants, String otherPermitIDs, String over80CountUs, String pctileCancerUs, String pctileDpmUs, String pctileO3Us, String pctilePctpre1960Us, String pctilePmUs, String pctileProximityNPDESUs, String pctileProximityNplUs, String pctileProximityRmpUs, String pctileProximityTsdfUs, String pctileRespUs, String pctileTrafficScoreUs, String rcRAIDs, String referencePoint, String registryID, String rmpIDs, String sdWAIDs, String score, String sourceID, String statute, String trIIDs, String trIbalFlag, String violFlag, String webDocs) {
    this.aiR3yrComplQtrsHistory = aiR3yrComplQtrsHistory;
    this.aiRCaseIDs = aiRCaseIDs;
    this.aiRCity = aiRCity;
    this.aiRClassification = aiRClassification;
    this.aiRComplStatus = aiRComplStatus;
    this.aiRCounty = aiRCounty;
    this.aiRDaysLastEval = aiRDaysLastEval;
    this.aiREPARegion = aiREPARegion;
    this.aiREvalCnt = aiREvalCnt;
    this.aiRFIPSCode = aiRFIPSCode;
    this.aiRFacilityTypeCode = aiRFacilityTypeCode;
    this.aiRFacilityTypeDesc = aiRFacilityTypeDesc;
    this.aiRFeaCnt = aiRFeaCnt;
    this.aiRHpvStatus = aiRHpvStatus;
    this.aiRIDs = aiRIDs;
    this.aiRIeaCnt = aiRIeaCnt;
    this.aiRIndianCntryFlg = aiRIndianCntryFlg;
    this.aiRLastEvalDate = aiRLastEvalDate;
    this.aiRLastEvalDateEPA = aiRLastEvalDateEPA;
    this.aiRLastEvalDateState = aiRLastEvalDateState;
    this.aiRLastFeaDate = aiRLastFeaDate;
    this.aiRLastFeaDateEPA = aiRLastFeaDateEPA;
    this.aiRLastFeaDateState = aiRLastFeaDateState;
    this.aiRLastIeaDate = aiRLastIeaDate;
    this.aiRLastIeaDateEPA = aiRLastIeaDateEPA;
    this.aiRLastIeaDateState = aiRLastIeaDateState;
    this.aiRLastPenaltyDate = aiRLastPenaltyDate;
    this.aiRLastStckDateEPA = aiRLastStckDateEPA;
    this.aiRLastStckDateState = aiRLastStckDateState;
    this.aiRLastStckTestDate = aiRLastStckTestDate;
    this.aiRLastStckTestResults = aiRLastStckTestResults;
    this.aiRLastViolDate = aiRLastViolDate;
    this.aiRMacts = aiRMacts;
    this.aiRMajorFlag = aiRMajorFlag;
    this.aiRMnthsWithHpv = aiRMnthsWithHpv;
    this.AIRNAICS = AIRNAICS;
    this.aiRName = aiRName;
    this.aiRNsps = aiRNsps;
    this.aiRNspsm = aiRNspsm;
    this.aiRPenalties = aiRPenalties;
    this.aiRPollRecentViol = aiRPollRecentViol;
    this.aiRPrograms = aiRPrograms;
    this.aiRQtrsWithHpv = aiRQtrsWithHpv;
    this.aiRQtrsWithViol = aiRQtrsWithViol;
    this.aiRRecentViolCnt = aiRRecentViolCnt;
    this.aiRStackTest5YrAll = aiRStackTest5YrAll;
    this.aiRStackTest5YrFail = aiRStackTest5YrFail;
    this.aiRState = aiRState;
    this.aiRStatus = aiRStatus;
    this.aiRStreet = aiRStreet;
    this.aiRTRIbalEPAids = aiRTRIbalEPAids;
    this.aiRTRIbalNames = aiRTRIbalNames;
    this.aiRUniverse = aiRUniverse;
    this.aiRZip = aiRZip;
    this.activeLower48 = activeLower48;
    this.cwAIDs = cwAIDs;
    this.calculatedAccuracyMeters = calculatedAccuracyMeters;
    this.camdIDs = camdIDs;
    this.censusBlockGroup = censusBlockGroup;
    this.chesapeakeBayFlag = chesapeakeBayFlag;
    this.collectionMethod = collectionMethod;
    this.currSvFlag = currSvFlag;
    this.currVioFlag = currVioFlag;
    this.epASystem = epASystem;
    this.ea5yrFlag = ea5yrFlag;
    this.eisIDs = eisIDs;
    this.ejscreenFlag = ejscreenFlag;
    this.ejscreenFlagUs = ejscreenFlagUs;
    this.facCamdReporter = facCamdReporter;
    this.facCountyName = facCountyName;
    this.facDerivedHuc = facDerivedHuc;
    this.facDerivedTRIbes = facDerivedTRIbes;
    this.facDerivedWBD = facDerivedWBD;
    this.facDerivedWBDName = facDerivedWBDName;
    this.facEisAIRReleases = facEisAIRReleases;
    this.facEisReporter = facEisReporter;
    this.facFIPSCode = facFIPSCode;
    this.facFederalAgencyCode = facFederalAgencyCode;
    this.facFederalAgencyName = facFederalAgencyName;
    this.facGHGCO2Releases = facGHGCO2Releases;
    this.facGHGReporter = facGHGReporter;
    this.facIndianCntryFlg = facIndianCntryFlg;
    this.facIndianSpatialFlg = facIndianSpatialFlg;
    this.facLat = facLat;
    this.facLong = facLong;
    this.facMapFlg = facMapFlg;
    this.facMapIcon = facMapIcon;
    this.facNaaFlag = facNaaFlag;
    this.facPercentMinority = facPercentMinority;
    this.facPopulationDensity = facPopulationDensity;
    this.facSICCodes = facSICCodes;
    this.facStdCountyName = facStdCountyName;
    this.facTRIAIRReleases = facTRIAIRReleases;
    this.facTRICarcAIRReleases = facTRICarcAIRReleases;
    this.facTRIHapsReleases = facTRIHapsReleases;
    this.facTRIReporter = facTRIReporter;
    this.facUsMexBorderFlg = facUsMexBorderFlg;
    this.ghGIDs = ghGIDs;
    this.hasPollRpt = hasPollRpt;
    this.infea5yrFlag = infea5yrFlag;
    this.insp5yrFlag = insp5yrFlag;
    this.lastDatePce = lastDatePce;
    this.lastDatePceEPA = lastDatePceEPA;
    this.lastDatePceSta = lastDatePceSta;
    this.localControlRegionCode = localControlRegionCode;
    this.localControlRegionName = localControlRegionName;
    this.lower48 = lower48;
    this.maintPollutantsNaa = maintPollutantsNaa;
    this.maintStandardsNaa = maintStandardsNaa;
    this.maintStatusNaa = maintStatusNaa;
    this.map = map;
    this.maxPctileUs = maxPctileUs;
    this.maxScore = maxScore;
    this.naPollutantsNaa = naPollutantsNaa;
    this.naStandardsNaa = naStandardsNaa;
    this.naStatusNaa = naStatusNaa;
    this.naaCategories = naaCategories;
    this.naaPollutants = naaPollutants;
    this.otherPermitIDs = otherPermitIDs;
    this.over80CountUs = over80CountUs;
    this.pctileCancerUs = pctileCancerUs;
    this.pctileDpmUs = pctileDpmUs;
    this.pctileO3Us = pctileO3Us;
    this.pctilePctpre1960Us = pctilePctpre1960Us;
    this.pctilePmUs = pctilePmUs;
    this.pctileProximityNPDESUs = pctileProximityNPDESUs;
    this.pctileProximityNplUs = pctileProximityNplUs;
    this.pctileProximityRmpUs = pctileProximityRmpUs;
    this.pctileProximityTsdfUs = pctileProximityTsdfUs;
    this.pctileRespUs = pctileRespUs;
    this.pctileTrafficScoreUs = pctileTrafficScoreUs;
    this.rcRAIDs = rcRAIDs;
    this.referencePoint = referencePoint;
    this.registryID = registryID;
    this.rmpIDs = rmpIDs;
    this.sdWAIDs = sdWAIDs;
    this.score = score;
    this.sourceID = sourceID;
    this.statute = statute;
    this.trIIDs = trIIDs;
    this.trIbalFlag = trIbalFlag;
    this.violFlag = violFlag;
    this.webDocs = webDocs;
  }

  public Air03 aiR3yrComplQtrsHistory(String aiR3yrComplQtrsHistory) {
    this.aiR3yrComplQtrsHistory = aiR3yrComplQtrsHistory;
    return this;
  }

  /**
   * The facility's 3-year compliance status history by quarter (3-month period). Each character represents a quarter of compliance, going from oldest to most recent. Character values correspond to the following compliance statuses: _ -�No Violation Identified V -�Violation Identified S -�High Priority Violation U - Undetermined
   * @return aiR3yrComplQtrsHistory
  */
  @NotNull 
  @Schema(name = "AIR3yrComplQtrsHistory", example = "VV__SS_U__V_", description = "The facility's 3-year compliance status history by quarter (3-month period). Each character represents a quarter of compliance, going from oldest to most recent. Character values correspond to the following compliance statuses: _ -�No Violation Identified V -�Violation Identified S -�High Priority Violation U - Undetermined", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIR3yrComplQtrsHistory")
  public String getAiR3yrComplQtrsHistory() {
    return aiR3yrComplQtrsHistory;
  }

  public void setAiR3yrComplQtrsHistory(String aiR3yrComplQtrsHistory) {
    this.aiR3yrComplQtrsHistory = aiR3yrComplQtrsHistory;
  }

  public Air03 aiRCaseIDs(String aiRCaseIDs) {
    this.aiRCaseIDs = aiRCaseIDs;
    return this;
  }

  /**
   * Space-delimited list of AIR cases associated with the facility.
   * @return aiRCaseIDs
  */
  @NotNull 
  @Schema(name = "AIRCaseIDs", example = "05-1993-1585 05-2014-5021", description = "Space-delimited list of AIR cases associated with the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRCaseIDs")
  public String getAiRCaseIDs() {
    return aiRCaseIDs;
  }

  public void setAiRCaseIDs(String aiRCaseIDs) {
    this.aiRCaseIDs = aiRCaseIDs;
  }

  public Air03 aiRCity(String aiRCity) {
    this.aiRCity = aiRCity;
    return this;
  }

  /**
   * The city where the AIR facility is located.
   * @return aiRCity
  */
  @NotNull 
  @Schema(name = "AIRCity", example = "Washington", description = "The city where the AIR facility is located.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRCity")
  public String getAiRCity() {
    return aiRCity;
  }

  public void setAiRCity(String aiRCity) {
    this.aiRCity = aiRCity;
  }

  public Air03 aiRClassification(String aiRClassification) {
    this.aiRClassification = aiRClassification;
    return this;
  }

  /**
   * Get aiRClassification
   * @return aiRClassification
  */
  @NotNull 
  @Schema(name = "AIRClassification", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRClassification")
  public String getAiRClassification() {
    return aiRClassification;
  }

  public void setAiRClassification(String aiRClassification) {
    this.aiRClassification = aiRClassification;
  }

  public Air03 aiRComplStatus(String aiRComplStatus) {
    this.aiRComplStatus = aiRComplStatus;
    return this;
  }

  /**
   * The facility's recent violation status under the Clean Air Act.
   * @return aiRComplStatus
  */
  @NotNull 
  @Schema(name = "AIRComplStatus", example = "No Viol", description = "The facility's recent violation status under the Clean Air Act.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRComplStatus")
  public String getAiRComplStatus() {
    return aiRComplStatus;
  }

  public void setAiRComplStatus(String aiRComplStatus) {
    this.aiRComplStatus = aiRComplStatus;
  }

  public Air03 aiRCounty(String aiRCounty) {
    this.aiRCounty = aiRCounty;
    return this;
  }

  /**
   * The name of the county where the AIR facility is located.
   * @return aiRCounty
  */
  @NotNull 
  @Schema(name = "AIRCounty", example = "Racine", description = "The name of the county where the AIR facility is located.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRCounty")
  public String getAiRCounty() {
    return aiRCounty;
  }

  public void setAiRCounty(String aiRCounty) {
    this.aiRCounty = aiRCounty;
  }

  public Air03 aiRDaysLastEval(String aiRDaysLastEval) {
    this.aiRDaysLastEval = aiRDaysLastEval;
    return this;
  }

  /**
   * The number of days since the most recent compliance evaluation of the facility.
   * @return aiRDaysLastEval
  */
  @NotNull 
  @Schema(name = "AIRDaysLastEval", example = "2806", description = "The number of days since the most recent compliance evaluation of the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRDaysLastEval")
  public String getAiRDaysLastEval() {
    return aiRDaysLastEval;
  }

  public void setAiRDaysLastEval(String aiRDaysLastEval) {
    this.aiRDaysLastEval = aiRDaysLastEval;
  }

  public Air03 aiREPARegion(String aiREPARegion) {
    this.aiREPARegion = aiREPARegion;
    return this;
  }

  /**
   * The EPA region where the AIR facility is located.
   * @return aiREPARegion
  */
  @NotNull 
  @Schema(name = "AIREPARegion", example = "05", description = "The EPA region where the AIR facility is located.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIREPARegion")
  public String getAiREPARegion() {
    return aiREPARegion;
  }

  public void setAiREPARegion(String aiREPARegion) {
    this.aiREPARegion = aiREPARegion;
  }

  public Air03 aiREvalCnt(String aiREvalCnt) {
    this.aiREvalCnt = aiREvalCnt;
    return this;
  }

  /**
   * The number of compliance evaluations, under the Clean Air Act, occurring at the facility within the last five years.
   * @return aiREvalCnt
  */
  @NotNull 
  @Schema(name = "AIREvalCnt", example = "0", description = "The number of compliance evaluations, under the Clean Air Act, occurring at the facility within the last five years.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIREvalCnt")
  public String getAiREvalCnt() {
    return aiREvalCnt;
  }

  public void setAiREvalCnt(String aiREvalCnt) {
    this.aiREvalCnt = aiREvalCnt;
  }

  public Air03 aiRFIPSCode(String aiRFIPSCode) {
    this.aiRFIPSCode = aiRFIPSCode;
    return this;
  }

  /**
   * A 5 digit combination of the 2 digit Federal Information Processing Standards (FIPS) code for the state and the 3 digit FIPS code of the county that a facility is located in.
   * @return aiRFIPSCode
  */
  @NotNull 
  @Schema(name = "AIRFIPSCode", example = "11001", description = "A 5 digit combination of the 2 digit Federal Information Processing Standards (FIPS) code for the state and the 3 digit FIPS code of the county that a facility is located in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRFIPSCode")
  public String getAiRFIPSCode() {
    return aiRFIPSCode;
  }

  public void setAiRFIPSCode(String aiRFIPSCode) {
    this.aiRFIPSCode = aiRFIPSCode;
  }

  public Air03 aiRFacilityTypeCode(String aiRFacilityTypeCode) {
    this.aiRFacilityTypeCode = aiRFacilityTypeCode;
    return this;
  }

  /**
   * A three-character code indicating if plant is government facility. COR - Corporation CNG - County Government DIS - District FDF - Federal Facility (U.S. Government) GOC - GOCO (Gov Owned/Contractor Operated) IND - Individual MXO - Mixed Ownership (e.g., Public/Private) MWD - Municipal or Water District CTG - Municipality NON - Non-Government POF - Privately Owned Facility SDT - School District STF - State Government TRB - Tribal Government UNK - Unknown
   * @return aiRFacilityTypeCode
  */
  @NotNull 
  @Schema(name = "AIRFacilityTypeCode", example = "POF", description = "A three-character code indicating if plant is government facility. COR - Corporation CNG - County Government DIS - District FDF - Federal Facility (U.S. Government) GOC - GOCO (Gov Owned/Contractor Operated) IND - Individual MXO - Mixed Ownership (e.g., Public/Private) MWD - Municipal or Water District CTG - Municipality NON - Non-Government POF - Privately Owned Facility SDT - School District STF - State Government TRB - Tribal Government UNK - Unknown", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRFacilityTypeCode")
  public String getAiRFacilityTypeCode() {
    return aiRFacilityTypeCode;
  }

  public void setAiRFacilityTypeCode(String aiRFacilityTypeCode) {
    this.aiRFacilityTypeCode = aiRFacilityTypeCode;
  }

  public Air03 aiRFacilityTypeDesc(String aiRFacilityTypeDesc) {
    this.aiRFacilityTypeDesc = aiRFacilityTypeDesc;
    return this;
  }

  /**
   * Get aiRFacilityTypeDesc
   * @return aiRFacilityTypeDesc
  */
  @NotNull 
  @Schema(name = "AIRFacilityTypeDesc", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRFacilityTypeDesc")
  public String getAiRFacilityTypeDesc() {
    return aiRFacilityTypeDesc;
  }

  public void setAiRFacilityTypeDesc(String aiRFacilityTypeDesc) {
    this.aiRFacilityTypeDesc = aiRFacilityTypeDesc;
  }

  public Air03 aiRFeaCnt(String aiRFeaCnt) {
    this.aiRFeaCnt = aiRFeaCnt;
    return this;
  }

  /**
   * The total number of formal enforcement actions taken against the facility within the last five years.
   * @return aiRFeaCnt
  */
  @NotNull 
  @Schema(name = "AIRFeaCnt", example = "2", description = "The total number of formal enforcement actions taken against the facility within the last five years.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRFeaCnt")
  public String getAiRFeaCnt() {
    return aiRFeaCnt;
  }

  public void setAiRFeaCnt(String aiRFeaCnt) {
    this.aiRFeaCnt = aiRFeaCnt;
  }

  public Air03 aiRHpvStatus(String aiRHpvStatus) {
    this.aiRHpvStatus = aiRHpvStatus;
    return this;
  }

  /**
   * Indicates whether the facility currently has an unresolved High Priority Violation (HPV) under the Clean Air Act.
   * @return aiRHpvStatus
  */
  @NotNull 
  @Schema(name = "AIRHpvStatus", example = "true", description = "Indicates whether the facility currently has an unresolved High Priority Violation (HPV) under the Clean Air Act.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRHpvStatus")
  public String getAiRHpvStatus() {
    return aiRHpvStatus;
  }

  public void setAiRHpvStatus(String aiRHpvStatus) {
    this.aiRHpvStatus = aiRHpvStatus;
  }

  public Air03 aiRIDs(String aiRIDs) {
    this.aiRIDs = aiRIDs;
    return this;
  }

  /**
   * Air Facility System (AFS) ID.
   * @return aiRIDs
  */
  @NotNull 
  @Schema(name = "AIRIDs", example = "DC0000001100195254", description = "Air Facility System (AFS) ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRIDs")
  public String getAiRIDs() {
    return aiRIDs;
  }

  public void setAiRIDs(String aiRIDs) {
    this.aiRIDs = aiRIDs;
  }

  public Air03 aiRIeaCnt(String aiRIeaCnt) {
    this.aiRIeaCnt = aiRIeaCnt;
    return this;
  }

  /**
   * The total number of informal enforcement actions taken against the facility within the last five years.
   * @return aiRIeaCnt
  */
  @NotNull 
  @Schema(name = "AIRIeaCnt", example = "2", description = "The total number of informal enforcement actions taken against the facility within the last five years.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRIeaCnt")
  public String getAiRIeaCnt() {
    return aiRIeaCnt;
  }

  public void setAiRIeaCnt(String aiRIeaCnt) {
    this.aiRIeaCnt = aiRIeaCnt;
  }

  public Air03 aiRIndianCntryFlg(String aiRIndianCntryFlg) {
    this.aiRIndianCntryFlg = aiRIndianCntryFlg;
    return this;
  }

  /**
   * Flag indicating whether the AIR facility is located in Indian country.
   * @return aiRIndianCntryFlg
  */
  @NotNull 
  @Schema(name = "AIRIndianCntryFlg", example = "N", description = "Flag indicating whether the AIR facility is located in Indian country.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRIndianCntryFlg")
  public String getAiRIndianCntryFlg() {
    return aiRIndianCntryFlg;
  }

  public void setAiRIndianCntryFlg(String aiRIndianCntryFlg) {
    this.aiRIndianCntryFlg = aiRIndianCntryFlg;
  }

  public Air03 aiRLastEvalDate(String aiRLastEvalDate) {
    this.aiRLastEvalDate = aiRLastEvalDate;
    return this;
  }

  /**
   * The date on which the most recent Full Compliance Evaluation (FCE) of the facility by EPA or a state agency was completed.
   * @return aiRLastEvalDate
  */
  @NotNull 
  @Schema(name = "AIRLastEvalDate", example = "05/18/2009", description = "The date on which the most recent Full Compliance Evaluation (FCE) of the facility by EPA or a state agency was completed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastEvalDate")
  public String getAiRLastEvalDate() {
    return aiRLastEvalDate;
  }

  public void setAiRLastEvalDate(String aiRLastEvalDate) {
    this.aiRLastEvalDate = aiRLastEvalDate;
  }

  public Air03 aiRLastEvalDateEPA(String aiRLastEvalDateEPA) {
    this.aiRLastEvalDateEPA = aiRLastEvalDateEPA;
    return this;
  }

  /**
   * The last Air Inspection Date performed by EPA.
   * @return aiRLastEvalDateEPA
  */
  @NotNull 
  @Schema(name = "AIRLastEvalDateEPA", example = "05/16/2014", description = "The last Air Inspection Date performed by EPA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastEvalDateEPA")
  public String getAiRLastEvalDateEPA() {
    return aiRLastEvalDateEPA;
  }

  public void setAiRLastEvalDateEPA(String aiRLastEvalDateEPA) {
    this.aiRLastEvalDateEPA = aiRLastEvalDateEPA;
  }

  public Air03 aiRLastEvalDateState(String aiRLastEvalDateState) {
    this.aiRLastEvalDateState = aiRLastEvalDateState;
    return this;
  }

  /**
   * The last Air Inspection Date performed by State or local authorities.
   * @return aiRLastEvalDateState
  */
  @NotNull 
  @Schema(name = "AIRLastEvalDateState", example = "05/18/2009", description = "The last Air Inspection Date performed by State or local authorities.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastEvalDateState")
  public String getAiRLastEvalDateState() {
    return aiRLastEvalDateState;
  }

  public void setAiRLastEvalDateState(String aiRLastEvalDateState) {
    this.aiRLastEvalDateState = aiRLastEvalDateState;
  }

  public Air03 aiRLastFeaDate(String aiRLastFeaDate) {
    this.aiRLastFeaDate = aiRLastFeaDate;
    return this;
  }

  /**
   * The effective date of the most recent listed formal enforcement action taken against the facility.
   * @return aiRLastFeaDate
  */
  @NotNull 
  @Schema(name = "AIRLastFeaDate", example = "05/16/2014", description = "The effective date of the most recent listed formal enforcement action taken against the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastFeaDate")
  public String getAiRLastFeaDate() {
    return aiRLastFeaDate;
  }

  public void setAiRLastFeaDate(String aiRLastFeaDate) {
    this.aiRLastFeaDate = aiRLastFeaDate;
  }

  public Air03 aiRLastFeaDateEPA(String aiRLastFeaDateEPA) {
    this.aiRLastFeaDateEPA = aiRLastFeaDateEPA;
    return this;
  }

  /**
   * The last Air Formal Enforcement Action Date take by EPA.
   * @return aiRLastFeaDateEPA
  */
  @NotNull 
  @Schema(name = "AIRLastFeaDateEPA", example = "05/16/2014", description = "The last Air Formal Enforcement Action Date take by EPA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastFeaDateEPA")
  public String getAiRLastFeaDateEPA() {
    return aiRLastFeaDateEPA;
  }

  public void setAiRLastFeaDateEPA(String aiRLastFeaDateEPA) {
    this.aiRLastFeaDateEPA = aiRLastFeaDateEPA;
  }

  public Air03 aiRLastFeaDateState(String aiRLastFeaDateState) {
    this.aiRLastFeaDateState = aiRLastFeaDateState;
    return this;
  }

  /**
   * The last Air Formal Enforcement Action Date take by State or Local authorities.
   * @return aiRLastFeaDateState
  */
  @NotNull 
  @Schema(name = "AIRLastFeaDateState", example = "05/16/2014", description = "The last Air Formal Enforcement Action Date take by State or Local authorities.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastFeaDateState")
  public String getAiRLastFeaDateState() {
    return aiRLastFeaDateState;
  }

  public void setAiRLastFeaDateState(String aiRLastFeaDateState) {
    this.aiRLastFeaDateState = aiRLastFeaDateState;
  }

  public Air03 aiRLastIeaDate(String aiRLastIeaDate) {
    this.aiRLastIeaDate = aiRLastIeaDate;
    return this;
  }

  /**
   * The effective date of the most recent listed informal enforcement action taken against the facility.
   * @return aiRLastIeaDate
  */
  @NotNull 
  @Schema(name = "AIRLastIeaDate", example = "04/25/2014", description = "The effective date of the most recent listed informal enforcement action taken against the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastIeaDate")
  public String getAiRLastIeaDate() {
    return aiRLastIeaDate;
  }

  public void setAiRLastIeaDate(String aiRLastIeaDate) {
    this.aiRLastIeaDate = aiRLastIeaDate;
  }

  public Air03 aiRLastIeaDateEPA(String aiRLastIeaDateEPA) {
    this.aiRLastIeaDateEPA = aiRLastIeaDateEPA;
    return this;
  }

  /**
   * The effective date of the most recent listed informal enforcement action taken against the facility by EPA.
   * @return aiRLastIeaDateEPA
  */
  @NotNull 
  @Schema(name = "AIRLastIeaDateEPA", example = "04/25/2014", description = "The effective date of the most recent listed informal enforcement action taken against the facility by EPA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastIeaDateEPA")
  public String getAiRLastIeaDateEPA() {
    return aiRLastIeaDateEPA;
  }

  public void setAiRLastIeaDateEPA(String aiRLastIeaDateEPA) {
    this.aiRLastIeaDateEPA = aiRLastIeaDateEPA;
  }

  public Air03 aiRLastIeaDateState(String aiRLastIeaDateState) {
    this.aiRLastIeaDateState = aiRLastIeaDateState;
    return this;
  }

  /**
   * The effective date of the most recent listed informal enforcement action taken against the facility by a state agency.
   * @return aiRLastIeaDateState
  */
  @NotNull 
  @Schema(name = "AIRLastIeaDateState", example = "04/25/2014", description = "The effective date of the most recent listed informal enforcement action taken against the facility by a state agency.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastIeaDateState")
  public String getAiRLastIeaDateState() {
    return aiRLastIeaDateState;
  }

  public void setAiRLastIeaDateState(String aiRLastIeaDateState) {
    this.aiRLastIeaDateState = aiRLastIeaDateState;
  }

  public Air03 aiRLastPenaltyDate(String aiRLastPenaltyDate) {
    this.aiRLastPenaltyDate = aiRLastPenaltyDate;
    return this;
  }

  /**
   * Indicates the date on which the most recent assessed (or final) penalty was taken against the facility for AIR.
   * @return aiRLastPenaltyDate
  */
  @NotNull 
  @Schema(name = "AIRLastPenaltyDate", example = "05/16/2014", description = "Indicates the date on which the most recent assessed (or final) penalty was taken against the facility for AIR.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastPenaltyDate")
  public String getAiRLastPenaltyDate() {
    return aiRLastPenaltyDate;
  }

  public void setAiRLastPenaltyDate(String aiRLastPenaltyDate) {
    this.aiRLastPenaltyDate = aiRLastPenaltyDate;
  }

  public Air03 aiRLastStckDateEPA(String aiRLastStckDateEPA) {
    this.aiRLastStckDateEPA = aiRLastStckDateEPA;
    return this;
  }

  /**
   * The date on which the most recent stack test by EPA occurred.
   * @return aiRLastStckDateEPA
  */
  @NotNull 
  @Schema(name = "AIRLastStckDateEPA", example = "04/25/2014", description = "The date on which the most recent stack test by EPA occurred.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastStckDateEPA")
  public String getAiRLastStckDateEPA() {
    return aiRLastStckDateEPA;
  }

  public void setAiRLastStckDateEPA(String aiRLastStckDateEPA) {
    this.aiRLastStckDateEPA = aiRLastStckDateEPA;
  }

  public Air03 aiRLastStckDateState(String aiRLastStckDateState) {
    this.aiRLastStckDateState = aiRLastStckDateState;
    return this;
  }

  /**
   * The date on which the most recent stack test by a state agency occurred.
   * @return aiRLastStckDateState
  */
  @NotNull 
  @Schema(name = "AIRLastStckDateState", example = "04/25/2014", description = "The date on which the most recent stack test by a state agency occurred.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastStckDateState")
  public String getAiRLastStckDateState() {
    return aiRLastStckDateState;
  }

  public void setAiRLastStckDateState(String aiRLastStckDateState) {
    this.aiRLastStckDateState = aiRLastStckDateState;
  }

  public Air03 aiRLastStckTestDate(String aiRLastStckTestDate) {
    this.aiRLastStckTestDate = aiRLastStckTestDate;
    return this;
  }

  /**
   * The date on which the most recent stack test occurred.
   * @return aiRLastStckTestDate
  */
  @NotNull 
  @Schema(name = "AIRLastStckTestDate", example = "04/25/2014", description = "The date on which the most recent stack test occurred.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastStckTestDate")
  public String getAiRLastStckTestDate() {
    return aiRLastStckTestDate;
  }

  public void setAiRLastStckTestDate(String aiRLastStckTestDate) {
    this.aiRLastStckTestDate = aiRLastStckTestDate;
  }

  public Air03 aiRLastStckTestResults(String aiRLastStckTestResults) {
    this.aiRLastStckTestResults = aiRLastStckTestResults;
    return this;
  }

  /**
   * The result of the most recent stack test (Pass, Fail, Pending, or Blank).
   * @return aiRLastStckTestResults
  */
  @NotNull 
  @Schema(name = "AIRLastStckTestResults", example = "04/25/2014", description = "The result of the most recent stack test (Pass, Fail, Pending, or Blank).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastStckTestResults")
  public String getAiRLastStckTestResults() {
    return aiRLastStckTestResults;
  }

  public void setAiRLastStckTestResults(String aiRLastStckTestResults) {
    this.aiRLastStckTestResults = aiRLastStckTestResults;
  }

  public Air03 aiRLastViolDate(String aiRLastViolDate) {
    this.aiRLastViolDate = aiRLastViolDate;
    return this;
  }

  /**
   * The date on which the most recent violation was reported.
   * @return aiRLastViolDate
  */
  @NotNull 
  @Schema(name = "AIRLastViolDate", example = "04/25/2014", description = "The date on which the most recent violation was reported.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRLastViolDate")
  public String getAiRLastViolDate() {
    return aiRLastViolDate;
  }

  public void setAiRLastViolDate(String aiRLastViolDate) {
    this.aiRLastViolDate = aiRLastViolDate;
  }

  public Air03 aiRMacts(String aiRMacts) {
    this.aiRMacts = aiRMacts;
    return this;
  }

  /**
   * The Maximum Achievable Control Technology (MACT) Subpart associated with the facility.
   * @return aiRMacts
  */
  @NotNull 
  @Schema(name = "AIRMacts", example = "ZZZZZ", description = "The Maximum Achievable Control Technology (MACT) Subpart associated with the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRMacts")
  public String getAiRMacts() {
    return aiRMacts;
  }

  public void setAiRMacts(String aiRMacts) {
    this.aiRMacts = aiRMacts;
  }

  public Air03 aiRMajorFlag(String aiRMajorFlag) {
    this.aiRMajorFlag = aiRMajorFlag;
    return this;
  }

  /**
   * Indicated whether the facility is designated as a major facilitiy.
   * @return aiRMajorFlag
  */
  @NotNull 
  @Schema(name = "AIRMajorFlag", example = "N", description = "Indicated whether the facility is designated as a major facilitiy.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRMajorFlag")
  public String getAiRMajorFlag() {
    return aiRMajorFlag;
  }

  public void setAiRMajorFlag(String aiRMajorFlag) {
    this.aiRMajorFlag = aiRMajorFlag;
  }

  public Air03 aiRMnthsWithHpv(String aiRMnthsWithHpv) {
    this.aiRMnthsWithHpv = aiRMnthsWithHpv;
    return this;
  }

  /**
   * The number of months in the last three years in which the permit or site is considered in High Priority Violation (HPV) status
   * @return aiRMnthsWithHpv
  */
  @NotNull 
  @Schema(name = "AIRMnthsWithHpv", example = "3", description = "The number of months in the last three years in which the permit or site is considered in High Priority Violation (HPV) status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRMnthsWithHpv")
  public String getAiRMnthsWithHpv() {
    return aiRMnthsWithHpv;
  }

  public void setAiRMnthsWithHpv(String aiRMnthsWithHpv) {
    this.aiRMnthsWithHpv = aiRMnthsWithHpv;
  }

  public Air03 AIRNAICS(String AIRNAICS) {
    this.AIRNAICS = AIRNAICS;
    return this;
  }

  /**
   * The facility’s or permit's primary North American Industry Classification System (NAICS) Code.
   * @return AIRNAICS
  */
  @NotNull 
  @Schema(name = "AIRNAICS", example = "812320", description = "The facility’s or permit's primary North American Industry Classification System (NAICS) Code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRNAICS")
  public String getAIRNAICS() {
    return AIRNAICS;
  }

  public void setAIRNAICS(String AIRNAICS) {
    this.AIRNAICS = AIRNAICS;
  }

  public Air03 aiRName(String aiRName) {
    this.aiRName = aiRName;
    return this;
  }

  /**
   * The name of the AIR Facility.
   * @return aiRName
  */
  @NotNull 
  @Schema(name = "AIRName", example = "WEST PARK CLEANERS", description = "The name of the AIR Facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRName")
  public String getAiRName() {
    return aiRName;
  }

  public void setAiRName(String aiRName) {
    this.aiRName = aiRName;
  }

  public Air03 aiRNsps(String aiRNsps) {
    this.aiRNsps = aiRNsps;
    return this;
  }

  /**
   * The New Source Performance Standards (NSPS) Subpart associated with the facility.
   * @return aiRNsps
  */
  @NotNull 
  @Schema(name = "AIRNsps", example = "NSPS Part 60", description = "The New Source Performance Standards (NSPS) Subpart associated with the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRNsps")
  public String getAiRNsps() {
    return aiRNsps;
  }

  public void setAiRNsps(String aiRNsps) {
    this.aiRNsps = aiRNsps;
  }

  public Air03 aiRNspsm(String aiRNspsm) {
    this.aiRNspsm = aiRNspsm;
    return this;
  }

  /**
   * The Non-Major New Source Performance Standards (NSPS) Subpart associated with the facility.
   * @return aiRNspsm
  */
  @NotNull 
  @Schema(name = "AIRNspsm", example = "NSPS Part 60", description = "The Non-Major New Source Performance Standards (NSPS) Subpart associated with the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRNspsm")
  public String getAiRNspsm() {
    return aiRNspsm;
  }

  public void setAiRNspsm(String aiRNspsm) {
    this.aiRNspsm = aiRNspsm;
  }

  public Air03 aiRPenalties(String aiRPenalties) {
    this.aiRPenalties = aiRPenalties;
    return this;
  }

  /**
   * The total dollar amount of assessed (or final) penalties taken against the facility within the last five years under the Clean Air Act. This value only includes penalties that have been entered in the national program database, ICIS-Air.
   * @return aiRPenalties
  */
  @NotNull 
  @Schema(name = "AIRPenalties", example = "$435", description = "The total dollar amount of assessed (or final) penalties taken against the facility within the last five years under the Clean Air Act. This value only includes penalties that have been entered in the national program database, ICIS-Air.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRPenalties")
  public String getAiRPenalties() {
    return aiRPenalties;
  }

  public void setAiRPenalties(String aiRPenalties) {
    this.aiRPenalties = aiRPenalties;
  }

  public Air03 aiRPollRecentViol(String aiRPollRecentViol) {
    this.aiRPollRecentViol = aiRPollRecentViol;
    return this;
  }

  /**
   * The names of pollutants or pollutant categories with violations reported in the last year.
   * @return aiRPollRecentViol
  */
  @NotNull 
  @Schema(name = "AIRPollRecentViol", example = "Sulfur", description = "The names of pollutants or pollutant categories with violations reported in the last year.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRPollRecentViol")
  public String getAiRPollRecentViol() {
    return aiRPollRecentViol;
  }

  public void setAiRPollRecentViol(String aiRPollRecentViol) {
    this.aiRPollRecentViol = aiRPollRecentViol;
  }

  public Air03 aiRPrograms(String aiRPrograms) {
    this.aiRPrograms = aiRPrograms;
    return this;
  }

  /**
   * Comma-delimited list of AIR programs.
   * @return aiRPrograms
  */
  @NotNull 
  @Schema(name = "AIRPrograms", example = "MACT, SIP", description = "Comma-delimited list of AIR programs.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRPrograms")
  public String getAiRPrograms() {
    return aiRPrograms;
  }

  public void setAiRPrograms(String aiRPrograms) {
    this.aiRPrograms = aiRPrograms;
  }

  public Air03 aiRQtrsWithHpv(String aiRQtrsWithHpv) {
    this.aiRQtrsWithHpv = aiRQtrsWithHpv;
    return this;
  }

  /**
   * The number of quarters in the last three years in which the permit or site is considered in High Priority Violation (HPV) status.
   * @return aiRQtrsWithHpv
  */
  @NotNull 
  @Schema(name = "AIRQtrsWithHpv", example = "4", description = "The number of quarters in the last three years in which the permit or site is considered in High Priority Violation (HPV) status.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRQtrsWithHpv")
  public String getAiRQtrsWithHpv() {
    return aiRQtrsWithHpv;
  }

  public void setAiRQtrsWithHpv(String aiRQtrsWithHpv) {
    this.aiRQtrsWithHpv = aiRQtrsWithHpv;
  }

  public Air03 aiRQtrsWithViol(String aiRQtrsWithViol) {
    this.aiRQtrsWithViol = aiRQtrsWithViol;
    return this;
  }

  /**
   * The number of quarters in the last three years in which the permit or site has had unresolved violation(s) reported.
   * @return aiRQtrsWithViol
  */
  @NotNull 
  @Schema(name = "AIRQtrsWithViol", example = "2", description = "The number of quarters in the last three years in which the permit or site has had unresolved violation(s) reported.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRQtrsWithViol")
  public String getAiRQtrsWithViol() {
    return aiRQtrsWithViol;
  }

  public void setAiRQtrsWithViol(String aiRQtrsWithViol) {
    this.aiRQtrsWithViol = aiRQtrsWithViol;
  }

  public Air03 aiRRecentViolCnt(String aiRRecentViolCnt) {
    this.aiRRecentViolCnt = aiRRecentViolCnt;
    return this;
  }

  /**
   * The number of violations reported in the last year.
   * @return aiRRecentViolCnt
  */
  @NotNull 
  @Schema(name = "AIRRecentViolCnt", example = "1", description = "The number of violations reported in the last year.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRRecentViolCnt")
  public String getAiRRecentViolCnt() {
    return aiRRecentViolCnt;
  }

  public void setAiRRecentViolCnt(String aiRRecentViolCnt) {
    this.aiRRecentViolCnt = aiRRecentViolCnt;
  }

  public Air03 aiRStackTest5YrAll(String aiRStackTest5YrAll) {
    this.aiRStackTest5YrAll = aiRStackTest5YrAll;
    return this;
  }

  /**
   * Get aiRStackTest5YrAll
   * @return aiRStackTest5YrAll
  */
  @NotNull 
  @Schema(name = "AIRStackTest5YrAll", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRStackTest5YrAll")
  public String getAiRStackTest5YrAll() {
    return aiRStackTest5YrAll;
  }

  public void setAiRStackTest5YrAll(String aiRStackTest5YrAll) {
    this.aiRStackTest5YrAll = aiRStackTest5YrAll;
  }

  public Air03 aiRStackTest5YrFail(String aiRStackTest5YrFail) {
    this.aiRStackTest5YrFail = aiRStackTest5YrFail;
    return this;
  }

  /**
   * Get aiRStackTest5YrFail
   * @return aiRStackTest5YrFail
  */
  @NotNull 
  @Schema(name = "AIRStackTest5YrFail", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRStackTest5YrFail")
  public String getAiRStackTest5YrFail() {
    return aiRStackTest5YrFail;
  }

  public void setAiRStackTest5YrFail(String aiRStackTest5YrFail) {
    this.aiRStackTest5YrFail = aiRStackTest5YrFail;
  }

  public Air03 aiRState(String aiRState) {
    this.aiRState = aiRState;
    return this;
  }

  /**
   * The state where the AIR facility is located.
   * @return aiRState
  */
  @NotNull 
  @Schema(name = "AIRState", example = "WI", description = "The state where the AIR facility is located.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRState")
  public String getAiRState() {
    return aiRState;
  }

  public void setAiRState(String aiRState) {
    this.aiRState = aiRState;
  }

  public Air03 aiRStatus(String aiRStatus) {
    this.aiRStatus = aiRStatus;
    return this;
  }

  /**
   * The status of the AIR facility location.
   * @return aiRStatus
  */
  @NotNull 
  @Schema(name = "AIRStatus", example = "Permanently Closed", description = "The status of the AIR facility location.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRStatus")
  public String getAiRStatus() {
    return aiRStatus;
  }

  public void setAiRStatus(String aiRStatus) {
    this.aiRStatus = aiRStatus;
  }

  public Air03 aiRStreet(String aiRStreet) {
    this.aiRStreet = aiRStreet;
    return this;
  }

  /**
   * The street address of the AIR facility location.
   * @return aiRStreet
  */
  @NotNull 
  @Schema(name = "AIRStreet", example = "2130 P STREET N.W.", description = "The street address of the AIR facility location.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRStreet")
  public String getAiRStreet() {
    return aiRStreet;
  }

  public void setAiRStreet(String aiRStreet) {
    this.aiRStreet = aiRStreet;
  }

  public Air03 aiRTRIbalEPAids(String aiRTRIbalEPAids) {
    this.aiRTRIbalEPAids = aiRTRIbalEPAids;
    return this;
  }

  /**
   * The EPA Tribal or Native Alaskan Village Identifier for facilities, that based on their Best Pick FRS spatial coordinate, are within a Tribal or Alaskan Village area.
   * @return aiRTRIbalEPAids
  */
  @NotNull 
  @Schema(name = "AIRTRIbalEPAids", description = "The EPA Tribal or Native Alaskan Village Identifier for facilities, that based on their Best Pick FRS spatial coordinate, are within a Tribal or Alaskan Village area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRTRIbalEPAids")
  public String getAiRTRIbalEPAids() {
    return aiRTRIbalEPAids;
  }

  public void setAiRTRIbalEPAids(String aiRTRIbalEPAids) {
    this.aiRTRIbalEPAids = aiRTRIbalEPAids;
  }

  public Air03 aiRTRIbalNames(String aiRTRIbalNames) {
    this.aiRTRIbalNames = aiRTRIbalNames;
    return this;
  }

  /**
   * The EPA Tribal or Native Alaskan Village Name for facilities, that based on their Best Pick FRS spatial coordinate, are within a Tribal or Alaskan Village area.
   * @return aiRTRIbalNames
  */
  @NotNull 
  @Schema(name = "AIRTRIbalNames", description = "The EPA Tribal or Native Alaskan Village Name for facilities, that based on their Best Pick FRS spatial coordinate, are within a Tribal or Alaskan Village area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRTRIbalNames")
  public String getAiRTRIbalNames() {
    return aiRTRIbalNames;
  }

  public void setAiRTRIbalNames(String aiRTRIbalNames) {
    this.aiRTRIbalNames = aiRTRIbalNames;
  }

  public Air03 aiRUniverse(String aiRUniverse) {
    this.aiRUniverse = aiRUniverse;
    return this;
  }

  /**
   * The program office defines each CAA Source ID and the associated permits as being Federally Reportable or Non-Federally Reportable. Under the CAA, federally reportable source include majors, synthetic minors, NESHAP Part 61 minors, minors with an unresolved High Priority Violation (HPV), with recent enforcement action, or included on a Compliance Monitoring Strategy plan.
   * @return aiRUniverse
  */
  @NotNull 
  @Schema(name = "AIRUniverse", example = "Minor Emissions", description = "The program office defines each CAA Source ID and the associated permits as being Federally Reportable or Non-Federally Reportable. Under the CAA, federally reportable source include majors, synthetic minors, NESHAP Part 61 minors, minors with an unresolved High Priority Violation (HPV), with recent enforcement action, or included on a Compliance Monitoring Strategy plan.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRUniverse")
  public String getAiRUniverse() {
    return aiRUniverse;
  }

  public void setAiRUniverse(String aiRUniverse) {
    this.aiRUniverse = aiRUniverse;
  }

  public Air03 aiRZip(String aiRZip) {
    this.aiRZip = aiRZip;
    return this;
  }

  /**
   * The five-digit zip code of the AIR facility.
   * @return aiRZip
  */
  @NotNull 
  @Schema(name = "AIRZip", example = "20037", description = "The five-digit zip code of the AIR facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("AIRZip")
  public String getAiRZip() {
    return aiRZip;
  }

  public void setAiRZip(String aiRZip) {
    this.aiRZip = aiRZip;
  }

  public Air03 activeLower48(String activeLower48) {
    this.activeLower48 = activeLower48;
    return this;
  }

  /**
   * A Y/N indicator indicating that the facility is active and located within the lower 48 contiguous US States.
   * @return activeLower48
  */
  @NotNull 
  @Schema(name = "ActiveLower48", description = "A Y/N indicator indicating that the facility is active and located within the lower 48 contiguous US States.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ActiveLower48")
  public String getActiveLower48() {
    return activeLower48;
  }

  public void setActiveLower48(String activeLower48) {
    this.activeLower48 = activeLower48;
  }

  public Air03 cwAIDs(String cwAIDs) {
    this.cwAIDs = cwAIDs;
    return this;
  }

  /**
   * A unique  ID assigned for each record/permit/site/facility within ICIS-NPDES. These identifiers are for used tracking purposes in the individual data systems.
   * @return cwAIDs
  */
  @NotNull 
  @Schema(name = "CWAIDs", example = "DC0000001", description = "A unique  ID assigned for each record/permit/site/facility within ICIS-NPDES. These identifiers are for used tracking purposes in the individual data systems.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CWAIDs")
  public String getCwAIDs() {
    return cwAIDs;
  }

  public void setCwAIDs(String cwAIDs) {
    this.cwAIDs = cwAIDs;
  }

  public Air03 calculatedAccuracyMeters(String calculatedAccuracyMeters) {
    this.calculatedAccuracyMeters = calculatedAccuracyMeters;
    return this;
  }

  /**
   * The estimated accuracy in Meters for the facility's geospatial coordinate.
   * @return calculatedAccuracyMeters
  */
  @NotNull 
  @Schema(name = "CalculatedAccuracyMeters", example = "50", description = "The estimated accuracy in Meters for the facility's geospatial coordinate.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CalculatedAccuracyMeters")
  public String getCalculatedAccuracyMeters() {
    return calculatedAccuracyMeters;
  }

  public void setCalculatedAccuracyMeters(String calculatedAccuracyMeters) {
    this.calculatedAccuracyMeters = calculatedAccuracyMeters;
  }

  public Air03 camdIDs(String camdIDs) {
    this.camdIDs = camdIDs;
    return this;
  }

  /**
   * Facility identifiers for the Clean Air Markets Division database.
   * @return camdIDs
  */
  @NotNull 
  @Schema(name = "CamdIDs", description = "Facility identifiers for the Clean Air Markets Division database.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CamdIDs")
  public String getCamdIDs() {
    return camdIDs;
  }

  public void setCamdIDs(String camdIDs) {
    this.camdIDs = camdIDs;
  }

  public Air03 censusBlockGroup(String censusBlockGroup) {
    this.censusBlockGroup = censusBlockGroup;
    return this;
  }

  /**
   * A geographic unit used by the United States Census Bureau, generally defined to contain between 600 and 3,000 people.
   * @return censusBlockGroup
  */
  @NotNull 
  @Schema(name = "CensusBlockGroup", example = "110010096022", description = "A geographic unit used by the United States Census Bureau, generally defined to contain between 600 and 3,000 people.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CensusBlockGroup")
  public String getCensusBlockGroup() {
    return censusBlockGroup;
  }

  public void setCensusBlockGroup(String censusBlockGroup) {
    this.censusBlockGroup = censusBlockGroup;
  }

  public Air03 chesapeakeBayFlag(String chesapeakeBayFlag) {
    this.chesapeakeBayFlag = chesapeakeBayFlag;
    return this;
  }

  /**
   * Displays \"Y\" if the facility is located within the Chesapeake Bay watershed.
   * @return chesapeakeBayFlag
  */
  @NotNull 
  @Schema(name = "ChesapeakeBayFlag", example = "Y", description = "Displays \"Y\" if the facility is located within the Chesapeake Bay watershed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ChesapeakeBayFlag")
  public String getChesapeakeBayFlag() {
    return chesapeakeBayFlag;
  }

  public void setChesapeakeBayFlag(String chesapeakeBayFlag) {
    this.chesapeakeBayFlag = chesapeakeBayFlag;
  }

  public Air03 collectionMethod(String collectionMethod) {
    this.collectionMethod = collectionMethod;
    return this;
  }

  /**
   * ??
   * @return collectionMethod
  */
  @NotNull 
  @Schema(name = "CollectionMethod", example = "ADDRESS MATCHING-HOUSE NUMBER", description = "??", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CollectionMethod")
  public String getCollectionMethod() {
    return collectionMethod;
  }

  public void setCollectionMethod(String collectionMethod) {
    this.collectionMethod = collectionMethod;
  }

  public Air03 currSvFlag(String currSvFlag) {
    this.currSvFlag = currSvFlag;
    return this;
  }

  /**
   * Indicates if the facility has a current significant violation. 1 = Yes
   * @return currSvFlag
  */
  @NotNull 
  @Schema(name = "CurrSvFlag", example = "0", description = "Indicates if the facility has a current significant violation. 1 = Yes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CurrSvFlag")
  public String getCurrSvFlag() {
    return currSvFlag;
  }

  public void setCurrSvFlag(String currSvFlag) {
    this.currSvFlag = currSvFlag;
  }

  public Air03 currVioFlag(String currVioFlag) {
    this.currVioFlag = currVioFlag;
    return this;
  }

  /**
   * Indicates if the facility has a current violation. 1 = Yes
   * @return currVioFlag
  */
  @NotNull 
  @Schema(name = "CurrVioFlag", example = "0", description = "Indicates if the facility has a current violation. 1 = Yes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("CurrVioFlag")
  public String getCurrVioFlag() {
    return currVioFlag;
  }

  public void setCurrVioFlag(String currVioFlag) {
    this.currVioFlag = currVioFlag;
  }

  public Air03 epASystem(String epASystem) {
    this.epASystem = epASystem;
    return this;
  }

  /**
   * The EPA data system in which permit and facility records are kept. EPA's Facility Registry System (FRS) links all program database records (such as permit IDs and IDs facilities use in reporting to EPA) together. The following list describes the individual data systems that are linked to from the detailed facility report:   - AFS: Air Facility System for Clean Air Act stationary source programs. - ICP: Integrated Compliance Information System for Clean Water Act programs monitoring National Pollutant Discharge Elimination System (NPDES) permits. - RCR: Resource Conservation and Recovery Act Information System (RCRAInfo) for tracking the Resource Conservation and Recovery Act (RCRA) programs. - NCDB: National Compliance Database System for monitoring national performance of the Toxic Substance Control Act (TSCA); the Emergency Planning and Right-to-Know Act, Section 313 (EPCRA); the Asbestos Hazard Emergency Response (AHERA); and the Federal Insecticide, Fungicide, and Rodenticide Act (FIFRA). - TRI: Toxics Release Inventory for Emergency Planning and Community Right-to-Know Act, Section 313 submissions. - NEI: National Emissions Inventory database contains information on stationary and mobile sources that emit criteria air pollutants and their precursors, as well as hazardous air pollutants (HAPs). The database includes estimates of annual emissions, by source, of air pollutants in each area of the country, on an annual basis. - TSCA: Toxic Substances Control Act addressing the production, importation, use, and disposal of specific chemicals.
   * @return epASystem
  */
  @NotNull 
  @Schema(name = "EPASystem", example = "ICP", description = "The EPA data system in which permit and facility records are kept. EPA's Facility Registry System (FRS) links all program database records (such as permit IDs and IDs facilities use in reporting to EPA) together. The following list describes the individual data systems that are linked to from the detailed facility report:   - AFS: Air Facility System for Clean Air Act stationary source programs. - ICP: Integrated Compliance Information System for Clean Water Act programs monitoring National Pollutant Discharge Elimination System (NPDES) permits. - RCR: Resource Conservation and Recovery Act Information System (RCRAInfo) for tracking the Resource Conservation and Recovery Act (RCRA) programs. - NCDB: National Compliance Database System for monitoring national performance of the Toxic Substance Control Act (TSCA); the Emergency Planning and Right-to-Know Act, Section 313 (EPCRA); the Asbestos Hazard Emergency Response (AHERA); and the Federal Insecticide, Fungicide, and Rodenticide Act (FIFRA). - TRI: Toxics Release Inventory for Emergency Planning and Community Right-to-Know Act, Section 313 submissions. - NEI: National Emissions Inventory database contains information on stationary and mobile sources that emit criteria air pollutants and their precursors, as well as hazardous air pollutants (HAPs). The database includes estimates of annual emissions, by source, of air pollutants in each area of the country, on an annual basis. - TSCA: Toxic Substances Control Act addressing the production, importation, use, and disposal of specific chemicals.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EPASystem")
  public String getEpASystem() {
    return epASystem;
  }

  public void setEpASystem(String epASystem) {
    this.epASystem = epASystem;
  }

  public Air03 ea5yrFlag(String ea5yrFlag) {
    this.ea5yrFlag = ea5yrFlag;
    return this;
  }

  /**
   * Indicates if the facility has a formal enforcement action within the last 5 years. 1 = Yes
   * @return ea5yrFlag
  */
  @NotNull 
  @Schema(name = "Ea5yrFlag", example = "0", description = "Indicates if the facility has a formal enforcement action within the last 5 years. 1 = Yes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Ea5yrFlag")
  public String getEa5yrFlag() {
    return ea5yrFlag;
  }

  public void setEa5yrFlag(String ea5yrFlag) {
    this.ea5yrFlag = ea5yrFlag;
  }

  public Air03 eisIDs(String eisIDs) {
    this.eisIDs = eisIDs;
    return this;
  }

  /**
   * A unique ID assigned for each facility within EPA’s Emissions Inventory System (EIS) Database.
   * @return eisIDs
  */
  @NotNull 
  @Schema(name = "EisIDs", example = "12620001", description = "A unique ID assigned for each facility within EPA’s Emissions Inventory System (EIS) Database.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EisIDs")
  public String getEisIDs() {
    return eisIDs;
  }

  public void setEisIDs(String eisIDs) {
    this.eisIDs = eisIDs;
  }

  public Air03 ejscreenFlag(String ejscreenFlag) {
    this.ejscreenFlag = ejscreenFlag;
    return this;
  }

  /**
   * A Y/N indicator identifying whether or not the facility is within an Environmental Justice area.
   * @return ejscreenFlag
  */
  @NotNull 
  @Schema(name = "EjscreenFlag", description = "A Y/N indicator identifying whether or not the facility is within an Environmental Justice area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EjscreenFlag")
  public String getEjscreenFlag() {
    return ejscreenFlag;
  }

  public void setEjscreenFlag(String ejscreenFlag) {
    this.ejscreenFlag = ejscreenFlag;
  }

  public Air03 ejscreenFlagUs(String ejscreenFlagUs) {
    this.ejscreenFlagUs = ejscreenFlagUs;
    return this;
  }

  /**
   * A Y/N indicator identifying whether or not the facility is within an Environmental Justice area.
   * @return ejscreenFlagUs
  */
  @NotNull 
  @Schema(name = "EjscreenFlagUs", description = "A Y/N indicator identifying whether or not the facility is within an Environmental Justice area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("EjscreenFlagUs")
  public String getEjscreenFlagUs() {
    return ejscreenFlagUs;
  }

  public void setEjscreenFlagUs(String ejscreenFlagUs) {
    this.ejscreenFlagUs = ejscreenFlagUs;
  }

  public Air03 facCamdReporter(String facCamdReporter) {
    this.facCamdReporter = facCamdReporter;
    return this;
  }

  /**
   * Indicates whether the facility reports to the Clean Air Markets Division (CAMD).
   * @return facCamdReporter
  */
  @NotNull 
  @Schema(name = "FacCamdReporter", example = "Y", description = "Indicates whether the facility reports to the Clean Air Markets Division (CAMD).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacCamdReporter")
  public String getFacCamdReporter() {
    return facCamdReporter;
  }

  public void setFacCamdReporter(String facCamdReporter) {
    this.facCamdReporter = facCamdReporter;
  }

  public Air03 facCountyName(String facCountyName) {
    this.facCountyName = facCountyName;
    return this;
  }

  /**
   * The facility county name from EPA's Facility Registry System
   * @return facCountyName
  */
  @NotNull 
  @Schema(name = "FacCountyName", example = "Fairfax County", description = "The facility county name from EPA's Facility Registry System", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacCountyName")
  public String getFacCountyName() {
    return facCountyName;
  }

  public void setFacCountyName(String facCountyName) {
    this.facCountyName = facCountyName;
  }

  public Air03 facDerivedHuc(String facDerivedHuc) {
    this.facDerivedHuc = facDerivedHuc;
    return this;
  }

  /**
   * The 8-digit Hydrologic Unit Code (HUC) of the watershed in which the facility resides. A HUC number is assigned to every watershed in the nation and uniquely identifies the watershed.
   * @return facDerivedHuc
  */
  @NotNull 
  @Schema(name = "FacDerivedHuc", example = "552968", description = "The 8-digit Hydrologic Unit Code (HUC) of the watershed in which the facility resides. A HUC number is assigned to every watershed in the nation and uniquely identifies the watershed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacDerivedHuc")
  public String getFacDerivedHuc() {
    return facDerivedHuc;
  }

  public void setFacDerivedHuc(String facDerivedHuc) {
    this.facDerivedHuc = facDerivedHuc;
  }

  public Air03 facDerivedTRIbes(String facDerivedTRIbes) {
    this.facDerivedTRIbes = facDerivedTRIbes;
    return this;
  }

  /**
   * The tribes or tribal territories located within 25 miles of the facility's location.
   * @return facDerivedTRIbes
  */
  @NotNull 
  @Schema(name = "FacDerivedTRIbes", example = "Cherokee Nation", description = "The tribes or tribal territories located within 25 miles of the facility's location.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacDerivedTRIbes")
  public String getFacDerivedTRIbes() {
    return facDerivedTRIbes;
  }

  public void setFacDerivedTRIbes(String facDerivedTRIbes) {
    this.facDerivedTRIbes = facDerivedTRIbes;
  }

  public Air03 facDerivedWBD(String facDerivedWBD) {
    this.facDerivedWBD = facDerivedWBD;
    return this;
  }

  /**
   * The Hydrologic Unit Code (HUC-12) of the waterbody in which the facility resides, derived based on location data in FRS.
   * @return facDerivedWBD
  */
  @NotNull 
  @Schema(name = "FacDerivedWBD", example = "20700100204", description = "The Hydrologic Unit Code (HUC-12) of the waterbody in which the facility resides, derived based on location data in FRS.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacDerivedWBD")
  public String getFacDerivedWBD() {
    return facDerivedWBD;
  }

  public void setFacDerivedWBD(String facDerivedWBD) {
    this.facDerivedWBD = facDerivedWBD;
  }

  public Air03 facDerivedWBDName(String facDerivedWBDName) {
    this.facDerivedWBDName = facDerivedWBDName;
    return this;
  }

  /**
   * The 12 digit Watershed Boundary Dataset Name derived from the FRS Best Pick Coordinate
   * @return facDerivedWBDName
  */
  @NotNull 
  @Schema(name = "FacDerivedWBDName", example = "Fourmile Run-Potomac River", description = "The 12 digit Watershed Boundary Dataset Name derived from the FRS Best Pick Coordinate", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacDerivedWBDName")
  public String getFacDerivedWBDName() {
    return facDerivedWBDName;
  }

  public void setFacDerivedWBDName(String facDerivedWBDName) {
    this.facDerivedWBDName = facDerivedWBDName;
  }

  public Air03 facEisAIRReleases(String facEisAIRReleases) {
    this.facEisAIRReleases = facEisAIRReleases;
    return this;
  }

  /**
   * The amount of hazardous air pollutants released to air in tons per year, as reported in the most recent National Emissions Inventory (NEI).
   * @return facEisAIRReleases
  */
  @NotNull 
  @Schema(name = "FacEisAIRReleases", example = "2.35", description = "The amount of hazardous air pollutants released to air in tons per year, as reported in the most recent National Emissions Inventory (NEI).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacEisAIRReleases")
  public String getFacEisAIRReleases() {
    return facEisAIRReleases;
  }

  public void setFacEisAIRReleases(String facEisAIRReleases) {
    this.facEisAIRReleases = facEisAIRReleases;
  }

  public Air03 facEisReporter(String facEisReporter) {
    this.facEisReporter = facEisReporter;
    return this;
  }

  /**
   * Indicates whether the facility reports to the Emissions Inventory System (EIS).
   * @return facEisReporter
  */
  @NotNull 
  @Schema(name = "FacEisReporter", example = "Y", description = "Indicates whether the facility reports to the Emissions Inventory System (EIS).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacEisReporter")
  public String getFacEisReporter() {
    return facEisReporter;
  }

  public void setFacEisReporter(String facEisReporter) {
    this.facEisReporter = facEisReporter;
  }

  public Air03 facFIPSCode(String facFIPSCode) {
    this.facFIPSCode = facFIPSCode;
    return this;
  }

  /**
   * The 2-digit Federal Information Processing Standards (FIPS) code to identify the county that a facility is located in.
   * @return facFIPSCode
  */
  @NotNull 
  @Schema(name = "FacFIPSCode", example = "55001", description = "The 2-digit Federal Information Processing Standards (FIPS) code to identify the county that a facility is located in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacFIPSCode")
  public String getFacFIPSCode() {
    return facFIPSCode;
  }

  public void setFacFIPSCode(String facFIPSCode) {
    this.facFIPSCode = facFIPSCode;
  }

  public Air03 facFederalAgencyCode(String facFederalAgencyCode) {
    this.facFederalAgencyCode = facFederalAgencyCode;
    return this;
  }

  /**
   * Indicates the federal agency, as classified in FRS. Federal agencies are installations that are owned and operated by the U.S. government. The five-character code consists of a letter followed by four numbers. There are four possible letters that can occupy the first character position: C = Civilian Federal Agency; D = Department of Defense; E = Department of Energy; X = Unknown. The second and third characters represent the agency code, while the fourth and fifth characters represent the bureau code.
   * @return facFederalAgencyCode
  */
  @NotNull 
  @Schema(name = "FacFederalAgencyCode", example = "E", description = "Indicates the federal agency, as classified in FRS. Federal agencies are installations that are owned and operated by the U.S. government. The five-character code consists of a letter followed by four numbers. There are four possible letters that can occupy the first character position: C = Civilian Federal Agency; D = Department of Defense; E = Department of Energy; X = Unknown. The second and third characters represent the agency code, while the fourth and fifth characters represent the bureau code.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacFederalAgencyCode")
  public String getFacFederalAgencyCode() {
    return facFederalAgencyCode;
  }

  public void setFacFederalAgencyCode(String facFederalAgencyCode) {
    this.facFederalAgencyCode = facFederalAgencyCode;
  }

  public Air03 facFederalAgencyName(String facFederalAgencyName) {
    this.facFederalAgencyName = facFederalAgencyName;
    return this;
  }

  /**
   * Indicates the name of the federal agency, as classified in FRS. Federal agencies are installations that are owned and operated by the U.S. government.
   * @return facFederalAgencyName
  */
  @NotNull 
  @Schema(name = "FacFederalAgencyName", example = "EPA", description = "Indicates the name of the federal agency, as classified in FRS. Federal agencies are installations that are owned and operated by the U.S. government.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacFederalAgencyName")
  public String getFacFederalAgencyName() {
    return facFederalAgencyName;
  }

  public void setFacFederalAgencyName(String facFederalAgencyName) {
    this.facFederalAgencyName = facFederalAgencyName;
  }

  public Air03 facGHGCO2Releases(String facGHGCO2Releases) {
    this.facGHGCO2Releases = facGHGCO2Releases;
    return this;
  }

  /**
   * The annual sum of total release amounts and \"associated quantities\" of all linked Greenhouse Gas IDs from the Office of Air and Radiation \"Summary 2010 Greenhouse Gas Data.\" Units are reported as metric tons of CO2 equivalents per year (MTCO2e/year).
   * @return facGHGCO2Releases
  */
  @NotNull 
  @Schema(name = "FacGHGCO2Releases", example = "100", description = "The annual sum of total release amounts and \"associated quantities\" of all linked Greenhouse Gas IDs from the Office of Air and Radiation \"Summary 2010 Greenhouse Gas Data.\" Units are reported as metric tons of CO2 equivalents per year (MTCO2e/year).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacGHGCO2Releases")
  public String getFacGHGCO2Releases() {
    return facGHGCO2Releases;
  }

  public void setFacGHGCO2Releases(String facGHGCO2Releases) {
    this.facGHGCO2Releases = facGHGCO2Releases;
  }

  public Air03 facGHGReporter(String facGHGReporter) {
    this.facGHGReporter = facGHGReporter;
    return this;
  }

  /**
   * Indicates whether the facility reports to the Greenhouse Gas Reporting Program (GHGRP)
   * @return facGHGReporter
  */
  @NotNull 
  @Schema(name = "FacGHGReporter", example = "Y", description = "Indicates whether the facility reports to the Greenhouse Gas Reporting Program (GHGRP)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacGHGReporter")
  public String getFacGHGReporter() {
    return facGHGReporter;
  }

  public void setFacGHGReporter(String facGHGReporter) {
    this.facGHGReporter = facGHGReporter;
  }

  public Air03 facIndianCntryFlg(String facIndianCntryFlg) {
    this.facIndianCntryFlg = facIndianCntryFlg;
    return this;
  }

  /**
   * Flag showing Y/N whether the facility is located in Indian Country.
   * @return facIndianCntryFlg
  */
  @NotNull 
  @Schema(name = "FacIndianCntryFlg", description = "Flag showing Y/N whether the facility is located in Indian Country.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacIndianCntryFlg")
  public String getFacIndianCntryFlg() {
    return facIndianCntryFlg;
  }

  public void setFacIndianCntryFlg(String facIndianCntryFlg) {
    this.facIndianCntryFlg = facIndianCntryFlg;
  }

  public Air03 facIndianSpatialFlg(String facIndianSpatialFlg) {
    this.facIndianSpatialFlg = facIndianSpatialFlg;
    return this;
  }

  /**
   * Returns “Y” if a facility is located within a tribal spatial boundary as defined by the U.S. Census Bureau 2010 tribal boundary layer data for tribes in the lower 48 states and Bureau of Land Management Alaska State Office data for native villages in Alaska. Returns “N” if a facility is not located within a tribal or native Alaskan village area.
   * @return facIndianSpatialFlg
  */
  @NotNull 
  @Schema(name = "FacIndianSpatialFlg", example = "Y", description = "Returns “Y” if a facility is located within a tribal spatial boundary as defined by the U.S. Census Bureau 2010 tribal boundary layer data for tribes in the lower 48 states and Bureau of Land Management Alaska State Office data for native villages in Alaska. Returns “N” if a facility is not located within a tribal or native Alaskan village area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacIndianSpatialFlg")
  public String getFacIndianSpatialFlg() {
    return facIndianSpatialFlg;
  }

  public void setFacIndianSpatialFlg(String facIndianSpatialFlg) {
    this.facIndianSpatialFlg = facIndianSpatialFlg;
  }

  public Air03 facLat(String facLat) {
    this.facLat = facLat;
    return this;
  }

  /**
   * The latitude of the facility in decimal degrees expressed using the NAD83 horizontal datum. The coordinate comes from the FRS EPA Locational Reference Tables (LRT) file which represents the most accurate value for the facility based on the available spatial metadata.
   * @return facLat
  */
  @NotNull 
  @Schema(name = "FacLat", example = "38.803076", description = "The latitude of the facility in decimal degrees expressed using the NAD83 horizontal datum. The coordinate comes from the FRS EPA Locational Reference Tables (LRT) file which represents the most accurate value for the facility based on the available spatial metadata.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacLat")
  public String getFacLat() {
    return facLat;
  }

  public void setFacLat(String facLat) {
    this.facLat = facLat;
  }

  public Air03 facLong(String facLong) {
    this.facLong = facLong;
    return this;
  }

  /**
   * The longitude of the facility in decimal degrees expressed using the NAD83 horizontal datum. The coordinate comes from the FRS EPA Locational Reference Tables (LRT) file which represents the most accurate value for the facility based on the available spatial metadata.
   * @return facLong
  */
  @NotNull 
  @Schema(name = "FacLong", example = "-77.085951", description = "The longitude of the facility in decimal degrees expressed using the NAD83 horizontal datum. The coordinate comes from the FRS EPA Locational Reference Tables (LRT) file which represents the most accurate value for the facility based on the available spatial metadata.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacLong")
  public String getFacLong() {
    return facLong;
  }

  public void setFacLong(String facLong) {
    this.facLong = facLong;
  }

  public Air03 facMapFlg(String facMapFlg) {
    this.facMapFlg = facMapFlg;
    return this;
  }

  /**
   * Graphical indicator denoting whether geographical data required to map a facility are available.
   * @return facMapFlg
  */
  @NotNull 
  @Schema(name = "FacMapFlg", example = "Y", description = "Graphical indicator denoting whether geographical data required to map a facility are available.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacMapFlg")
  public String getFacMapFlg() {
    return facMapFlg;
  }

  public void setFacMapFlg(String facMapFlg) {
    this.facMapFlg = facMapFlg;
  }

  public Air03 facMapIcon(String facMapIcon) {
    this.facMapIcon = facMapIcon;
    return this;
  }

  /**
   * The default map icon image file calculated for the facility by the ECHO program.
   * @return facMapIcon
  */
  @NotNull 
  @Schema(name = "FacMapIcon", example = "CWA-NC-MJ-2.png", description = "The default map icon image file calculated for the facility by the ECHO program.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacMapIcon")
  public String getFacMapIcon() {
    return facMapIcon;
  }

  public void setFacMapIcon(String facMapIcon) {
    this.facMapIcon = facMapIcon;
  }

  public Air03 facNaaFlag(String facNaaFlag) {
    this.facNaaFlag = facNaaFlag;
    return this;
  }

  /**
   * Indicates whether the facility is located in a nonattainment area of the country, where air pollution levels persistently exceed the national ambient air quality standards. This flag does not indicate whether or not the facility has violated national ambient area quality standards.
   * @return facNaaFlag
  */
  @NotNull 
  @Schema(name = "FacNaaFlag", example = "Y", description = "Indicates whether the facility is located in a nonattainment area of the country, where air pollution levels persistently exceed the national ambient air quality standards. This flag does not indicate whether or not the facility has violated national ambient area quality standards.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacNaaFlag")
  public String getFacNaaFlag() {
    return facNaaFlag;
  }

  public void setFacNaaFlag(String facNaaFlag) {
    this.facNaaFlag = facNaaFlag;
  }

  public Air03 facPercentMinority(String facPercentMinority) {
    this.facPercentMinority = facPercentMinority;
    return this;
  }

  /**
   * Percent Minority is the percentage of the population of the given area that is considered minority. Statistics are shown for the area within a 3-mile radius of each facility.
   * @return facPercentMinority
  */
  @NotNull 
  @Schema(name = "FacPercentMinority", example = "45.379", description = "Percent Minority is the percentage of the population of the given area that is considered minority. Statistics are shown for the area within a 3-mile radius of each facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacPercentMinority")
  public String getFacPercentMinority() {
    return facPercentMinority;
  }

  public void setFacPercentMinority(String facPercentMinority) {
    this.facPercentMinority = facPercentMinority;
  }

  public Air03 facPopulationDensity(String facPopulationDensity) {
    this.facPopulationDensity = facPopulationDensity;
    return this;
  }

  /**
   * The number of persons per square mile in the profiled area.
   * @return facPopulationDensity
  */
  @NotNull 
  @Schema(name = "FacPopulationDensity", example = "9611.17", description = "The number of persons per square mile in the profiled area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacPopulationDensity")
  public String getFacPopulationDensity() {
    return facPopulationDensity;
  }

  public void setFacPopulationDensity(String facPopulationDensity) {
    this.facPopulationDensity = facPopulationDensity;
  }

  public Air03 facSICCodes(String facSICCodes) {
    this.facSICCodes = facSICCodes;
    return this;
  }

  /**
   * Indicates the facility’s or permit's primary Standard Industrial Classification (SIC) Code. The SIC code describes the primary activity of the facility.
   * @return facSICCodes
  */
  @NotNull 
  @Schema(name = "FacSICCodes", example = "811", description = "Indicates the facility’s or permit's primary Standard Industrial Classification (SIC) Code. The SIC code describes the primary activity of the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacSICCodes")
  public String getFacSICCodes() {
    return facSICCodes;
  }

  public void setFacSICCodes(String facSICCodes) {
    this.facSICCodes = facSICCodes;
  }

  public Air03 facStdCountyName(String facStdCountyName) {
    this.facStdCountyName = facStdCountyName;
    return this;
  }

  /**
   * The standardized  facility county name from EPA's Facility Registry System
   * @return facStdCountyName
  */
  @NotNull 
  @Schema(name = "FacStdCountyName", example = "Fairfax County", description = "The standardized  facility county name from EPA's Facility Registry System", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacStdCountyName")
  public String getFacStdCountyName() {
    return facStdCountyName;
  }

  public void setFacStdCountyName(String facStdCountyName) {
    this.facStdCountyName = facStdCountyName;
  }

  public Air03 facTRIAIRReleases(String facTRIAIRReleases) {
    this.facTRIAIRReleases = facTRIAIRReleases;
    return this;
  }

  /**
   * The total chemical releases to air, in pounds, as reported to TRI by the facility for the most recent reporting year.
   * @return facTRIAIRReleases
  */
  @NotNull 
  @Schema(name = "FacTRIAIRReleases", example = "36", description = "The total chemical releases to air, in pounds, as reported to TRI by the facility for the most recent reporting year.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacTRIAIRReleases")
  public String getFacTRIAIRReleases() {
    return facTRIAIRReleases;
  }

  public void setFacTRIAIRReleases(String facTRIAIRReleases) {
    this.facTRIAIRReleases = facTRIAIRReleases;
  }

  public Air03 facTRICarcAIRReleases(String facTRICarcAIRReleases) {
    this.facTRICarcAIRReleases = facTRICarcAIRReleases;
    return this;
  }

  /**
   * The pounds of chemicals considered to be carcinogens released to air, as reported to TRI for the most recent reporting year. Chemicals are classified as carcinogens under the requirements of the Occupational Safety and Health Administration (OSHA).
   * @return facTRICarcAIRReleases
  */
  @NotNull 
  @Schema(name = "FacTRICarcAIRReleases", example = "24", description = "The pounds of chemicals considered to be carcinogens released to air, as reported to TRI for the most recent reporting year. Chemicals are classified as carcinogens under the requirements of the Occupational Safety and Health Administration (OSHA).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacTRICarcAIRReleases")
  public String getFacTRICarcAIRReleases() {
    return facTRICarcAIRReleases;
  }

  public void setFacTRICarcAIRReleases(String facTRICarcAIRReleases) {
    this.facTRICarcAIRReleases = facTRICarcAIRReleases;
  }

  public Air03 facTRIHapsReleases(String facTRIHapsReleases) {
    this.facTRIHapsReleases = facTRIHapsReleases;
    return this;
  }

  /**
   * The pounds of chemicals classified as hazardous air pollutants (HAPS) released to air in pounds per year, as reported to TRI for the most recent reporting year.
   * @return facTRIHapsReleases
  */
  @NotNull 
  @Schema(name = "FacTRIHapsReleases", example = "35.5", description = "The pounds of chemicals classified as hazardous air pollutants (HAPS) released to air in pounds per year, as reported to TRI for the most recent reporting year.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacTRIHapsReleases")
  public String getFacTRIHapsReleases() {
    return facTRIHapsReleases;
  }

  public void setFacTRIHapsReleases(String facTRIHapsReleases) {
    this.facTRIHapsReleases = facTRIHapsReleases;
  }

  public Air03 facTRIReporter(String facTRIReporter) {
    this.facTRIReporter = facTRIReporter;
    return this;
  }

  /**
   * Indicates whether facility reported to the Toxics Release Inventory (TRI) for the most recent reporting year.
   * @return facTRIReporter
  */
  @NotNull 
  @Schema(name = "FacTRIReporter", example = "B", description = "Indicates whether facility reported to the Toxics Release Inventory (TRI) for the most recent reporting year.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacTRIReporter")
  public String getFacTRIReporter() {
    return facTRIReporter;
  }

  public void setFacTRIReporter(String facTRIReporter) {
    this.facTRIReporter = facTRIReporter;
  }

  public Air03 facUsMexBorderFlg(String facUsMexBorderFlg) {
    this.facUsMexBorderFlg = facUsMexBorderFlg;
    return this;
  }

  /**
   * A Y/N flag indicating that the facility is within 100KM of the US-Mexico Border.
   * @return facUsMexBorderFlg
  */
  @NotNull 
  @Schema(name = "FacUsMexBorderFlg", example = "Y", description = "A Y/N flag indicating that the facility is within 100KM of the US-Mexico Border.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("FacUsMexBorderFlg")
  public String getFacUsMexBorderFlg() {
    return facUsMexBorderFlg;
  }

  public void setFacUsMexBorderFlg(String facUsMexBorderFlg) {
    this.facUsMexBorderFlg = facUsMexBorderFlg;
  }

  public Air03 ghGIDs(String ghGIDs) {
    this.ghGIDs = ghGIDs;
    return this;
  }

  /**
   * A unique ID assigned for each facility within EPA’s Greenhouse Gas Reporting Program (GHGRP) Emissions Data Sets.
   * @return ghGIDs
  */
  @NotNull 
  @Schema(name = "GHGIDs", example = "110000", description = "A unique ID assigned for each facility within EPA’s Greenhouse Gas Reporting Program (GHGRP) Emissions Data Sets.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("GHGIDs")
  public String getGhGIDs() {
    return ghGIDs;
  }

  public void setGhGIDs(String ghGIDs) {
    this.ghGIDs = ghGIDs;
  }

  public Air03 hasPollRpt(String hasPollRpt) {
    this.hasPollRpt = hasPollRpt;
    return this;
  }

  /**
   * ???
   * @return hasPollRpt
  */
  @NotNull 
  @Schema(name = "HasPollRpt", example = "Y", description = "???", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("HasPollRpt")
  public String getHasPollRpt() {
    return hasPollRpt;
  }

  public void setHasPollRpt(String hasPollRpt) {
    this.hasPollRpt = hasPollRpt;
  }

  public Air03 infea5yrFlag(String infea5yrFlag) {
    this.infea5yrFlag = infea5yrFlag;
    return this;
  }

  /**
   * Indicates if the facility has an informal enforcement action within the last 5 years. 1 = Yes.
   * @return infea5yrFlag
  */
  @NotNull 
  @Schema(name = "Infea5yrFlag", example = "0", description = "Indicates if the facility has an informal enforcement action within the last 5 years. 1 = Yes.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Infea5yrFlag")
  public String getInfea5yrFlag() {
    return infea5yrFlag;
  }

  public void setInfea5yrFlag(String infea5yrFlag) {
    this.infea5yrFlag = infea5yrFlag;
  }

  public Air03 insp5yrFlag(String insp5yrFlag) {
    this.insp5yrFlag = insp5yrFlag;
    return this;
  }

  /**
   * Indicates if the facility has an inspection within the last 5 years. 1 = Yes
   * @return insp5yrFlag
  */
  @NotNull 
  @Schema(name = "Insp5yrFlag", example = "1", description = "Indicates if the facility has an inspection within the last 5 years. 1 = Yes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Insp5yrFlag")
  public String getInsp5yrFlag() {
    return insp5yrFlag;
  }

  public void setInsp5yrFlag(String insp5yrFlag) {
    this.insp5yrFlag = insp5yrFlag;
  }

  public Air03 lastDatePce(String lastDatePce) {
    this.lastDatePce = lastDatePce;
    return this;
  }

  /**
   * The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by EPA or a state agency was completed.
   * @return lastDatePce
  */
  @NotNull 
  @Schema(name = "LastDatePce", example = "04/25/2014", description = "The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by EPA or a state agency was completed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LastDatePce")
  public String getLastDatePce() {
    return lastDatePce;
  }

  public void setLastDatePce(String lastDatePce) {
    this.lastDatePce = lastDatePce;
  }

  public Air03 lastDatePceEPA(String lastDatePceEPA) {
    this.lastDatePceEPA = lastDatePceEPA;
    return this;
  }

  /**
   * The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by EPA was completed.
   * @return lastDatePceEPA
  */
  @NotNull 
  @Schema(name = "LastDatePceEPA", example = "04/25/2014", description = "The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by EPA was completed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LastDatePceEPA")
  public String getLastDatePceEPA() {
    return lastDatePceEPA;
  }

  public void setLastDatePceEPA(String lastDatePceEPA) {
    this.lastDatePceEPA = lastDatePceEPA;
  }

  public Air03 lastDatePceSta(String lastDatePceSta) {
    this.lastDatePceSta = lastDatePceSta;
    return this;
  }

  /**
   * The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by a state agency was completed.
   * @return lastDatePceSta
  */
  @NotNull 
  @Schema(name = "LastDatePceSta", example = "04/25/2014", description = "The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by a state agency was completed.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LastDatePceSta")
  public String getLastDatePceSta() {
    return lastDatePceSta;
  }

  public void setLastDatePceSta(String lastDatePceSta) {
    this.lastDatePceSta = lastDatePceSta;
  }

  public Air03 localControlRegionCode(String localControlRegionCode) {
    this.localControlRegionCode = localControlRegionCode;
    return this;
  }

  /**
   * Code for regions within a state. Search criteria for DFR in OTIS.
   * @return localControlRegionCode
  */
  @NotNull 
  @Schema(name = "LocalControlRegionCode", description = "Code for regions within a state. Search criteria for DFR in OTIS.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LocalControlRegionCode")
  public String getLocalControlRegionCode() {
    return localControlRegionCode;
  }

  public void setLocalControlRegionCode(String localControlRegionCode) {
    this.localControlRegionCode = localControlRegionCode;
  }

  public Air03 localControlRegionName(String localControlRegionName) {
    this.localControlRegionName = localControlRegionName;
    return this;
  }

  /**
   * Regions within a state. Search criteria for DFR in OTIS.
   * @return localControlRegionName
  */
  @NotNull 
  @Schema(name = "LocalControlRegionName", description = "Regions within a state. Search criteria for DFR in OTIS.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("LocalControlRegionName")
  public String getLocalControlRegionName() {
    return localControlRegionName;
  }

  public void setLocalControlRegionName(String localControlRegionName) {
    this.localControlRegionName = localControlRegionName;
  }

  public Air03 lower48(String lower48) {
    this.lower48 = lower48;
    return this;
  }

  /**
   * Flag showing Y/N whether location is within the contiguous (lower 48) United States.
   * @return lower48
  */
  @NotNull 
  @Schema(name = "Lower48", example = "Y", description = "Flag showing Y/N whether location is within the contiguous (lower 48) United States.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Lower48")
  public String getLower48() {
    return lower48;
  }

  public void setLower48(String lower48) {
    this.lower48 = lower48;
  }

  public Air03 maintPollutantsNaa(String maintPollutantsNaa) {
    this.maintPollutantsNaa = maintPollutantsNaa;
    return this;
  }

  /**
   * Get maintPollutantsNaa
   * @return maintPollutantsNaa
  */
  @NotNull 
  @Schema(name = "MaintPollutantsNaa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MaintPollutantsNaa")
  public String getMaintPollutantsNaa() {
    return maintPollutantsNaa;
  }

  public void setMaintPollutantsNaa(String maintPollutantsNaa) {
    this.maintPollutantsNaa = maintPollutantsNaa;
  }

  public Air03 maintStandardsNaa(String maintStandardsNaa) {
    this.maintStandardsNaa = maintStandardsNaa;
    return this;
  }

  /**
   * Get maintStandardsNaa
   * @return maintStandardsNaa
  */
  @NotNull 
  @Schema(name = "MaintStandardsNaa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MaintStandardsNaa")
  public String getMaintStandardsNaa() {
    return maintStandardsNaa;
  }

  public void setMaintStandardsNaa(String maintStandardsNaa) {
    this.maintStandardsNaa = maintStandardsNaa;
  }

  public Air03 maintStatusNaa(String maintStatusNaa) {
    this.maintStatusNaa = maintStatusNaa;
    return this;
  }

  /**
   * Get maintStatusNaa
   * @return maintStatusNaa
  */
  @NotNull 
  @Schema(name = "MaintStatusNaa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MaintStatusNaa")
  public String getMaintStatusNaa() {
    return maintStatusNaa;
  }

  public void setMaintStatusNaa(String maintStatusNaa) {
    this.maintStatusNaa = maintStatusNaa;
  }

  public Air03 map(String map) {
    this.map = map;
    return this;
  }

  /**
   * No Longer Used.
   * @return map
  */
  @NotNull 
  @Schema(name = "Map", description = "No Longer Used.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Map")
  public String getMap() {
    return map;
  }

  public void setMap(String map) {
    this.map = map;
  }

  public Air03 maxPctileUs(String maxPctileUs) {
    this.maxPctileUs = maxPctileUs;
    return this;
  }

  /**
   * The maximum percentile from all individual EJSCREEN indicators.
   * @return maxPctileUs
  */
  @NotNull 
  @Schema(name = "MaxPctileUs", example = "98", description = "The maximum percentile from all individual EJSCREEN indicators.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MaxPctileUs")
  public String getMaxPctileUs() {
    return maxPctileUs;
  }

  public void setMaxPctileUs(String maxPctileUs) {
    this.maxPctileUs = maxPctileUs;
  }

  public Air03 maxScore(String maxScore) {
    this.maxScore = maxScore;
    return this;
  }

  /**
   * A sorting score for internal use.
   * @return maxScore
  */
  @NotNull 
  @Schema(name = "MaxScore", example = "1", description = "A sorting score for internal use.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("MaxScore")
  public String getMaxScore() {
    return maxScore;
  }

  public void setMaxScore(String maxScore) {
    this.maxScore = maxScore;
  }

  public Air03 naPollutantsNaa(String naPollutantsNaa) {
    this.naPollutantsNaa = naPollutantsNaa;
    return this;
  }

  /**
   * Get naPollutantsNaa
   * @return naPollutantsNaa
  */
  @NotNull 
  @Schema(name = "NaPollutantsNaa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("NaPollutantsNaa")
  public String getNaPollutantsNaa() {
    return naPollutantsNaa;
  }

  public void setNaPollutantsNaa(String naPollutantsNaa) {
    this.naPollutantsNaa = naPollutantsNaa;
  }

  public Air03 naStandardsNaa(String naStandardsNaa) {
    this.naStandardsNaa = naStandardsNaa;
    return this;
  }

  /**
   * Get naStandardsNaa
   * @return naStandardsNaa
  */
  @NotNull 
  @Schema(name = "NaStandardsNaa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("NaStandardsNaa")
  public String getNaStandardsNaa() {
    return naStandardsNaa;
  }

  public void setNaStandardsNaa(String naStandardsNaa) {
    this.naStandardsNaa = naStandardsNaa;
  }

  public Air03 naStatusNaa(String naStatusNaa) {
    this.naStatusNaa = naStatusNaa;
    return this;
  }

  /**
   * Get naStatusNaa
   * @return naStatusNaa
  */
  @NotNull 
  @Schema(name = "NaStatusNaa", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("NaStatusNaa")
  public String getNaStatusNaa() {
    return naStatusNaa;
  }

  public void setNaStatusNaa(String naStatusNaa) {
    this.naStatusNaa = naStatusNaa;
  }

  public Air03 naaCategories(String naaCategories) {
    this.naaCategories = naaCategories;
    return this;
  }

  /**
   * The nonattainment area categories that the facility is in, derived spatially based on the facility's geographic coordinates in FRS.�
   * @return naaCategories
  */
  @NotNull 
  @Schema(name = "NaaCategories", example = "8-HOUR OZONE(2015)", description = "The nonattainment area categories that the facility is in, derived spatially based on the facility's geographic coordinates in FRS.�", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("NaaCategories")
  public String getNaaCategories() {
    return naaCategories;
  }

  public void setNaaCategories(String naaCategories) {
    this.naaCategories = naaCategories;
  }

  public Air03 naaPollutants(String naaPollutants) {
    this.naaPollutants = naaPollutants;
    return this;
  }

  /**
   * All criteria pollutants that the facility is in nonattainment for.
   * @return naaPollutants
  */
  @NotNull 
  @Schema(name = "NaaPollutants", example = "OZONE", description = "All criteria pollutants that the facility is in nonattainment for.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("NaaPollutants")
  public String getNaaPollutants() {
    return naaPollutants;
  }

  public void setNaaPollutants(String naaPollutants) {
    this.naaPollutants = naaPollutants;
  }

  public Air03 otherPermitIDs(String otherPermitIDs) {
    this.otherPermitIDs = otherPermitIDs;
    return this;
  }

  /**
   * Get otherPermitIDs
   * @return otherPermitIDs
  */
  @NotNull 
  @Schema(name = "OtherPermitIDs", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("OtherPermitIDs")
  public String getOtherPermitIDs() {
    return otherPermitIDs;
  }

  public void setOtherPermitIDs(String otherPermitIDs) {
    this.otherPermitIDs = otherPermitIDs;
  }

  public Air03 over80CountUs(String over80CountUs) {
    this.over80CountUs = over80CountUs;
    return this;
  }

  /**
   * The number of primary EJSCREEN environmental justice (EJ) indexes exceeding the 80th or higher national percentile for the Census block group that the facility is located in.
   * @return over80CountUs
  */
  @NotNull 
  @Schema(name = "Over80CountUs", example = "3", description = "The number of primary EJSCREEN environmental justice (EJ) indexes exceeding the 80th or higher national percentile for the Census block group that the facility is located in.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Over80CountUs")
  public String getOver80CountUs() {
    return over80CountUs;
  }

  public void setOver80CountUs(String over80CountUs) {
    this.over80CountUs = over80CountUs;
  }

  public Air03 pctileCancerUs(String pctileCancerUs) {
    this.pctileCancerUs = pctileCancerUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN NATA air toxics cancer risk indicator.
   * @return pctileCancerUs
  */
  @NotNull 
  @Schema(name = "PctileCancerUs", example = "99", description = "The national percentile of the census block group for the EJSCREEN NATA air toxics cancer risk indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileCancerUs")
  public String getPctileCancerUs() {
    return pctileCancerUs;
  }

  public void setPctileCancerUs(String pctileCancerUs) {
    this.pctileCancerUs = pctileCancerUs;
  }

  public Air03 pctileDpmUs(String pctileDpmUs) {
    this.pctileDpmUs = pctileDpmUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN diesel particulate matter indicator.
   * @return pctileDpmUs
  */
  @NotNull 
  @Schema(name = "PctileDpmUs", example = "99", description = "The national percentile of the census block group for the EJSCREEN diesel particulate matter indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileDpmUs")
  public String getPctileDpmUs() {
    return pctileDpmUs;
  }

  public void setPctileDpmUs(String pctileDpmUs) {
    this.pctileDpmUs = pctileDpmUs;
  }

  public Air03 pctileO3Us(String pctileO3Us) {
    this.pctileO3Us = pctileO3Us;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN ozone indicator.
   * @return pctileO3Us
  */
  @NotNull 
  @Schema(name = "PctileO3Us", example = "94", description = "The national percentile of the census block group for the EJSCREEN ozone indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileO3Us")
  public String getPctileO3Us() {
    return pctileO3Us;
  }

  public void setPctileO3Us(String pctileO3Us) {
    this.pctileO3Us = pctileO3Us;
  }

  public Air03 pctilePctpre1960Us(String pctilePctpre1960Us) {
    this.pctilePctpre1960Us = pctilePctpre1960Us;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN Lead paint indicator.
   * @return pctilePctpre1960Us
  */
  @NotNull 
  @Schema(name = "PctilePctpre1960Us", example = "14.6", description = "The national percentile of the census block group for the EJSCREEN Lead paint indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctilePctpre1960Us")
  public String getPctilePctpre1960Us() {
    return pctilePctpre1960Us;
  }

  public void setPctilePctpre1960Us(String pctilePctpre1960Us) {
    this.pctilePctpre1960Us = pctilePctpre1960Us;
  }

  public Air03 pctilePmUs(String pctilePmUs) {
    this.pctilePmUs = pctilePmUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN particulate matter indicator.
   * @return pctilePmUs
  */
  @NotNull 
  @Schema(name = "PctilePmUs", example = "93", description = "The national percentile of the census block group for the EJSCREEN particulate matter indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctilePmUs")
  public String getPctilePmUs() {
    return pctilePmUs;
  }

  public void setPctilePmUs(String pctilePmUs) {
    this.pctilePmUs = pctilePmUs;
  }

  public Air03 pctileProximityNPDESUs(String pctileProximityNPDESUs) {
    this.pctileProximityNPDESUs = pctileProximityNPDESUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN proximity to major direct water dischargers indicator.
   * @return pctileProximityNPDESUs
  */
  @NotNull 
  @Schema(name = "PctileProximityNPDESUs", example = "23.7", description = "The national percentile of the census block group for the EJSCREEN proximity to major direct water dischargers indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileProximityNPDESUs")
  public String getPctileProximityNPDESUs() {
    return pctileProximityNPDESUs;
  }

  public void setPctileProximityNPDESUs(String pctileProximityNPDESUs) {
    this.pctileProximityNPDESUs = pctileProximityNPDESUs;
  }

  public Air03 pctileProximityNplUs(String pctileProximityNplUs) {
    this.pctileProximityNplUs = pctileProximityNplUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN proximity to National Priorities List (NPL) sites indicator.
   * @return pctileProximityNplUs
  */
  @NotNull 
  @Schema(name = "PctileProximityNplUs", example = "96", description = "The national percentile of the census block group for the EJSCREEN proximity to National Priorities List (NPL) sites indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileProximityNplUs")
  public String getPctileProximityNplUs() {
    return pctileProximityNplUs;
  }

  public void setPctileProximityNplUs(String pctileProximityNplUs) {
    this.pctileProximityNplUs = pctileProximityNplUs;
  }

  public Air03 pctileProximityRmpUs(String pctileProximityRmpUs) {
    this.pctileProximityRmpUs = pctileProximityRmpUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN proximity to Risk Management Plan (RMP) sites indicator.
   * @return pctileProximityRmpUs
  */
  @NotNull 
  @Schema(name = "PctileProximityRmpUs", example = "91", description = "The national percentile of the census block group for the EJSCREEN proximity to Risk Management Plan (RMP) sites indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileProximityRmpUs")
  public String getPctileProximityRmpUs() {
    return pctileProximityRmpUs;
  }

  public void setPctileProximityRmpUs(String pctileProximityRmpUs) {
    this.pctileProximityRmpUs = pctileProximityRmpUs;
  }

  public Air03 pctileProximityTsdfUs(String pctileProximityTsdfUs) {
    this.pctileProximityTsdfUs = pctileProximityTsdfUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN proximity to Treatment Storage and Disposal Facilities (TSDFs) indicator.
   * @return pctileProximityTsdfUs
  */
  @NotNull 
  @Schema(name = "PctileProximityTsdfUs", example = "82", description = "The national percentile of the census block group for the EJSCREEN proximity to Treatment Storage and Disposal Facilities (TSDFs) indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileProximityTsdfUs")
  public String getPctileProximityTsdfUs() {
    return pctileProximityTsdfUs;
  }

  public void setPctileProximityTsdfUs(String pctileProximityTsdfUs) {
    this.pctileProximityTsdfUs = pctileProximityTsdfUs;
  }

  public Air03 pctileRespUs(String pctileRespUs) {
    this.pctileRespUs = pctileRespUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN NATA respiratory hazard index indicator.
   * @return pctileRespUs
  */
  @NotNull 
  @Schema(name = "PctileRespUs", example = "99", description = "The national percentile of the census block group for the EJSCREEN NATA respiratory hazard index indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileRespUs")
  public String getPctileRespUs() {
    return pctileRespUs;
  }

  public void setPctileRespUs(String pctileRespUs) {
    this.pctileRespUs = pctileRespUs;
  }

  public Air03 pctileTrafficScoreUs(String pctileTrafficScoreUs) {
    this.pctileTrafficScoreUs = pctileTrafficScoreUs;
    return this;
  }

  /**
   * The national percentile of the census block group for the EJSCREEN Traffic proximity and volume indicator.
   * @return pctileTrafficScoreUs
  */
  @NotNull 
  @Schema(name = "PctileTrafficScoreUs", example = "92", description = "The national percentile of the census block group for the EJSCREEN Traffic proximity and volume indicator.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("PctileTrafficScoreUs")
  public String getPctileTrafficScoreUs() {
    return pctileTrafficScoreUs;
  }

  public void setPctileTrafficScoreUs(String pctileTrafficScoreUs) {
    this.pctileTrafficScoreUs = pctileTrafficScoreUs;
  }

  public Air03 rcRAIDs(String rcRAIDs) {
    this.rcRAIDs = rcRAIDs;
    return this;
  }

  /**
   * A unique 12-character ID assigned for each record/permit/site/facility within the RCRAInfo database.
   * @return rcRAIDs
  */
  @NotNull 
  @Schema(name = "RCRAIDs", example = "VAD981111784", description = "A unique 12-character ID assigned for each record/permit/site/facility within the RCRAInfo database.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RCRAIDs")
  public String getRcRAIDs() {
    return rcRAIDs;
  }

  public void setRcRAIDs(String rcRAIDs) {
    this.rcRAIDs = rcRAIDs;
  }

  public Air03 referencePoint(String referencePoint) {
    this.referencePoint = referencePoint;
    return this;
  }

  /**
   * ??
   * @return referencePoint
  */
  @NotNull 
  @Schema(name = "ReferencePoint", example = "ENTRANCE POINT OF A FACILITY OR STATION", description = "??", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ReferencePoint")
  public String getReferencePoint() {
    return referencePoint;
  }

  public void setReferencePoint(String referencePoint) {
    this.referencePoint = referencePoint;
  }

  public Air03 registryID(String registryID) {
    this.registryID = registryID;
    return this;
  }

  /**
   * An internal 12-digit Facility Registry Service (FRS) tracking number used to tie all facility data together in EPA regulatory program databases.
   * @return registryID
  */
  @NotNull 
  @Schema(name = "RegistryID", example = "110020837601", description = "An internal 12-digit Facility Registry Service (FRS) tracking number used to tie all facility data together in EPA regulatory program databases.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RegistryID")
  public String getRegistryID() {
    return registryID;
  }

  public void setRegistryID(String registryID) {
    this.registryID = registryID;
  }

  public Air03 rmpIDs(String rmpIDs) {
    this.rmpIDs = rmpIDs;
    return this;
  }

  /**
   * A unique ID assigned to each facility submitting a Risk Management Plan to EPA under the Risk Management Plan Rule.
   * @return rmpIDs
  */
  @NotNull 
  @Schema(name = "RmpIDs", example = "110000", description = "A unique ID assigned to each facility submitting a Risk Management Plan to EPA under the Risk Management Plan Rule.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("RmpIDs")
  public String getRmpIDs() {
    return rmpIDs;
  }

  public void setRmpIDs(String rmpIDs) {
    this.rmpIDs = rmpIDs;
  }

  public Air03 sdWAIDs(String sdWAIDs) {
    this.sdWAIDs = sdWAIDs;
    return this;
  }

  /**
   * A unique 9-character ID assigned for each public water system within the Safe Drinking Water Information System (SDWIS).
   * @return sdWAIDs
  */
  @NotNull 
  @Schema(name = "SDWAIDs", example = "DC0000001", description = "A unique 9-character ID assigned for each public water system within the Safe Drinking Water Information System (SDWIS).", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SDWAIDs")
  public String getSdWAIDs() {
    return sdWAIDs;
  }

  public void setSdWAIDs(String sdWAIDs) {
    this.sdWAIDs = sdWAIDs;
  }

  public Air03 score(String score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @NotNull 
  @Schema(name = "Score", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Score")
  public String getScore() {
    return score;
  }

  public void setScore(String score) {
    this.score = score;
  }

  public Air03 sourceID(String sourceID) {
    this.sourceID = sourceID;
    return this;
  }

  /**
   * Unique Identifier assigned by EPA.
   * @return sourceID
  */
  @NotNull 
  @Schema(name = "SourceID", example = "ALR040033", description = "Unique Identifier assigned by EPA.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("SourceID")
  public String getSourceID() {
    return sourceID;
  }

  public void setSourceID(String sourceID) {
    this.sourceID = sourceID;
  }

  public Air03 statute(String statute) {
    this.statute = statute;
    return this;
  }

  /**
   * The name of the statute associated with each of the permits and identifiers linked to the facility:  - CAA = the Clean Air Act - CWA = the Clean Water Act - RCRA = the Resource Conservation and Recovery Act - EP313 = the Emergency Planning and Community Right-to-Know Act, Section 313 (also known as the Toxics Release Inventory Program) - TSCA = the Toxic Substances Control Act - SDWA = the Safe Drinking Water Act
   * @return statute
  */
  @NotNull 
  @Schema(name = "Statute", example = "CWA", description = "The name of the statute associated with each of the permits and identifiers linked to the facility:  - CAA = the Clean Air Act - CWA = the Clean Water Act - RCRA = the Resource Conservation and Recovery Act - EP313 = the Emergency Planning and Community Right-to-Know Act, Section 313 (also known as the Toxics Release Inventory Program) - TSCA = the Toxic Substances Control Act - SDWA = the Safe Drinking Water Act", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("Statute")
  public String getStatute() {
    return statute;
  }

  public void setStatute(String statute) {
    this.statute = statute;
  }

  public Air03 trIIDs(String trIIDs) {
    this.trIIDs = trIIDs;
    return this;
  }

  /**
   * A unique 15-character ID assigned for each facility within the Toxics Release Inventory (TRI) program. The format is ZZZZZNNNNNSSSSS, where ZZZZZ = ZIP code, NNNNN = the first 5 consonants of the name, and SSSSS = the first 5 non-blank non-special characters in the street address.
   * @return trIIDs
  */
  @NotNull 
  @Schema(name = "TRIIDs", example = "20011FRTTT5001F", description = "A unique 15-character ID assigned for each facility within the Toxics Release Inventory (TRI) program. The format is ZZZZZNNNNNSSSSS, where ZZZZZ = ZIP code, NNNNN = the first 5 consonants of the name, and SSSSS = the first 5 non-blank non-special characters in the street address.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TRIIDs")
  public String getTrIIDs() {
    return trIIDs;
  }

  public void setTrIIDs(String trIIDs) {
    this.trIIDs = trIIDs;
  }

  public Air03 trIbalFlag(String trIbalFlag) {
    this.trIbalFlag = trIbalFlag;
    return this;
  }

  /**
   * A flag indicating that the facility is within a tribal area.
   * @return trIbalFlag
  */
  @NotNull 
  @Schema(name = "TRIbalFlag", example = "1", description = "A flag indicating that the facility is within a tribal area.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("TRIbalFlag")
  public String getTrIbalFlag() {
    return trIbalFlag;
  }

  public void setTrIbalFlag(String trIbalFlag) {
    this.trIbalFlag = trIbalFlag;
  }

  public Air03 violFlag(String violFlag) {
    this.violFlag = violFlag;
    return this;
  }

  /**
   * Indicates if the facility had a violation within the last 3 years. 1 = Yes
   * @return violFlag
  */
  @NotNull 
  @Schema(name = "ViolFlag", example = "1", description = "Indicates if the facility had a violation within the last 3 years. 1 = Yes", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ViolFlag")
  public String getViolFlag() {
    return violFlag;
  }

  public void setViolFlag(String violFlag) {
    this.violFlag = violFlag;
  }

  public Air03 webDocs(String webDocs) {
    this.webDocs = webDocs;
    return this;
  }

  /**
   * Contains flags that identify what web accessible documents are available for the facility.
   * @return webDocs
  */
  @NotNull 
  @Schema(name = "WebDocs", example = "C6", description = "Contains flags that identify what web accessible documents are available for the facility.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("WebDocs")
  public String getWebDocs() {
    return webDocs;
  }

  public void setWebDocs(String webDocs) {
    this.webDocs = webDocs;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Air03 air03 = (Air03) o;
    return Objects.equals(this.aiR3yrComplQtrsHistory, air03.aiR3yrComplQtrsHistory) &&
        Objects.equals(this.aiRCaseIDs, air03.aiRCaseIDs) &&
        Objects.equals(this.aiRCity, air03.aiRCity) &&
        Objects.equals(this.aiRClassification, air03.aiRClassification) &&
        Objects.equals(this.aiRComplStatus, air03.aiRComplStatus) &&
        Objects.equals(this.aiRCounty, air03.aiRCounty) &&
        Objects.equals(this.aiRDaysLastEval, air03.aiRDaysLastEval) &&
        Objects.equals(this.aiREPARegion, air03.aiREPARegion) &&
        Objects.equals(this.aiREvalCnt, air03.aiREvalCnt) &&
        Objects.equals(this.aiRFIPSCode, air03.aiRFIPSCode) &&
        Objects.equals(this.aiRFacilityTypeCode, air03.aiRFacilityTypeCode) &&
        Objects.equals(this.aiRFacilityTypeDesc, air03.aiRFacilityTypeDesc) &&
        Objects.equals(this.aiRFeaCnt, air03.aiRFeaCnt) &&
        Objects.equals(this.aiRHpvStatus, air03.aiRHpvStatus) &&
        Objects.equals(this.aiRIDs, air03.aiRIDs) &&
        Objects.equals(this.aiRIeaCnt, air03.aiRIeaCnt) &&
        Objects.equals(this.aiRIndianCntryFlg, air03.aiRIndianCntryFlg) &&
        Objects.equals(this.aiRLastEvalDate, air03.aiRLastEvalDate) &&
        Objects.equals(this.aiRLastEvalDateEPA, air03.aiRLastEvalDateEPA) &&
        Objects.equals(this.aiRLastEvalDateState, air03.aiRLastEvalDateState) &&
        Objects.equals(this.aiRLastFeaDate, air03.aiRLastFeaDate) &&
        Objects.equals(this.aiRLastFeaDateEPA, air03.aiRLastFeaDateEPA) &&
        Objects.equals(this.aiRLastFeaDateState, air03.aiRLastFeaDateState) &&
        Objects.equals(this.aiRLastIeaDate, air03.aiRLastIeaDate) &&
        Objects.equals(this.aiRLastIeaDateEPA, air03.aiRLastIeaDateEPA) &&
        Objects.equals(this.aiRLastIeaDateState, air03.aiRLastIeaDateState) &&
        Objects.equals(this.aiRLastPenaltyDate, air03.aiRLastPenaltyDate) &&
        Objects.equals(this.aiRLastStckDateEPA, air03.aiRLastStckDateEPA) &&
        Objects.equals(this.aiRLastStckDateState, air03.aiRLastStckDateState) &&
        Objects.equals(this.aiRLastStckTestDate, air03.aiRLastStckTestDate) &&
        Objects.equals(this.aiRLastStckTestResults, air03.aiRLastStckTestResults) &&
        Objects.equals(this.aiRLastViolDate, air03.aiRLastViolDate) &&
        Objects.equals(this.aiRMacts, air03.aiRMacts) &&
        Objects.equals(this.aiRMajorFlag, air03.aiRMajorFlag) &&
        Objects.equals(this.aiRMnthsWithHpv, air03.aiRMnthsWithHpv) &&
        Objects.equals(this.AIRNAICS, air03.AIRNAICS) &&
        Objects.equals(this.aiRName, air03.aiRName) &&
        Objects.equals(this.aiRNsps, air03.aiRNsps) &&
        Objects.equals(this.aiRNspsm, air03.aiRNspsm) &&
        Objects.equals(this.aiRPenalties, air03.aiRPenalties) &&
        Objects.equals(this.aiRPollRecentViol, air03.aiRPollRecentViol) &&
        Objects.equals(this.aiRPrograms, air03.aiRPrograms) &&
        Objects.equals(this.aiRQtrsWithHpv, air03.aiRQtrsWithHpv) &&
        Objects.equals(this.aiRQtrsWithViol, air03.aiRQtrsWithViol) &&
        Objects.equals(this.aiRRecentViolCnt, air03.aiRRecentViolCnt) &&
        Objects.equals(this.aiRStackTest5YrAll, air03.aiRStackTest5YrAll) &&
        Objects.equals(this.aiRStackTest5YrFail, air03.aiRStackTest5YrFail) &&
        Objects.equals(this.aiRState, air03.aiRState) &&
        Objects.equals(this.aiRStatus, air03.aiRStatus) &&
        Objects.equals(this.aiRStreet, air03.aiRStreet) &&
        Objects.equals(this.aiRTRIbalEPAids, air03.aiRTRIbalEPAids) &&
        Objects.equals(this.aiRTRIbalNames, air03.aiRTRIbalNames) &&
        Objects.equals(this.aiRUniverse, air03.aiRUniverse) &&
        Objects.equals(this.aiRZip, air03.aiRZip) &&
        Objects.equals(this.activeLower48, air03.activeLower48) &&
        Objects.equals(this.cwAIDs, air03.cwAIDs) &&
        Objects.equals(this.calculatedAccuracyMeters, air03.calculatedAccuracyMeters) &&
        Objects.equals(this.camdIDs, air03.camdIDs) &&
        Objects.equals(this.censusBlockGroup, air03.censusBlockGroup) &&
        Objects.equals(this.chesapeakeBayFlag, air03.chesapeakeBayFlag) &&
        Objects.equals(this.collectionMethod, air03.collectionMethod) &&
        Objects.equals(this.currSvFlag, air03.currSvFlag) &&
        Objects.equals(this.currVioFlag, air03.currVioFlag) &&
        Objects.equals(this.epASystem, air03.epASystem) &&
        Objects.equals(this.ea5yrFlag, air03.ea5yrFlag) &&
        Objects.equals(this.eisIDs, air03.eisIDs) &&
        Objects.equals(this.ejscreenFlag, air03.ejscreenFlag) &&
        Objects.equals(this.ejscreenFlagUs, air03.ejscreenFlagUs) &&
        Objects.equals(this.facCamdReporter, air03.facCamdReporter) &&
        Objects.equals(this.facCountyName, air03.facCountyName) &&
        Objects.equals(this.facDerivedHuc, air03.facDerivedHuc) &&
        Objects.equals(this.facDerivedTRIbes, air03.facDerivedTRIbes) &&
        Objects.equals(this.facDerivedWBD, air03.facDerivedWBD) &&
        Objects.equals(this.facDerivedWBDName, air03.facDerivedWBDName) &&
        Objects.equals(this.facEisAIRReleases, air03.facEisAIRReleases) &&
        Objects.equals(this.facEisReporter, air03.facEisReporter) &&
        Objects.equals(this.facFIPSCode, air03.facFIPSCode) &&
        Objects.equals(this.facFederalAgencyCode, air03.facFederalAgencyCode) &&
        Objects.equals(this.facFederalAgencyName, air03.facFederalAgencyName) &&
        Objects.equals(this.facGHGCO2Releases, air03.facGHGCO2Releases) &&
        Objects.equals(this.facGHGReporter, air03.facGHGReporter) &&
        Objects.equals(this.facIndianCntryFlg, air03.facIndianCntryFlg) &&
        Objects.equals(this.facIndianSpatialFlg, air03.facIndianSpatialFlg) &&
        Objects.equals(this.facLat, air03.facLat) &&
        Objects.equals(this.facLong, air03.facLong) &&
        Objects.equals(this.facMapFlg, air03.facMapFlg) &&
        Objects.equals(this.facMapIcon, air03.facMapIcon) &&
        Objects.equals(this.facNaaFlag, air03.facNaaFlag) &&
        Objects.equals(this.facPercentMinority, air03.facPercentMinority) &&
        Objects.equals(this.facPopulationDensity, air03.facPopulationDensity) &&
        Objects.equals(this.facSICCodes, air03.facSICCodes) &&
        Objects.equals(this.facStdCountyName, air03.facStdCountyName) &&
        Objects.equals(this.facTRIAIRReleases, air03.facTRIAIRReleases) &&
        Objects.equals(this.facTRICarcAIRReleases, air03.facTRICarcAIRReleases) &&
        Objects.equals(this.facTRIHapsReleases, air03.facTRIHapsReleases) &&
        Objects.equals(this.facTRIReporter, air03.facTRIReporter) &&
        Objects.equals(this.facUsMexBorderFlg, air03.facUsMexBorderFlg) &&
        Objects.equals(this.ghGIDs, air03.ghGIDs) &&
        Objects.equals(this.hasPollRpt, air03.hasPollRpt) &&
        Objects.equals(this.infea5yrFlag, air03.infea5yrFlag) &&
        Objects.equals(this.insp5yrFlag, air03.insp5yrFlag) &&
        Objects.equals(this.lastDatePce, air03.lastDatePce) &&
        Objects.equals(this.lastDatePceEPA, air03.lastDatePceEPA) &&
        Objects.equals(this.lastDatePceSta, air03.lastDatePceSta) &&
        Objects.equals(this.localControlRegionCode, air03.localControlRegionCode) &&
        Objects.equals(this.localControlRegionName, air03.localControlRegionName) &&
        Objects.equals(this.lower48, air03.lower48) &&
        Objects.equals(this.maintPollutantsNaa, air03.maintPollutantsNaa) &&
        Objects.equals(this.maintStandardsNaa, air03.maintStandardsNaa) &&
        Objects.equals(this.maintStatusNaa, air03.maintStatusNaa) &&
        Objects.equals(this.map, air03.map) &&
        Objects.equals(this.maxPctileUs, air03.maxPctileUs) &&
        Objects.equals(this.maxScore, air03.maxScore) &&
        Objects.equals(this.naPollutantsNaa, air03.naPollutantsNaa) &&
        Objects.equals(this.naStandardsNaa, air03.naStandardsNaa) &&
        Objects.equals(this.naStatusNaa, air03.naStatusNaa) &&
        Objects.equals(this.naaCategories, air03.naaCategories) &&
        Objects.equals(this.naaPollutants, air03.naaPollutants) &&
        Objects.equals(this.otherPermitIDs, air03.otherPermitIDs) &&
        Objects.equals(this.over80CountUs, air03.over80CountUs) &&
        Objects.equals(this.pctileCancerUs, air03.pctileCancerUs) &&
        Objects.equals(this.pctileDpmUs, air03.pctileDpmUs) &&
        Objects.equals(this.pctileO3Us, air03.pctileO3Us) &&
        Objects.equals(this.pctilePctpre1960Us, air03.pctilePctpre1960Us) &&
        Objects.equals(this.pctilePmUs, air03.pctilePmUs) &&
        Objects.equals(this.pctileProximityNPDESUs, air03.pctileProximityNPDESUs) &&
        Objects.equals(this.pctileProximityNplUs, air03.pctileProximityNplUs) &&
        Objects.equals(this.pctileProximityRmpUs, air03.pctileProximityRmpUs) &&
        Objects.equals(this.pctileProximityTsdfUs, air03.pctileProximityTsdfUs) &&
        Objects.equals(this.pctileRespUs, air03.pctileRespUs) &&
        Objects.equals(this.pctileTrafficScoreUs, air03.pctileTrafficScoreUs) &&
        Objects.equals(this.rcRAIDs, air03.rcRAIDs) &&
        Objects.equals(this.referencePoint, air03.referencePoint) &&
        Objects.equals(this.registryID, air03.registryID) &&
        Objects.equals(this.rmpIDs, air03.rmpIDs) &&
        Objects.equals(this.sdWAIDs, air03.sdWAIDs) &&
        Objects.equals(this.score, air03.score) &&
        Objects.equals(this.sourceID, air03.sourceID) &&
        Objects.equals(this.statute, air03.statute) &&
        Objects.equals(this.trIIDs, air03.trIIDs) &&
        Objects.equals(this.trIbalFlag, air03.trIbalFlag) &&
        Objects.equals(this.violFlag, air03.violFlag) &&
        Objects.equals(this.webDocs, air03.webDocs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aiR3yrComplQtrsHistory, aiRCaseIDs, aiRCity, aiRClassification, aiRComplStatus, aiRCounty, aiRDaysLastEval, aiREPARegion, aiREvalCnt, aiRFIPSCode, aiRFacilityTypeCode, aiRFacilityTypeDesc, aiRFeaCnt, aiRHpvStatus, aiRIDs, aiRIeaCnt, aiRIndianCntryFlg, aiRLastEvalDate, aiRLastEvalDateEPA, aiRLastEvalDateState, aiRLastFeaDate, aiRLastFeaDateEPA, aiRLastFeaDateState, aiRLastIeaDate, aiRLastIeaDateEPA, aiRLastIeaDateState, aiRLastPenaltyDate, aiRLastStckDateEPA, aiRLastStckDateState, aiRLastStckTestDate, aiRLastStckTestResults, aiRLastViolDate, aiRMacts, aiRMajorFlag, aiRMnthsWithHpv, AIRNAICS, aiRName, aiRNsps, aiRNspsm, aiRPenalties, aiRPollRecentViol, aiRPrograms, aiRQtrsWithHpv, aiRQtrsWithViol, aiRRecentViolCnt, aiRStackTest5YrAll, aiRStackTest5YrFail, aiRState, aiRStatus, aiRStreet, aiRTRIbalEPAids, aiRTRIbalNames, aiRUniverse, aiRZip, activeLower48, cwAIDs, calculatedAccuracyMeters, camdIDs, censusBlockGroup, chesapeakeBayFlag, collectionMethod, currSvFlag, currVioFlag, epASystem, ea5yrFlag, eisIDs, ejscreenFlag, ejscreenFlagUs, facCamdReporter, facCountyName, facDerivedHuc, facDerivedTRIbes, facDerivedWBD, facDerivedWBDName, facEisAIRReleases, facEisReporter, facFIPSCode, facFederalAgencyCode, facFederalAgencyName, facGHGCO2Releases, facGHGReporter, facIndianCntryFlg, facIndianSpatialFlg, facLat, facLong, facMapFlg, facMapIcon, facNaaFlag, facPercentMinority, facPopulationDensity, facSICCodes, facStdCountyName, facTRIAIRReleases, facTRICarcAIRReleases, facTRIHapsReleases, facTRIReporter, facUsMexBorderFlg, ghGIDs, hasPollRpt, infea5yrFlag, insp5yrFlag, lastDatePce, lastDatePceEPA, lastDatePceSta, localControlRegionCode, localControlRegionName, lower48, maintPollutantsNaa, maintStandardsNaa, maintStatusNaa, map, maxPctileUs, maxScore, naPollutantsNaa, naStandardsNaa, naStatusNaa, naaCategories, naaPollutants, otherPermitIDs, over80CountUs, pctileCancerUs, pctileDpmUs, pctileO3Us, pctilePctpre1960Us, pctilePmUs, pctileProximityNPDESUs, pctileProximityNplUs, pctileProximityRmpUs, pctileProximityTsdfUs, pctileRespUs, pctileTrafficScoreUs, rcRAIDs, referencePoint, registryID, rmpIDs, sdWAIDs, score, sourceID, statute, trIIDs, trIbalFlag, violFlag, webDocs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Air03 {\n");
    sb.append("    aiR3yrComplQtrsHistory: ").append(toIndentedString(aiR3yrComplQtrsHistory)).append("\n");
    sb.append("    aiRCaseIDs: ").append(toIndentedString(aiRCaseIDs)).append("\n");
    sb.append("    aiRCity: ").append(toIndentedString(aiRCity)).append("\n");
    sb.append("    aiRClassification: ").append(toIndentedString(aiRClassification)).append("\n");
    sb.append("    aiRComplStatus: ").append(toIndentedString(aiRComplStatus)).append("\n");
    sb.append("    aiRCounty: ").append(toIndentedString(aiRCounty)).append("\n");
    sb.append("    aiRDaysLastEval: ").append(toIndentedString(aiRDaysLastEval)).append("\n");
    sb.append("    aiREPARegion: ").append(toIndentedString(aiREPARegion)).append("\n");
    sb.append("    aiREvalCnt: ").append(toIndentedString(aiREvalCnt)).append("\n");
    sb.append("    aiRFIPSCode: ").append(toIndentedString(aiRFIPSCode)).append("\n");
    sb.append("    aiRFacilityTypeCode: ").append(toIndentedString(aiRFacilityTypeCode)).append("\n");
    sb.append("    aiRFacilityTypeDesc: ").append(toIndentedString(aiRFacilityTypeDesc)).append("\n");
    sb.append("    aiRFeaCnt: ").append(toIndentedString(aiRFeaCnt)).append("\n");
    sb.append("    aiRHpvStatus: ").append(toIndentedString(aiRHpvStatus)).append("\n");
    sb.append("    aiRIDs: ").append(toIndentedString(aiRIDs)).append("\n");
    sb.append("    aiRIeaCnt: ").append(toIndentedString(aiRIeaCnt)).append("\n");
    sb.append("    aiRIndianCntryFlg: ").append(toIndentedString(aiRIndianCntryFlg)).append("\n");
    sb.append("    aiRLastEvalDate: ").append(toIndentedString(aiRLastEvalDate)).append("\n");
    sb.append("    aiRLastEvalDateEPA: ").append(toIndentedString(aiRLastEvalDateEPA)).append("\n");
    sb.append("    aiRLastEvalDateState: ").append(toIndentedString(aiRLastEvalDateState)).append("\n");
    sb.append("    aiRLastFeaDate: ").append(toIndentedString(aiRLastFeaDate)).append("\n");
    sb.append("    aiRLastFeaDateEPA: ").append(toIndentedString(aiRLastFeaDateEPA)).append("\n");
    sb.append("    aiRLastFeaDateState: ").append(toIndentedString(aiRLastFeaDateState)).append("\n");
    sb.append("    aiRLastIeaDate: ").append(toIndentedString(aiRLastIeaDate)).append("\n");
    sb.append("    aiRLastIeaDateEPA: ").append(toIndentedString(aiRLastIeaDateEPA)).append("\n");
    sb.append("    aiRLastIeaDateState: ").append(toIndentedString(aiRLastIeaDateState)).append("\n");
    sb.append("    aiRLastPenaltyDate: ").append(toIndentedString(aiRLastPenaltyDate)).append("\n");
    sb.append("    aiRLastStckDateEPA: ").append(toIndentedString(aiRLastStckDateEPA)).append("\n");
    sb.append("    aiRLastStckDateState: ").append(toIndentedString(aiRLastStckDateState)).append("\n");
    sb.append("    aiRLastStckTestDate: ").append(toIndentedString(aiRLastStckTestDate)).append("\n");
    sb.append("    aiRLastStckTestResults: ").append(toIndentedString(aiRLastStckTestResults)).append("\n");
    sb.append("    aiRLastViolDate: ").append(toIndentedString(aiRLastViolDate)).append("\n");
    sb.append("    aiRMacts: ").append(toIndentedString(aiRMacts)).append("\n");
    sb.append("    aiRMajorFlag: ").append(toIndentedString(aiRMajorFlag)).append("\n");
    sb.append("    aiRMnthsWithHpv: ").append(toIndentedString(aiRMnthsWithHpv)).append("\n");
    sb.append("    AIRNAICS: ").append(toIndentedString(AIRNAICS)).append("\n");
    sb.append("    aiRName: ").append(toIndentedString(aiRName)).append("\n");
    sb.append("    aiRNsps: ").append(toIndentedString(aiRNsps)).append("\n");
    sb.append("    aiRNspsm: ").append(toIndentedString(aiRNspsm)).append("\n");
    sb.append("    aiRPenalties: ").append(toIndentedString(aiRPenalties)).append("\n");
    sb.append("    aiRPollRecentViol: ").append(toIndentedString(aiRPollRecentViol)).append("\n");
    sb.append("    aiRPrograms: ").append(toIndentedString(aiRPrograms)).append("\n");
    sb.append("    aiRQtrsWithHpv: ").append(toIndentedString(aiRQtrsWithHpv)).append("\n");
    sb.append("    aiRQtrsWithViol: ").append(toIndentedString(aiRQtrsWithViol)).append("\n");
    sb.append("    aiRRecentViolCnt: ").append(toIndentedString(aiRRecentViolCnt)).append("\n");
    sb.append("    aiRStackTest5YrAll: ").append(toIndentedString(aiRStackTest5YrAll)).append("\n");
    sb.append("    aiRStackTest5YrFail: ").append(toIndentedString(aiRStackTest5YrFail)).append("\n");
    sb.append("    aiRState: ").append(toIndentedString(aiRState)).append("\n");
    sb.append("    aiRStatus: ").append(toIndentedString(aiRStatus)).append("\n");
    sb.append("    aiRStreet: ").append(toIndentedString(aiRStreet)).append("\n");
    sb.append("    aiRTRIbalEPAids: ").append(toIndentedString(aiRTRIbalEPAids)).append("\n");
    sb.append("    aiRTRIbalNames: ").append(toIndentedString(aiRTRIbalNames)).append("\n");
    sb.append("    aiRUniverse: ").append(toIndentedString(aiRUniverse)).append("\n");
    sb.append("    aiRZip: ").append(toIndentedString(aiRZip)).append("\n");
    sb.append("    activeLower48: ").append(toIndentedString(activeLower48)).append("\n");
    sb.append("    cwAIDs: ").append(toIndentedString(cwAIDs)).append("\n");
    sb.append("    calculatedAccuracyMeters: ").append(toIndentedString(calculatedAccuracyMeters)).append("\n");
    sb.append("    camdIDs: ").append(toIndentedString(camdIDs)).append("\n");
    sb.append("    censusBlockGroup: ").append(toIndentedString(censusBlockGroup)).append("\n");
    sb.append("    chesapeakeBayFlag: ").append(toIndentedString(chesapeakeBayFlag)).append("\n");
    sb.append("    collectionMethod: ").append(toIndentedString(collectionMethod)).append("\n");
    sb.append("    currSvFlag: ").append(toIndentedString(currSvFlag)).append("\n");
    sb.append("    currVioFlag: ").append(toIndentedString(currVioFlag)).append("\n");
    sb.append("    epASystem: ").append(toIndentedString(epASystem)).append("\n");
    sb.append("    ea5yrFlag: ").append(toIndentedString(ea5yrFlag)).append("\n");
    sb.append("    eisIDs: ").append(toIndentedString(eisIDs)).append("\n");
    sb.append("    ejscreenFlag: ").append(toIndentedString(ejscreenFlag)).append("\n");
    sb.append("    ejscreenFlagUs: ").append(toIndentedString(ejscreenFlagUs)).append("\n");
    sb.append("    facCamdReporter: ").append(toIndentedString(facCamdReporter)).append("\n");
    sb.append("    facCountyName: ").append(toIndentedString(facCountyName)).append("\n");
    sb.append("    facDerivedHuc: ").append(toIndentedString(facDerivedHuc)).append("\n");
    sb.append("    facDerivedTRIbes: ").append(toIndentedString(facDerivedTRIbes)).append("\n");
    sb.append("    facDerivedWBD: ").append(toIndentedString(facDerivedWBD)).append("\n");
    sb.append("    facDerivedWBDName: ").append(toIndentedString(facDerivedWBDName)).append("\n");
    sb.append("    facEisAIRReleases: ").append(toIndentedString(facEisAIRReleases)).append("\n");
    sb.append("    facEisReporter: ").append(toIndentedString(facEisReporter)).append("\n");
    sb.append("    facFIPSCode: ").append(toIndentedString(facFIPSCode)).append("\n");
    sb.append("    facFederalAgencyCode: ").append(toIndentedString(facFederalAgencyCode)).append("\n");
    sb.append("    facFederalAgencyName: ").append(toIndentedString(facFederalAgencyName)).append("\n");
    sb.append("    facGHGCO2Releases: ").append(toIndentedString(facGHGCO2Releases)).append("\n");
    sb.append("    facGHGReporter: ").append(toIndentedString(facGHGReporter)).append("\n");
    sb.append("    facIndianCntryFlg: ").append(toIndentedString(facIndianCntryFlg)).append("\n");
    sb.append("    facIndianSpatialFlg: ").append(toIndentedString(facIndianSpatialFlg)).append("\n");
    sb.append("    facLat: ").append(toIndentedString(facLat)).append("\n");
    sb.append("    facLong: ").append(toIndentedString(facLong)).append("\n");
    sb.append("    facMapFlg: ").append(toIndentedString(facMapFlg)).append("\n");
    sb.append("    facMapIcon: ").append(toIndentedString(facMapIcon)).append("\n");
    sb.append("    facNaaFlag: ").append(toIndentedString(facNaaFlag)).append("\n");
    sb.append("    facPercentMinority: ").append(toIndentedString(facPercentMinority)).append("\n");
    sb.append("    facPopulationDensity: ").append(toIndentedString(facPopulationDensity)).append("\n");
    sb.append("    facSICCodes: ").append(toIndentedString(facSICCodes)).append("\n");
    sb.append("    facStdCountyName: ").append(toIndentedString(facStdCountyName)).append("\n");
    sb.append("    facTRIAIRReleases: ").append(toIndentedString(facTRIAIRReleases)).append("\n");
    sb.append("    facTRICarcAIRReleases: ").append(toIndentedString(facTRICarcAIRReleases)).append("\n");
    sb.append("    facTRIHapsReleases: ").append(toIndentedString(facTRIHapsReleases)).append("\n");
    sb.append("    facTRIReporter: ").append(toIndentedString(facTRIReporter)).append("\n");
    sb.append("    facUsMexBorderFlg: ").append(toIndentedString(facUsMexBorderFlg)).append("\n");
    sb.append("    ghGIDs: ").append(toIndentedString(ghGIDs)).append("\n");
    sb.append("    hasPollRpt: ").append(toIndentedString(hasPollRpt)).append("\n");
    sb.append("    infea5yrFlag: ").append(toIndentedString(infea5yrFlag)).append("\n");
    sb.append("    insp5yrFlag: ").append(toIndentedString(insp5yrFlag)).append("\n");
    sb.append("    lastDatePce: ").append(toIndentedString(lastDatePce)).append("\n");
    sb.append("    lastDatePceEPA: ").append(toIndentedString(lastDatePceEPA)).append("\n");
    sb.append("    lastDatePceSta: ").append(toIndentedString(lastDatePceSta)).append("\n");
    sb.append("    localControlRegionCode: ").append(toIndentedString(localControlRegionCode)).append("\n");
    sb.append("    localControlRegionName: ").append(toIndentedString(localControlRegionName)).append("\n");
    sb.append("    lower48: ").append(toIndentedString(lower48)).append("\n");
    sb.append("    maintPollutantsNaa: ").append(toIndentedString(maintPollutantsNaa)).append("\n");
    sb.append("    maintStandardsNaa: ").append(toIndentedString(maintStandardsNaa)).append("\n");
    sb.append("    maintStatusNaa: ").append(toIndentedString(maintStatusNaa)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    maxPctileUs: ").append(toIndentedString(maxPctileUs)).append("\n");
    sb.append("    maxScore: ").append(toIndentedString(maxScore)).append("\n");
    sb.append("    naPollutantsNaa: ").append(toIndentedString(naPollutantsNaa)).append("\n");
    sb.append("    naStandardsNaa: ").append(toIndentedString(naStandardsNaa)).append("\n");
    sb.append("    naStatusNaa: ").append(toIndentedString(naStatusNaa)).append("\n");
    sb.append("    naaCategories: ").append(toIndentedString(naaCategories)).append("\n");
    sb.append("    naaPollutants: ").append(toIndentedString(naaPollutants)).append("\n");
    sb.append("    otherPermitIDs: ").append(toIndentedString(otherPermitIDs)).append("\n");
    sb.append("    over80CountUs: ").append(toIndentedString(over80CountUs)).append("\n");
    sb.append("    pctileCancerUs: ").append(toIndentedString(pctileCancerUs)).append("\n");
    sb.append("    pctileDpmUs: ").append(toIndentedString(pctileDpmUs)).append("\n");
    sb.append("    pctileO3Us: ").append(toIndentedString(pctileO3Us)).append("\n");
    sb.append("    pctilePctpre1960Us: ").append(toIndentedString(pctilePctpre1960Us)).append("\n");
    sb.append("    pctilePmUs: ").append(toIndentedString(pctilePmUs)).append("\n");
    sb.append("    pctileProximityNPDESUs: ").append(toIndentedString(pctileProximityNPDESUs)).append("\n");
    sb.append("    pctileProximityNplUs: ").append(toIndentedString(pctileProximityNplUs)).append("\n");
    sb.append("    pctileProximityRmpUs: ").append(toIndentedString(pctileProximityRmpUs)).append("\n");
    sb.append("    pctileProximityTsdfUs: ").append(toIndentedString(pctileProximityTsdfUs)).append("\n");
    sb.append("    pctileRespUs: ").append(toIndentedString(pctileRespUs)).append("\n");
    sb.append("    pctileTrafficScoreUs: ").append(toIndentedString(pctileTrafficScoreUs)).append("\n");
    sb.append("    rcRAIDs: ").append(toIndentedString(rcRAIDs)).append("\n");
    sb.append("    referencePoint: ").append(toIndentedString(referencePoint)).append("\n");
    sb.append("    registryID: ").append(toIndentedString(registryID)).append("\n");
    sb.append("    rmpIDs: ").append(toIndentedString(rmpIDs)).append("\n");
    sb.append("    sdWAIDs: ").append(toIndentedString(sdWAIDs)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    sourceID: ").append(toIndentedString(sourceID)).append("\n");
    sb.append("    statute: ").append(toIndentedString(statute)).append("\n");
    sb.append("    trIIDs: ").append(toIndentedString(trIIDs)).append("\n");
    sb.append("    trIbalFlag: ").append(toIndentedString(trIbalFlag)).append("\n");
    sb.append("    violFlag: ").append(toIndentedString(violFlag)).append("\n");
    sb.append("    webDocs: ").append(toIndentedString(webDocs)).append("\n");
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

