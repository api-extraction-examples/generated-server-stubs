﻿/*
 * Open Build Service API
 *
 * The _Open Build Service API_ is a XML API.  To authenticate, use [HTTP basic authentication](https://en.wikipedia.org/wiki/Basic_access_authentication) by passing the _Authorization_ header in the form of `Authorization: Basic <credentials>`.  There is no API versioning as there is no need for it right now.  Only rudimentary rate limiting is implemented, so please be gentle when using the API concurrently, especially with potentially expensive operations. In case of abuse, we will limit/remove your access.  For command-line users, we recommend using [osc](https://github.com/openSUSE/osc) with its _api_ command to interact with the API. It's as simple as this example: `osc api /about` (_about_ is one of the endpoints documented below) 
 *
 * The version of the OpenAPI document: 2.10.50
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