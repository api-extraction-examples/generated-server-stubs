/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete an attribute and all its values in projects or packages.
* Delete an attribute and all its values in projects or packages.  This operation is the same as the one defined with [DELETE /attribute/{namespace}/{attribute_name}/_meta](#/Attributes/delete_attribute__namespace___attribute_name___meta) 
*
* attributeUnderscorename String The name of the attribute
* no response value expected for this operation
* */
const attributeNamespaceAttributeNameDELETE = ({ attributeUnderscorename }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        attributeUnderscorename,
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
* Delete an attribute and all its values in projects or packages.
* Delete an attribute and all its values in projects or packages.  This operation is the same as the one defined with [DELETE /attribute/{namespace}/{attribute_name}](#/Attributes/delete_attribute__namespace___attribute_name_) 
*
* no response value expected for this operation
* */
const attributeNamespaceAttributeNameMetaDELETE = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Shows attribute.
* Shows attribute.
*
* returns _attribute__namespace___attribute_name___meta_get_200_response
* */
const attributeNamespaceAttributeNameMetaGET = () => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
* Change attribute data. Create an attribute if it doesn't exist.
* This endpoint can be used for both, creating an attribute and updating it:   * If the attribute passed as parameter doesn't exist, it will create the attribute.   * If the attribute passed as parameter already exists, it will update the attribute.  This operation is the same as the one defined with [PUT](#/Attributes/put_attribute__namespace___attribute_name___meta). 
*
* body Object Attribute definition.
* no response value expected for this operation
* */
const attributeNamespaceAttributeNameMetaPOST = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
/**
* Change attribute data. Create an attribute if it doesn't exist.
* This endpoint can be used for both, creating an attribute and updating it:   * If the attribute passed as parameter doesn't exist, it will create the attribute.   * If the attribute passed as parameter already exists, it will update the attribute.  This operation is the same as the one defined with [POST](#/Attributes/post_attribute__namespace___attribute_name___meta). 
*
* body Object Attribute definition.
* no response value expected for this operation
* */
const attributeNamespaceAttributeNameMetaPUT = ({ body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
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
  attributeNamespaceAttributeNameDELETE,
  attributeNamespaceAttributeNameMetaDELETE,
  attributeNamespaceAttributeNameMetaGET,
  attributeNamespaceAttributeNameMetaPOST,
  attributeNamespaceAttributeNameMetaPUT,
};
