/*
 * LaunchDarkly REST API
 *
 * Build custom integrations with the LaunchDarkly REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: support@launchdarkly.com
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
    /// 
    /// </summary>
    [DataContract]
    public partial class PostReviewApprovalRequestRequest : IEquatable<PostReviewApprovalRequestRequest>
    {
        /// <summary>
        /// comment will be included in audit log item for change.
        /// </summary>
        /// <value>comment will be included in audit log item for change.</value>
        /// <example>This is a comment string</example>
        [DataMember(Name="comment", EmitDefaultValue=false)]
        public string Comment { get; set; }


        /// <summary>
        /// One of approve, decline, or comment.
        /// </summary>
        /// <value>One of approve, decline, or comment.</value>
        [TypeConverter(typeof(CustomEnumConverter<KindEnum>))]
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum KindEnum
        {
            
            /// <summary>
            /// Enum ApproveEnum for approve
            /// </summary>
            [EnumMember(Value = "approve")]
            ApproveEnum = 1,
            
            /// <summary>
            /// Enum DeclineEnum for decline
            /// </summary>
            [EnumMember(Value = "decline")]
            DeclineEnum = 2,
            
            /// <summary>
            /// Enum CommentEnum for comment
            /// </summary>
            [EnumMember(Value = "comment")]
            CommentEnum = 3
        }

        /// <summary>
        /// One of approve, decline, or comment.
        /// </summary>
        /// <value>One of approve, decline, or comment.</value>
        /// <example>approve</example>
        [Required]
        [DataMember(Name="kind", EmitDefaultValue=true)]
        public KindEnum Kind { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class PostReviewApprovalRequestRequest {\n");
            sb.Append("  Comment: ").Append(Comment).Append("\n");
            sb.Append("  Kind: ").Append(Kind).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((PostReviewApprovalRequestRequest)obj);
        }

        /// <summary>
        /// Returns true if PostReviewApprovalRequestRequest instances are equal
        /// </summary>
        /// <param name="other">Instance of PostReviewApprovalRequestRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(PostReviewApprovalRequestRequest other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Comment == other.Comment ||
                    Comment != null &&
                    Comment.Equals(other.Comment)
                ) && 
                (
                    Kind == other.Kind ||
                    
                    Kind.Equals(other.Kind)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Comment != null)
                    hashCode = hashCode * 59 + Comment.GetHashCode();
                    
                    hashCode = hashCode * 59 + Kind.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(PostReviewApprovalRequestRequest left, PostReviewApprovalRequestRequest right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(PostReviewApprovalRequestRequest left, PostReviewApprovalRequestRequest right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}