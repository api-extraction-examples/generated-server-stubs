/*
 * Intel Product Catalogue Service
 *
 * This is the documentation for PIM Micro services. In order to use this tool you need to have Basic Auth credentials and a client id. If you dont have one, please make sure to request one by sending an email to the PIM MS team: [pim.360.team@intel.com](mailto:pim.360.team@intel.com?subject=PIMServices)
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: pim.360.team@intel.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.ComponentModel;
using System.Globalization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Converters
{
    /// <summary>
    /// Custom string to enum converter
    /// </summary>
    public class CustomEnumConverter<T> : TypeConverter
    {
        /// <summary>
        /// Determine if we can convert a type to an enum
        /// </summary>
        /// <param name="context"></param>
        /// <param name="sourceType"></param>
        /// <returns></returns>
        public override bool CanConvertFrom(ITypeDescriptorContext context, Type sourceType)
        {
            return sourceType == typeof(string) || base.CanConvertFrom(context, sourceType);
        }

        /// <summary>
        /// Convert from a type value to an enum
        /// </summary>
        /// <param name="context"></param>
        /// <param name="culture"></param>
        /// <param name="value"></param>
        /// <returns></returns>
        public override object ConvertFrom(ITypeDescriptorContext context, CultureInfo culture, object value)
        {
            var s = value as string;
            if (string.IsNullOrEmpty(s))
            {
                return null;
            }

            return JsonConvert.DeserializeObject<T>(@"""" + value + @"""");
        }
    }
}
