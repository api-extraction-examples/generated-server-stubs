﻿/*
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

namespace Org.OpenAPITools.OpenApi
{
    /// <summary>
    /// Replacement utilities from Swashbuckle.AspNetCore.SwaggerGen which are not in 5.x
    /// </summary>
    public static class TypeExtensions
    {
        /// <summary>
        /// Produce a friendly name for the type which is unique.
        /// </summary>
        /// <param name="type"></param>
        /// <param name="fullyQualified"></param>
        public static string FriendlyId(this Type type, bool fullyQualified = false)
        {
            var typeName = fullyQualified
                ? type.FullNameSansTypeParameters().Replace("+", ".")
                : type.Name;

            if (type.IsGenericType)
            {
                var genericArgumentIds = type.GetGenericArguments()
                    .Select(t => t.FriendlyId(fullyQualified))
                    .ToArray();

                return new StringBuilder(typeName)
                    .Replace($"`{genericArgumentIds.Count()}", string.Empty)
                    .Append($"[{string.Join(",", genericArgumentIds).TrimEnd(',')}]")
                    .ToString();
            }

            return typeName;
        }

        /// <summary>
        /// Determine the fully qualified type name without type parameters.
        /// </summary>
        /// <param name="type"></param>
        public static string FullNameSansTypeParameters(this Type type)
        {
            var fullName = type.FullName;
            if (string.IsNullOrEmpty(fullName))
                fullName = type.Name;
            var chopIndex = fullName.IndexOf("[[", StringComparison.Ordinal);
            return (chopIndex == -1) ? fullName : fullName.Substring(0, chopIndex);
        }
    }
}