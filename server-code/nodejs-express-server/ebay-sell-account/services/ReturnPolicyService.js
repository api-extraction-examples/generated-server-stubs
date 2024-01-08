/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This method creates a new return policy where the policy encapsulates seller's terms for returning items.  <br/><br/>Each policy targets a specific marketplace, and you can create multiple policies for each marketplace. Return policies are not applicable to motor-vehicle listings.<br/><br/>A successful request returns the <b>getReturnPolicy</b> URI to the new policy in the <b>Location</b> response header and the ID for the new policy is returned in the response payload.  <p class=\"tablenote\"><b>Tip:</b> For details on creating and using the business policies supported by the Account API, see <a href=\"/api-docs/sell/static/seller-accounts/business-policies.html\">eBay business policies</a>.</p>
*
* returnPolicyRequest ReturnPolicyRequest Return policy request
* returns SetReturnPolicyResponse
* */
const createReturnPolicy = ({ returnPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        returnPolicyRequest,
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
* This method deletes a return policy. Supply the ID of the policy you want to delete in the <b>returnPolicyId</b> path parameter.
*
* returnUnderscorepolicyUnderscoreid String This path parameter specifies the ID of the return policy you want to delete.
* no response value expected for this operation
* */
const deleteReturnPolicy = ({ returnUnderscorepolicyUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        returnUnderscorepolicyUnderscoreid,
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
* This method retrieves all the return policies configured for the marketplace you specify using the <code>marketplace_id</code> query parameter.  <br/><br/><b>Marketplaces and locales</b>  <br/><br/>Get the correct policies for a marketplace that supports multiple locales using the <code>Content-Language</code> request header. For example, get the policies for the French locale of the Canadian marketplace by specifying <code>fr-CA</code> for the <code>Content-Language</code> header. Likewise, target the Dutch locale of the Belgium marketplace by setting <code>Content-Language: nl-BE</code>. For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\" target=\"_blank\">HTTP request headers</a>.
*
* marketplaceUnderscoreid String This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
* returns ReturnPolicyResponse
* */
const getReturnPolicies = ({ marketplaceUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        marketplaceUnderscoreid,
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
* This method retrieves the complete details of the return policy specified by the <b>returnPolicyId</b> path parameter.
*
* returnUnderscorepolicyUnderscoreid String This path parameter specifies the of the return policy you want to retrieve.
* returns ReturnPolicy
* */
const getReturnPolicy = ({ returnUnderscorepolicyUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        returnUnderscorepolicyUnderscoreid,
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
* This method retrieves the details of a specific return policy. Supply both the policy <code>name</code> and its associated <code>marketplace_id</code> in the request query parameters.   <br/><br/><b>Marketplaces and locales</b>  <br/><br/>Get the correct policy for a marketplace that supports multiple locales using the <code>Content-Language</code> request header. For example, get a policy for the French locale of the Canadian marketplace by specifying <code>fr-CA</code> for the <code>Content-Language</code> header. Likewise, target the Dutch locale of the Belgium marketplace by setting <code>Content-Language: nl-BE</code>. For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\">HTTP request headers</a>.
*
* marketplaceUnderscoreid String This query parameter specifies the ID of the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
* name String This query parameter specifies the seller-defined name of the return policy you want to retrieve.
* returns ReturnPolicy
* */
const getReturnPolicyByName = ({ marketplaceUnderscoreid, name }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        marketplaceUnderscoreid,
        name,
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
* This method updates an existing return policy. Specify the policy you want to update using the <b>return_policy_id</b> path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
*
* returnUnderscorepolicyUnderscoreid String This path parameter specifies the ID of the return policy you want to update.
* returnPolicyRequest ReturnPolicyRequest Container for a return policy request.
* returns SetReturnPolicyResponse
* */
const updateReturnPolicy = ({ returnUnderscorepolicyUnderscoreid, returnPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        returnUnderscorepolicyUnderscoreid,
        returnPolicyRequest,
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
  createReturnPolicy,
  deleteReturnPolicy,
  getReturnPolicies,
  getReturnPolicy,
  getReturnPolicyByName,
  updateReturnPolicy,
};
