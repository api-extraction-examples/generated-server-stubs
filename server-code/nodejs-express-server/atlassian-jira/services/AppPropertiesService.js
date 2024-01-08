/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete app property
* Deletes an app's property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request.
*
* addonKey String The key of the app, as defined in its descriptor.
* propertyKey String The key of the property.
* no response value expected for this operation
* */
const addonPropertiesResource.deleteAddonProperty_delete = ({ addonKey, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        addonKey,
        propertyKey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get app properties
* Gets all the properties of an app.  **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).
*
* addonKey String The key of the app, as defined in its descriptor.
* returns PropertyKeys
* */
const addonPropertiesResource.getAddonProperties_get = ({ addonKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        addonKey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Get app property
* Returns the key and value of an app's property.  **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request. Additionally, Forge apps published on the Marketplace can access properties of Connect apps they were [migrated from](https://developer.atlassian.com/platform/forge/build-a-connect-on-forge-app/).
*
* addonKey String The key of the app, as defined in its descriptor.
* propertyKey String The key of the property.
* returns EntityProperty
* */
const addonPropertiesResource.getAddonProperty_get = ({ addonKey, propertyKey }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        addonKey,
        propertyKey,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);
/**
* Set app property
* Sets the value of an app's property. Use this resource to store custom data for your app.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  **[Permissions](#permissions) required:** Only a Connect app whose key matches `addonKey` can make this request.
*
* addonKey String The key of the app, as defined in its descriptor.
* propertyKey String The key of the property.
* body oas_any_type_not_mapped 
* returns OperationMessage
* */
const addonPropertiesResource.putAddonProperty_put = ({ addonKey, propertyKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        addonKey,
        propertyKey,
        body,
      }));
    } catch (e) {
      reject(Service.rejectResponse(
        e.message || 'Invalid input',
        e.status || 405,
      ));
    }
  },
);

module.exports = {
  addonPropertiesResource.deleteAddonProperty_delete,
  addonPropertiesResource.getAddonProperties_get,
  addonPropertiesResource.getAddonProperty_get,
  addonPropertiesResource.putAddonProperty_put,
};
