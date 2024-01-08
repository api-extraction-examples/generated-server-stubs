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
using System.IO;
using System.Threading.Tasks;
using Microsoft.AspNetCore.Mvc.Formatters;

namespace Org.OpenAPITools.Formatters
{
    /// <inheritdoc />
    public class InputFormatterStream : InputFormatter
    {
        /// <inheritdoc />
        public InputFormatterStream()
        {
            SupportedMediaTypes.Add("application/octet-stream");
            SupportedMediaTypes.Add("image/jpeg");
        }

        /// <inheritdoc />
        public override Task<InputFormatterResult> ReadRequestBodyAsync(InputFormatterContext context)
        {
            return InputFormatterResult.SuccessAsync(context.HttpContext.Request.Body);
        }

        /// <inheritdoc />
        protected override bool CanReadType(Type type)
        {
            if (type == typeof(Stream))
            {
                return true;
            }

            return false;
        }
    }
}