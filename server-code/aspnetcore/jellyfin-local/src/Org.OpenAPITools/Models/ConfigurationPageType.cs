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
        /// Enum ConfigurationPageType.
        /// </summary>
        /// <value>Enum ConfigurationPageType.</value>
        [TypeConverter(typeof(CustomEnumConverter<ConfigurationPageType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum ConfigurationPageType
        {
            
            /// <summary>
            /// Enum PluginConfigurationEnum for PluginConfiguration
            /// </summary>
            [EnumMember(Value = "PluginConfiguration")]
            PluginConfigurationEnum = 1,
            
            /// <summary>
            /// Enum NoneEnum for None
            /// </summary>
            [EnumMember(Value = "None")]
            NoneEnum = 2
        }
}
