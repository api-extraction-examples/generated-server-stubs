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
        /// Gets or Sets ProfileConditionType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<ProfileConditionType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ProfileConditionType
        {
            
            /// <summary>
            /// Enum EqualsEnum for Equals
            /// </summary>
            [EnumMember(Value = "Equals")]
            EqualsEnum = 1,
            
            /// <summary>
            /// Enum NotEqualsEnum for NotEquals
            /// </summary>
            [EnumMember(Value = "NotEquals")]
            NotEqualsEnum = 2,
            
            /// <summary>
            /// Enum LessThanEqualEnum for LessThanEqual
            /// </summary>
            [EnumMember(Value = "LessThanEqual")]
            LessThanEqualEnum = 3,
            
            /// <summary>
            /// Enum GreaterThanEqualEnum for GreaterThanEqual
            /// </summary>
            [EnumMember(Value = "GreaterThanEqual")]
            GreaterThanEqualEnum = 4,
            
            /// <summary>
            /// Enum EqualsAnyEnum for EqualsAny
            /// </summary>
            [EnumMember(Value = "EqualsAny")]
            EqualsAnyEnum = 5
        }
}