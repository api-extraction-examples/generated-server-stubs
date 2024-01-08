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
        /// An enum representing a subtitle playback mode.
        /// </summary>
        /// <value>An enum representing a subtitle playback mode.</value>
        [TypeConverter(typeof(CustomEnumConverter<SubtitlePlaybackMode>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SubtitlePlaybackMode
        {
            
            /// <summary>
            /// Enum DefaultEnum for Default
            /// </summary>
            [EnumMember(Value = "Default")]
            DefaultEnum = 1,
            
            /// <summary>
            /// Enum AlwaysEnum for Always
            /// </summary>
            [EnumMember(Value = "Always")]
            AlwaysEnum = 2,
            
            /// <summary>
            /// Enum OnlyForcedEnum for OnlyForced
            /// </summary>
            [EnumMember(Value = "OnlyForced")]
            OnlyForcedEnum = 3,
            
            /// <summary>
            /// Enum NoneEnum for None
            /// </summary>
            [EnumMember(Value = "None")]
            NoneEnum = 4,
            
            /// <summary>
            /// Enum SmartEnum for Smart
            /// </summary>
            [EnumMember(Value = "Smart")]
            SmartEnum = 5
        }
}
