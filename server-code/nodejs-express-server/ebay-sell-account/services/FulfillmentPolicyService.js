/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This method creates a new fulfillment policy where the policy encapsulates seller's terms for fulfilling item purchases. Fulfillment policies include the shipment options that the seller offers to buyers.  <br/><br/>Each policy targets a specific eBay marketplace and a category group type, and you can create multiple policies for each combination. <br/><br/>A successful request returns the <b>getFulfillmentPolicy</b> URI to the new policy in the <b>Location</b> response header and the ID for the new policy is returned in the response payload.  <p class=\"tablenote\"><b>Tip:</b> For details on creating and using the business policies supported by the Account API, see <a href=\"/api-docs/sell/static/seller-accounts/business-policies.html\">eBay business policies</a>.</p>  <p><b>Using the eBay standard envelope service (eSE)</b></p>  <p>The eBay standard envelope service (eSE) is a domestic envelope service with tracking through eBay. This service applies to specific Trading Cards categories (not all categories are supported), and to Coins & Paper Money, Postcards, and Stamps. See <a href=\"/api-docs/sell/static/seller-accounts/using-the-ebay-standard-envelope-service.html\" target=\"_blank\">Using the eBay standard envelope (eSE) service</a>.</p>
*
* fulfillmentPolicyRequest FulfillmentPolicyRequest Request to create a seller account fulfillment policy.
* returns SetFulfillmentPolicyResponse
* */
const createFulfillmentPolicy = ({ fulfillmentPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fulfillmentPolicyRequest,
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
* This method deletes a fulfillment policy. Supply the ID of the policy you want to delete in the <b>fulfillmentPolicyId</b> path parameter.
*
* fulfillmentPolicyId String This path parameter specifies the ID of the fulfillment policy to delete.
* no response value expected for this operation
* */
const deleteFulfillmentPolicy = ({ fulfillmentPolicyId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fulfillmentPolicyId,
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
* This method retrieves all the fulfillment policies configured for the marketplace you specify using the <code>marketplace_id</code> query parameter.  <br/><br/><b>Marketplaces and locales</b>  <br/><br/>Get the correct policies for a marketplace that supports multiple locales using the <code>Content-Language</code> request header. For example, get the policies for the French locale of the Canadian marketplace by specifying <code>fr-CA</code> for the <code>Content-Language</code> header. Likewise, target the Dutch locale of the Belgium marketplace by setting <code>Content-Language: nl-BE</code>. For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\" target=\"_blank\">HTTP request headers</a>.
*
* marketplaceUnderscoreid String This query parameter specifies the eBay marketplace of the policies you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
* returns FulfillmentPolicyResponse
* */
const getFulfillmentPolicies = ({ marketplaceUnderscoreid }) => new Promise(
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
* This method retrieves the complete details of a fulfillment policy. Supply the ID of the policy you want to retrieve using the <b>fulfillmentPolicyId</b> path parameter.
*
* fulfillmentPolicyId String This path parameter specifies the ID of the fulfillment policy you want to retrieve.
* returns FulfillmentPolicy
* */
const getFulfillmentPolicy = ({ fulfillmentPolicyId }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fulfillmentPolicyId,
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
* This method retrieves the details for a specific fulfillment policy. In the request, supply both the policy <code>name</code> and its associated <code>marketplace_id</code> as query parameters.   <br/><br/><b>Marketplaces and locales</b>  <br/><br/>Get the correct policy for a marketplace that supports multiple locales using the <code>Content-Language</code> request header. For example, get a policy for the French locale of the Canadian marketplace by specifying <code>fr-CA</code> for the <code>Content-Language</code> header. Likewise, target the Dutch locale of the Belgium marketplace by setting <code>Content-Language: nl-BE</code>. For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\">HTTP request headers</a>.
*
* marketplaceUnderscoreid String This query parameter specifies the eBay marketplace of the policy you want to retrieve. For implementation help, refer to eBay API documentation at https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum
* name String This query parameter specifies the seller-defined name of the fulfillment policy you want to retrieve.
* returns FulfillmentPolicy
* */
const getFulfillmentPolicyByName = ({ marketplaceUnderscoreid, name }) => new Promise(
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
* This method updates an existing fulfillment policy. Specify the policy you want to update using the <b>fulfillment_policy_id</b> path parameter. Supply a complete policy payload with the updates you want to make; this call overwrites the existing policy with the new details specified in the payload.
*
* fulfillmentPolicyId String This path parameter specifies the ID of the fulfillment policy you want to update.
* fulfillmentPolicyRequest FulfillmentPolicyRequest Fulfillment policy request
* returns SetFulfillmentPolicyResponse
* */
const updateFulfillmentPolicy = ({ fulfillmentPolicyId, fulfillmentPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        fulfillmentPolicyId,
        fulfillmentPolicyRequest,
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
  createFulfillmentPolicy,
  deleteFulfillmentPolicy,
  getFulfillmentPolicies,
  getFulfillmentPolicy,
  getFulfillmentPolicyByName,
  updateFulfillmentPolicy,
};
