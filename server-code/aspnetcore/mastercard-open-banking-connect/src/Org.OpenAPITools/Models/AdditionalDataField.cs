/*
 * Open Banking - Payments initiation service
 *
 * Open Banking - Payments initiation service
 *
 * The version of the OpenAPI document: 1.16.0
 * Contact: apisupport@mastercard.com
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
        /// Additional ASPSP field Types to be returned
        /// </summary>
        /// <value>Additional ASPSP field Types to be returned</value>
        [TypeConverter(typeof(CustomEnumConverter<AdditionalDataField>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AdditionalDataField
        {
            
            /// <summary>
            /// Enum CapabilitiesEnum for capabilities
            /// </summary>
            [EnumMember(Value = "capabilities")]
            CapabilitiesEnum = 1,
            
            /// <summary>
            /// Enum LogoEnum for logo
            /// </summary>
            [EnumMember(Value = "logo")]
            LogoEnum = 2
        }
}
