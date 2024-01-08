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
        /// The number of Environmenmt Justice Indicators above the 80th percentile.  Valid values are 1 through 11.
        /// </summary>
        /// <value>The number of Environmenmt Justice Indicators above the 80th percentile.  Valid values are 1 through 11.</value>
        [TypeConverter(typeof(CustomEnumConverter<FormDataFPEjscreenOver80cnt>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum FormDataFPEjscreenOver80cnt
        {
            
            /// <summary>
            /// Enum _1Enum for 1
            /// </summary>
            [EnumMember(Value = "1")]
            _1Enum = 1,
            
            /// <summary>
            /// Enum _2Enum for 2
            /// </summary>
            [EnumMember(Value = "2")]
            _2Enum = 2,
            
            /// <summary>
            /// Enum _3Enum for 3
            /// </summary>
            [EnumMember(Value = "3")]
            _3Enum = 3,
            
            /// <summary>
            /// Enum _4Enum for 4
            /// </summary>
            [EnumMember(Value = "4")]
            _4Enum = 4,
            
            /// <summary>
            /// Enum _5Enum for 5
            /// </summary>
            [EnumMember(Value = "5")]
            _5Enum = 5,
            
            /// <summary>
            /// Enum _6Enum for 6
            /// </summary>
            [EnumMember(Value = "6")]
            _6Enum = 6,
            
            /// <summary>
            /// Enum _7Enum for 7
            /// </summary>
            [EnumMember(Value = "7")]
            _7Enum = 7,
            
            /// <summary>
            /// Enum _8Enum for 8
            /// </summary>
            [EnumMember(Value = "8")]
            _8Enum = 8,
            
            /// <summary>
            /// Enum _9Enum for 9
            /// </summary>
            [EnumMember(Value = "9")]
            _9Enum = 9,
            
            /// <summary>
            /// Enum _10Enum for 10
            /// </summary>
            [EnumMember(Value = "10")]
            _10Enum = 10,
            
            /// <summary>
            /// Enum _11Enum for 11
            /// </summary>
            [EnumMember(Value = "11")]
            _11Enum = 11
        }
}