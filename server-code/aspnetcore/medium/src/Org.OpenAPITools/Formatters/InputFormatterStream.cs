/*
 * Medium API
 *
 * Medium API helps you to quickly extract data from Medium's Website (https://medium.com).   You can gather data related to users, publications, articles (including its textual content), latest posts &amp; top writers within a topic/niche, etc… 
 *
 * The version of the OpenAPI document: 1.0
 * Contact: nishu@mediumapi.com
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