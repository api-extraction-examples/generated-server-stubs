/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* List all attribute namespaces.
* List all attribute namespaces.
*
* returns Object
* */
const attributeGET = () => new Promise(
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
* Delete an attribute namespace and all attributes below.
* Delete an attribute namespace and all attributes below.  This operation is the same as the one defined with [DELETE /attribute/{namespace}/_meta](#/Attributes/delete_attribute__namespace___meta). 
*
* returns Object
* */
const attributeNamespaceDELETE = () => new Promise(
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
* List all attributes below a namespace.
* List all attributes under a given attribute namespace.
*
* namespace String The namespace
* returns Object
* */
const attributeNamespaceGET = ({ namespace }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        namespace,
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
* Delete an attribute namespace and all attributes below.
* Delete an attribute namespace and all attributes below.  This operation is the same as the one defined with [DELETE /attribute/{namespace}](#/Attributes/delete_attribute__namespace_). 
*
* no response value expected for this operation
* */
const attributeNamespaceMetaDELETE = () => new Promise(
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
* Show attribute namespace.
* Shows attribute namespace.
*
* returns _attribute__namespace___meta_get_200_response
* */
const attributeNamespaceMetaGET = () => new Promise(
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
* Change attribute namespace. Create an attribute namespace if it doesn't exist.
* This endpoint can be used for both, creating an attribute namespace and updating it:   * If the attribute namespace passed as parameter doesn't exist, it will create the attribute namespace.   * If the attribute namespace passed as parameter already exists, it will update the namespace attribute.  This operation is the same as the one defined with [PUT](#/Attributes/put_attribute__namespace___meta). 
*
* body Object Attribute namespace definition.  XML Schema used for body validation: [attribute_namespace_meta.xsd](../schema/attribute_namespace_meta.xsd) 
* no response value expected for this operation
* */
const attributeNamespaceMetaPOST = ({ body }) => new Promise(
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
* Change attribute namespace. Create an attribute namespace if it doesn't exist.
* This endpoint can be used for both, creating an attribute namespace and updating it:   * If the attribute namespace passed as parameter doesn't exist, it will create the attribute namespace.   * If the attribute namespace passed as parameter already exists, it will update the namespace attribute.  This operation is the same as the one defined with [POST](#/Attributes/post_attribute__namespace___meta). 
*
* body Object Attribute namespace definition.  XML Schema used for body validation: [attribute_namespace_meta.xsd](../schema/attribute_namespace_meta.xsd) 
* no response value expected for this operation
* */
const attributeNamespaceMetaPUT = ({ body }) => new Promise(
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
  attributeGET,
  attributeNamespaceDELETE,
  attributeNamespaceGET,
  attributeNamespaceMetaDELETE,
  attributeNamespaceMetaGET,
  attributeNamespaceMetaPOST,
  attributeNamespaceMetaPUT,
};
