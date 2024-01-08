/*
 * Bills API
 *
 * API to get and search for information regarding Bills, their stages, associated amendments and publications.
 *
 * The version of the OpenAPI document: v1
 * Contact: softwareengineering@parliament.uk
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
        /// Gets or Sets OriginatingHouse
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<OriginatingHouse>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum OriginatingHouse
        {
            
            /// <summary>
            /// Enum AllEnum for All
            /// </summary>
            [EnumMember(Value = "All")]
            AllEnum = 1,
            
            /// <summary>
            /// Enum CommonsEnum for Commons
            /// </summary>
            [EnumMember(Value = "Commons")]
            CommonsEnum = 2,
            
            /// <summary>
            /// Enum LordsEnum for Lords
            /// </summary>
            [EnumMember(Value = "Lords")]
            LordsEnum = 3
        }
}
