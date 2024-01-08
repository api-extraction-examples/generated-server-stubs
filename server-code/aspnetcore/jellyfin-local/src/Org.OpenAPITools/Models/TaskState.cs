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
        /// Enum TaskState.
        /// </summary>
        /// <value>Enum TaskState.</value>
        [TypeConverter(typeof(CustomEnumConverter<TaskState>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum TaskState
        {
            
            /// <summary>
            /// Enum IdleEnum for Idle
            /// </summary>
            [EnumMember(Value = "Idle")]
            IdleEnum = 1,
            
            /// <summary>
            /// Enum CancellingEnum for Cancelling
            /// </summary>
            [EnumMember(Value = "Cancelling")]
            CancellingEnum = 2,
            
            /// <summary>
            /// Enum RunningEnum for Running
            /// </summary>
            [EnumMember(Value = "Running")]
            RunningEnum = 3
        }
}