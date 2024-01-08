/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Clean Air Act Download Data Service
* Based on the QID obtained from a get_facilities or get_facility_info query, return a comma sepated vaule (CSV) file of the facilities found.
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - CSV = Facility results formatted as comma delimited file download (default). - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns File
* */
const air_rest_services_get_downloadGET = ({ qid, output, qcolumns, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        output,
        qcolumns,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Download Data Service
* Based on the QID obtained from a get_facilities or get_facility_info query, return a comma sepated vaule (CSV) file of the facilities found.
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - CSV = Facility results formatted as comma delimited file download (default). - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns File
* */
const air_rest_services_get_downloadPOST = ({ qid, output, qcolumns, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        output,
        qcolumns,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Facility Search
* Validates query search parameters and returns query identifier.  Use the responseset parameter to set the page size
*
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* pUnderscorefn String Facility Name Filter. Enter one or more case-insensitive facility names to filter results.  Provide multiple values as a comma-delimited list.  See p_fntype for additional modifiers. (optional)
* pUnderscoresa String Facility street address. Enter a complete or partial street address. (optional)
* pUnderscoresa1 String Facility street address. Enter a complete or partial street address.   Note that p_sa1 is culmulative with p_sa. (optional)
* pUnderscorect String Facility City Filter. Enter a single case-insensitive city name to filter results. (optional)
* pUnderscoreco String Facility County Filter. Provide a single county name in combination with a state value provided via p_st. (optional)
* pUnderscorefips String FIPS Code Filter.  Enter a single 5-character Federal Information Processing Standards (FIPS) state + county value to restrict results.  E.g. to limit results to Kenosha County, Wisconsin, use 55059. (optional)
* pUnderscorest String Facility State and State-Equivalent Filter.  Provide one or more USPS postal abbreviations for states and state-equivalents to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorezip String 5-Digit ZIP Code Filter. Provide one or more 5-digit postal zip codes to filter results.  May contain multiple comma-separated values. (optional)
* pUnderscorelcon String Air Program Local Control Region Code Filter.  Enter one or more local control region codes to filter results.  Provide multiple codes as a comma-delimited list.  Codes where they exist are specific by state. (optional)
* pUnderscorefrs String Facility Registry Service ID Filter. Enter a single 12-digit FRS identifier to filter results. (optional)
* pUnderscorereg String EPA Region Filter. Provide a single value of 01 thru 10 to restrict results to a single EPA region. (optional)
* pUnderscoresic String Standard Industrial Classification (SIC) Code Filter.  Enter a single 4-digit SIC Code to filter results.  If more complex filtering is required, use p_sic2 and p_sic4. (optional)
* pUnderscorencs String North American Industry Classification System Filter. Enter two to six digits to filter results to facilities having matching NAICS codes.  Digits less than six will match to all codes beginning with the provided values. (optional)
* pUnderscoreqnc BigDecimal Number of quarters in non-compliance limiter.  Enter an integer value between 1 and 4 to limit results. (optional)
* pUnderscorepen String Last Penality Date Qualifier Filter.  Enter one of the following:    - NEVER = No Penalties - ANY = Any Penalty - LEXX = Less than or equal to XX months.  Provide a number in place of XX, e.g. \"LE5\" for a facility with a penalty within previous 5 months. - GTXX = Greater than XX months.  Provide a number in place of XX, eg. GT12, for a facility with the last penalty greater than 12 months ago. (optional)
* pUnderscoreopst String Operating status filter.  Enter one or more operating status codes to limit results.   Provide multiple codes as a comma-delimited list. (optional)
* pUnderscorec1lat BigDecimal In decimal degrees.  Latitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscorec1lon BigDecimal In decimal degrees.  Longitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscorec2lat BigDecimal In decimal degrees.  Latitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscorec2lon BigDecimal In decimal degrees.  Longitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscoreusmex String US-Mexico Border Flag.  Enter Y/N to restrict searches to facilities located within 100KM of the border. (optional)
* pUnderscoresic2 String Standard Industrial Classification (SIC) Code Filter Alternate 2. Enter a wild-card search against SIC codes.  A final wild-card is always present allowing \"22\" to match all SIC codes beginning with 22.  Use the \"%\" character within strings to match any SIC values with the pattern.  For example, \"2%21\" matches 2021, 2121, 2221, etc. (optional)
* pUnderscoresic4 String Standard Industrial Classification (SIC) Code Filter Alternate 3.  Enter the first 2, 3 or 4 SIC code digits to filter results to facilities having those code prefixes.  As this alternative does not utilize an index, p_sic2 will generally be quicker. (optional)
* pUnderscorefa String Federal Agency. 1 character or 5-character values; may contain multiple comma-separated values. ALL will retrieve all facilities where the federal agency code is not null.  Use the Federal Agencies lookup service to obtain a list of values. (optional)
* pUnderscoreact String Active Permits/Facilities Flag.  Provide Y or N to filter results to facilities with active permits. (optional)
* pUnderscoremaj String Major Facility Flag.  Enter Y to restrict results to Major facilities only. (optional)
* pUnderscoremact String CAA Maximum Achievable Control Technology (MACT) Subpart codes (alpha ID between 1 and 7 characters) applicable to the facility. (optional)
* pUnderscorensps String Air Programl New Source Performance Standards (NSPS)  Subpart Code Search.  One or more valid Air Program NSPS Program codes cand be passed.   (optional)
* pUnderscorenspsm String Air Programl New Source Performance Standards Minors (NSPSM) Subpart Code Search.  One or more valid Air Program NSPSM Subpart codes can be passed.   (optional)
* pUnderscoreprog String Air Program Code Filter.  Enter one or more Air program codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorefea String Formal Enforcement Actions [within / not within] specified date range indicator. The date range is determined by parameters p_fead1 and p_fead2 or by parameter p_feay. - W = within date range - N = not within date range (optional)
* pUnderscorefeay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Formal Enforcement Actions (FEA). Used along with p_fea (which indicates whether to look within or outside of the date range) to find FEAs within (or not within) the number of years specified. (optional)
* pUnderscorefeaa String Agency associated with Formal Enforcement Actions: - E = EPA - S = State - A = All (optional)
* pUnderscoreiea String Informal Enforcement Actions [within / not within] specified date range.  The date range is determined by parameters p_iead1 and p_iead2 or by parameter p_ieay. - W = within date range - N = not within date range (optional)
* pUnderscoreieay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Informal Enforcement Actions (IEA). Used along with p_iea (which indicates whether to look within or outside of the date range) to find IEAs within (or not within) the number of years specified. (optional)
* pUnderscoreieaa String Agency associated with Informal Enforcement Actions. If left blank, both agencies are included. - E = EPA - S = State (optional)
* pUnderscoreqiv String Quarters in Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of noncompliance. - Z = Zero quarters in noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in noncompliance. (optional)
* pUnderscorenaa String Non-Attainment Area Flag.  Enter a Y or N to filter for or against facilities flagged as non-attainment areas. (optional)
* pUnderscoreimpw String Discharging into Impaired Waters Flag. Enter Y to limit results to facilities with discharge to waterbodies listed as impaired in the ATTAINS database. (optional)
* pUnderscoretrep String Current Toxics Release Inventory (TRI) Reporter Limiter.  Enter one of the following codes to limit results. - CURR = Current TRI reporter. - NONCURR = Has reported to TRI in the past but not for the current reporting year. (optional)
* pUnderscoretriUnderscorecat String Toxic Release Inventory Released To Air Chemical Identifier Category Filter.  Enter the chemical identifier category code to limit results. Note when filtering by TRI chemical identifier categories one may not also filter by specific chemical identifiers via p_tri_pol.  You must also specify a release amount using p_tri_amt or p_tri_any_amt. - TOTAL = Total Released to Air - CARC = Total Carcinogens Released to Air - HAP = Total Hazardous Air Pollutants Released to Air (optional)
* pUnderscoretriUnderscoreamt String Toxic Release Inventory Release Amount Filter.  Enter a value in pounds to limit results to facilities releasing this amount or greateer of TRI releases.  Valid values are 0, GT0, GT1000, GT5000, GT10000 and GT50000. Note when filtering by TRI release amounts one may only use either p_tri_amt or p_tri_any_amt. (optional)
* pUnderscoretriUnderscoreanyUnderscoreamt BigDecimal Toxic Release Inventory Release Of Any Kind Above Value Filter.  Enter a value to limit results to facilities releasing this amount or more of TRI releases.  Note when filtering by TRI releases one may only use p_tri_any_amt or p_tri_amt and not both. (optional)
* pUnderscoretriUnderscorepol String Toxic Release Inventory Chemical Identifier Filter.  Enter one or more chemical identifier codes to limit results. Note when filtering by specific TRI chemical identifiers one may not also filter by chemical identifier categories via p_tri_cat. (optional)
* pUnderscoreghgUnderscorecat String Green House Gas (GHG) Gas Code Category.  Must be used with either a formatted (p_ghg_amt) or custom (p_ghg_any_amt) release amount. (optional)
* pUnderscoreghgUnderscoreamt String Green House Gas (GHG) CO2 Equivalent Formatted Release Amount.  First 2 characters must contain GT (greater than) followed by a number. (optional)
* pUnderscoreghgUnderscoreanyUnderscoreamt BigDecimal Green House Gas (GHG) C02 Equivalent Custom Amount.  The C02E value reported for the provided category, will be greater or equal to the amount provided. (optional)
* pUnderscoreghgUnderscoreyr String Green House Gas (GHG) Reporting Year. (2010 through 2015) (optional)
* pUnderscoreneiUnderscorepol String National Emissions Inventory (NEI) Pollutant Identifier.  When a pollutant identifer is entered a corresponding formatted amount or custom amount must be entered. (optional)
* pUnderscoreneiUnderscoreamt String National Emissions Inventory (NEI) Formatted Pollutant Amount.  A formatted value where the 1st two characters must start with GT or LT followed by a number.  Identifies facilities that have a NEI Pollutant Emission  where the supplied value is > or < the pollutant emission amount.   (optional)
* pUnderscoreneiUnderscoreanyUnderscoreamt BigDecimal National Emissions Inventory (NEI) Custom Pollutant Amount.  Only a number can be entered.  Identifies facilities with where the NEI Pollutant Emission Amount is greater than the number entered. (optional)
* pUnderscoreneiUnderscoreyr String National Emissions Inventory (NEI) year:  2014 or 2011 (optional)
* pUnderscoreneiUnderscorecat String National Emissions Inventory (NEI) Pollutant Category.  When a pollutant category is entered, a corresponding formatted pollutant amount or custom amount must be entered. (optional)
* pUnderscorepm String Percent Minority Population Limiter.  Enter a value to restrict results to facilities with a given percentage of minority population within 3-mile radius. - NONE = 0% - GT5 = greater than 5% - GT10 = greater than 10% - GT25 = greater than 25% - GT50 = greater than 50% - GT75 = greater than 75% (optional)
* pUnderscorepd String Population Density Limiter (per sq mile). Enter a value to limit results to facilities located in area of a given population density. - NONE = 0 population density per square mile - GT100 = More than 100 population density per square mile - GT500 = More than 500 population density per square mile - GT1000 = More than 1000 population density per square mile - GT5000 = More than 5000 population density per square mile - GT10000 = More than 10000 population density per square mile - GT20000 = More than 20000 population density per square mile (optional)
* pUnderscoreico String Indian Country Flag.  Enter a \"Y\" or \"N\" to restrict searches to facilities inside or outside Indian Country. (optional)
* pUnderscorehuc String 2-, 4-, 6-, or 8-character watershed code. May contain multiple comma-separated values. (optional)
* pUnderscorewbd String 2-, 4-, 6-, 8-, 10-, or 12-character watershed (WBD from the USGS Watershed Boundary Dataset). May contain multiple comma-separated values.  Uses the FRS Best Pick Coordinate to obtain the WBD12 Huc value. (optional)
* pUnderscorepid String Nine-digit permit IDs. May contain up to 2000 comma-separated values. (optional)
* pUnderscoremed String Filter Results by Media. - M = RMP (Risk Management Plan) - R = RCRA (Hazardous Waste) - S = SDWA (Public Drinking Water Systems) - W = Water - ALL = Water and RCRA and SDWA (optional)
* pUnderscoreysl String Last Facility Inspection [within / not within] Specified Date Range Indicator. The date range is determined by parameters p_idt1 and p_idt2 or by parameter p_ysly. - W = within date range - N = not within date range (optional)
* pUnderscoreysly BigDecimal Number of years (1 to 5) since last facility inspection.  A value of 1 means that it has been inspected within the year. (optional)
* pUnderscoreysla String Facility Last Inspection Code Filter.  If left blank, both agencies are included.  Enter a value to limit results: - E = EPA - S = State (optional)
* pUnderscorestsl String Last Stack Test [within / not within] Specified Date Range Indicator. - W = within date range - N = not within date range (optional)
* pUnderscorestsly BigDecimal Number of years (1 to 5) since date of last stack test. A value of 1 means it has been inspected within the year. (optional)
* pUnderscorestsla String Stack Last Test Code Filter.  Enter a value to limit results: - A = All - E = EPA - S = State (optional)
* pUnderscorestres String Air Stack Test Status Description Filter.  Enter one or more test status descriptions to filter results.  Enter multiple values as a comma-delimited list. (optional)
* pUnderscoresttyp String Air Conductor Type Code Filter.  Enter one or more conductor type codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscoreqs String Quick Search. Allows entry for city, state, and/or zip code. (optional)
* pUnderscoresfs String Single Facility Search Filter.  Provide a facility name or program system identifier to limit results.  For the all data search, the FRS registry identifier is also searched. (optional)
* pUnderscoretribeid BigDecimal Numeric code for tribe (or list of tribes). (optional)
* pUnderscoretribename String Tribe Name Filter.  Enter a single tribe name to filter results. (optional)
* pUnderscoretribedist BigDecimal Proximity to tribal land limiter. Enter an amount of mile between 0 and 25 to filter results.  This parameter is only evaluated if p_tribeid is populated. (optional)
* pUnderscoreowop String Owner/Operator code filter.  Enter one or more codes to limit results. - CNG - COR - CTG - DIS - FDF - MWD - MXO - NON - POF - SDT - STF - TRB (optional)
* pUnderscoreagoo String Indicates whether to AND or OR the Owner/Operator parameter (p_owop) and the federal agency code (p_fa) parameters. (optional)
* pUnderscoreidt1 String Beginning of date range of most recent facility inspection. (optional)
* pUnderscoreidt2 String End of date range of most recent facility inspection. (optional)
* pUnderscorestdt1 String Beginning of date range of most recent stack test. (optional)
* pUnderscorestdt2 String End of date range of most recent stack test. (optional)
* pUnderscorepityp String Inspection Type: - CAC = Corrective Action Inspection - CAV = Compliance Assistance Visit - CDI = Case Development Inspection - CEI = Inspection Inspection - CSE = Compliance Schedule Evaluation - FCI = Focused Compliance - FRR = Financial Record Review - FSD = Facility Self Disclosure - FUI = Follow-Up Inspection - GME = Groundwater Monitoring Evaluation - NRR = Non-Financial Record Review - OAM = Operation and Maintenance Inspection May contain multiple comma-separated values. (optional)
* pUnderscorecifdi String Compliance issuess found during inspection. (optional)
* pUnderscorepfead1 String Formal Enforcement Action Date Range Start.  Enter a date in MM/DD/YYYY format to set the start of the range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfead2 String Formal Enforcement Action Date Range End.  Enter a date in MM/DD/YYYY format to set the end of the date range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfeat String Formal Enforcement Action (FEA) Code Filter.  Enter one or more three-letter FEA codes to restrict results to facilities with these attributes.  Use p_fead1 and p_fead2 parameters to further restrict this filter by entering a date range.  Provide multiple codes as a comma-delimited list. (optional)
* pUnderscorepsncq String Quarters in Significant Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of significant noncompliance. - Z = Zero quarters in significant noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in significant noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in significant noncompliance. (optional)
* pUnderscorepctrack String Compliance Tracking Limiter. Provide a keyword to indicate the extent to which data is being entered and effluent exceedances are being identified. - Off - Partial - On (optional)
* pUnderscoreswpa String Source water protection area (optional)
* pUnderscoredes String Universe Designation Limiter.  Enter one or more universe designation codes.  Provide multiple values as a comma-delimited list.  Use code \"TSDF\" to return the full enforcement TSDF universe and \"Operating TSDF\" to return the operating TSDF universe. (optional)
* pUnderscorefntype String Controls type of text search performed on facility name with parameter p_fn. - EXACT = Find facilities having the exact provided name(s). - BEGINS = Find facilities with names starting with the provided term(s). - ALL = Find facilities using Oracle text search terms. - CONTAINS =  (optional)
* pUnderscorehpvmth String Months in high priority violation status out of the previous three years limiter.  Provide a number of months in the past three years.  Results will limited to facilities in high priority violation status during that time.  (optional)
* pUnderscorerecvio String Recent Violation Status Filter.  Enter one or more recent violation codes to limit results.  Provide multiple values as a comma-delimited list. - NO VIOL = Selects facilities with no recent violations. - ANY HPV = Selects facilities with either addressed or unaddressed high priority violations. - ADDRS-EPA - Select facilities with recent EPA addressed violations. - ADDRS-LOCAL - Select facilities with recent locally addressed violations. - ADDRS-STATE - Select facilities with recent state addressed violations. - UNADDR-EPA - Select facilities with recent EPA unaddressed violations. - UNADDR-LOCAL - Select facilities with recent locally unaddressed violations. - UNADDR-STATE - Select facilities with recent state unaddressed violations. - FRV VIOL = Selects facilities with a recent federally reportable violation without a high priority violation. (optional)
* pUnderscorepollvio String Air Pollutant Code For A Recent Violation Filter.  Provide one or more pollutant codes to select facilities with one or more of the entered pollutant codes for a recent air violation.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorear String Associated EPA Air Reports Program Filter.  Enter multiple values as a comma-delimited list.  Valid values are: - TRI = Toxic Release Inventory. - GHG = Green House Gas Reporter. - EIS = Emission Inventory System. - CAMD = Clean Air Markets Program Reporter. (optional)
* pUnderscoretriUnderscoreyr String Toxic Release Inventory Reporting Year Filter.  Enter one or more year values to filter results by the TRI reporting year.  Provide multiple years as a comma-delimited list. (optional)
* pUnderscorepidall String Controls whether search is restricted to existing system. Y means the search will match the p_pid parameter against all associated permits (AIR, RCRA, SDWIS, etc). (optional)
* pUnderscorefacUnderscoreico String FRS tribal land code flag.  Enter \"Y\" or \"N\" to include or exclude facilities based on FRS tribal land code. (optional)
* pUnderscoreicoo String Indian country search and/or flag.  Enter \"Y\" to set indian country search conditions to return any results found using p_ico, p_fac_ico or p_fac_icoo.  Otherwise only results matching all provided p_ico, p_fac_ico or p_fac_icoo conditions will be returned. (optional)
* pUnderscorefacUnderscoreicos String FRS tribal land spatial flag.  Enter \"Y\" or \"N\" to include or exclude facilities based on FRS tribal land spatial flag. (optional)
* pUnderscoreejscreen String Enter \"Y\" to limit facilities to Census block groups where one of more Environmental Justice indexes above 80th percentile. (optional)
* pUnderscorelimitUnderscoreaddr String Limit Address Search Flag.  Enter Y to restrict facility searches to native data source only.   (optional)
* pUnderscorelat BigDecimal Latitude location in decimal degrees. (optional)
* pUnderscorelong BigDecimal Longitude location in decimal degrees. (optional)
* pUnderscoreradius BigDecimal Spatial Search Radius.  Enter a radius up to 100 miles in which to spatially search for facilities. (optional)
* pUnderscoredecouple String Decouple Inspection Code Search Flag.  Enter \"Y\" to search for inspection code types with p_pityp without respect to the date range search provided with p_ysl* parameters. (optional)
* pUnderscoreejscreenUnderscoreover80cnt String The number of Environmenmt Justice Indicators above the 80th percentile.  Valid values are 1 through 11. (optional)
* queryset BigDecimal Query Limiter.  Enter a value to limit the number of records returned for each query. Value cannot exceed 70,000. (optional)
* responseset BigDecimal Response Set Limiter. Enter a value to limit the number of records per page. Value cannot exceed 1,000. (optional)
* tablelist String Table List Flag. Enter a Y to display the first page of facility results. (optional)
* maplist String Map List Flag.  Provide a Y to return mappable coordinates representing the full geographic extent of the queryset (all facilities that met the selection criteria). (optional)
* summarylist String Summary List Flag.  Enter a Y to return a list of summary statistics based on the parameters submitted to the query service. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* returns _air_rest_services_get_facilities_get_200_response
* */
const air_rest_services_get_facilitiesGET = ({ output, pUnderscorefn, pUnderscoresa, pUnderscoresa1, pUnderscorect, pUnderscoreco, pUnderscorefips, pUnderscorest, pUnderscorezip, pUnderscorelcon, pUnderscorefrs, pUnderscorereg, pUnderscoresic, pUnderscorencs, pUnderscoreqnc, pUnderscorepen, pUnderscoreopst, pUnderscorec1lat, pUnderscorec1lon, pUnderscorec2lat, pUnderscorec2lon, pUnderscoreusmex, pUnderscoresic2, pUnderscoresic4, pUnderscorefa, pUnderscoreact, pUnderscoremaj, pUnderscoremact, pUnderscorensps, pUnderscorenspsm, pUnderscoreprog, pUnderscorefea, pUnderscorefeay, pUnderscorefeaa, pUnderscoreiea, pUnderscoreieay, pUnderscoreieaa, pUnderscoreqiv, pUnderscorenaa, pUnderscoreimpw, pUnderscoretrep, pUnderscoretriUnderscorecat, pUnderscoretriUnderscoreamt, pUnderscoretriUnderscoreanyUnderscoreamt, pUnderscoretriUnderscorepol, pUnderscoreghgUnderscorecat, pUnderscoreghgUnderscoreamt, pUnderscoreghgUnderscoreanyUnderscoreamt, pUnderscoreghgUnderscoreyr, pUnderscoreneiUnderscorepol, pUnderscoreneiUnderscoreamt, pUnderscoreneiUnderscoreanyUnderscoreamt, pUnderscoreneiUnderscoreyr, pUnderscoreneiUnderscorecat, pUnderscorepm, pUnderscorepd, pUnderscoreico, pUnderscorehuc, pUnderscorewbd, pUnderscorepid, pUnderscoremed, pUnderscoreysl, pUnderscoreysly, pUnderscoreysla, pUnderscorestsl, pUnderscorestsly, pUnderscorestsla, pUnderscorestres, pUnderscoresttyp, pUnderscoreqs, pUnderscoresfs, pUnderscoretribeid, pUnderscoretribename, pUnderscoretribedist, pUnderscoreowop, pUnderscoreagoo, pUnderscoreidt1, pUnderscoreidt2, pUnderscorestdt1, pUnderscorestdt2, pUnderscorepityp, pUnderscorecifdi, pUnderscorepfead1, pUnderscorepfead2, pUnderscorepfeat, pUnderscorepsncq, pUnderscorepctrack, pUnderscoreswpa, pUnderscoredes, pUnderscorefntype, pUnderscorehpvmth, pUnderscorerecvio, pUnderscorepollvio, pUnderscorear, pUnderscoretriUnderscoreyr, pUnderscorepidall, pUnderscorefacUnderscoreico, pUnderscoreicoo, pUnderscorefacUnderscoreicos, pUnderscoreejscreen, pUnderscorelimitUnderscoreaddr, pUnderscorelat, pUnderscorelong, pUnderscoreradius, pUnderscoredecouple, pUnderscoreejscreenUnderscoreover80cnt, queryset, responseset, tablelist, maplist, summarylist, callback, qcolumns }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        output,
        pUnderscorefn,
        pUnderscoresa,
        pUnderscoresa1,
        pUnderscorect,
        pUnderscoreco,
        pUnderscorefips,
        pUnderscorest,
        pUnderscorezip,
        pUnderscorelcon,
        pUnderscorefrs,
        pUnderscorereg,
        pUnderscoresic,
        pUnderscorencs,
        pUnderscoreqnc,
        pUnderscorepen,
        pUnderscoreopst,
        pUnderscorec1lat,
        pUnderscorec1lon,
        pUnderscorec2lat,
        pUnderscorec2lon,
        pUnderscoreusmex,
        pUnderscoresic2,
        pUnderscoresic4,
        pUnderscorefa,
        pUnderscoreact,
        pUnderscoremaj,
        pUnderscoremact,
        pUnderscorensps,
        pUnderscorenspsm,
        pUnderscoreprog,
        pUnderscorefea,
        pUnderscorefeay,
        pUnderscorefeaa,
        pUnderscoreiea,
        pUnderscoreieay,
        pUnderscoreieaa,
        pUnderscoreqiv,
        pUnderscorenaa,
        pUnderscoreimpw,
        pUnderscoretrep,
        pUnderscoretriUnderscorecat,
        pUnderscoretriUnderscoreamt,
        pUnderscoretriUnderscoreanyUnderscoreamt,
        pUnderscoretriUnderscorepol,
        pUnderscoreghgUnderscorecat,
        pUnderscoreghgUnderscoreamt,
        pUnderscoreghgUnderscoreanyUnderscoreamt,
        pUnderscoreghgUnderscoreyr,
        pUnderscoreneiUnderscorepol,
        pUnderscoreneiUnderscoreamt,
        pUnderscoreneiUnderscoreanyUnderscoreamt,
        pUnderscoreneiUnderscoreyr,
        pUnderscoreneiUnderscorecat,
        pUnderscorepm,
        pUnderscorepd,
        pUnderscoreico,
        pUnderscorehuc,
        pUnderscorewbd,
        pUnderscorepid,
        pUnderscoremed,
        pUnderscoreysl,
        pUnderscoreysly,
        pUnderscoreysla,
        pUnderscorestsl,
        pUnderscorestsly,
        pUnderscorestsla,
        pUnderscorestres,
        pUnderscoresttyp,
        pUnderscoreqs,
        pUnderscoresfs,
        pUnderscoretribeid,
        pUnderscoretribename,
        pUnderscoretribedist,
        pUnderscoreowop,
        pUnderscoreagoo,
        pUnderscoreidt1,
        pUnderscoreidt2,
        pUnderscorestdt1,
        pUnderscorestdt2,
        pUnderscorepityp,
        pUnderscorecifdi,
        pUnderscorepfead1,
        pUnderscorepfead2,
        pUnderscorepfeat,
        pUnderscorepsncq,
        pUnderscorepctrack,
        pUnderscoreswpa,
        pUnderscoredes,
        pUnderscorefntype,
        pUnderscorehpvmth,
        pUnderscorerecvio,
        pUnderscorepollvio,
        pUnderscorear,
        pUnderscoretriUnderscoreyr,
        pUnderscorepidall,
        pUnderscorefacUnderscoreico,
        pUnderscoreicoo,
        pUnderscorefacUnderscoreicos,
        pUnderscoreejscreen,
        pUnderscorelimitUnderscoreaddr,
        pUnderscorelat,
        pUnderscorelong,
        pUnderscoreradius,
        pUnderscoredecouple,
        pUnderscoreejscreenUnderscoreover80cnt,
        queryset,
        responseset,
        tablelist,
        maplist,
        summarylist,
        callback,
        qcolumns,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Facility Search
* Validates query search parameters and returns query identifier.  Use the responseset parameter to set the page size
*
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* pUnderscorefn String Facility Name Filter. Enter one or more case-insensitive facility names to filter results.  Provide multiple values as a comma-delimited list.  See p_fntype for additional modifiers. (optional)
* pUnderscoresa String Facility street address. Enter a complete or partial street address. (optional)
* pUnderscoresa1 String Facility street address. Enter a complete or partial street address.   Note that p_sa1 is culmulative with p_sa. (optional)
* pUnderscorect String Facility City Filter. Enter a single case-insensitive city name to filter results. (optional)
* pUnderscoreco String Facility County Filter. Provide a single county name in combination with a state value provided via p_st. (optional)
* pUnderscorefips String FIPS Code Filter.  Enter a single 5-character Federal Information Processing Standards (FIPS) state + county value to restrict results.  E.g. to limit results to Kenosha County, Wisconsin, use 55059. (optional)
* pUnderscorest String Facility State and State-Equivalent Filter.  Provide one or more USPS postal abbreviations for states and state-equivalents to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorezip String 5-Digit ZIP Code Filter. Provide one or more 5-digit postal zip codes to filter results.  May contain multiple comma-separated values. (optional)
* pUnderscorelcon String Air Program Local Control Region Code Filter.  Enter one or more local control region codes to filter results.  Provide multiple codes as a comma-delimited list.  Codes where they exist are specific by state. (optional)
* pUnderscorefrs String Facility Registry Service ID Filter. Enter a single 12-digit FRS identifier to filter results. (optional)
* pUnderscorereg String EPA Region Filter. Provide a single value of 01 thru 10 to restrict results to a single EPA region. (optional)
* pUnderscoresic String Standard Industrial Classification (SIC) Code Filter.  Enter a single 4-digit SIC Code to filter results.  If more complex filtering is required, use p_sic2 and p_sic4. (optional)
* pUnderscorencs String North American Industry Classification System Filter. Enter two to six digits to filter results to facilities having matching NAICS codes.  Digits less than six will match to all codes beginning with the provided values. (optional)
* pUnderscoreqnc BigDecimal Number of quarters in non-compliance limiter.  Enter an integer value between 1 and 4 to limit results. (optional)
* pUnderscorepen String Last Penality Date Qualifier Filter.  Enter one of the following:    - NEVER = No Penalties - ANY = Any Penalty - LEXX = Less than or equal to XX months.  Provide a number in place of XX, e.g. \\\"LE5\\\" for a facility with a penalty within previous 5 months. - GTXX = Greater than XX months.  Provide a number in place of XX, eg. GT12, for a facility with the last penalty greater than 12 months ago. (optional)
* pUnderscoreopst String Operating status filter.  Enter one or more operating status codes to limit results.   Provide multiple codes as a comma-delimited list. (optional)
* pUnderscorec1lat BigDecimal In decimal degrees.  Latitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscorec1lon BigDecimal In decimal degrees.  Longitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscorec2lat BigDecimal In decimal degrees.  Latitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscorec2lon BigDecimal In decimal degrees.  Longitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* pUnderscoreusmex String US-Mexico Border Flag.  Enter Y/N to restrict searches to facilities located within 100KM of the border. (optional)
* pUnderscoresic2 String Standard Industrial Classification (SIC) Code Filter Alternate 2. Enter a wild-card search against SIC codes.  A final wild-card is always present allowing \\\"22\\\" to match all SIC codes beginning with 22.  Use the \\\"%\\\" character within strings to match any SIC values with the pattern.  For example, \\\"2%21\\\" matches 2021, 2121, 2221, etc. (optional)
* pUnderscoresic4 String Standard Industrial Classification (SIC) Code Filter Alternate 3.  Enter the first 2, 3 or 4 SIC code digits to filter results to facilities having those code prefixes.  As this alternative does not utilize an index, p_sic2 will generally be quicker. (optional)
* pUnderscorefa String Federal Agency. 1 character or 5-character values; may contain multiple comma-separated values. ALL will retrieve all facilities where the federal agency code is not null.  Use the Federal Agencies lookup service to obtain a list of values. (optional)
* pUnderscoreact String Active Permits/Facilities Flag.  Provide Y or N to filter results to facilities with active permits. (optional)
* pUnderscoremaj String Major Facility Flag.  Enter Y to restrict results to Major facilities only. (optional)
* pUnderscoremact String CAA Maximum Achievable Control Technology (MACT) Subpart codes (alpha ID between 1 and 7 characters) applicable to the facility. (optional)
* pUnderscorensps String Air Programl New Source Performance Standards (NSPS)  Subpart Code Search.  One or more valid Air Program NSPS Program codes cand be passed.   (optional)
* pUnderscorenspsm String Air Programl New Source Performance Standards Minors (NSPSM) Subpart Code Search.  One or more valid Air Program NSPSM Subpart codes can be passed.   (optional)
* pUnderscoreprog String Air Program Code Filter.  Enter one or more Air program codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorefea String Formal Enforcement Actions [within / not within] specified date range indicator. The date range is determined by parameters p_fead1 and p_fead2 or by parameter p_feay. - W = within date range - N = not within date range (optional)
* pUnderscorefeay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Formal Enforcement Actions (FEA). Used along with p_fea (which indicates whether to look within or outside of the date range) to find FEAs within (or not within) the number of years specified. (optional)
* pUnderscorefeaa String Agency associated with Formal Enforcement Actions: - E = EPA - S = State - A = All (optional)
* pUnderscoreiea String Informal Enforcement Actions [within / not within] specified date range.  The date range is determined by parameters p_iead1 and p_iead2 or by parameter p_ieay. - W = within date range - N = not within date range (optional)
* pUnderscoreieay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Informal Enforcement Actions (IEA). Used along with p_iea (which indicates whether to look within or outside of the date range) to find IEAs within (or not within) the number of years specified. (optional)
* pUnderscoreieaa String Agency associated with Informal Enforcement Actions. If left blank, both agencies are included. - E = EPA - S = State (optional)
* pUnderscoreqiv String Quarters in Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of noncompliance. - Z = Zero quarters in noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in noncompliance. (optional)
* pUnderscorenaa String Non-Attainment Area Flag.  Enter a Y or N to filter for or against facilities flagged as non-attainment areas. (optional)
* pUnderscoreimpw String Discharging into Impaired Waters Flag. Enter Y to limit results to facilities with discharge to waterbodies listed as impaired in the ATTAINS database. (optional)
* pUnderscoretrep String Current Toxics Release Inventory (TRI) Reporter Limiter.  Enter one of the following codes to limit results. - CURR = Current TRI reporter. - NONCURR = Has reported to TRI in the past but not for the current reporting year. (optional)
* pUnderscoretriUnderscorecat String Toxic Release Inventory Released To Air Chemical Identifier Category Filter.  Enter the chemical identifier category code to limit results. Note when filtering by TRI chemical identifier categories one may not also filter by specific chemical identifiers via p_tri_pol.  You must also specify a release amount using p_tri_amt or p_tri_any_amt. - TOTAL = Total Released to Air - CARC = Total Carcinogens Released to Air - HAP = Total Hazardous Air Pollutants Released to Air (optional)
* pUnderscoretriUnderscoreamt String Toxic Release Inventory Release Amount Filter.  Enter a value in pounds to limit results to facilities releasing this amount or greateer of TRI releases.  Valid values are 0, GT0, GT1000, GT5000, GT10000 and GT50000. Note when filtering by TRI release amounts one may only use either p_tri_amt or p_tri_any_amt. (optional)
* pUnderscoretriUnderscoreanyUnderscoreamt BigDecimal Toxic Release Inventory Release Of Any Kind Above Value Filter.  Enter a value to limit results to facilities releasing this amount or more of TRI releases.  Note when filtering by TRI releases one may only use p_tri_any_amt or p_tri_amt and not both. (optional)
* pUnderscoretriUnderscorepol String Toxic Release Inventory Chemical Identifier Filter.  Enter one or more chemical identifier codes to limit results. Note when filtering by specific TRI chemical identifiers one may not also filter by chemical identifier categories via p_tri_cat. (optional)
* pUnderscoreghgUnderscorecat String Green House Gas (GHG) Gas Code Category.  Must be used with either a formatted (p_ghg_amt) or custom (p_ghg_any_amt) release amount. (optional)
* pUnderscoreghgUnderscoreamt String Green House Gas (GHG) CO2 Equivalent Formatted Release Amount.  First 2 characters must contain GT (greater than) followed by a number. (optional)
* pUnderscoreghgUnderscoreanyUnderscoreamt BigDecimal Green House Gas (GHG) C02 Equivalent Custom Amount.  The C02E value reported for the provided category, will be greater or equal to the amount provided. (optional)
* pUnderscoreghgUnderscoreyr String Green House Gas (GHG) Reporting Year. (2010 through 2015) (optional)
* pUnderscoreneiUnderscorepol String National Emissions Inventory (NEI) Pollutant Identifier.  When a pollutant identifer is entered a corresponding formatted amount or custom amount must be entered. (optional)
* pUnderscoreneiUnderscoreamt String National Emissions Inventory (NEI) Formatted Pollutant Amount.  A formatted value where the 1st two characters must start with GT or LT followed by a number.  Identifies facilities that have a NEI Pollutant Emission  where the supplied value is > or < the pollutant emission amount.   (optional)
* pUnderscoreneiUnderscoreanyUnderscoreamt BigDecimal National Emissions Inventory (NEI) Custom Pollutant Amount.  Only a number can be entered.  Identifies facilities with where the NEI Pollutant Emission Amount is greater than the number entered. (optional)
* pUnderscoreneiUnderscoreyr String National Emissions Inventory (NEI) year:  2014 or 2011 (optional)
* pUnderscoreneiUnderscorecat String National Emissions Inventory (NEI) Pollutant Category.  When a pollutant category is entered, a corresponding formatted pollutant amount or custom amount must be entered. (optional)
* pUnderscorepm String Percent Minority Population Limiter.  Enter a value to restrict results to facilities with a given percentage of minority population within 3-mile radius. - NONE = 0% - GT5 = greater than 5% - GT10 = greater than 10% - GT25 = greater than 25% - GT50 = greater than 50% - GT75 = greater than 75% (optional)
* pUnderscorepd String Population Density Limiter (per sq mile). Enter a value to limit results to facilities located in area of a given population density. - NONE = 0 population density per square mile - GT100 = More than 100 population density per square mile - GT500 = More than 500 population density per square mile - GT1000 = More than 1000 population density per square mile - GT5000 = More than 5000 population density per square mile - GT10000 = More than 10000 population density per square mile - GT20000 = More than 20000 population density per square mile (optional)
* pUnderscoreico String Indian Country Flag.  Enter a \\\"Y\\\" or \\\"N\\\" to restrict searches to facilities inside or outside Indian Country. (optional)
* pUnderscorehuc String 2-, 4-, 6-, or 8-character watershed code. May contain multiple comma-separated values. (optional)
* pUnderscorewbd String 2-, 4-, 6-, 8-, 10-, or 12-character watershed (WBD from the USGS Watershed Boundary Dataset). May contain multiple comma-separated values.  Uses the FRS Best Pick Coordinate to obtain the WBD12 Huc value. (optional)
* pUnderscorepid String Nine-digit permit IDs. May contain up to 2000 comma-separated values. (optional)
* pUnderscoremed String Filter Results by Media. - M = RMP (Risk Management Plan) - R = RCRA (Hazardous Waste) - S = SDWA (Public Drinking Water Systems) - W = Water - ALL = Water and RCRA and SDWA (optional)
* pUnderscoreysl String Last Facility Inspection [within / not within] Specified Date Range Indicator. The date range is determined by parameters p_idt1 and p_idt2 or by parameter p_ysly. - W = within date range - N = not within date range (optional)
* pUnderscoreysly BigDecimal Number of years (1 to 5) since last facility inspection.  A value of 1 means that it has been inspected within the year. (optional)
* pUnderscoreysla String Facility Last Inspection Code Filter.  If left blank, both agencies are included.  Enter a value to limit results: - E = EPA - S = State (optional)
* pUnderscorestsl String Last Stack Test [within / not within] Specified Date Range Indicator. - W = within date range - N = not within date range (optional)
* pUnderscorestsly BigDecimal Number of years (1 to 5) since date of last stack test. A value of 1 means it has been inspected within the year. (optional)
* pUnderscorestsla String Stack Last Test Code Filter.  Enter a value to limit results: - A = All - E = EPA - S = State (optional)
* pUnderscorestres String Air Stack Test Status Description Filter.  Enter one or more test status descriptions to filter results.  Enter multiple values as a comma-delimited list. (optional)
* pUnderscoresttyp String Air Conductor Type Code Filter.  Enter one or more conductor type codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscoreqs String Quick Search. Allows entry for city, state, and/or zip code. (optional)
* pUnderscoresfs String Single Facility Search Filter.  Provide a facility name or program system identifier to limit results.  For the all data search, the FRS registry identifier is also searched. (optional)
* pUnderscoretribeid BigDecimal Numeric code for tribe (or list of tribes). (optional)
* pUnderscoretribename String Tribe Name Filter.  Enter a single tribe name to filter results. (optional)
* pUnderscoretribedist BigDecimal Proximity to tribal land limiter. Enter an amount of mile between 0 and 25 to filter results.  This parameter is only evaluated if p_tribeid is populated. (optional)
* pUnderscoreowop String Owner/Operator code filter.  Enter one or more codes to limit results. - CNG - COR - CTG - DIS - FDF - MWD - MXO - NON - POF - SDT - STF - TRB (optional)
* pUnderscoreagoo String Indicates whether to AND or OR the Owner/Operator parameter (p_owop) and the federal agency code (p_fa) parameters. (optional)
* pUnderscoreidt1 String Beginning of date range of most recent facility inspection. (optional)
* pUnderscoreidt2 String End of date range of most recent facility inspection. (optional)
* pUnderscorestdt1 String Beginning of date range of most recent stack test. (optional)
* pUnderscorestdt2 String End of date range of most recent stack test. (optional)
* pUnderscorepityp String Inspection Type: - CAC = Corrective Action Inspection - CAV = Compliance Assistance Visit - CDI = Case Development Inspection - CEI = Inspection Inspection - CSE = Compliance Schedule Evaluation - FCI = Focused Compliance - FRR = Financial Record Review - FSD = Facility Self Disclosure - FUI = Follow-Up Inspection - GME = Groundwater Monitoring Evaluation - NRR = Non-Financial Record Review - OAM = Operation and Maintenance Inspection May contain multiple comma-separated values. (optional)
* pUnderscorecifdi String Compliance issuess found during inspection. (optional)
* pUnderscorepfead1 String Formal Enforcement Action Date Range Start.  Enter a date in MM/DD/YYYY format to set the start of the range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfead2 String Formal Enforcement Action Date Range End.  Enter a date in MM/DD/YYYY format to set the end of the date range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfeat String Formal Enforcement Action (FEA) Code Filter.  Enter one or more three-letter FEA codes to restrict results to facilities with these attributes.  Use p_fead1 and p_fead2 parameters to further restrict this filter by entering a date range.  Provide multiple codes as a comma-delimited list. (optional)
* pUnderscorepsncq String Quarters in Significant Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of significant noncompliance. - Z = Zero quarters in significant noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in significant noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in significant noncompliance. (optional)
* pUnderscorepctrack String Compliance Tracking Limiter. Provide a keyword to indicate the extent to which data is being entered and effluent exceedances are being identified. - Off - Partial - On (optional)
* pUnderscoreswpa String Source water protection area (optional)
* pUnderscoredes String Universe Designation Limiter.  Enter one or more universe designation codes.  Provide multiple values as a comma-delimited list.  Use code \\\"TSDF\\\" to return the full enforcement TSDF universe and \\\"Operating TSDF\\\" to return the operating TSDF universe. (optional)
* pUnderscorefntype String Controls type of text search performed on facility name with parameter p_fn. - EXACT = Find facilities having the exact provided name(s). - BEGINS = Find facilities with names starting with the provided term(s). - ALL = Find facilities using Oracle text search terms. - CONTAINS =  (optional)
* pUnderscorehpvmth String Months in high priority violation status out of the previous three years limiter.  Provide a number of months in the past three years.  Results will limited to facilities in high priority violation status during that time.  (optional)
* pUnderscorerecvio String Recent Violation Status Filter.  Enter one or more recent violation codes to limit results.  Provide multiple values as a comma-delimited list. - NO VIOL = Selects facilities with no recent violations. - ANY HPV = Selects facilities with either addressed or unaddressed high priority violations. - ADDRS-EPA - Select facilities with recent EPA addressed violations. - ADDRS-LOCAL - Select facilities with recent locally addressed violations. - ADDRS-STATE - Select facilities with recent state addressed violations. - UNADDR-EPA - Select facilities with recent EPA unaddressed violations. - UNADDR-LOCAL - Select facilities with recent locally unaddressed violations. - UNADDR-STATE - Select facilities with recent state unaddressed violations. - FRV VIOL = Selects facilities with a recent federally reportable violation without a high priority violation. (optional)
* pUnderscorepollvio String Air Pollutant Code For A Recent Violation Filter.  Provide one or more pollutant codes to select facilities with one or more of the entered pollutant codes for a recent air violation.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorear String Associated EPA Air Reports Program Filter.  Enter multiple values as a comma-delimited list.  Valid values are: - TRI = Toxic Release Inventory. - GHG = Green House Gas Reporter. - EIS = Emission Inventory System. - CAMD = Clean Air Markets Program Reporter. (optional)
* pUnderscoretriUnderscoreyr String Toxic Release Inventory Reporting Year Filter.  Enter one or more year values to filter results by the TRI reporting year.  Provide multiple years as a comma-delimited list. (optional)
* pUnderscorepidall String Controls whether search is restricted to existing system. Y means the search will match the p_pid parameter against all associated permits (AIR, RCRA, SDWIS, etc). (optional)
* pUnderscorefacUnderscoreico String FRS tribal land code flag.  Enter \\\"Y\\\" or \\\"N\\\" to include or exclude facilities based on FRS tribal land code. (optional)
* pUnderscoreicoo String Indian country search and/or flag.  Enter \\\"Y\\\" to set indian country search conditions to return any results found using p_ico, p_fac_ico or p_fac_icoo.  Otherwise only results matching all provided p_ico, p_fac_ico or p_fac_icoo conditions will be returned. (optional)
* pUnderscorefacUnderscoreicos String FRS tribal land spatial flag.  Enter \\\"Y\\\" or \\\"N\\\" to include or exclude facilities based on FRS tribal land spatial flag. (optional)
* pUnderscoreejscreen String Enter \\\"Y\\\" to limit facilities to Census block groups where one of more Environmental Justice indexes above 80th percentile. (optional)
* pUnderscorelimitUnderscoreaddr String Limit Address Search Flag.  Enter Y to restrict facility searches to native data source only.   (optional)
* pUnderscorelat BigDecimal Latitude location in decimal degrees. (optional)
* pUnderscorelong BigDecimal Longitude location in decimal degrees. (optional)
* pUnderscoreradius BigDecimal Spatial Search Radius.  Enter a radius up to 100 miles in which to spatially search for facilities. (optional)
* pUnderscoredecouple String Decouple Inspection Code Search Flag.  Enter \\\"Y\\\" to search for inspection code types with p_pityp without respect to the date range search provided with p_ysl* parameters. (optional)
* pUnderscoreejscreenUnderscoreover80cnt String The number of Environmenmt Justice Indicators above the 80th percentile.  Valid values are 1 through 11. (optional)
* queryset BigDecimal Query Limiter.  Enter a value to limit the number of records returned for each query. Value cannot exceed 70,000. (optional)
* responseset BigDecimal Response Set Limiter. Enter a value to limit the number of records per page. Value cannot exceed 1,000. (optional)
* tablelist String Table List Flag. Enter a Y to display the first page of facility results. (optional)
* maplist String Map List Flag.  Provide a Y to return mappable coordinates representing the full geographic extent of the queryset (all facilities that met the selection criteria). (optional)
* summarylist String Summary List Flag.  Enter a Y to return a list of summary statistics based on the parameters submitted to the query service. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* returns _air_rest_services_get_facilities_get_200_response
* */
const air_rest_services_get_facilitiesPOST = ({ output, pUnderscorefn, pUnderscoresa, pUnderscoresa1, pUnderscorect, pUnderscoreco, pUnderscorefips, pUnderscorest, pUnderscorezip, pUnderscorelcon, pUnderscorefrs, pUnderscorereg, pUnderscoresic, pUnderscorencs, pUnderscoreqnc, pUnderscorepen, pUnderscoreopst, pUnderscorec1lat, pUnderscorec1lon, pUnderscorec2lat, pUnderscorec2lon, pUnderscoreusmex, pUnderscoresic2, pUnderscoresic4, pUnderscorefa, pUnderscoreact, pUnderscoremaj, pUnderscoremact, pUnderscorensps, pUnderscorenspsm, pUnderscoreprog, pUnderscorefea, pUnderscorefeay, pUnderscorefeaa, pUnderscoreiea, pUnderscoreieay, pUnderscoreieaa, pUnderscoreqiv, pUnderscorenaa, pUnderscoreimpw, pUnderscoretrep, pUnderscoretriUnderscorecat, pUnderscoretriUnderscoreamt, pUnderscoretriUnderscoreanyUnderscoreamt, pUnderscoretriUnderscorepol, pUnderscoreghgUnderscorecat, pUnderscoreghgUnderscoreamt, pUnderscoreghgUnderscoreanyUnderscoreamt, pUnderscoreghgUnderscoreyr, pUnderscoreneiUnderscorepol, pUnderscoreneiUnderscoreamt, pUnderscoreneiUnderscoreanyUnderscoreamt, pUnderscoreneiUnderscoreyr, pUnderscoreneiUnderscorecat, pUnderscorepm, pUnderscorepd, pUnderscoreico, pUnderscorehuc, pUnderscorewbd, pUnderscorepid, pUnderscoremed, pUnderscoreysl, pUnderscoreysly, pUnderscoreysla, pUnderscorestsl, pUnderscorestsly, pUnderscorestsla, pUnderscorestres, pUnderscoresttyp, pUnderscoreqs, pUnderscoresfs, pUnderscoretribeid, pUnderscoretribename, pUnderscoretribedist, pUnderscoreowop, pUnderscoreagoo, pUnderscoreidt1, pUnderscoreidt2, pUnderscorestdt1, pUnderscorestdt2, pUnderscorepityp, pUnderscorecifdi, pUnderscorepfead1, pUnderscorepfead2, pUnderscorepfeat, pUnderscorepsncq, pUnderscorepctrack, pUnderscoreswpa, pUnderscoredes, pUnderscorefntype, pUnderscorehpvmth, pUnderscorerecvio, pUnderscorepollvio, pUnderscorear, pUnderscoretriUnderscoreyr, pUnderscorepidall, pUnderscorefacUnderscoreico, pUnderscoreicoo, pUnderscorefacUnderscoreicos, pUnderscoreejscreen, pUnderscorelimitUnderscoreaddr, pUnderscorelat, pUnderscorelong, pUnderscoreradius, pUnderscoredecouple, pUnderscoreejscreenUnderscoreover80cnt, queryset, responseset, tablelist, maplist, summarylist, callback, qcolumns }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        output,
        pUnderscorefn,
        pUnderscoresa,
        pUnderscoresa1,
        pUnderscorect,
        pUnderscoreco,
        pUnderscorefips,
        pUnderscorest,
        pUnderscorezip,
        pUnderscorelcon,
        pUnderscorefrs,
        pUnderscorereg,
        pUnderscoresic,
        pUnderscorencs,
        pUnderscoreqnc,
        pUnderscorepen,
        pUnderscoreopst,
        pUnderscorec1lat,
        pUnderscorec1lon,
        pUnderscorec2lat,
        pUnderscorec2lon,
        pUnderscoreusmex,
        pUnderscoresic2,
        pUnderscoresic4,
        pUnderscorefa,
        pUnderscoreact,
        pUnderscoremaj,
        pUnderscoremact,
        pUnderscorensps,
        pUnderscorenspsm,
        pUnderscoreprog,
        pUnderscorefea,
        pUnderscorefeay,
        pUnderscorefeaa,
        pUnderscoreiea,
        pUnderscoreieay,
        pUnderscoreieaa,
        pUnderscoreqiv,
        pUnderscorenaa,
        pUnderscoreimpw,
        pUnderscoretrep,
        pUnderscoretriUnderscorecat,
        pUnderscoretriUnderscoreamt,
        pUnderscoretriUnderscoreanyUnderscoreamt,
        pUnderscoretriUnderscorepol,
        pUnderscoreghgUnderscorecat,
        pUnderscoreghgUnderscoreamt,
        pUnderscoreghgUnderscoreanyUnderscoreamt,
        pUnderscoreghgUnderscoreyr,
        pUnderscoreneiUnderscorepol,
        pUnderscoreneiUnderscoreamt,
        pUnderscoreneiUnderscoreanyUnderscoreamt,
        pUnderscoreneiUnderscoreyr,
        pUnderscoreneiUnderscorecat,
        pUnderscorepm,
        pUnderscorepd,
        pUnderscoreico,
        pUnderscorehuc,
        pUnderscorewbd,
        pUnderscorepid,
        pUnderscoremed,
        pUnderscoreysl,
        pUnderscoreysly,
        pUnderscoreysla,
        pUnderscorestsl,
        pUnderscorestsly,
        pUnderscorestsla,
        pUnderscorestres,
        pUnderscoresttyp,
        pUnderscoreqs,
        pUnderscoresfs,
        pUnderscoretribeid,
        pUnderscoretribename,
        pUnderscoretribedist,
        pUnderscoreowop,
        pUnderscoreagoo,
        pUnderscoreidt1,
        pUnderscoreidt2,
        pUnderscorestdt1,
        pUnderscorestdt2,
        pUnderscorepityp,
        pUnderscorecifdi,
        pUnderscorepfead1,
        pUnderscorepfead2,
        pUnderscorepfeat,
        pUnderscorepsncq,
        pUnderscorepctrack,
        pUnderscoreswpa,
        pUnderscoredes,
        pUnderscorefntype,
        pUnderscorehpvmth,
        pUnderscorerecvio,
        pUnderscorepollvio,
        pUnderscorear,
        pUnderscoretriUnderscoreyr,
        pUnderscorepidall,
        pUnderscorefacUnderscoreico,
        pUnderscoreicoo,
        pUnderscorefacUnderscoreicos,
        pUnderscoreejscreen,
        pUnderscorelimitUnderscoreaddr,
        pUnderscorelat,
        pUnderscorelong,
        pUnderscoreradius,
        pUnderscoredecouple,
        pUnderscoreejscreenUnderscoreover80cnt,
        queryset,
        responseset,
        tablelist,
        maplist,
        summarylist,
        callback,
        qcolumns,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Facility Enhanced Search
* Returns either an array of Facilities or an array of Clusters that meet the specified search criteria.
*
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. - CSV = Facility results formatted as comma delimited file download. - GEOJSON = Facility results formatted as GeoJSON feature collection. - GEOJSONP = Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* pUnderscorefn String Facility Name Filter. Enter one or more case-insensitive facility names to filter results.  Provide multiple values as a comma-delimited list.  See p_fntype for additional modifiers. (optional)
* pUnderscoresa String Facility street address. Enter a complete or partial street address. (optional)
* pUnderscoresa1 String Facility street address. Enter a complete or partial street address.   Note that p_sa1 is culmulative with p_sa. (optional)
* pUnderscorect String Facility City Filter. Enter a single case-insensitive city name to filter results. (optional)
* pUnderscoreco String Facility County Filter. Provide a single county name in combination with a state value provided via p_st. (optional)
* pUnderscorefips String FIPS Code Filter.  Enter a single 5-character Federal Information Processing Standards (FIPS) state + county value to restrict results.  E.g. to limit results to Kenosha County, Wisconsin, use 55059. (optional)
* pUnderscorest String Facility State and State-Equivalent Filter.  Provide one or more USPS postal abbreviations for states and state-equivalents to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorezip String 5-Digit ZIP Code Filter. Provide one or more 5-digit postal zip codes to filter results.  May contain multiple comma-separated values. (optional)
* pUnderscorelcon String Air Program Local Control Region Code Filter.  Enter one or more local control region codes to filter results.  Provide multiple codes as a comma-delimited list.  Codes where they exist are specific by state. (optional)
* pUnderscorefrs String Facility Registry Service ID Filter. Enter a single 12-digit FRS identifier to filter results. (optional)
* pUnderscorereg String EPA Region Filter. Provide a single value of 01 thru 10 to restrict results to a single EPA region. (optional)
* pUnderscoresic String Standard Industrial Classification (SIC) Code Filter.  Enter a single 4-digit SIC Code to filter results.  If more complex filtering is required, use p_sic2 and p_sic4. (optional)
* pUnderscorencs String North American Industry Classification System Filter. Enter two to six digits to filter results to facilities having matching NAICS codes.  Digits less than six will match to all codes beginning with the provided values. (optional)
* pUnderscoreqnc BigDecimal Number of quarters in non-compliance limiter.  Enter an integer value between 1 and 4 to limit results. (optional)
* pUnderscorepen String Last Penality Date Qualifier Filter.  Enter one of the following:    - NEVER = No Penalties - ANY = Any Penalty - LEXX = Less than or equal to XX months.  Provide a number in place of XX, e.g. \"LE5\" for a facility with a penalty within previous 5 months. - GTXX = Greater than XX months.  Provide a number in place of XX, eg. GT12, for a facility with the last penalty greater than 12 months ago. (optional)
* pUnderscoreopst String Operating status filter.  Enter one or more operating status codes to limit results.   Provide multiple codes as a comma-delimited list. (optional)
* xmin BigDecimal Minimum longitude value in decimal degrees. (optional)
* ymin BigDecimal Minimum latitude value in decimal degrees. (optional)
* xmax BigDecimal Maximum longitude value in decimal degrees. (optional)
* ymax BigDecimal Maximum latitude value in decimal degrees. (optional)
* pUnderscoreusmex String US-Mexico Border Flag.  Enter Y/N to restrict searches to facilities located within 100KM of the border. (optional)
* pUnderscoresic2 String Standard Industrial Classification (SIC) Code Filter Alternate 2. Enter a wild-card search against SIC codes.  A final wild-card is always present allowing \"22\" to match all SIC codes beginning with 22.  Use the \"%\" character within strings to match any SIC values with the pattern.  For example, \"2%21\" matches 2021, 2121, 2221, etc. (optional)
* pUnderscoresic4 String Standard Industrial Classification (SIC) Code Filter Alternate 3.  Enter the first 2, 3 or 4 SIC code digits to filter results to facilities having those code prefixes.  As this alternative does not utilize an index, p_sic2 will generally be quicker. (optional)
* pUnderscorefa String Federal Agency. 1 character or 5-character values; may contain multiple comma-separated values. ALL will retrieve all facilities where the federal agency code is not null.  Use the Federal Agencies lookup service to obtain a list of values. (optional)
* pUnderscoreact String Active Permits/Facilities Flag.  Provide Y or N to filter results to facilities with active permits. (optional)
* pUnderscoremaj String Major Facility Flag.  Enter Y to restrict results to Major facilities only. (optional)
* pUnderscoremact String CAA Maximum Achievable Control Technology (MACT) Subpart codes (alpha ID between 1 and 7 characters) applicable to the facility. (optional)
* pUnderscorensps String Air Programl New Source Performance Standards (NSPS)  Subpart Code Search.  One or more valid Air Program NSPS Program codes cand be passed.   (optional)
* pUnderscorenspsm String Air Programl New Source Performance Standards Minors (NSPSM) Subpart Code Search.  One or more valid Air Program NSPSM Subpart codes can be passed.   (optional)
* pUnderscoreprog String Air Program Code Filter.  Enter one or more Air program codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorefea String Formal Enforcement Actions [within / not within] specified date range indicator. The date range is determined by parameters p_fead1 and p_fead2 or by parameter p_feay. - W = within date range - N = not within date range (optional)
* pUnderscorefeay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Formal Enforcement Actions (FEA). Used along with p_fea (which indicates whether to look within or outside of the date range) to find FEAs within (or not within) the number of years specified. (optional)
* pUnderscorefeaa String Agency associated with Formal Enforcement Actions: - E = EPA - S = State - A = All (optional)
* pUnderscoreiea String Informal Enforcement Actions [within / not within] specified date range.  The date range is determined by parameters p_iead1 and p_iead2 or by parameter p_ieay. - W = within date range - N = not within date range (optional)
* pUnderscoreieay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Informal Enforcement Actions (IEA). Used along with p_iea (which indicates whether to look within or outside of the date range) to find IEAs within (or not within) the number of years specified. (optional)
* pUnderscoreieaa String Agency associated with Informal Enforcement Actions. If left blank, both agencies are included. - E = EPA - S = State (optional)
* pUnderscoreqiv String Quarters in Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of noncompliance. - Z = Zero quarters in noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in noncompliance. (optional)
* pUnderscorenaa String Non-Attainment Area Flag.  Enter a Y or N to filter for or against facilities flagged as non-attainment areas. (optional)
* pUnderscoreimpw String Discharging into Impaired Waters Flag. Enter Y to limit results to facilities with discharge to waterbodies listed as impaired in the ATTAINS database. (optional)
* pUnderscoretrep String Current Toxics Release Inventory (TRI) Reporter Limiter.  Enter one of the following codes to limit results. - CURR = Current TRI reporter. - NONCURR = Has reported to TRI in the past but not for the current reporting year. (optional)
* pUnderscoretriUnderscorecat String Toxic Release Inventory Released To Air Chemical Identifier Category Filter.  Enter the chemical identifier category code to limit results. Note when filtering by TRI chemical identifier categories one may not also filter by specific chemical identifiers via p_tri_pol.  You must also specify a release amount using p_tri_amt or p_tri_any_amt. - TOTAL = Total Released to Air - CARC = Total Carcinogens Released to Air - HAP = Total Hazardous Air Pollutants Released to Air (optional)
* pUnderscoretriUnderscoreamt String Toxic Release Inventory Release Amount Filter.  Enter a value in pounds to limit results to facilities releasing this amount or greateer of TRI releases.  Valid values are 0, GT0, GT1000, GT5000, GT10000 and GT50000. Note when filtering by TRI release amounts one may only use either p_tri_amt or p_tri_any_amt. (optional)
* pUnderscoretriUnderscoreanyUnderscoreamt BigDecimal Toxic Release Inventory Release Of Any Kind Above Value Filter.  Enter a value to limit results to facilities releasing this amount or more of TRI releases.  Note when filtering by TRI releases one may only use p_tri_any_amt or p_tri_amt and not both. (optional)
* pUnderscoretriUnderscorepol String Toxic Release Inventory Chemical Identifier Filter.  Enter one or more chemical identifier codes to limit results. Note when filtering by specific TRI chemical identifiers one may not also filter by chemical identifier categories via p_tri_cat. (optional)
* pUnderscoreghgUnderscorecat String Green House Gas (GHG) Gas Code Category.  Must be used with either a formatted (p_ghg_amt) or custom (p_ghg_any_amt) release amount. (optional)
* pUnderscoreghgUnderscoreamt String Green House Gas (GHG) CO2 Equivalent Formatted Release Amount.  First 2 characters must contain GT (greater than) followed by a number. (optional)
* pUnderscoreghgUnderscoreanyUnderscoreamt BigDecimal Green House Gas (GHG) C02 Equivalent Custom Amount.  The C02E value reported for the provided category, will be greater or equal to the amount provided. (optional)
* pUnderscoreghgUnderscoreyr String Green House Gas (GHG) Reporting Year. (2010 through 2015) (optional)
* pUnderscoreneiUnderscorepol String National Emissions Inventory (NEI) Pollutant Identifier.  When a pollutant identifer is entered a corresponding formatted amount or custom amount must be entered. (optional)
* pUnderscoreneiUnderscoreamt String National Emissions Inventory (NEI) Formatted Pollutant Amount.  A formatted value where the 1st two characters must start with GT or LT followed by a number.  Identifies facilities that have a NEI Pollutant Emission  where the supplied value is > or < the pollutant emission amount.   (optional)
* pUnderscoreneiUnderscoreanyUnderscoreamt BigDecimal National Emissions Inventory (NEI) Custom Pollutant Amount.  Only a number can be entered.  Identifies facilities with where the NEI Pollutant Emission Amount is greater than the number entered. (optional)
* pUnderscoreneiUnderscoreyr String National Emissions Inventory (NEI) year:  2014 or 2011 (optional)
* pUnderscoreneiUnderscorecat String National Emissions Inventory (NEI) Pollutant Category.  When a pollutant category is entered, a corresponding formatted pollutant amount or custom amount must be entered. (optional)
* pUnderscorepm String Percent Minority Population Limiter.  Enter a value to restrict results to facilities with a given percentage of minority population within 3-mile radius. - NONE = 0% - GT5 = greater than 5% - GT10 = greater than 10% - GT25 = greater than 25% - GT50 = greater than 50% - GT75 = greater than 75% (optional)
* pUnderscorepd String Population Density Limiter (per sq mile). Enter a value to limit results to facilities located in area of a given population density. - NONE = 0 population density per square mile - GT100 = More than 100 population density per square mile - GT500 = More than 500 population density per square mile - GT1000 = More than 1000 population density per square mile - GT5000 = More than 5000 population density per square mile - GT10000 = More than 10000 population density per square mile - GT20000 = More than 20000 population density per square mile (optional)
* pUnderscoreico String Indian Country Flag.  Enter a \"Y\" or \"N\" to restrict searches to facilities inside or outside Indian Country. (optional)
* pUnderscorehuc String 2-, 4-, 6-, or 8-character watershed code. May contain multiple comma-separated values. (optional)
* pUnderscorewbd String 2-, 4-, 6-, 8-, 10-, or 12-character watershed (WBD from the USGS Watershed Boundary Dataset). May contain multiple comma-separated values.  Uses the FRS Best Pick Coordinate to obtain the WBD12 Huc value. (optional)
* pUnderscorepid String Nine-digit permit IDs. May contain up to 2000 comma-separated values. (optional)
* pUnderscoremed String Filter Results by Media. - M = RMP (Risk Management Plan) - R = RCRA (Hazardous Waste) - S = SDWA (Public Drinking Water Systems) - W = Water - ALL = Water and RCRA and SDWA (optional)
* pUnderscoreysl String Last Facility Inspection [within / not within] Specified Date Range Indicator. The date range is determined by parameters p_idt1 and p_idt2 or by parameter p_ysly. - W = within date range - N = not within date range (optional)
* pUnderscoreysly BigDecimal Number of years (1 to 5) since last facility inspection.  A value of 1 means that it has been inspected within the year. (optional)
* pUnderscoreysla String Facility Last Inspection Code Filter.  If left blank, both agencies are included.  Enter a value to limit results: - E = EPA - S = State (optional)
* pUnderscorestsl String Last Stack Test [within / not within] Specified Date Range Indicator. - W = within date range - N = not within date range (optional)
* pUnderscorestsly BigDecimal Number of years (1 to 5) since date of last stack test. A value of 1 means it has been inspected within the year. (optional)
* pUnderscorestsla String Stack Last Test Code Filter.  Enter a value to limit results: - A = All - E = EPA - S = State (optional)
* pUnderscorestres String Air Stack Test Status Description Filter.  Enter one or more test status descriptions to filter results.  Enter multiple values as a comma-delimited list. (optional)
* pUnderscoresttyp String Air Conductor Type Code Filter.  Enter one or more conductor type codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscoreqs String Quick Search. Allows entry for city, state, and/or zip code. (optional)
* pUnderscoresfs String Single Facility Search Filter.  Provide a facility name or program system identifier to limit results.  For the all data search, the FRS registry identifier is also searched. (optional)
* pUnderscoretribeid BigDecimal Numeric code for tribe (or list of tribes). (optional)
* pUnderscoretribename String Tribe Name Filter.  Enter a single tribe name to filter results. (optional)
* pUnderscoretribedist BigDecimal Proximity to tribal land limiter. Enter an amount of mile between 0 and 25 to filter results.  This parameter is only evaluated if p_tribeid is populated. (optional)
* pUnderscoreowop String Owner/Operator code filter.  Enter one or more codes to limit results. - CNG - COR - CTG - DIS - FDF - MWD - MXO - NON - POF - SDT - STF - TRB (optional)
* pUnderscoreagoo String Indicates whether to AND or OR the Owner/Operator parameter (p_owop) and the federal agency code (p_fa) parameters. (optional)
* pUnderscoreidt1 String Beginning of date range of most recent facility inspection. (optional)
* pUnderscoreidt2 String End of date range of most recent facility inspection. (optional)
* pUnderscorestdt1 String Beginning of date range of most recent stack test. (optional)
* pUnderscorestdt2 String End of date range of most recent stack test. (optional)
* pUnderscorepityp String Inspection Type: - CAC = Corrective Action Inspection - CAV = Compliance Assistance Visit - CDI = Case Development Inspection - CEI = Inspection Inspection - CSE = Compliance Schedule Evaluation - FCI = Focused Compliance - FRR = Financial Record Review - FSD = Facility Self Disclosure - FUI = Follow-Up Inspection - GME = Groundwater Monitoring Evaluation - NRR = Non-Financial Record Review - OAM = Operation and Maintenance Inspection May contain multiple comma-separated values. (optional)
* pUnderscorecifdi String Compliance issuess found during inspection. (optional)
* pUnderscorepfead1 String Formal Enforcement Action Date Range Start.  Enter a date in MM/DD/YYYY format to set the start of the range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfead2 String Formal Enforcement Action Date Range End.  Enter a date in MM/DD/YYYY format to set the end of the date range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfeat String Formal Enforcement Action (FEA) Code Filter.  Enter one or more three-letter FEA codes to restrict results to facilities with these attributes.  Use p_fead1 and p_fead2 parameters to further restrict this filter by entering a date range.  Provide multiple codes as a comma-delimited list. (optional)
* pUnderscorepsncq String Quarters in Significant Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of significant noncompliance. - Z = Zero quarters in significant noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in significant noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in significant noncompliance. (optional)
* pUnderscorepctrack String Compliance Tracking Limiter. Provide a keyword to indicate the extent to which data is being entered and effluent exceedances are being identified. - Off - Partial - On (optional)
* pUnderscoreswpa String Source water protection area (optional)
* pUnderscoredes String Universe Designation Limiter.  Enter one or more universe designation codes.  Provide multiple values as a comma-delimited list.  Use code \"TSDF\" to return the full enforcement TSDF universe and \"Operating TSDF\" to return the operating TSDF universe. (optional)
* pUnderscorefntype String Controls type of text search performed on facility name with parameter p_fn. - EXACT = Find facilities having the exact provided name(s). - BEGINS = Find facilities with names starting with the provided term(s). - ALL = Find facilities using Oracle text search terms. - CONTAINS =  (optional)
* pUnderscorehpvmth String Months in high priority violation status out of the previous three years limiter.  Provide a number of months in the past three years.  Results will limited to facilities in high priority violation status during that time.  (optional)
* pUnderscorerecvio String Recent Violation Status Filter.  Enter one or more recent violation codes to limit results.  Provide multiple values as a comma-delimited list. - NO VIOL = Selects facilities with no recent violations. - ANY HPV = Selects facilities with either addressed or unaddressed high priority violations. - ADDRS-EPA - Select facilities with recent EPA addressed violations. - ADDRS-LOCAL - Select facilities with recent locally addressed violations. - ADDRS-STATE - Select facilities with recent state addressed violations. - UNADDR-EPA - Select facilities with recent EPA unaddressed violations. - UNADDR-LOCAL - Select facilities with recent locally unaddressed violations. - UNADDR-STATE - Select facilities with recent state unaddressed violations. - FRV VIOL = Selects facilities with a recent federally reportable violation without a high priority violation. (optional)
* pUnderscorepollvio String Air Pollutant Code For A Recent Violation Filter.  Provide one or more pollutant codes to select facilities with one or more of the entered pollutant codes for a recent air violation.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorear String Associated EPA Air Reports Program Filter.  Enter multiple values as a comma-delimited list.  Valid values are: - TRI = Toxic Release Inventory. - GHG = Green House Gas Reporter. - EIS = Emission Inventory System. - CAMD = Clean Air Markets Program Reporter. (optional)
* pUnderscoretriUnderscoreyr String Toxic Release Inventory Reporting Year Filter.  Enter one or more year values to filter results by the TRI reporting year.  Provide multiple years as a comma-delimited list. (optional)
* pUnderscorepidall String Controls whether search is restricted to existing system. Y means the search will match the p_pid parameter against all associated permits (AIR, RCRA, SDWIS, etc). (optional)
* pUnderscorefacUnderscoreico String FRS tribal land code flag.  Enter \"Y\" or \"N\" to include or exclude facilities based on FRS tribal land code. (optional)
* pUnderscoreicoo String Indian country search and/or flag.  Enter \"Y\" to set indian country search conditions to return any results found using p_ico, p_fac_ico or p_fac_icoo.  Otherwise only results matching all provided p_ico, p_fac_ico or p_fac_icoo conditions will be returned. (optional)
* pUnderscorefacUnderscoreicos String FRS tribal land spatial flag.  Enter \"Y\" or \"N\" to include or exclude facilities based on FRS tribal land spatial flag. (optional)
* pUnderscoreejscreen String Enter \"Y\" to limit facilities to Census block groups where one of more Environmental Justice indexes above 80th percentile. (optional)
* pUnderscorelimitUnderscoreaddr String Limit Address Search Flag.  Enter Y to restrict facility searches to native data source only.   (optional)
* pUnderscorelat BigDecimal Latitude location in decimal degrees. (optional)
* pUnderscorelong BigDecimal Longitude location in decimal degrees. (optional)
* pUnderscoreradius BigDecimal Spatial Search Radius.  Enter a radius up to 100 miles in which to spatially search for facilities. (optional)
* pUnderscoredecouple String Decouple Inspection Code Search Flag.  Enter \"Y\" to search for inspection code types with p_pityp without respect to the date range search provided with p_ysl* parameters. (optional)
* pUnderscoreejscreenUnderscoreover80cnt String The number of Environmenmt Justice Indicators above the 80th percentile.  Valid values are 1 through 11. (optional)
* queryset BigDecimal Query Limiter.  Enter a value to limit the number of records returned for each query. Value cannot exceed 70,000. (optional)
* responseset BigDecimal Response Set Limiter. Enter a value to limit the number of records per page. Value cannot exceed 1,000. (optional)
* summarylist String Summary List Flag.  Enter a Y to return a list of summary statistics based on the parameters submitted to the query service. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns _air_rest_services_get_facility_info_get_200_response
* */
const air_rest_services_get_facility_infoGET = ({ output, pUnderscorefn, pUnderscoresa, pUnderscoresa1, pUnderscorect, pUnderscoreco, pUnderscorefips, pUnderscorest, pUnderscorezip, pUnderscorelcon, pUnderscorefrs, pUnderscorereg, pUnderscoresic, pUnderscorencs, pUnderscoreqnc, pUnderscorepen, pUnderscoreopst, xmin, ymin, xmax, ymax, pUnderscoreusmex, pUnderscoresic2, pUnderscoresic4, pUnderscorefa, pUnderscoreact, pUnderscoremaj, pUnderscoremact, pUnderscorensps, pUnderscorenspsm, pUnderscoreprog, pUnderscorefea, pUnderscorefeay, pUnderscorefeaa, pUnderscoreiea, pUnderscoreieay, pUnderscoreieaa, pUnderscoreqiv, pUnderscorenaa, pUnderscoreimpw, pUnderscoretrep, pUnderscoretriUnderscorecat, pUnderscoretriUnderscoreamt, pUnderscoretriUnderscoreanyUnderscoreamt, pUnderscoretriUnderscorepol, pUnderscoreghgUnderscorecat, pUnderscoreghgUnderscoreamt, pUnderscoreghgUnderscoreanyUnderscoreamt, pUnderscoreghgUnderscoreyr, pUnderscoreneiUnderscorepol, pUnderscoreneiUnderscoreamt, pUnderscoreneiUnderscoreanyUnderscoreamt, pUnderscoreneiUnderscoreyr, pUnderscoreneiUnderscorecat, pUnderscorepm, pUnderscorepd, pUnderscoreico, pUnderscorehuc, pUnderscorewbd, pUnderscorepid, pUnderscoremed, pUnderscoreysl, pUnderscoreysly, pUnderscoreysla, pUnderscorestsl, pUnderscorestsly, pUnderscorestsla, pUnderscorestres, pUnderscoresttyp, pUnderscoreqs, pUnderscoresfs, pUnderscoretribeid, pUnderscoretribename, pUnderscoretribedist, pUnderscoreowop, pUnderscoreagoo, pUnderscoreidt1, pUnderscoreidt2, pUnderscorestdt1, pUnderscorestdt2, pUnderscorepityp, pUnderscorecifdi, pUnderscorepfead1, pUnderscorepfead2, pUnderscorepfeat, pUnderscorepsncq, pUnderscorepctrack, pUnderscoreswpa, pUnderscoredes, pUnderscorefntype, pUnderscorehpvmth, pUnderscorerecvio, pUnderscorepollvio, pUnderscorear, pUnderscoretriUnderscoreyr, pUnderscorepidall, pUnderscorefacUnderscoreico, pUnderscoreicoo, pUnderscorefacUnderscoreicos, pUnderscoreejscreen, pUnderscorelimitUnderscoreaddr, pUnderscorelat, pUnderscorelong, pUnderscoreradius, pUnderscoredecouple, pUnderscoreejscreenUnderscoreover80cnt, queryset, responseset, summarylist, callback, qcolumns, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        output,
        pUnderscorefn,
        pUnderscoresa,
        pUnderscoresa1,
        pUnderscorect,
        pUnderscoreco,
        pUnderscorefips,
        pUnderscorest,
        pUnderscorezip,
        pUnderscorelcon,
        pUnderscorefrs,
        pUnderscorereg,
        pUnderscoresic,
        pUnderscorencs,
        pUnderscoreqnc,
        pUnderscorepen,
        pUnderscoreopst,
        xmin,
        ymin,
        xmax,
        ymax,
        pUnderscoreusmex,
        pUnderscoresic2,
        pUnderscoresic4,
        pUnderscorefa,
        pUnderscoreact,
        pUnderscoremaj,
        pUnderscoremact,
        pUnderscorensps,
        pUnderscorenspsm,
        pUnderscoreprog,
        pUnderscorefea,
        pUnderscorefeay,
        pUnderscorefeaa,
        pUnderscoreiea,
        pUnderscoreieay,
        pUnderscoreieaa,
        pUnderscoreqiv,
        pUnderscorenaa,
        pUnderscoreimpw,
        pUnderscoretrep,
        pUnderscoretriUnderscorecat,
        pUnderscoretriUnderscoreamt,
        pUnderscoretriUnderscoreanyUnderscoreamt,
        pUnderscoretriUnderscorepol,
        pUnderscoreghgUnderscorecat,
        pUnderscoreghgUnderscoreamt,
        pUnderscoreghgUnderscoreanyUnderscoreamt,
        pUnderscoreghgUnderscoreyr,
        pUnderscoreneiUnderscorepol,
        pUnderscoreneiUnderscoreamt,
        pUnderscoreneiUnderscoreanyUnderscoreamt,
        pUnderscoreneiUnderscoreyr,
        pUnderscoreneiUnderscorecat,
        pUnderscorepm,
        pUnderscorepd,
        pUnderscoreico,
        pUnderscorehuc,
        pUnderscorewbd,
        pUnderscorepid,
        pUnderscoremed,
        pUnderscoreysl,
        pUnderscoreysly,
        pUnderscoreysla,
        pUnderscorestsl,
        pUnderscorestsly,
        pUnderscorestsla,
        pUnderscorestres,
        pUnderscoresttyp,
        pUnderscoreqs,
        pUnderscoresfs,
        pUnderscoretribeid,
        pUnderscoretribename,
        pUnderscoretribedist,
        pUnderscoreowop,
        pUnderscoreagoo,
        pUnderscoreidt1,
        pUnderscoreidt2,
        pUnderscorestdt1,
        pUnderscorestdt2,
        pUnderscorepityp,
        pUnderscorecifdi,
        pUnderscorepfead1,
        pUnderscorepfead2,
        pUnderscorepfeat,
        pUnderscorepsncq,
        pUnderscorepctrack,
        pUnderscoreswpa,
        pUnderscoredes,
        pUnderscorefntype,
        pUnderscorehpvmth,
        pUnderscorerecvio,
        pUnderscorepollvio,
        pUnderscorear,
        pUnderscoretriUnderscoreyr,
        pUnderscorepidall,
        pUnderscorefacUnderscoreico,
        pUnderscoreicoo,
        pUnderscorefacUnderscoreicos,
        pUnderscoreejscreen,
        pUnderscorelimitUnderscoreaddr,
        pUnderscorelat,
        pUnderscorelong,
        pUnderscoreradius,
        pUnderscoredecouple,
        pUnderscoreejscreenUnderscoreover80cnt,
        queryset,
        responseset,
        summarylist,
        callback,
        qcolumns,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Facility Enhanced Search
* Returns either an array of Facilities or an array of Clusters that meet the specified search criteria.
*
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. - CSV = Facility results formatted as comma delimited file download. - GEOJSON = Facility results formatted as GeoJSON feature collection. - GEOJSONP = Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* pUnderscorefn String Facility Name Filter. Enter one or more case-insensitive facility names to filter results.  Provide multiple values as a comma-delimited list.  See p_fntype for additional modifiers. (optional)
* pUnderscoresa String Facility street address. Enter a complete or partial street address. (optional)
* pUnderscoresa1 String Facility street address. Enter a complete or partial street address.   Note that p_sa1 is culmulative with p_sa. (optional)
* pUnderscorect String Facility City Filter. Enter a single case-insensitive city name to filter results. (optional)
* pUnderscoreco String Facility County Filter. Provide a single county name in combination with a state value provided via p_st. (optional)
* pUnderscorefips String FIPS Code Filter.  Enter a single 5-character Federal Information Processing Standards (FIPS) state + county value to restrict results.  E.g. to limit results to Kenosha County, Wisconsin, use 55059. (optional)
* pUnderscorest String Facility State and State-Equivalent Filter.  Provide one or more USPS postal abbreviations for states and state-equivalents to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorezip String 5-Digit ZIP Code Filter. Provide one or more 5-digit postal zip codes to filter results.  May contain multiple comma-separated values. (optional)
* pUnderscorelcon String Air Program Local Control Region Code Filter.  Enter one or more local control region codes to filter results.  Provide multiple codes as a comma-delimited list.  Codes where they exist are specific by state. (optional)
* pUnderscorefrs String Facility Registry Service ID Filter. Enter a single 12-digit FRS identifier to filter results. (optional)
* pUnderscorereg String EPA Region Filter. Provide a single value of 01 thru 10 to restrict results to a single EPA region. (optional)
* pUnderscoresic String Standard Industrial Classification (SIC) Code Filter.  Enter a single 4-digit SIC Code to filter results.  If more complex filtering is required, use p_sic2 and p_sic4. (optional)
* pUnderscorencs String North American Industry Classification System Filter. Enter two to six digits to filter results to facilities having matching NAICS codes.  Digits less than six will match to all codes beginning with the provided values. (optional)
* pUnderscoreqnc BigDecimal Number of quarters in non-compliance limiter.  Enter an integer value between 1 and 4 to limit results. (optional)
* pUnderscorepen String Last Penality Date Qualifier Filter.  Enter one of the following:    - NEVER = No Penalties - ANY = Any Penalty - LEXX = Less than or equal to XX months.  Provide a number in place of XX, e.g. \\\"LE5\\\" for a facility with a penalty within previous 5 months. - GTXX = Greater than XX months.  Provide a number in place of XX, eg. GT12, for a facility with the last penalty greater than 12 months ago. (optional)
* pUnderscoreopst String Operating status filter.  Enter one or more operating status codes to limit results.   Provide multiple codes as a comma-delimited list. (optional)
* xmin BigDecimal Minimum longitude value in decimal degrees. (optional)
* ymin BigDecimal Minimum latitude value in decimal degrees. (optional)
* xmax BigDecimal Maximum longitude value in decimal degrees. (optional)
* ymax BigDecimal Maximum latitude value in decimal degrees. (optional)
* pUnderscoreusmex String US-Mexico Border Flag.  Enter Y/N to restrict searches to facilities located within 100KM of the border. (optional)
* pUnderscoresic2 String Standard Industrial Classification (SIC) Code Filter Alternate 2. Enter a wild-card search against SIC codes.  A final wild-card is always present allowing \\\"22\\\" to match all SIC codes beginning with 22.  Use the \\\"%\\\" character within strings to match any SIC values with the pattern.  For example, \\\"2%21\\\" matches 2021, 2121, 2221, etc. (optional)
* pUnderscoresic4 String Standard Industrial Classification (SIC) Code Filter Alternate 3.  Enter the first 2, 3 or 4 SIC code digits to filter results to facilities having those code prefixes.  As this alternative does not utilize an index, p_sic2 will generally be quicker. (optional)
* pUnderscorefa String Federal Agency. 1 character or 5-character values; may contain multiple comma-separated values. ALL will retrieve all facilities where the federal agency code is not null.  Use the Federal Agencies lookup service to obtain a list of values. (optional)
* pUnderscoreact String Active Permits/Facilities Flag.  Provide Y or N to filter results to facilities with active permits. (optional)
* pUnderscoremaj String Major Facility Flag.  Enter Y to restrict results to Major facilities only. (optional)
* pUnderscoremact String CAA Maximum Achievable Control Technology (MACT) Subpart codes (alpha ID between 1 and 7 characters) applicable to the facility. (optional)
* pUnderscorensps String Air Programl New Source Performance Standards (NSPS)  Subpart Code Search.  One or more valid Air Program NSPS Program codes cand be passed.   (optional)
* pUnderscorenspsm String Air Programl New Source Performance Standards Minors (NSPSM) Subpart Code Search.  One or more valid Air Program NSPSM Subpart codes can be passed.   (optional)
* pUnderscoreprog String Air Program Code Filter.  Enter one or more Air program codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorefea String Formal Enforcement Actions [within / not within] specified date range indicator. The date range is determined by parameters p_fead1 and p_fead2 or by parameter p_feay. - W = within date range - N = not within date range (optional)
* pUnderscorefeay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Formal Enforcement Actions (FEA). Used along with p_fea (which indicates whether to look within or outside of the date range) to find FEAs within (or not within) the number of years specified. (optional)
* pUnderscorefeaa String Agency associated with Formal Enforcement Actions: - E = EPA - S = State - A = All (optional)
* pUnderscoreiea String Informal Enforcement Actions [within / not within] specified date range.  The date range is determined by parameters p_iead1 and p_iead2 or by parameter p_ieay. - W = within date range - N = not within date range (optional)
* pUnderscoreieay BigDecimal Years (1 to 5) Range.  This value is used to create a date range for Informal Enforcement Actions (IEA). Used along with p_iea (which indicates whether to look within or outside of the date range) to find IEAs within (or not within) the number of years specified. (optional)
* pUnderscoreieaa String Agency associated with Informal Enforcement Actions. If left blank, both agencies are included. - E = EPA - S = State (optional)
* pUnderscoreqiv String Quarters in Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of noncompliance. - Z = Zero quarters in noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in noncompliance. (optional)
* pUnderscorenaa String Non-Attainment Area Flag.  Enter a Y or N to filter for or against facilities flagged as non-attainment areas. (optional)
* pUnderscoreimpw String Discharging into Impaired Waters Flag. Enter Y to limit results to facilities with discharge to waterbodies listed as impaired in the ATTAINS database. (optional)
* pUnderscoretrep String Current Toxics Release Inventory (TRI) Reporter Limiter.  Enter one of the following codes to limit results. - CURR = Current TRI reporter. - NONCURR = Has reported to TRI in the past but not for the current reporting year. (optional)
* pUnderscoretriUnderscorecat String Toxic Release Inventory Released To Air Chemical Identifier Category Filter.  Enter the chemical identifier category code to limit results. Note when filtering by TRI chemical identifier categories one may not also filter by specific chemical identifiers via p_tri_pol.  You must also specify a release amount using p_tri_amt or p_tri_any_amt. - TOTAL = Total Released to Air - CARC = Total Carcinogens Released to Air - HAP = Total Hazardous Air Pollutants Released to Air (optional)
* pUnderscoretriUnderscoreamt String Toxic Release Inventory Release Amount Filter.  Enter a value in pounds to limit results to facilities releasing this amount or greateer of TRI releases.  Valid values are 0, GT0, GT1000, GT5000, GT10000 and GT50000. Note when filtering by TRI release amounts one may only use either p_tri_amt or p_tri_any_amt. (optional)
* pUnderscoretriUnderscoreanyUnderscoreamt BigDecimal Toxic Release Inventory Release Of Any Kind Above Value Filter.  Enter a value to limit results to facilities releasing this amount or more of TRI releases.  Note when filtering by TRI releases one may only use p_tri_any_amt or p_tri_amt and not both. (optional)
* pUnderscoretriUnderscorepol String Toxic Release Inventory Chemical Identifier Filter.  Enter one or more chemical identifier codes to limit results. Note when filtering by specific TRI chemical identifiers one may not also filter by chemical identifier categories via p_tri_cat. (optional)
* pUnderscoreghgUnderscorecat String Green House Gas (GHG) Gas Code Category.  Must be used with either a formatted (p_ghg_amt) or custom (p_ghg_any_amt) release amount. (optional)
* pUnderscoreghgUnderscoreamt String Green House Gas (GHG) CO2 Equivalent Formatted Release Amount.  First 2 characters must contain GT (greater than) followed by a number. (optional)
* pUnderscoreghgUnderscoreanyUnderscoreamt BigDecimal Green House Gas (GHG) C02 Equivalent Custom Amount.  The C02E value reported for the provided category, will be greater or equal to the amount provided. (optional)
* pUnderscoreghgUnderscoreyr String Green House Gas (GHG) Reporting Year. (2010 through 2015) (optional)
* pUnderscoreneiUnderscorepol String National Emissions Inventory (NEI) Pollutant Identifier.  When a pollutant identifer is entered a corresponding formatted amount or custom amount must be entered. (optional)
* pUnderscoreneiUnderscoreamt String National Emissions Inventory (NEI) Formatted Pollutant Amount.  A formatted value where the 1st two characters must start with GT or LT followed by a number.  Identifies facilities that have a NEI Pollutant Emission  where the supplied value is > or < the pollutant emission amount.   (optional)
* pUnderscoreneiUnderscoreanyUnderscoreamt BigDecimal National Emissions Inventory (NEI) Custom Pollutant Amount.  Only a number can be entered.  Identifies facilities with where the NEI Pollutant Emission Amount is greater than the number entered. (optional)
* pUnderscoreneiUnderscoreyr String National Emissions Inventory (NEI) year:  2014 or 2011 (optional)
* pUnderscoreneiUnderscorecat String National Emissions Inventory (NEI) Pollutant Category.  When a pollutant category is entered, a corresponding formatted pollutant amount or custom amount must be entered. (optional)
* pUnderscorepm String Percent Minority Population Limiter.  Enter a value to restrict results to facilities with a given percentage of minority population within 3-mile radius. - NONE = 0% - GT5 = greater than 5% - GT10 = greater than 10% - GT25 = greater than 25% - GT50 = greater than 50% - GT75 = greater than 75% (optional)
* pUnderscorepd String Population Density Limiter (per sq mile). Enter a value to limit results to facilities located in area of a given population density. - NONE = 0 population density per square mile - GT100 = More than 100 population density per square mile - GT500 = More than 500 population density per square mile - GT1000 = More than 1000 population density per square mile - GT5000 = More than 5000 population density per square mile - GT10000 = More than 10000 population density per square mile - GT20000 = More than 20000 population density per square mile (optional)
* pUnderscoreico String Indian Country Flag.  Enter a \\\"Y\\\" or \\\"N\\\" to restrict searches to facilities inside or outside Indian Country. (optional)
* pUnderscorehuc String 2-, 4-, 6-, or 8-character watershed code. May contain multiple comma-separated values. (optional)
* pUnderscorewbd String 2-, 4-, 6-, 8-, 10-, or 12-character watershed (WBD from the USGS Watershed Boundary Dataset). May contain multiple comma-separated values.  Uses the FRS Best Pick Coordinate to obtain the WBD12 Huc value. (optional)
* pUnderscorepid String Nine-digit permit IDs. May contain up to 2000 comma-separated values. (optional)
* pUnderscoremed String Filter Results by Media. - M = RMP (Risk Management Plan) - R = RCRA (Hazardous Waste) - S = SDWA (Public Drinking Water Systems) - W = Water - ALL = Water and RCRA and SDWA (optional)
* pUnderscoreysl String Last Facility Inspection [within / not within] Specified Date Range Indicator. The date range is determined by parameters p_idt1 and p_idt2 or by parameter p_ysly. - W = within date range - N = not within date range (optional)
* pUnderscoreysly BigDecimal Number of years (1 to 5) since last facility inspection.  A value of 1 means that it has been inspected within the year. (optional)
* pUnderscoreysla String Facility Last Inspection Code Filter.  If left blank, both agencies are included.  Enter a value to limit results: - E = EPA - S = State (optional)
* pUnderscorestsl String Last Stack Test [within / not within] Specified Date Range Indicator. - W = within date range - N = not within date range (optional)
* pUnderscorestsly BigDecimal Number of years (1 to 5) since date of last stack test. A value of 1 means it has been inspected within the year. (optional)
* pUnderscorestsla String Stack Last Test Code Filter.  Enter a value to limit results: - A = All - E = EPA - S = State (optional)
* pUnderscorestres String Air Stack Test Status Description Filter.  Enter one or more test status descriptions to filter results.  Enter multiple values as a comma-delimited list. (optional)
* pUnderscoresttyp String Air Conductor Type Code Filter.  Enter one or more conductor type codes to filter results.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscoreqs String Quick Search. Allows entry for city, state, and/or zip code. (optional)
* pUnderscoresfs String Single Facility Search Filter.  Provide a facility name or program system identifier to limit results.  For the all data search, the FRS registry identifier is also searched. (optional)
* pUnderscoretribeid BigDecimal Numeric code for tribe (or list of tribes). (optional)
* pUnderscoretribename String Tribe Name Filter.  Enter a single tribe name to filter results. (optional)
* pUnderscoretribedist BigDecimal Proximity to tribal land limiter. Enter an amount of mile between 0 and 25 to filter results.  This parameter is only evaluated if p_tribeid is populated. (optional)
* pUnderscoreowop String Owner/Operator code filter.  Enter one or more codes to limit results. - CNG - COR - CTG - DIS - FDF - MWD - MXO - NON - POF - SDT - STF - TRB (optional)
* pUnderscoreagoo String Indicates whether to AND or OR the Owner/Operator parameter (p_owop) and the federal agency code (p_fa) parameters. (optional)
* pUnderscoreidt1 String Beginning of date range of most recent facility inspection. (optional)
* pUnderscoreidt2 String End of date range of most recent facility inspection. (optional)
* pUnderscorestdt1 String Beginning of date range of most recent stack test. (optional)
* pUnderscorestdt2 String End of date range of most recent stack test. (optional)
* pUnderscorepityp String Inspection Type: - CAC = Corrective Action Inspection - CAV = Compliance Assistance Visit - CDI = Case Development Inspection - CEI = Inspection Inspection - CSE = Compliance Schedule Evaluation - FCI = Focused Compliance - FRR = Financial Record Review - FSD = Facility Self Disclosure - FUI = Follow-Up Inspection - GME = Groundwater Monitoring Evaluation - NRR = Non-Financial Record Review - OAM = Operation and Maintenance Inspection May contain multiple comma-separated values. (optional)
* pUnderscorecifdi String Compliance issuess found during inspection. (optional)
* pUnderscorepfead1 String Formal Enforcement Action Date Range Start.  Enter a date in MM/DD/YYYY format to set the start of the range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfead2 String Formal Enforcement Action Date Range End.  Enter a date in MM/DD/YYYY format to set the end of the date range for filtering by recent Formal Enforcement Action (FEA) taken against the facility within the last five years. (optional)
* pUnderscorepfeat String Formal Enforcement Action (FEA) Code Filter.  Enter one or more three-letter FEA codes to restrict results to facilities with these attributes.  Use p_fead1 and p_fead2 parameters to further restrict this filter by entering a date range.  Provide multiple codes as a comma-delimited list. (optional)
* pUnderscorepsncq String Quarters in Significant Noncompliance Limiter.  Enter a coded value to limit results to facilities with given quarter of significant noncompliance. - Z = Zero quarters in significant noncompliance. - GEXX = Replacing XX with a numeric value, that number of quarterd or more in significant noncompliance. - GTXX = Replacing XX with a numeric value, more than that number of quarters in significant noncompliance. (optional)
* pUnderscorepctrack String Compliance Tracking Limiter. Provide a keyword to indicate the extent to which data is being entered and effluent exceedances are being identified. - Off - Partial - On (optional)
* pUnderscoreswpa String Source water protection area (optional)
* pUnderscoredes String Universe Designation Limiter.  Enter one or more universe designation codes.  Provide multiple values as a comma-delimited list.  Use code \\\"TSDF\\\" to return the full enforcement TSDF universe and \\\"Operating TSDF\\\" to return the operating TSDF universe. (optional)
* pUnderscorefntype String Controls type of text search performed on facility name with parameter p_fn. - EXACT = Find facilities having the exact provided name(s). - BEGINS = Find facilities with names starting with the provided term(s). - ALL = Find facilities using Oracle text search terms. - CONTAINS =  (optional)
* pUnderscorehpvmth String Months in high priority violation status out of the previous three years limiter.  Provide a number of months in the past three years.  Results will limited to facilities in high priority violation status during that time.  (optional)
* pUnderscorerecvio String Recent Violation Status Filter.  Enter one or more recent violation codes to limit results.  Provide multiple values as a comma-delimited list. - NO VIOL = Selects facilities with no recent violations. - ANY HPV = Selects facilities with either addressed or unaddressed high priority violations. - ADDRS-EPA - Select facilities with recent EPA addressed violations. - ADDRS-LOCAL - Select facilities with recent locally addressed violations. - ADDRS-STATE - Select facilities with recent state addressed violations. - UNADDR-EPA - Select facilities with recent EPA unaddressed violations. - UNADDR-LOCAL - Select facilities with recent locally unaddressed violations. - UNADDR-STATE - Select facilities with recent state unaddressed violations. - FRV VIOL = Selects facilities with a recent federally reportable violation without a high priority violation. (optional)
* pUnderscorepollvio String Air Pollutant Code For A Recent Violation Filter.  Provide one or more pollutant codes to select facilities with one or more of the entered pollutant codes for a recent air violation.  Provide multiple values as a comma-delimited list. (optional)
* pUnderscorear String Associated EPA Air Reports Program Filter.  Enter multiple values as a comma-delimited list.  Valid values are: - TRI = Toxic Release Inventory. - GHG = Green House Gas Reporter. - EIS = Emission Inventory System. - CAMD = Clean Air Markets Program Reporter. (optional)
* pUnderscoretriUnderscoreyr String Toxic Release Inventory Reporting Year Filter.  Enter one or more year values to filter results by the TRI reporting year.  Provide multiple years as a comma-delimited list. (optional)
* pUnderscorepidall String Controls whether search is restricted to existing system. Y means the search will match the p_pid parameter against all associated permits (AIR, RCRA, SDWIS, etc). (optional)
* pUnderscorefacUnderscoreico String FRS tribal land code flag.  Enter \\\"Y\\\" or \\\"N\\\" to include or exclude facilities based on FRS tribal land code. (optional)
* pUnderscoreicoo String Indian country search and/or flag.  Enter \\\"Y\\\" to set indian country search conditions to return any results found using p_ico, p_fac_ico or p_fac_icoo.  Otherwise only results matching all provided p_ico, p_fac_ico or p_fac_icoo conditions will be returned. (optional)
* pUnderscorefacUnderscoreicos String FRS tribal land spatial flag.  Enter \\\"Y\\\" or \\\"N\\\" to include or exclude facilities based on FRS tribal land spatial flag. (optional)
* pUnderscoreejscreen String Enter \\\"Y\\\" to limit facilities to Census block groups where one of more Environmental Justice indexes above 80th percentile. (optional)
* pUnderscorelimitUnderscoreaddr String Limit Address Search Flag.  Enter Y to restrict facility searches to native data source only.   (optional)
* pUnderscorelat BigDecimal Latitude location in decimal degrees. (optional)
* pUnderscorelong BigDecimal Longitude location in decimal degrees. (optional)
* pUnderscoreradius BigDecimal Spatial Search Radius.  Enter a radius up to 100 miles in which to spatially search for facilities. (optional)
* pUnderscoredecouple String Decouple Inspection Code Search Flag.  Enter \\\"Y\\\" to search for inspection code types with p_pityp without respect to the date range search provided with p_ysl* parameters. (optional)
* pUnderscoreejscreenUnderscoreover80cnt String The number of Environmenmt Justice Indicators above the 80th percentile.  Valid values are 1 through 11. (optional)
* queryset BigDecimal Query Limiter.  Enter a value to limit the number of records returned for each query. Value cannot exceed 70,000. (optional)
* responseset BigDecimal Response Set Limiter. Enter a value to limit the number of records per page. Value cannot exceed 1,000. (optional)
* summarylist String Summary List Flag.  Enter a Y to return a list of summary statistics based on the parameters submitted to the query service. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns _air_rest_services_get_facility_info_get_200_response
* */
const air_rest_services_get_facility_infoPOST = ({ output, pUnderscorefn, pUnderscoresa, pUnderscoresa1, pUnderscorect, pUnderscoreco, pUnderscorefips, pUnderscorest, pUnderscorezip, pUnderscorelcon, pUnderscorefrs, pUnderscorereg, pUnderscoresic, pUnderscorencs, pUnderscoreqnc, pUnderscorepen, pUnderscoreopst, xmin, ymin, xmax, ymax, pUnderscoreusmex, pUnderscoresic2, pUnderscoresic4, pUnderscorefa, pUnderscoreact, pUnderscoremaj, pUnderscoremact, pUnderscorensps, pUnderscorenspsm, pUnderscoreprog, pUnderscorefea, pUnderscorefeay, pUnderscorefeaa, pUnderscoreiea, pUnderscoreieay, pUnderscoreieaa, pUnderscoreqiv, pUnderscorenaa, pUnderscoreimpw, pUnderscoretrep, pUnderscoretriUnderscorecat, pUnderscoretriUnderscoreamt, pUnderscoretriUnderscoreanyUnderscoreamt, pUnderscoretriUnderscorepol, pUnderscoreghgUnderscorecat, pUnderscoreghgUnderscoreamt, pUnderscoreghgUnderscoreanyUnderscoreamt, pUnderscoreghgUnderscoreyr, pUnderscoreneiUnderscorepol, pUnderscoreneiUnderscoreamt, pUnderscoreneiUnderscoreanyUnderscoreamt, pUnderscoreneiUnderscoreyr, pUnderscoreneiUnderscorecat, pUnderscorepm, pUnderscorepd, pUnderscoreico, pUnderscorehuc, pUnderscorewbd, pUnderscorepid, pUnderscoremed, pUnderscoreysl, pUnderscoreysly, pUnderscoreysla, pUnderscorestsl, pUnderscorestsly, pUnderscorestsla, pUnderscorestres, pUnderscoresttyp, pUnderscoreqs, pUnderscoresfs, pUnderscoretribeid, pUnderscoretribename, pUnderscoretribedist, pUnderscoreowop, pUnderscoreagoo, pUnderscoreidt1, pUnderscoreidt2, pUnderscorestdt1, pUnderscorestdt2, pUnderscorepityp, pUnderscorecifdi, pUnderscorepfead1, pUnderscorepfead2, pUnderscorepfeat, pUnderscorepsncq, pUnderscorepctrack, pUnderscoreswpa, pUnderscoredes, pUnderscorefntype, pUnderscorehpvmth, pUnderscorerecvio, pUnderscorepollvio, pUnderscorear, pUnderscoretriUnderscoreyr, pUnderscorepidall, pUnderscorefacUnderscoreico, pUnderscoreicoo, pUnderscorefacUnderscoreicos, pUnderscoreejscreen, pUnderscorelimitUnderscoreaddr, pUnderscorelat, pUnderscorelong, pUnderscoreradius, pUnderscoredecouple, pUnderscoreejscreenUnderscoreover80cnt, queryset, responseset, summarylist, callback, qcolumns, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        output,
        pUnderscorefn,
        pUnderscoresa,
        pUnderscoresa1,
        pUnderscorect,
        pUnderscoreco,
        pUnderscorefips,
        pUnderscorest,
        pUnderscorezip,
        pUnderscorelcon,
        pUnderscorefrs,
        pUnderscorereg,
        pUnderscoresic,
        pUnderscorencs,
        pUnderscoreqnc,
        pUnderscorepen,
        pUnderscoreopst,
        xmin,
        ymin,
        xmax,
        ymax,
        pUnderscoreusmex,
        pUnderscoresic2,
        pUnderscoresic4,
        pUnderscorefa,
        pUnderscoreact,
        pUnderscoremaj,
        pUnderscoremact,
        pUnderscorensps,
        pUnderscorenspsm,
        pUnderscoreprog,
        pUnderscorefea,
        pUnderscorefeay,
        pUnderscorefeaa,
        pUnderscoreiea,
        pUnderscoreieay,
        pUnderscoreieaa,
        pUnderscoreqiv,
        pUnderscorenaa,
        pUnderscoreimpw,
        pUnderscoretrep,
        pUnderscoretriUnderscorecat,
        pUnderscoretriUnderscoreamt,
        pUnderscoretriUnderscoreanyUnderscoreamt,
        pUnderscoretriUnderscorepol,
        pUnderscoreghgUnderscorecat,
        pUnderscoreghgUnderscoreamt,
        pUnderscoreghgUnderscoreanyUnderscoreamt,
        pUnderscoreghgUnderscoreyr,
        pUnderscoreneiUnderscorepol,
        pUnderscoreneiUnderscoreamt,
        pUnderscoreneiUnderscoreanyUnderscoreamt,
        pUnderscoreneiUnderscoreyr,
        pUnderscoreneiUnderscorecat,
        pUnderscorepm,
        pUnderscorepd,
        pUnderscoreico,
        pUnderscorehuc,
        pUnderscorewbd,
        pUnderscorepid,
        pUnderscoremed,
        pUnderscoreysl,
        pUnderscoreysly,
        pUnderscoreysla,
        pUnderscorestsl,
        pUnderscorestsly,
        pUnderscorestsla,
        pUnderscorestres,
        pUnderscoresttyp,
        pUnderscoreqs,
        pUnderscoresfs,
        pUnderscoretribeid,
        pUnderscoretribename,
        pUnderscoretribedist,
        pUnderscoreowop,
        pUnderscoreagoo,
        pUnderscoreidt1,
        pUnderscoreidt2,
        pUnderscorestdt1,
        pUnderscorestdt2,
        pUnderscorepityp,
        pUnderscorecifdi,
        pUnderscorepfead1,
        pUnderscorepfead2,
        pUnderscorepfeat,
        pUnderscorepsncq,
        pUnderscorepctrack,
        pUnderscoreswpa,
        pUnderscoredes,
        pUnderscorefntype,
        pUnderscorehpvmth,
        pUnderscorerecvio,
        pUnderscorepollvio,
        pUnderscorear,
        pUnderscoretriUnderscoreyr,
        pUnderscorepidall,
        pUnderscorefacUnderscoreico,
        pUnderscoreicoo,
        pUnderscorefacUnderscoreicos,
        pUnderscoreejscreen,
        pUnderscorelimitUnderscoreaddr,
        pUnderscorelat,
        pUnderscorelong,
        pUnderscoreradius,
        pUnderscoredecouple,
        pUnderscoreejscreenUnderscoreover80cnt,
        queryset,
        responseset,
        summarylist,
        callback,
        qcolumns,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act GeoJSON Service
* Based on the QID obtained from a get_facilities or get_facility_info query, return GeoJSON of the facilities found.
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - GEOJSON = Facility results formatted as GeoJSON feature collection (default). - GEOJSONP = Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* newsort BigDecimal Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column. (optional)
* descending String Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns _air_rest_services_get_geojson_get_200_response
* */
const air_rest_services_get_geojsonGET = ({ qid, output, callback, newsort, descending, qcolumns, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        output,
        callback,
        newsort,
        descending,
        qcolumns,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act GeoJSON Service
* Based on the QID obtained from a get_facilities or get_facility_info query, return GeoJSON of the facilities found.
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - GEOJSON = Facility results formatted as GeoJSON feature collection (default). - GEOJSONP = Facility results formatted as GeoJSON feature collection with Padding. - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* newsort BigDecimal Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column. (optional)
* descending String Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns _air_rest_services_get_geojson_get_200_response
* */
const air_rest_services_get_geojsonPOST = ({ qid, output, callback, newsort, descending, qcolumns, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        output,
        callback,
        newsort,
        descending,
        qcolumns,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Info Clusters Service
* Based on the QID obtained from a clustered get_facility_info query, download cluster facility information as either a CSV or GEOJSON file.
*
* pUnderscoreqid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - CSV = Facility results formatted as comma delimited file download (default). - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns File
* */
const air_rest_services_get_info_clustersGET = ({ pUnderscoreqid, output, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pUnderscoreqid,
        output,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Info Clusters Service
* Based on the QID obtained from a clustered get_facility_info query, download cluster facility information as either a CSV or GEOJSON file.
*
* pUnderscoreqid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - CSV = Facility results formatted as comma delimited file download (default). - GEOJSOND = Facility results formatted as GeoJSON feature collection download. (optional)
* pUnderscoreprettyUnderscoreprint BigDecimal Optional flag to request GeoJSON formatted results to be pretty printed.  Only provide a numeric value when the output needs to be human readable as pretty printing has a performance cost. (optional)
* returns File
* */
const air_rest_services_get_info_clustersPOST = ({ pUnderscoreqid, output, pUnderscoreprettyUnderscoreprint }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        pUnderscoreqid,
        output,
        pUnderscoreprettyUnderscoreprint,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Map Service
* The purpose of the GET_MAP service is to display facility coordinates and facility clusters related to a get_facilities facility query. Currently, the maximum number of coordinates returned is 500. GET_MAP performs automatic clustering at the state, county, and zip code levels to maximize the number of coordinates returned.
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* pUnderscoreid String Identifier for the service.
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* tablelist String Table List Flag. Enter a Y to display the first page of facility results. (optional)
* c1Underscorelat BigDecimal Latitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* c1Underscorelong BigDecimal Longitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* c2Underscorelat BigDecimal Latitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* c2Underscorelong BigDecimal Longitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* returns _air_rest_services_get_map_get_200_response
* */
const air_rest_services_get_mapGET = ({ qid, pUnderscoreid, output, callback, tablelist, c1Underscorelat, c1Underscorelong, c2Underscorelat, c2Underscorelong }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        pUnderscoreid,
        output,
        callback,
        tablelist,
        c1Underscorelat,
        c1Underscorelong,
        c2Underscorelat,
        c2Underscorelong,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Map Service
* The purpose of the GET_MAP service is to display facility coordinates and facility clusters related to a get_facilities facility query. Currently, the maximum number of coordinates returned is 500. GET_MAP performs automatic clustering at the state, county, and zip code levels to maximize the number of coordinates returned.
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* pUnderscoreid String Identifier for the service.
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* tablelist String Table List Flag. Enter a Y to display the first page of facility results. (optional)
* c1Underscorelat BigDecimal Latitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* c1Underscorelong BigDecimal Longitude of 1st corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* c2Underscorelat BigDecimal Latitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* c2Underscorelong BigDecimal Longitude of 2nd corner of box that bounds the resulting facilities. The latitude and longitude of both corners of the bounding box must be provided. (optional)
* returns _air_rest_services_get_map_get_200_response
* */
const air_rest_services_get_mapPOST = ({ qid, pUnderscoreid, output, callback, tablelist, c1Underscorelat, c1Underscorelong, c2Underscorelat, c2Underscorelong }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        pUnderscoreid,
        output,
        callback,
        tablelist,
        c1Underscorelat,
        c1Underscorelong,
        c2Underscorelat,
        c2Underscorelong,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Search by Query ID
* GET_QID is passed with a query ID corresponding to a previously run get_facilities query. It then returns a Facility object containing all matching facilities. The main purpose of GET_QID is for large querysets that contain multiple pages (responsesets) of output. GET_QID allows for pagination and for the selection and sorting of columns. 
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* pageno BigDecimal Indicates the number of the page to display. It is used only when the results are paginated. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* newsort BigDecimal Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column. (optional)
* descending String Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* returns _air_rest_services_get_qid_get_200_response
* */
const air_rest_services_get_qidGET = ({ qid, output, pageno, callback, newsort, descending, qcolumns }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        output,
        pageno,
        callback,
        newsort,
        descending,
        qcolumns,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Clean Air Act Search by Query ID
* GET_QID is passed with a query ID corresponding to a previously run get_facilities query. It then returns a Facility object containing all matching facilities. The main purpose of GET_QID is for large querysets that contain multiple pages (responsesets) of output. GET_QID allows for pagination and for the selection and sorting of columns. 
*
* qid String Query ID Selector.  Enter the QueryID number from a previously run query.
* output String Output Format Flag.  Enter one of the following keywords: - JSON = Data model formatted as Javascript Object Notation (default). - JSONP = Data model formatted as Javascript Object Notation with Padding.   - XML = Data model formatted as Extensible Markup Language. (optional)
* pageno BigDecimal Indicates the number of the page to display. It is used only when the results are paginated. (optional)
* callback String JSONP Callback.  For use with JSONP and GEOJSONP output only.  Enter a name of the function in which to wrap the JSON response. (optional)
* newsort BigDecimal Output Sort Column.  Enter the number of the column on which the data will be sorted. If unpopulated results will sort on the first column. (optional)
* descending String Output Sort Column Descending Flag.  Enter Y to column identified in the newsort parameter descending.  Enter N to use ascending sort order. Used only when newsort parameter is populated. (optional)
* qcolumns String Used to customize service output.  A list of comma-separated column IDs of output objects that will be returned in the service query object or download.  Use the metadata service endpoint for a complete list of Ids and definitions. (optional)
* returns _air_rest_services_get_qid_get_200_response
* */
const air_rest_services_get_qidPOST = ({ qid, output, pageno, callback, newsort, descending, qcolumns }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        qid,
        output,
        pageno,
        callback,
        newsort,
        descending,
        qcolumns,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  air_rest_services_get_downloadGET,
  air_rest_services_get_downloadPOST,
  air_rest_services_get_facilitiesGET,
  air_rest_services_get_facilitiesPOST,
  air_rest_services_get_facility_infoGET,
  air_rest_services_get_facility_infoPOST,
  air_rest_services_get_geojsonGET,
  air_rest_services_get_geojsonPOST,
  air_rest_services_get_info_clustersGET,
  air_rest_services_get_info_clustersPOST,
  air_rest_services_get_mapGET,
  air_rest_services_get_mapPOST,
  air_rest_services_get_qidGET,
  air_rest_services_get_qidPOST,
};
