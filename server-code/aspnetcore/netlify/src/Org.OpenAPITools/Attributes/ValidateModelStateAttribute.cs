/*
 * Netlify's API documentation
 *
 * Netlify is a hosting service for the programmable web. It understands your documents and provides an API to handle atomic deploys of websites, manage form submissions, inject JavaScript snippets, and much more. This is a REST-style API that uses JSON for serialization and OAuth 2 for authentication.  This document is an OpenAPI reference for the Netlify API that you can explore. For more detailed instructions for common uses, please visit the [online documentation](https://www.netlify.com/docs/api/). Visit our Community forum to join the conversation about [understanding and using Netlify’s API](https://community.netlify.com/t/common-issue-understanding-and-using-netlifys-api/160).  Additionally, we have two API clients for your convenience: - [Go Client](https://github.com/netlify/open-api#go-client) - [JS Client](https://github.com/netlify/build/tree/main/packages/js-client)
 *
 * The version of the OpenAPI document: 2.16.0
 * 
 * Generated by: https://openapi-generator.tech
 */

using System.ComponentModel.DataAnnotations;
using System.Reflection;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Controllers;
using Microsoft.AspNetCore.Mvc.Filters;
using Microsoft.AspNetCore.Mvc.ModelBinding;

namespace Org.OpenAPITools.Attributes
{
    /// <summary>
    /// Model state validation attribute
    /// </summary>
    public class ValidateModelStateAttribute : ActionFilterAttribute
    {
        /// <summary>
        /// Called before the action method is invoked
        /// </summary>
        /// <param name="context"></param>
        public override void OnActionExecuting(ActionExecutingContext context)
        {
            // Per https://blog.markvincze.com/how-to-validate-action-parameters-with-dataannotation-attributes/
            if (context.ActionDescriptor is ControllerActionDescriptor descriptor)
            {
                foreach (var parameter in descriptor.MethodInfo.GetParameters())
                {
                    object args = null;
                    if (context.ActionArguments.ContainsKey(parameter.Name))
                    {
                        args = context.ActionArguments[parameter.Name];
                    }

                    ValidateAttributes(parameter, args, context.ModelState);
                }
            }

            if (!context.ModelState.IsValid)
            {
                context.Result = new BadRequestObjectResult(context.ModelState);
            }
        }

        private void ValidateAttributes(ParameterInfo parameter, object args, ModelStateDictionary modelState)
        {
            foreach (var attributeData in parameter.CustomAttributes)
            {
                var attributeInstance = parameter.GetCustomAttribute(attributeData.AttributeType);

                if (attributeInstance is ValidationAttribute validationAttribute)
                {
                    var isValid = validationAttribute.IsValid(args);
                    if (!isValid)
                    {
                        modelState.AddModelError(parameter.Name, validationAttribute.FormatErrorMessage(parameter.Name));
                    }
                }
            }
        }
    }
}