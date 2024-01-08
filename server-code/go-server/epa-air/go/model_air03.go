/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * API version: 2019.10.15
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi




// Air03 - Facilities Object
type Air03 struct {

	// The facility's 3-year compliance status history by quarter (3-month period). Each character represents a quarter of compliance, going from oldest to most recent. Character values correspond to the following compliance statuses: _ -�No Violation Identified V -�Violation Identified S -�High Priority Violation U - Undetermined
	AIR3yrComplQtrsHistory string `json:"AIR3yrComplQtrsHistory"`

	// Space-delimited list of AIR cases associated with the facility.
	AIRCaseIDs string `json:"AIRCaseIDs"`

	// The city where the AIR facility is located.
	AIRCity string `json:"AIRCity"`

	AIRClassification string `json:"AIRClassification"`

	// The facility's recent violation status under the Clean Air Act.
	AIRComplStatus string `json:"AIRComplStatus"`

	// The name of the county where the AIR facility is located.
	AIRCounty string `json:"AIRCounty"`

	// The number of days since the most recent compliance evaluation of the facility.
	AIRDaysLastEval string `json:"AIRDaysLastEval"`

	// The EPA region where the AIR facility is located.
	AIREPARegion string `json:"AIREPARegion"`

	// The number of compliance evaluations, under the Clean Air Act, occurring at the facility within the last five years.
	AIREvalCnt string `json:"AIREvalCnt"`

	// A 5 digit combination of the 2 digit Federal Information Processing Standards (FIPS) code for the state and the 3 digit FIPS code of the county that a facility is located in.
	AIRFIPSCode string `json:"AIRFIPSCode"`

	// A three-character code indicating if plant is government facility. COR - Corporation CNG - County Government DIS - District FDF - Federal Facility (U.S. Government) GOC - GOCO (Gov Owned/Contractor Operated) IND - Individual MXO - Mixed Ownership (e.g., Public/Private) MWD - Municipal or Water District CTG - Municipality NON - Non-Government POF - Privately Owned Facility SDT - School District STF - State Government TRB - Tribal Government UNK - Unknown
	AIRFacilityTypeCode string `json:"AIRFacilityTypeCode"`

	AIRFacilityTypeDesc string `json:"AIRFacilityTypeDesc"`

	// The total number of formal enforcement actions taken against the facility within the last five years.
	AIRFeaCnt string `json:"AIRFeaCnt"`

	// Indicates whether the facility currently has an unresolved High Priority Violation (HPV) under the Clean Air Act.
	AIRHpvStatus string `json:"AIRHpvStatus"`

	// Air Facility System (AFS) ID.
	AIRIDs string `json:"AIRIDs"`

	// The total number of informal enforcement actions taken against the facility within the last five years.
	AIRIeaCnt string `json:"AIRIeaCnt"`

	// Flag indicating whether the AIR facility is located in Indian country.
	AIRIndianCntryFlg string `json:"AIRIndianCntryFlg"`

	// The date on which the most recent Full Compliance Evaluation (FCE) of the facility by EPA or a state agency was completed.
	AIRLastEvalDate string `json:"AIRLastEvalDate"`

	// The last Air Inspection Date performed by EPA.
	AIRLastEvalDateEPA string `json:"AIRLastEvalDateEPA"`

	// The last Air Inspection Date performed by State or local authorities.
	AIRLastEvalDateState string `json:"AIRLastEvalDateState"`

	// The effective date of the most recent listed formal enforcement action taken against the facility.
	AIRLastFeaDate string `json:"AIRLastFeaDate"`

	// The last Air Formal Enforcement Action Date take by EPA.
	AIRLastFeaDateEPA string `json:"AIRLastFeaDateEPA"`

	// The last Air Formal Enforcement Action Date take by State or Local authorities.
	AIRLastFeaDateState string `json:"AIRLastFeaDateState"`

	// The effective date of the most recent listed informal enforcement action taken against the facility.
	AIRLastIeaDate string `json:"AIRLastIeaDate"`

	// The effective date of the most recent listed informal enforcement action taken against the facility by EPA.
	AIRLastIeaDateEPA string `json:"AIRLastIeaDateEPA"`

	// The effective date of the most recent listed informal enforcement action taken against the facility by a state agency.
	AIRLastIeaDateState string `json:"AIRLastIeaDateState"`

	// Indicates the date on which the most recent assessed (or final) penalty was taken against the facility for AIR.
	AIRLastPenaltyDate string `json:"AIRLastPenaltyDate"`

	// The date on which the most recent stack test by EPA occurred.
	AIRLastStckDateEPA string `json:"AIRLastStckDateEPA"`

	// The date on which the most recent stack test by a state agency occurred.
	AIRLastStckDateState string `json:"AIRLastStckDateState"`

	// The date on which the most recent stack test occurred.
	AIRLastStckTestDate string `json:"AIRLastStckTestDate"`

	// The result of the most recent stack test (Pass, Fail, Pending, or Blank).
	AIRLastStckTestResults string `json:"AIRLastStckTestResults"`

	// The date on which the most recent violation was reported.
	AIRLastViolDate string `json:"AIRLastViolDate"`

	// The Maximum Achievable Control Technology (MACT) Subpart associated with the facility.
	AIRMacts string `json:"AIRMacts"`

	// Indicated whether the facility is designated as a major facilitiy.
	AIRMajorFlag string `json:"AIRMajorFlag"`

	// The number of months in the last three years in which the permit or site is considered in High Priority Violation (HPV) status
	AIRMnthsWithHpv string `json:"AIRMnthsWithHpv"`

	// The facility’s or permit's primary North American Industry Classification System (NAICS) Code.
	AIRNAICS string `json:"AIRNAICS"`

	// The name of the AIR Facility.
	AIRName string `json:"AIRName"`

	// The New Source Performance Standards (NSPS) Subpart associated with the facility.
	AIRNsps string `json:"AIRNsps"`

	// The Non-Major New Source Performance Standards (NSPS) Subpart associated with the facility.
	AIRNspsm string `json:"AIRNspsm"`

	// The total dollar amount of assessed (or final) penalties taken against the facility within the last five years under the Clean Air Act. This value only includes penalties that have been entered in the national program database, ICIS-Air.
	AIRPenalties string `json:"AIRPenalties"`

	// The names of pollutants or pollutant categories with violations reported in the last year.
	AIRPollRecentViol string `json:"AIRPollRecentViol"`

	// Comma-delimited list of AIR programs.
	AIRPrograms string `json:"AIRPrograms"`

	// The number of quarters in the last three years in which the permit or site is considered in High Priority Violation (HPV) status.
	AIRQtrsWithHpv string `json:"AIRQtrsWithHpv"`

	// The number of quarters in the last three years in which the permit or site has had unresolved violation(s) reported.
	AIRQtrsWithViol string `json:"AIRQtrsWithViol"`

	// The number of violations reported in the last year.
	AIRRecentViolCnt string `json:"AIRRecentViolCnt"`

	AIRStackTest5YrAll string `json:"AIRStackTest5YrAll"`

	AIRStackTest5YrFail string `json:"AIRStackTest5YrFail"`

	// The state where the AIR facility is located.
	AIRState string `json:"AIRState"`

	// The status of the AIR facility location.
	AIRStatus string `json:"AIRStatus"`

	// The street address of the AIR facility location.
	AIRStreet string `json:"AIRStreet"`

	// The EPA Tribal or Native Alaskan Village Identifier for facilities, that based on their Best Pick FRS spatial coordinate, are within a Tribal or Alaskan Village area.
	AIRTRIbalEPAids string `json:"AIRTRIbalEPAids"`

	// The EPA Tribal or Native Alaskan Village Name for facilities, that based on their Best Pick FRS spatial coordinate, are within a Tribal or Alaskan Village area.
	AIRTRIbalNames string `json:"AIRTRIbalNames"`

	// The program office defines each CAA Source ID and the associated permits as being Federally Reportable or Non-Federally Reportable. Under the CAA, federally reportable source include majors, synthetic minors, NESHAP Part 61 minors, minors with an unresolved High Priority Violation (HPV), with recent enforcement action, or included on a Compliance Monitoring Strategy plan.
	AIRUniverse string `json:"AIRUniverse"`

	// The five-digit zip code of the AIR facility.
	AIRZip string `json:"AIRZip"`

	// A Y/N indicator indicating that the facility is active and located within the lower 48 contiguous US States.
	ActiveLower48 string `json:"ActiveLower48"`

	// A unique  ID assigned for each record/permit/site/facility within ICIS-NPDES. These identifiers are for used tracking purposes in the individual data systems.
	CWAIDs string `json:"CWAIDs"`

	// The estimated accuracy in Meters for the facility's geospatial coordinate.
	CalculatedAccuracyMeters string `json:"CalculatedAccuracyMeters"`

	// Facility identifiers for the Clean Air Markets Division database.
	CamdIDs string `json:"CamdIDs"`

	// A geographic unit used by the United States Census Bureau, generally defined to contain between 600 and 3,000 people.
	CensusBlockGroup string `json:"CensusBlockGroup"`

	// Displays \"Y\" if the facility is located within the Chesapeake Bay watershed.
	ChesapeakeBayFlag string `json:"ChesapeakeBayFlag"`

	// ??
	CollectionMethod string `json:"CollectionMethod"`

	// Indicates if the facility has a current significant violation. 1 = Yes
	CurrSvFlag string `json:"CurrSvFlag"`

	// Indicates if the facility has a current violation. 1 = Yes
	CurrVioFlag string `json:"CurrVioFlag"`

	// The EPA data system in which permit and facility records are kept. EPA's Facility Registry System (FRS) links all program database records (such as permit IDs and IDs facilities use in reporting to EPA) together. The following list describes the individual data systems that are linked to from the detailed facility report:   - AFS: Air Facility System for Clean Air Act stationary source programs. - ICP: Integrated Compliance Information System for Clean Water Act programs monitoring National Pollutant Discharge Elimination System (NPDES) permits. - RCR: Resource Conservation and Recovery Act Information System (RCRAInfo) for tracking the Resource Conservation and Recovery Act (RCRA) programs. - NCDB: National Compliance Database System for monitoring national performance of the Toxic Substance Control Act (TSCA); the Emergency Planning and Right-to-Know Act, Section 313 (EPCRA); the Asbestos Hazard Emergency Response (AHERA); and the Federal Insecticide, Fungicide, and Rodenticide Act (FIFRA). - TRI: Toxics Release Inventory for Emergency Planning and Community Right-to-Know Act, Section 313 submissions. - NEI: National Emissions Inventory database contains information on stationary and mobile sources that emit criteria air pollutants and their precursors, as well as hazardous air pollutants (HAPs). The database includes estimates of annual emissions, by source, of air pollutants in each area of the country, on an annual basis. - TSCA: Toxic Substances Control Act addressing the production, importation, use, and disposal of specific chemicals.
	EPASystem string `json:"EPASystem"`

	// Indicates if the facility has a formal enforcement action within the last 5 years. 1 = Yes
	Ea5yrFlag string `json:"Ea5yrFlag"`

	// A unique ID assigned for each facility within EPA’s Emissions Inventory System (EIS) Database.
	EisIDs string `json:"EisIDs"`

	// A Y/N indicator identifying whether or not the facility is within an Environmental Justice area.
	EjscreenFlag string `json:"EjscreenFlag"`

	// A Y/N indicator identifying whether or not the facility is within an Environmental Justice area.
	EjscreenFlagUs string `json:"EjscreenFlagUs"`

	// Indicates whether the facility reports to the Clean Air Markets Division (CAMD).
	FacCamdReporter string `json:"FacCamdReporter"`

	// The facility county name from EPA's Facility Registry System
	FacCountyName string `json:"FacCountyName"`

	// The 8-digit Hydrologic Unit Code (HUC) of the watershed in which the facility resides. A HUC number is assigned to every watershed in the nation and uniquely identifies the watershed.
	FacDerivedHuc string `json:"FacDerivedHuc"`

	// The tribes or tribal territories located within 25 miles of the facility's location.
	FacDerivedTRIbes string `json:"FacDerivedTRIbes"`

	// The Hydrologic Unit Code (HUC-12) of the waterbody in which the facility resides, derived based on location data in FRS.
	FacDerivedWBD string `json:"FacDerivedWBD"`

	// The 12 digit Watershed Boundary Dataset Name derived from the FRS Best Pick Coordinate
	FacDerivedWBDName string `json:"FacDerivedWBDName"`

	// The amount of hazardous air pollutants released to air in tons per year, as reported in the most recent National Emissions Inventory (NEI).
	FacEisAIRReleases string `json:"FacEisAIRReleases"`

	// Indicates whether the facility reports to the Emissions Inventory System (EIS).
	FacEisReporter string `json:"FacEisReporter"`

	// The 2-digit Federal Information Processing Standards (FIPS) code to identify the county that a facility is located in.
	FacFIPSCode string `json:"FacFIPSCode"`

	// Indicates the federal agency, as classified in FRS. Federal agencies are installations that are owned and operated by the U.S. government. The five-character code consists of a letter followed by four numbers. There are four possible letters that can occupy the first character position: C = Civilian Federal Agency; D = Department of Defense; E = Department of Energy; X = Unknown. The second and third characters represent the agency code, while the fourth and fifth characters represent the bureau code.
	FacFederalAgencyCode string `json:"FacFederalAgencyCode"`

	// Indicates the name of the federal agency, as classified in FRS. Federal agencies are installations that are owned and operated by the U.S. government.
	FacFederalAgencyName string `json:"FacFederalAgencyName"`

	// The annual sum of total release amounts and \"associated quantities\" of all linked Greenhouse Gas IDs from the Office of Air and Radiation \"Summary 2010 Greenhouse Gas Data.\" Units are reported as metric tons of CO2 equivalents per year (MTCO2e/year).
	FacGHGCO2Releases string `json:"FacGHGCO2Releases"`

	// Indicates whether the facility reports to the Greenhouse Gas Reporting Program (GHGRP)
	FacGHGReporter string `json:"FacGHGReporter"`

	// Flag showing Y/N whether the facility is located in Indian Country.
	FacIndianCntryFlg string `json:"FacIndianCntryFlg"`

	// Returns “Y” if a facility is located within a tribal spatial boundary as defined by the U.S. Census Bureau 2010 tribal boundary layer data for tribes in the lower 48 states and Bureau of Land Management Alaska State Office data for native villages in Alaska. Returns “N” if a facility is not located within a tribal or native Alaskan village area.
	FacIndianSpatialFlg string `json:"FacIndianSpatialFlg"`

	// The latitude of the facility in decimal degrees expressed using the NAD83 horizontal datum. The coordinate comes from the FRS EPA Locational Reference Tables (LRT) file which represents the most accurate value for the facility based on the available spatial metadata.
	FacLat string `json:"FacLat"`

	// The longitude of the facility in decimal degrees expressed using the NAD83 horizontal datum. The coordinate comes from the FRS EPA Locational Reference Tables (LRT) file which represents the most accurate value for the facility based on the available spatial metadata.
	FacLong string `json:"FacLong"`

	// Graphical indicator denoting whether geographical data required to map a facility are available.
	FacMapFlg string `json:"FacMapFlg"`

	// The default map icon image file calculated for the facility by the ECHO program.
	FacMapIcon string `json:"FacMapIcon"`

	// Indicates whether the facility is located in a nonattainment area of the country, where air pollution levels persistently exceed the national ambient air quality standards. This flag does not indicate whether or not the facility has violated national ambient area quality standards.
	FacNaaFlag string `json:"FacNaaFlag"`

	// Percent Minority is the percentage of the population of the given area that is considered minority. Statistics are shown for the area within a 3-mile radius of each facility.
	FacPercentMinority string `json:"FacPercentMinority"`

	// The number of persons per square mile in the profiled area.
	FacPopulationDensity string `json:"FacPopulationDensity"`

	// Indicates the facility’s or permit's primary Standard Industrial Classification (SIC) Code. The SIC code describes the primary activity of the facility.
	FacSICCodes string `json:"FacSICCodes"`

	// The standardized  facility county name from EPA's Facility Registry System
	FacStdCountyName string `json:"FacStdCountyName"`

	// The total chemical releases to air, in pounds, as reported to TRI by the facility for the most recent reporting year.
	FacTRIAIRReleases string `json:"FacTRIAIRReleases"`

	// The pounds of chemicals considered to be carcinogens released to air, as reported to TRI for the most recent reporting year. Chemicals are classified as carcinogens under the requirements of the Occupational Safety and Health Administration (OSHA).
	FacTRICarcAIRReleases string `json:"FacTRICarcAIRReleases"`

	// The pounds of chemicals classified as hazardous air pollutants (HAPS) released to air in pounds per year, as reported to TRI for the most recent reporting year.
	FacTRIHapsReleases string `json:"FacTRIHapsReleases"`

	// Indicates whether facility reported to the Toxics Release Inventory (TRI) for the most recent reporting year.
	FacTRIReporter string `json:"FacTRIReporter"`

	// A Y/N flag indicating that the facility is within 100KM of the US-Mexico Border.
	FacUsMexBorderFlg string `json:"FacUsMexBorderFlg"`

	// A unique ID assigned for each facility within EPA’s Greenhouse Gas Reporting Program (GHGRP) Emissions Data Sets.
	GHGIDs string `json:"GHGIDs"`

	// ???
	HasPollRpt string `json:"HasPollRpt"`

	// Indicates if the facility has an informal enforcement action within the last 5 years. 1 = Yes.
	Infea5yrFlag string `json:"Infea5yrFlag"`

	// Indicates if the facility has an inspection within the last 5 years. 1 = Yes
	Insp5yrFlag string `json:"Insp5yrFlag"`

	// The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by EPA or a state agency was completed.
	LastDatePce string `json:"LastDatePce"`

	// The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by EPA was completed.
	LastDatePceEPA string `json:"LastDatePceEPA"`

	// The date on which the most recent Partial Compliance Evaluation (PCE) of the facility by a state agency was completed.
	LastDatePceSta string `json:"LastDatePceSta"`

	// Code for regions within a state. Search criteria for DFR in OTIS.
	LocalControlRegionCode string `json:"LocalControlRegionCode"`

	// Regions within a state. Search criteria for DFR in OTIS.
	LocalControlRegionName string `json:"LocalControlRegionName"`

	// Flag showing Y/N whether location is within the contiguous (lower 48) United States.
	Lower48 string `json:"Lower48"`

	MaintPollutantsNaa string `json:"MaintPollutantsNaa"`

	MaintStandardsNaa string `json:"MaintStandardsNaa"`

	MaintStatusNaa string `json:"MaintStatusNaa"`

	// No Longer Used.
	Map string `json:"Map"`

	// The maximum percentile from all individual EJSCREEN indicators.
	MaxPctileUs string `json:"MaxPctileUs"`

	// A sorting score for internal use.
	MaxScore string `json:"MaxScore"`

	NaPollutantsNaa string `json:"NaPollutantsNaa"`

	NaStandardsNaa string `json:"NaStandardsNaa"`

	NaStatusNaa string `json:"NaStatusNaa"`

	// The nonattainment area categories that the facility is in, derived spatially based on the facility's geographic coordinates in FRS.�
	NaaCategories string `json:"NaaCategories"`

	// All criteria pollutants that the facility is in nonattainment for.
	NaaPollutants string `json:"NaaPollutants"`

	OtherPermitIDs string `json:"OtherPermitIDs"`

	// The number of primary EJSCREEN environmental justice (EJ) indexes exceeding the 80th or higher national percentile for the Census block group that the facility is located in.
	Over80CountUs string `json:"Over80CountUs"`

	// The national percentile of the census block group for the EJSCREEN NATA air toxics cancer risk indicator.
	PctileCancerUs string `json:"PctileCancerUs"`

	// The national percentile of the census block group for the EJSCREEN diesel particulate matter indicator.
	PctileDpmUs string `json:"PctileDpmUs"`

	// The national percentile of the census block group for the EJSCREEN ozone indicator.
	PctileO3Us string `json:"PctileO3Us"`

	// The national percentile of the census block group for the EJSCREEN Lead paint indicator.
	PctilePctpre1960Us string `json:"PctilePctpre1960Us"`

	// The national percentile of the census block group for the EJSCREEN particulate matter indicator.
	PctilePmUs string `json:"PctilePmUs"`

	// The national percentile of the census block group for the EJSCREEN proximity to major direct water dischargers indicator.
	PctileProximityNPDESUs string `json:"PctileProximityNPDESUs"`

	// The national percentile of the census block group for the EJSCREEN proximity to National Priorities List (NPL) sites indicator.
	PctileProximityNplUs string `json:"PctileProximityNplUs"`

	// The national percentile of the census block group for the EJSCREEN proximity to Risk Management Plan (RMP) sites indicator.
	PctileProximityRmpUs string `json:"PctileProximityRmpUs"`

	// The national percentile of the census block group for the EJSCREEN proximity to Treatment Storage and Disposal Facilities (TSDFs) indicator.
	PctileProximityTsdfUs string `json:"PctileProximityTsdfUs"`

	// The national percentile of the census block group for the EJSCREEN NATA respiratory hazard index indicator.
	PctileRespUs string `json:"PctileRespUs"`

	// The national percentile of the census block group for the EJSCREEN Traffic proximity and volume indicator.
	PctileTrafficScoreUs string `json:"PctileTrafficScoreUs"`

	// A unique 12-character ID assigned for each record/permit/site/facility within the RCRAInfo database.
	RCRAIDs string `json:"RCRAIDs"`

	// ??
	ReferencePoint string `json:"ReferencePoint"`

	// An internal 12-digit Facility Registry Service (FRS) tracking number used to tie all facility data together in EPA regulatory program databases.
	RegistryID string `json:"RegistryID"`

	// A unique ID assigned to each facility submitting a Risk Management Plan to EPA under the Risk Management Plan Rule.
	RmpIDs string `json:"RmpIDs"`

	// A unique 9-character ID assigned for each public water system within the Safe Drinking Water Information System (SDWIS).
	SDWAIDs string `json:"SDWAIDs"`

	Score string `json:"Score"`

	// Unique Identifier assigned by EPA.
	SourceID string `json:"SourceID"`

	// The name of the statute associated with each of the permits and identifiers linked to the facility:  - CAA = the Clean Air Act - CWA = the Clean Water Act - RCRA = the Resource Conservation and Recovery Act - EP313 = the Emergency Planning and Community Right-to-Know Act, Section 313 (also known as the Toxics Release Inventory Program) - TSCA = the Toxic Substances Control Act - SDWA = the Safe Drinking Water Act
	Statute string `json:"Statute"`

	// A unique 15-character ID assigned for each facility within the Toxics Release Inventory (TRI) program. The format is ZZZZZNNNNNSSSSS, where ZZZZZ = ZIP code, NNNNN = the first 5 consonants of the name, and SSSSS = the first 5 non-blank non-special characters in the street address.
	TRIIDs string `json:"TRIIDs"`

	// A flag indicating that the facility is within a tribal area.
	TRIbalFlag string `json:"TRIbalFlag"`

	// Indicates if the facility had a violation within the last 3 years. 1 = Yes
	ViolFlag string `json:"ViolFlag"`

	// Contains flags that identify what web accessible documents are available for the facility.
	WebDocs string `json:"WebDocs"`
}

