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
        /// Enum ChannelType.
        /// </summary>
        /// <value>Enum ChannelType.</value>
        [TypeConverter(typeof(CustomEnumConverter<ChannelType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ChannelType
        {
            
            /// <summary>
            /// Enum TVEnum for TV
            /// </summary>
            [EnumMember(Value = "TV")]
            TVEnum = 1,
            
            /// <summary>
            /// Enum RadioEnum for Radio
            /// </summary>
            [EnumMember(Value = "Radio")]
            RadioEnum = 2
        }
}