/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Update custom field value
* Updates the value of a custom field on one or more issues. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
*
* fieldIdOrKey String The ID or key of the custom field. For example, `customfield_10010`.
* customFieldValueUpdateDetails CustomFieldValueUpdateDetails 
* generateChangelog Boolean Whether to generate a changelog for this update. (optional)
* returns oas_any_type_not_mapped
* */
const updateCustomFieldValue = ({ fieldIdOrKey, customFieldValueUpdateDetails, generateChangelog }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fieldIdOrKey,
        customFieldValueUpdateDetails,
        generateChangelog,
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
* Update custom fields
* Updates the value of one or more custom fields on one or more issues. Combinations of custom field and issue should be unique within the request. Custom fields can only be updated by the Forge app that created them.  **[Permissions](#permissions) required:** Only the app that created the custom field can update its values with this operation.
*
* multipleCustomFieldValuesUpdateDetails MultipleCustomFieldValuesUpdateDetails 
* generateChangelog Boolean Whether to generate a changelog for this update. (optional)
* returns oas_any_type_not_mapped
* */
const updateMultipleCustomFieldValues = ({ multipleCustomFieldValuesUpdateDetails, generateChangelog }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        multipleCustomFieldValuesUpdateDetails,
        generateChangelog,
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
  updateCustomFieldValue,
  updateMultipleCustomFieldValues,
};
