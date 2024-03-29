/*
 * CircleCI REST API
 *
 * The CircleCI API is a RESTful, fully-featured API that allows you to do almost anything in CircleCI. You can access all information and trigger all actions. The only thing we don’t provide access to is billing functions, which must be done from the CircleCI web UI. 
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
        /// Gets or Sets Lifecycle
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<Lifecycle>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum Lifecycle
        {
            
            /// <summary>
            /// Enum QueuedEnum for queued
            /// </summary>
            [EnumMember(Value = "queued")]
            QueuedEnum = 1,
            
            /// <summary>
            /// Enum ScheduledEnum for scheduled
            /// </summary>
            [EnumMember(Value = "scheduled")]
            ScheduledEnum = 2,
            
            /// <summary>
            /// Enum NotRunEnum for not_run
            /// </summary>
            [EnumMember(Value = "not_run")]
            NotRunEnum = 3,
            
            /// <summary>
            /// Enum NotRunningEnum for not_running
            /// </summary>
            [EnumMember(Value = "not_running")]
            NotRunningEnum = 4,
            
            /// <summary>
            /// Enum RunningEnum for running
            /// </summary>
            [EnumMember(Value = "running")]
            RunningEnum = 5,
            
            /// <summary>
            /// Enum FinishedEnum for finished
            /// </summary>
            [EnumMember(Value = "finished")]
            FinishedEnum = 6
        }
}
