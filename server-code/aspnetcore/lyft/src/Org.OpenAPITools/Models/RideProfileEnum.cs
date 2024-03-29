/*
 * Lyft
 *
 * Drive your app to success with Lyft's API
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: api-support@lyft.com
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
        /// The payment profile which the user has picked for the ride
        /// </summary>
        /// <value>The payment profile which the user has picked for the ride</value>
        [TypeConverter(typeof(CustomEnumConverter<RideProfileEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum RideProfileEnum
        {
            
            /// <summary>
            /// Enum PersonalEnum for personal
            /// </summary>
            [EnumMember(Value = "personal")]
            PersonalEnum = 1,
            
            /// <summary>
            /// Enum BusinessEnum for business
            /// </summary>
            [EnumMember(Value = "business")]
            BusinessEnum = 2
        }
}
