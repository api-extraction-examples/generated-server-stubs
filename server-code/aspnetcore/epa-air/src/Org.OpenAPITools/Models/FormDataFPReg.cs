/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * The version of the OpenAPI document: 2019.10.15
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Org.OpenAPITools.Converters;

namespace Org.OpenAPITools.Models
{ 
        /// <summary>
        /// EPA Region Filter. Provide a single value of 01 thru 10 to restrict results to a single EPA region.
        /// </summary>
        /// <value>EPA Region Filter. Provide a single value of 01 thru 10 to restrict results to a single EPA region.</value>
        [TypeConverter(typeof(CustomEnumConverter<FormDataFPReg>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum FormDataFPReg
        {
            
            /// <summary>
            /// Enum _01Enum for 01
            /// </summary>
            [EnumMember(Value = "01")]
            _01Enum = 1,
            
            /// <summary>
            /// Enum _02Enum for 02
            /// </summary>
            [EnumMember(Value = "02")]
            _02Enum = 2,
            
            /// <summary>
            /// Enum _03Enum for 03
            /// </summary>
            [EnumMember(Value = "03")]
            _03Enum = 3,
            
            /// <summary>
            /// Enum _04Enum for 04
            /// </summary>
            [EnumMember(Value = "04")]
            _04Enum = 4,
            
            /// <summary>
            /// Enum _05Enum for 05
            /// </summary>
            [EnumMember(Value = "05")]
            _05Enum = 5,
            
            /// <summary>
            /// Enum _06Enum for 06
            /// </summary>
            [EnumMember(Value = "06")]
            _06Enum = 6,
            
            /// <summary>
            /// Enum _07Enum for 07
            /// </summary>
            [EnumMember(Value = "07")]
            _07Enum = 7,
            
            /// <summary>
            /// Enum _08Enum for 08
            /// </summary>
            [EnumMember(Value = "08")]
            _08Enum = 8,
            
            /// <summary>
            /// Enum _09Enum for 09
            /// </summary>
            [EnumMember(Value = "09")]
            _09Enum = 9,
            
            /// <summary>
            /// Enum _10Enum for 10
            /// </summary>
            [EnumMember(Value = "10")]
            _10Enum = 10
        }
}