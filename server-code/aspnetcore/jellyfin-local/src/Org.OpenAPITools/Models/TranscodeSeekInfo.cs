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
        /// Gets or Sets TranscodeSeekInfo
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<TranscodeSeekInfo>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TranscodeSeekInfo
        {
            
            /// <summary>
            /// Enum AutoEnum for Auto
            /// </summary>
            [EnumMember(Value = "Auto")]
            AutoEnum = 1,
            
            /// <summary>
            /// Enum BytesEnum for Bytes
            /// </summary>
            [EnumMember(Value = "Bytes")]
            BytesEnum = 2
        }
}
