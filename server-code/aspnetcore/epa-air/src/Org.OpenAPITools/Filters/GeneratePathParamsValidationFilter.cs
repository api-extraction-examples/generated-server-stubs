/*
 * U.S. EPA Enforcement and Compliance History Online (ECHO) - Clean Air Act
 *
 * Enforcement and Compliance History Online (ECHO) is a tool developed and maintained by EPA's Office of Enforcement and Compliance Assurance for public use. ECHO provides integrated compliance and enforcement information for over 1 million regulated facilities nationwide.  Air Rest Services provides multiple service endpoints, each with specific capabilities, to search and retrieve data on facilities regulated under the Clean Air Act (CAA). The returned results reflect data drawn from EPA's ICIS-Air database.  The get_facilities, get_map, get_qid, and get_download end points are meant to be used together, while the enhanced get_facility_info end point is self contained. The get_facility_info end point returns either an array of state, county or zip clusters with summary statistics per cluster or an array of facilities.  The recommended use scenario for get_facilities, get_qid, get_map, and get_downoad is:  <b>1)</b>  Use get_facilities to validate passed query parameters, obtain summary statistics and to obtain a query_id (QID).  QIDs are time sensitive and will be valid for approximately 30 minutes. <b>2)</b>  Use get_qid, with the returned QID, to paginate through arrays of facility results. <b>3)</b>  Use get_map, with the returned QID, to zoom in/out and pan on the clustered and individual facility coordinates that meet the QID query criteria. <b>4)</b>  Use get_download, with the returned QID, to generate a Comma Separated Value (CSV) file of facility information that meets the QID query criteria.  Use the qcolumns parameter to customize your search results.  Use the Metadata service endpoint for a list of available output objects, their Column Ids, and their definitions to help you build your customized output.   Additional ECHO Resources:   <a href=\"https://echo.epa.gov/tools/web-services\">Web Services</a>, <a href=\"https://echo.epa.gov/resources/echo-data/about-the-data\">About ECHO's Data</a>, <a href=\"https://echo.epa.gov/tools/data-downloads\">Data Downloads</a>
 *
 * The version of the OpenAPI document: 2019.10.15
 * 
 * Generated by: https://openapi-generator.tech
 */

using System.ComponentModel.DataAnnotations;
using System.Linq;
using Microsoft.AspNetCore.Mvc.Controllers;
using Microsoft.OpenApi.Models;
using Swashbuckle.AspNetCore.SwaggerGen;

namespace Org.OpenAPITools.Filters
{
    /// <summary>
    /// Path Parameter Validation Rules Filter
    /// </summary>
    public class GeneratePathParamsValidationFilter : IOperationFilter
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="operation">Operation</param>
        /// <param name="context">OperationFilterContext</param>
        public void Apply(OpenApiOperation operation, OperationFilterContext context)
        {
            var pars = context.ApiDescription.ParameterDescriptions;

            foreach (var par in pars)
            {
                var openapiParam = operation.Parameters.SingleOrDefault(p => p.Name == par.Name);

                var attributes = ((ControllerParameterDescriptor)par.ParameterDescriptor).ParameterInfo.CustomAttributes.ToList();

                // See https://github.com/domaindrivendev/Swashbuckle.AspNetCore/issues/1147
                // and https://mikeralphson.github.io/openapi/2017/03/15/openapi3.0.0-rc0
                // Basically OpenAPI v3 body parameters are split out into RequestBody and the properties have moved to schema
                if (attributes.Any() && openapiParam != null)
                {
                    // Required - [Required]
                    var requiredAttr = attributes.FirstOrDefault(p => p.AttributeType == typeof(RequiredAttribute));
                    if (requiredAttr != null)
                    {
                        openapiParam.Required = true;
                    }

                    // Regex Pattern [RegularExpression]
                    var regexAttr = attributes.FirstOrDefault(p => p.AttributeType == typeof(RegularExpressionAttribute));
                    if (regexAttr != null)
                    {
                        var regex = (string)regexAttr.ConstructorArguments[0].Value;
                        openapiParam.Schema.Pattern = regex;
                    }

                    // String Length [StringLength]
                    int? minLength = null, maxLength = null;
                    var stringLengthAttr = attributes.FirstOrDefault(p => p.AttributeType == typeof(StringLengthAttribute));
                    if (stringLengthAttr != null)
                    {
                        if (stringLengthAttr.NamedArguments.Count == 1)
                        {
                            minLength = (int)stringLengthAttr.NamedArguments.Single(p => p.MemberName == "MinimumLength").TypedValue.Value;
                        }
                        maxLength = (int)stringLengthAttr.ConstructorArguments[0].Value;
                    }

                    var minLengthAttr = attributes.FirstOrDefault(p => p.AttributeType == typeof(MinLengthAttribute));
                    if (minLengthAttr != null)
                    {
                        minLength = (int)minLengthAttr.ConstructorArguments[0].Value;
                    }

                    var maxLengthAttr = attributes.FirstOrDefault(p => p.AttributeType == typeof(MaxLengthAttribute));
                    if (maxLengthAttr != null)
                    {
                        maxLength = (int)maxLengthAttr.ConstructorArguments[0].Value;
                    }

                    if (minLength != null)
                    {
                        openapiParam.Schema.MinLength = minLength;
                    }

                    if (maxLength != null)
                    {
                        openapiParam.Schema.MaxLength = maxLength;
                    }

                    // Range [Range]
                    var rangeAttr = attributes.FirstOrDefault(p => p.AttributeType == typeof(RangeAttribute));
                    if (rangeAttr != null)
                    {
                        var rangeMin = (int)rangeAttr.ConstructorArguments[0].Value;
                        var rangeMax = (int)rangeAttr.ConstructorArguments[1].Value;

                        openapiParam.Schema.MinLength = rangeMin;
                        openapiParam.Schema.MaxLength = rangeMax;
                    }
                }
            }
        }
    }
}
