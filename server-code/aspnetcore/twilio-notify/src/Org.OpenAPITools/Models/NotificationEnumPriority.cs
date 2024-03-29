/*
 * Twilio - Notify
 *
 * This is the public Twilio REST API.
 *
 * The version of the OpenAPI document: 1.52.0
 * Contact: support@twilio.com
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
        /// Gets or Sets notification_enum_priority
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<NotificationEnumPriority>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum NotificationEnumPriority
        {
            
            /// <summary>
            /// Enum HighEnum for high
            /// </summary>
            [EnumMember(Value = "high")]
            HighEnum = 1,
            
            /// <summary>
            /// Enum LowEnum for low
            /// </summary>
            [EnumMember(Value = "low")]
            LowEnum = 2
        }
}
