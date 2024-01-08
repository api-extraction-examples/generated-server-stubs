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
        /// Enum GroupRepeatMode.
        /// </summary>
        /// <value>Enum GroupRepeatMode.</value>
        [TypeConverter(typeof(CustomEnumConverter<GroupRepeatMode>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum GroupRepeatMode
        {
            
            /// <summary>
            /// Enum RepeatOneEnum for RepeatOne
            /// </summary>
            [EnumMember(Value = "RepeatOne")]
            RepeatOneEnum = 1,
            
            /// <summary>
            /// Enum RepeatAllEnum for RepeatAll
            /// </summary>
            [EnumMember(Value = "RepeatAll")]
            RepeatAllEnum = 2,
            
            /// <summary>
            /// Enum RepeatNoneEnum for RepeatNone
            /// </summary>
            [EnumMember(Value = "RepeatNone")]
            RepeatNoneEnum = 3
        }
}