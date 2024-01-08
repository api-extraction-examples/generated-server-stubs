/*
 * Discovery Market Research
 *
 * <p>This API drives the <a href=\"https://discovery.gsa.gov\">Discovery Market Research Tool</a>. It contains information on the vendors that are part of the OASIS and OASIS Small Business contracting vehicles, such as their contracting history, their elligibility for contract awards, and their small business designations. To learn more about the tool, please visit <a href=\"https://discovery.gsa.gov\">Discovery</a> or see the README on our <a href=\"https://github.com/PSHCDevOps/discovery\">GitHub repository</a>.</p> <p><strong>Please note that the base path for this API is <code>https://api.data.gov/gsa/discovery/</code></strong></p> <p>It requires an API key, obtainable at <a href=\"http://api.data.gov/\">api.data.gov</a>. It must be passed in the <code>api_key</code> parameter with each request.</p>
 *
 * The version of the OpenAPI document: 0.1
 * Contact: discovery-18f@gsa.gov
 * Generated by: https://openapi-generator.tech
 */

using System.Linq;
using System.Text.RegularExpressions;
using Microsoft.OpenApi.Models;
using Swashbuckle.AspNetCore.SwaggerGen;

namespace Org.OpenAPITools.Filters
{
    /// <summary>
    /// BasePath Document Filter sets BasePath property of OpenAPI and removes it from the individual URL paths
    /// </summary>
    public class BasePathFilter : IDocumentFilter
    {
        /// <summary>
        /// Constructor
        /// </summary>
        /// <param name="basePath">BasePath to remove from Operations</param>
        public BasePathFilter(string basePath)
        {
            BasePath = basePath;
        }

        /// <summary>
        /// Gets the BasePath of the OpenAPI Doc
        /// </summary>
        /// <returns>The BasePath of the OpenAPI Doc</returns>
        public string BasePath { get; }

        /// <summary>
        /// Apply the filter
        /// </summary>
        /// <param name="openapiDoc">OpenApiDocument</param>
        /// <param name="context">FilterContext</param>
        public void Apply(OpenApiDocument openapiDoc, DocumentFilterContext context)
        {
            //openapiDoc.BasePath = BasePath;

            var pathsToModify = openapiDoc.Paths.Where(p => p.Key.StartsWith(BasePath)).ToList();

            foreach (var (key, value) in pathsToModify)
            {
                if (key.StartsWith(BasePath))
                {
                    var newKey = Regex.Replace(key, $"^{BasePath}", string.Empty);
                    openapiDoc.Paths.Remove(key);
                    openapiDoc.Paths.Add(newKey, value);
                }
            }
        }
    }
}