// AssertAir03Required checks if the required fields are not zero-ed
func AssertAir03Required(obj Air03) error {
	elements := map[string]interface{}{
		"AIR3yrComplQtrsHistory": obj.AIR3yrComplQtrsHistory,
		"AIRCaseIDs": obj.AIRCaseIDs,
		"AIRCity": obj.AIRCity,
		"AIRClassification": obj.AIRClassification,
		"AIRComplStatus": obj.AIRComplStatus,
		"AIRCounty": obj.AIRCounty,
		"AIRDaysLastEval": obj.AIRDaysLastEval,
		"AIREPARegion": obj.AIREPARegion,
		"AIREvalCnt": obj.AIREvalCnt,
		"AIRFIPSCode": obj.AIRFIPSCode,
		"AIRFacilityTypeCode": obj.AIRFacilityTypeCode,
		"AIRFacilityTypeDesc": obj.AIRFacilityTypeDesc,
		"AIRFeaCnt": obj.AIRFeaCnt,
		"AIRHpvStatus": obj.AIRHpvStatus,
		"AIRIDs": obj.AIRIDs,
		"AIRIeaCnt": obj.AIRIeaCnt,
		"AIRIndianCntryFlg": obj.AIRIndianCntryFlg,
		"AIRLastEvalDate": obj.AIRLastEvalDate,
		"AIRLastEvalDateEPA": obj.AIRLastEvalDateEPA,
		"AIRLastEvalDateState": obj.AIRLastEvalDateState,
		"AIRLastFeaDate": obj.AIRLastFeaDate,
		"AIRLastFeaDateEPA": obj.AIRLastFeaDateEPA,
		"AIRLastFeaDateState": obj.AIRLastFeaDateState,
		"AIRLastIeaDate": obj.AIRLastIeaDate,
		"AIRLastIeaDateEPA": obj.AIRLastIeaDateEPA,
		"AIRLastIeaDateState": obj.AIRLastIeaDateState,
		"AIRLastPenaltyDate": obj.AIRLastPenaltyDate,
		"AIRLastStckDateEPA": obj.AIRLastStckDateEPA,
		"AIRLastStckDateState": obj.AIRLastStckDateState,
		"AIRLastStckTestDate": obj.AIRLastStckTestDate,
		"AIRLastStckTestResults": obj.AIRLastStckTestResults,
		"AIRLastViolDate": obj.AIRLastViolDate,
		"AIRMacts": obj.AIRMacts,
		"AIRMajorFlag": obj.AIRMajorFlag,
		"AIRMnthsWithHpv": obj.AIRMnthsWithHpv,
		"AIRNAICS": obj.AIRNAICS,
		"AIRName": obj.AIRName,
		"AIRNsps": obj.AIRNsps,
		"AIRNspsm": obj.AIRNspsm,
		"AIRPenalties": obj.AIRPenalties,
		"AIRPollRecentViol": obj.AIRPollRecentViol,
		"AIRPrograms": obj.AIRPrograms,
		"AIRQtrsWithHpv": obj.AIRQtrsWithHpv,
		"AIRQtrsWithViol": obj.AIRQtrsWithViol,
		"AIRRecentViolCnt": obj.AIRRecentViolCnt,
		"AIRStackTest5YrAll": obj.AIRStackTest5YrAll,
		"AIRStackTest5YrFail": obj.AIRStackTest5YrFail,
		"AIRState": obj.AIRState,
		"AIRStatus": obj.AIRStatus,
		"AIRStreet": obj.AIRStreet,
		"AIRTRIbalEPAids": obj.AIRTRIbalEPAids,
		"AIRTRIbalNames": obj.AIRTRIbalNames,
		"AIRUniverse": obj.AIRUniverse,
		"AIRZip": obj.AIRZip,
		"ActiveLower48": obj.ActiveLower48,
		"CWAIDs": obj.CWAIDs,
		"CalculatedAccuracyMeters": obj.CalculatedAccuracyMeters,
		"CamdIDs": obj.CamdIDs,
		"CensusBlockGroup": obj.CensusBlockGroup,
		"ChesapeakeBayFlag": obj.ChesapeakeBayFlag,
		"CollectionMethod": obj.CollectionMethod,
		"CurrSvFlag": obj.CurrSvFlag,
		"CurrVioFlag": obj.CurrVioFlag,
		"EPASystem": obj.EPASystem,
		"Ea5yrFlag": obj.Ea5yrFlag,
		"EisIDs": obj.EisIDs,
		"EjscreenFlag": obj.EjscreenFlag,
		"EjscreenFlagUs": obj.EjscreenFlagUs,
		"FacCamdReporter": obj.FacCamdReporter,
		"FacCountyName": obj.FacCountyName,
		"FacDerivedHuc": obj.FacDerivedHuc,
		"FacDerivedTRIbes": obj.FacDerivedTRIbes,
		"FacDerivedWBD": obj.FacDerivedWBD,
		"FacDerivedWBDName": obj.FacDerivedWBDName,
		"FacEisAIRReleases": obj.FacEisAIRReleases,
		"FacEisReporter": obj.FacEisReporter,
		"FacFIPSCode": obj.FacFIPSCode,
		"FacFederalAgencyCode": obj.FacFederalAgencyCode,
		"FacFederalAgencyName": obj.FacFederalAgencyName,
		"FacGHGCO2Releases": obj.FacGHGCO2Releases,
		"FacGHGReporter": obj.FacGHGReporter,
		"FacIndianCntryFlg": obj.FacIndianCntryFlg,
		"FacIndianSpatialFlg": obj.FacIndianSpatialFlg,
		"FacLat": obj.FacLat,
		"FacLong": obj.FacLong,
		"FacMapFlg": obj.FacMapFlg,
		"FacMapIcon": obj.FacMapIcon,
		"FacNaaFlag": obj.FacNaaFlag,
		"FacPercentMinority": obj.FacPercentMinority,
		"FacPopulationDensity": obj.FacPopulationDensity,
		"FacSICCodes": obj.FacSICCodes,
		"FacStdCountyName": obj.FacStdCountyName,
		"FacTRIAIRReleases": obj.FacTRIAIRReleases,
		"FacTRICarcAIRReleases": obj.FacTRICarcAIRReleases,
		"FacTRIHapsReleases": obj.FacTRIHapsReleases,
		"FacTRIReporter": obj.FacTRIReporter,
		"FacUsMexBorderFlg": obj.FacUsMexBorderFlg,
		"GHGIDs": obj.GHGIDs,
		"HasPollRpt": obj.HasPollRpt,
		"Infea5yrFlag": obj.Infea5yrFlag,
		"Insp5yrFlag": obj.Insp5yrFlag,
		"LastDatePce": obj.LastDatePce,
		"LastDatePceEPA": obj.LastDatePceEPA,
		"LastDatePceSta": obj.LastDatePceSta,
		"LocalControlRegionCode": obj.LocalControlRegionCode,
		"LocalControlRegionName": obj.LocalControlRegionName,
		"Lower48": obj.Lower48,
		"MaintPollutantsNaa": obj.MaintPollutantsNaa,
		"MaintStandardsNaa": obj.MaintStandardsNaa,
		"MaintStatusNaa": obj.MaintStatusNaa,
		"Map": obj.Map,
		"MaxPctileUs": obj.MaxPctileUs,
		"MaxScore": obj.MaxScore,
		"NaPollutantsNaa": obj.NaPollutantsNaa,
		"NaStandardsNaa": obj.NaStandardsNaa,
		"NaStatusNaa": obj.NaStatusNaa,
		"NaaCategories": obj.NaaCategories,
		"NaaPollutants": obj.NaaPollutants,
		"OtherPermitIDs": obj.OtherPermitIDs,
		"Over80CountUs": obj.Over80CountUs,
		"PctileCancerUs": obj.PctileCancerUs,
		"PctileDpmUs": obj.PctileDpmUs,
		"PctileO3Us": obj.PctileO3Us,
		"PctilePctpre1960Us": obj.PctilePctpre1960Us,
		"PctilePmUs": obj.PctilePmUs,
		"PctileProximityNPDESUs": obj.PctileProximityNPDESUs,
		"PctileProximityNplUs": obj.PctileProximityNplUs,
		"PctileProximityRmpUs": obj.PctileProximityRmpUs,
		"PctileProximityTsdfUs": obj.PctileProximityTsdfUs,
		"PctileRespUs": obj.PctileRespUs,
		"PctileTrafficScoreUs": obj.PctileTrafficScoreUs,
		"RCRAIDs": obj.RCRAIDs,
		"ReferencePoint": obj.ReferencePoint,
		"RegistryID": obj.RegistryID,
		"RmpIDs": obj.RmpIDs,
		"SDWAIDs": obj.SDWAIDs,
		"Score": obj.Score,
		"SourceID": obj.SourceID,
		"Statute": obj.Statute,
		"TRIIDs": obj.TRIIDs,
		"TRIbalFlag": obj.TRIbalFlag,
		"ViolFlag": obj.ViolFlag,
		"WebDocs": obj.WebDocs,
	}
	for name, el := range elements {
		if isZero := IsZeroValue(el); isZero {
			return &RequiredError{Field: name}
		}
	}

	return nil
}

// AssertAir03Constraints checks if the values respects the defined constraints
func AssertAir03Constraints(obj Air03) error {
	return nil
}
