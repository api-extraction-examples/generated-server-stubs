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
        /// Gets or Sets SubtitleDeliveryMethod
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<SubtitleDeliveryMethod>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SubtitleDeliveryMethod
        {
            
            /// <summary>
            /// Enum EncodeEnum for Encode
            /// </summary>
            [EnumMember(Value = "Encode")]
            EncodeEnum = 1,
            
            /// <summary>
            /// Enum EmbedEnum for Embed
            /// </summary>
            [EnumMember(Value = "Embed")]
            EmbedEnum = 2,
            
            /// <summary>
            /// Enum ExternalEnum for External
            /// </summary>
            [EnumMember(Value = "External")]
            ExternalEnum = 3,
            
            /// <summary>
            /// Enum HlsEnum for Hls
            /// </summary>
            [EnumMember(Value = "Hls")]
            HlsEnum = 4
        }
}