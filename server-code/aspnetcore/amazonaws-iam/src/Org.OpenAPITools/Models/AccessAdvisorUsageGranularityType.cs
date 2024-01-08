/*
 * AWS Identity and Access Management
 *
 * <fullname>Identity and Access Management</fullname> <p>Identity and Access Management (IAM) is a web service for securely controlling access to Amazon Web Services services. With IAM, you can centrally manage users, security credentials such as access keys, and permissions that control which Amazon Web Services resources users and applications can access. For more information about IAM, see <a href=\"http://aws.amazon.com/iam/\">Identity and Access Management (IAM)</a> and the <a href=\"https://docs.aws.amazon.com/IAM/latest/UserGuide/\">Identity and Access Management User Guide</a>.</p>
 *
 * The version of the OpenAPI document: 2010-05-08
 * Contact: mike.ralphson@gmail.com
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
        /// Gets or Sets AccessAdvisorUsageGranularityType
        /// </summary>
        [TypeConverter(typeof(CustomEnumConverter<AccessAdvisorUsageGranularityType>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum AccessAdvisorUsageGranularityType
        {
            
            /// <summary>
            /// Enum SERVICELEVELEnum for SERVICE_LEVEL
            /// </summary>
            [EnumMember(Value = "SERVICE_LEVEL")]
            SERVICELEVELEnum = 1,
            
            /// <summary>
            /// Enum ACTIONLEVELEnum for ACTION_LEVEL
            /// </summary>
            [EnumMember(Value = "ACTION_LEVEL")]
            ACTIONLEVELEnum = 2
        }
}
