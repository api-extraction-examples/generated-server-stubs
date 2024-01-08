/*
 * Account API
 *
 * The <b>Account API</b> gives sellers the ability to configure their eBay seller accounts, including the seller's policies (eBay business policies and seller-defined custom policies), opt in and out of eBay seller programs, configure sales tax tables, and get account information.  <br/><br/>For details on the availability of the methods in this API, see <a href=\"/api-docs/sell/account/overview.html#requirements\">Account API requirements and restrictions</a>.
 *
 * The version of the OpenAPI document: v1.9.0
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
    /// A container that defines the elements of error and warning messages.
    /// </summary>
    [DataContract]
    public partial class Error : IEquatable<Error>
    {
        /// <summary>
        /// The category type for this error or warning. It is a string that can have one of three values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Application&lt;/code&gt;: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service&#39;s business logic, system failures, or request errors from a dependency.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Business&lt;/code&gt;: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as \&quot;Seller does not ship item to Antarctica\&quot; or \&quot;Buyer ineligible to purchase an alcoholic item\&quot;. Business errors are not syntactical input errors.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Request&lt;/code&gt;: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.&lt;/li&gt;&lt;/ul&gt;
        /// </summary>
        /// <value>The category type for this error or warning. It is a string that can have one of three values:&lt;ul&gt;&lt;li&gt;&lt;code&gt;Application&lt;/code&gt;: Indicates an exception or error occurred in the application code or at runtime. Examples include catching an exception in a service&#39;s business logic, system failures, or request errors from a dependency.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Business&lt;/code&gt;: Used when your service or a dependent service refused to continue processing on the resource because of a business rule violation such as \&quot;Seller does not ship item to Antarctica\&quot; or \&quot;Buyer ineligible to purchase an alcoholic item\&quot;. Business errors are not syntactical input errors.&lt;/li&gt;&lt;li&gt;&lt;code&gt;Request&lt;/code&gt;: Used when there is anything wrong with the request, such as authentication, syntactical errors, rate limiting or missing headers, bad HTTP header values, and so on.&lt;/li&gt;&lt;/ul&gt;</value>
        [DataMember(Name="category", EmitDefaultValue=false)]
        public string Category { get; set; }

        /// <summary>
        /// Name of the domain ,or primary system, of the service or application where the error occurred.
        /// </summary>
        /// <value>Name of the domain ,or primary system, of the service or application where the error occurred.</value>
        [DataMember(Name="domain", EmitDefaultValue=false)]
        public string Domain { get; set; }

        /// <summary>
        /// A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.
        /// </summary>
        /// <value>A positive integer that uniquely identifies the specific error condition that occurred. Your application can use error codes as identifiers in your customized error-handling algorithms.</value>
        [DataMember(Name="errorId", EmitDefaultValue=true)]
        public int ErrorId { get; set; }

        /// <summary>
        /// Identifies specific request elements associated with the error, if any. inputRefId&#39;s response is format specific. For JSON, use &lt;i&gt;JSONPath&lt;/i&gt; notation.
        /// </summary>
        /// <value>Identifies specific request elements associated with the error, if any. inputRefId&#39;s response is format specific. For JSON, use &lt;i&gt;JSONPath&lt;/i&gt; notation.</value>
        [DataMember(Name="inputRefIds", EmitDefaultValue=false)]
        public List<string> InputRefIds { get; set; }

        /// <summary>
        /// A more detailed explanation of the error than given in the &lt;code&gt;message&lt;/code&gt; error field.
        /// </summary>
        /// <value>A more detailed explanation of the error than given in the &lt;code&gt;message&lt;/code&gt; error field.</value>
        [DataMember(Name="longMessage", EmitDefaultValue=false)]
        public string LongMessage { get; set; }

        /// <summary>
        /// Information on how to correct the problem, in the end user&#39;s terms and language where applicable. Its value is at most 50 characters long. If applicable, the value is localized in the end user&#39;s requested locale.
        /// </summary>
        /// <value>Information on how to correct the problem, in the end user&#39;s terms and language where applicable. Its value is at most 50 characters long. If applicable, the value is localized in the end user&#39;s requested locale.</value>
        [DataMember(Name="message", EmitDefaultValue=false)]
        public string Message { get; set; }

        /// <summary>
        /// Identifies specific response elements associated with the error, if any. Path format is the same as &lt;code&gt;inputRefId&lt;/code&gt;.
        /// </summary>
        /// <value>Identifies specific response elements associated with the error, if any. Path format is the same as &lt;code&gt;inputRefId&lt;/code&gt;.</value>
        [DataMember(Name="outputRefIds", EmitDefaultValue=false)]
        public List<string> OutputRefIds { get; set; }

        /// <summary>
        /// This optional list of name/value pairs that contain context-specific &lt;code&gt;ErrorParameter&lt;/code&gt; objects, with each item in the list being a parameter (or input field name) that caused an error condition. Each &lt;code&gt;ErrorParameter&lt;/code&gt; object consists of two fields, a &lt;code&gt;name&lt;/code&gt; and a &lt;code&gt;value&lt;/code&gt;.
        /// </summary>
        /// <value>This optional list of name/value pairs that contain context-specific &lt;code&gt;ErrorParameter&lt;/code&gt; objects, with each item in the list being a parameter (or input field name) that caused an error condition. Each &lt;code&gt;ErrorParameter&lt;/code&gt; object consists of two fields, a &lt;code&gt;name&lt;/code&gt; and a &lt;code&gt;value&lt;/code&gt;.</value>
        [DataMember(Name="parameters", EmitDefaultValue=false)]
        public List<ErrorParameter> Parameters { get; set; }

        /// <summary>
        /// If present, indicates the subsystem in which the error occurred.
        /// </summary>
        /// <value>If present, indicates the subsystem in which the error occurred.</value>
        [DataMember(Name="subdomain", EmitDefaultValue=false)]
        public string Subdomain { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Error {\n");
            sb.Append("  Category: ").Append(Category).Append("\n");
            sb.Append("  Domain: ").Append(Domain).Append("\n");
            sb.Append("  ErrorId: ").Append(ErrorId).Append("\n");
            sb.Append("  InputRefIds: ").Append(InputRefIds).Append("\n");
            sb.Append("  LongMessage: ").Append(LongMessage).Append("\n");
            sb.Append("  Message: ").Append(Message).Append("\n");
            sb.Append("  OutputRefIds: ").Append(OutputRefIds).Append("\n");
            sb.Append("  Parameters: ").Append(Parameters).Append("\n");
            sb.Append("  Subdomain: ").Append(Subdomain).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Error)obj);
        }

        /// <summary>
        /// Returns true if Error instances are equal
        /// </summary>
        /// <param name="other">Instance of Error to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Error other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Category == other.Category ||
                    Category != null &&
                    Category.Equals(other.Category)
                ) && 
                (
                    Domain == other.Domain ||
                    Domain != null &&
                    Domain.Equals(other.Domain)
                ) && 
                (
                    ErrorId == other.ErrorId ||
                    
                    ErrorId.Equals(other.ErrorId)
                ) && 
                (
                    InputRefIds == other.InputRefIds ||
                    InputRefIds != null &&
                    other.InputRefIds != null &&
                    InputRefIds.SequenceEqual(other.InputRefIds)
                ) && 
                (
                    LongMessage == other.LongMessage ||
                    LongMessage != null &&
                    LongMessage.Equals(other.LongMessage)
                ) && 
                (
                    Message == other.Message ||
                    Message != null &&
                    Message.Equals(other.Message)
                ) && 
                (
                    OutputRefIds == other.OutputRefIds ||
                    OutputRefIds != null &&
                    other.OutputRefIds != null &&
                    OutputRefIds.SequenceEqual(other.OutputRefIds)
                ) && 
                (
                    Parameters == other.Parameters ||
                    Parameters != null &&
                    other.Parameters != null &&
                    Parameters.SequenceEqual(other.Parameters)
                ) && 
                (
                    Subdomain == other.Subdomain ||
                    Subdomain != null &&
                    Subdomain.Equals(other.Subdomain)
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
                    if (Category != null)
                    hashCode = hashCode * 59 + Category.GetHashCode();
                    if (Domain != null)
                    hashCode = hashCode * 59 + Domain.GetHashCode();
                    
                    hashCode = hashCode * 59 + ErrorId.GetHashCode();
                    if (InputRefIds != null)
                    hashCode = hashCode * 59 + InputRefIds.GetHashCode();
                    if (LongMessage != null)
                    hashCode = hashCode * 59 + LongMessage.GetHashCode();
                    if (Message != null)
                    hashCode = hashCode * 59 + Message.GetHashCode();
                    if (OutputRefIds != null)
                    hashCode = hashCode * 59 + OutputRefIds.GetHashCode();
                    if (Parameters != null)
                    hashCode = hashCode * 59 + Parameters.GetHashCode();
                    if (Subdomain != null)
                    hashCode = hashCode * 59 + Subdomain.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Error left, Error right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Error left, Error right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}