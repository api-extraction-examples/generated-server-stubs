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
        /// An enum representing the sorting order.
        /// </summary>
        /// <value>An enum representing the sorting order.</value>
        [TypeConverter(typeof(CustomEnumConverter<SortOrder>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum SortOrder
        {
            
            /// <summary>
            /// Enum AscendingEnum for Ascending
            /// </summary>
            [EnumMember(Value = "Ascending")]
            AscendingEnum = 1,
            
            /// <summary>
            /// Enum DescendingEnum for Descending
            /// </summary>
            [EnumMember(Value = "Descending")]
            DescendingEnum = 2
        }
}
