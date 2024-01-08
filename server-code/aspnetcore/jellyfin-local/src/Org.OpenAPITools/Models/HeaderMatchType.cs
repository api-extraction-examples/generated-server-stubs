/*
 * Jellyfin API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
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
        /// Gets or Sets HeaderMatchType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<HeaderMatchType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum HeaderMatchType
        {
            
            /// <summary>
            /// Enum EqualsEnum for Equals
            /// </summary>
            [EnumMember(Value = "Equals")]
            EqualsEnum = 1,
            
            /// <summary>
            /// Enum RegexEnum for Regex
            /// </summary>
            [EnumMember(Value = "Regex")]
            RegexEnum = 2,
            
            /// <summary>
            /// Enum SubstringEnum for Substring
            /// </summary>
            [EnumMember(Value = "Substring")]
            SubstringEnum = 3
        }
}