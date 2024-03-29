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
        /// Gets or Sets Status
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<Status>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum Status
        {
            
            /// <summary>
            /// Enum RetriedEnum for retried
            /// </summary>
            [EnumMember(Value = "retried")]
            RetriedEnum = 1,
            
            /// <summary>
            /// Enum CanceledEnum for canceled
            /// </summary>
            [EnumMember(Value = "canceled")]
            CanceledEnum = 2,
            
            /// <summary>
            /// Enum InfrastructureFailEnum for infrastructure_fail
            /// </summary>
            [EnumMember(Value = "infrastructure_fail")]
            InfrastructureFailEnum = 3,
            
            /// <summary>
            /// Enum TimedoutEnum for timedout
            /// </summary>
            [EnumMember(Value = "timedout")]
            TimedoutEnum = 4,
            
            /// <summary>
            /// Enum NotRunEnum for not_run
            /// </summary>
            [EnumMember(Value = "not_run")]
            NotRunEnum = 5,
            
            /// <summary>
            /// Enum RunningEnum for running
            /// </summary>
            [EnumMember(Value = "running")]
            RunningEnum = 6,
            
            /// <summary>
            /// Enum FailedEnum for failed
            /// </summary>
            [EnumMember(Value = "failed")]
            FailedEnum = 7,
            
            /// <summary>
            /// Enum QueuedEnum for queued
            /// </summary>
            [EnumMember(Value = "queued")]
            QueuedEnum = 8,
            
            /// <summary>
            /// Enum ScheduledEnum for scheduled
            /// </summary>
            [EnumMember(Value = "scheduled")]
            ScheduledEnum = 9,
            
            /// <summary>
            /// Enum NotRunningEnum for not_running
            /// </summary>
            [EnumMember(Value = "not_running")]
            NotRunningEnum = 10,
            
            /// <summary>
            /// Enum NoTestsEnum for no_tests
            /// </summary>
            [EnumMember(Value = "no_tests")]
            NoTestsEnum = 11,
            
            /// <summary>
            /// Enum FixedEnum for fixed
            /// </summary>
            [EnumMember(Value = "fixed")]
            FixedEnum = 12,
            
            /// <summary>
            /// Enum SuccessEnum for success
            /// </summary>
            [EnumMember(Value = "success")]
            SuccessEnum = 13
        }
}
