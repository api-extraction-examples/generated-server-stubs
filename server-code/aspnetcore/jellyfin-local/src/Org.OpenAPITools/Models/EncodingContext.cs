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
        /// Gets or Sets EncodingContext
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<EncodingContext>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum EncodingContext
        {
            
            /// <summary>
            /// Enum StreamingEnum for Streaming
            /// </summary>
            [EnumMember(Value = "Streaming")]
            StreamingEnum = 1,
            
            /// <summary>
            /// Enum StaticEnum for Static
            /// </summary>
            [EnumMember(Value = "Static")]
            StaticEnum = 2
        }
}