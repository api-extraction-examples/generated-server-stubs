/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* This method creates a new custom policy in which a seller specifies their terms for complying with local governmental regulations. <br/><br/>Two Custom Policy types are supported: <ul><li>Product Compliance (PRODUCT_COMPLIANCE)</li> <li>Takeback (TAKE_BACK)</li></ul>Each Custom Policy targets a <b>policyType</b> and <b>eBay marketplace</b> combination. Multiple policies may be created as follows: <ul><li><b>Product Compliance</b>: a maximum of 10 policies per eBay marketplace may be created</li> <li><b>Takeback</b>: a maximum of 3 policies per eBay marketplace may be created</li></ul>A successful create policy call returns an HTTP status code of <b>201 Created</b> with the system-generated policy ID included in the <b>Location</b> response header.<br/><br/><b>Product Compliance Policy</b><br/><br/>Product Compliance policies disclose product information as required for regulatory compliance.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> A maximum of 10 Product Compliance policies per eBay marketplace may be created.</span> <br/><br/> <b>Takeback Policy</b><br/><br/>Takeback policies describe the seller's legal obligation to take back a previously purchased item when the buyer purchases a new one.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> A maximum of 3 Takeback policies per eBay marketplace may be created.</span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div>
*
* xEBAYCMARKETPLACEID String This header parameter specifies the eBay marketplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div>
* customPolicyCreateRequest CustomPolicyCreateRequest Request to create a new Custom Policy.
* returns Object
* */
const createCustomPolicy = ({ xEBAYCMARKETPLACEID, customPolicyCreateRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xEBAYCMARKETPLACEID,
        customPolicyCreateRequest,
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
* This method retrieves the list of custom policies specified by the <b>policy_types</b> query parameter for the selected eBay marketplace.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div><br/><br/>For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\" target=\"_blank\">HTTP request headers</a>.
*
* xEBAYCMARKETPLACEID String This header parameter specifies the eBay marketplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span></br><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div>
* policyUnderscoretypes String This query parameter specifies the type of custom policies to be returned.<br /><br />Multiple policy types may be requested in a single call by providing a comma-delimited set of all policy types to be returned.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> Omitting this query parameter from a request will also return policies of all policy types.</span><br/><br/>Two Custom Policy types are supported: <ul><li>Product Compliance (PRODUCT_COMPLIANCE)</li> <li>Takeback (TAKE_BACK)</li></ul> (optional)
* returns CustomPolicyResponse
* */
const getCustomPolicies = ({ xEBAYCMARKETPLACEID, policyUnderscoretypes }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        xEBAYCMARKETPLACEID,
        policyUnderscoretypes,
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
* This method retrieves the custom policy specified by the <b>custom_policy_id</b> path parameter for the selected eBay marketplace.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div><br/><br/>For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\" target=\"_blank\">HTTP request headers</a>.
*
* customUnderscorepolicyUnderscoreid String This path parameter is the unique custom policy identifier for the policy to be returned.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> This value is automatically assigned by the system when the policy is created.</span>
* xEBAYCMARKETPLACEID String This header parameter specifies the eBay marketplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div>
* returns CustomPolicy
* */
const getCustomPolicy = ({ customUnderscorepolicyUnderscoreid, xEBAYCMARKETPLACEID }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        customUnderscorepolicyUnderscoreid,
        xEBAYCMARKETPLACEID,
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
* This method updates an existing custom policy specified by the <b>custom_policy_id</b> path parameter for the selected marketplace. This method overwrites the policy's <b>Name</b>, <b>Label</b>, and <b>Description</b> fields. Therefore, the complete, current text of all three policy fields must be included in the request payload even when one or two of these fields will not actually be updated.<br/> <br/>For example, the value for the <b>Label</b> field is to be updated, but the <b>Name</b> and <b>Description</b> values will remain unchanged. The existing <b>Name</b> and <b>Description</b> values, as they are defined in the current policy, must also be passed in. <br/><br/>A successful policy update call returns an HTTP status code of <b>204 No Content</b>.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div><br/><br/>For details on header values, see <a href=\"/api-docs/static/rest-request-components.html#HTTP\">HTTP request headers</a>.
*
* customUnderscorepolicyUnderscoreid String This path parameter is the unique custom policy identifier for the policy to be returned.<br/><br/><span class=\"tablenote\"><strong>Note:</strong> This value is automatically assigned by the system when the policy is created.</span>
* xEBAYCMARKETPLACEID String This header parameter specifies the eBay marketplace for the custom policy that is being created. Supported values for this header can be found in the <a href=\"/api-docs/sell/account/types/ba:MarketplaceIdEnum\" target=\"_blank\">MarketplaceIdEnum</a> type definition.<br/> <br/> <span class=\"tablenote\"><strong>Note:</strong> The following eBay marketplaces support Custom Policies: <ul><li>Germany (EBAY_DE)</li> <li>Canada (EBAY_CA)</li> <li>Australia (EBAY_AU)</li> <li>United States (EBAY_US)</li> <li>France (EBAY_FR)</li></ul></span><br/><div class=\"msgbox_important\"><p class=\"msgbox_importantInDiv\" data-mc-autonum=\"&lt;b&gt;&lt;span style=&quot;color: #dd1e31;&quot; class=&quot;mcFormatColor&quot;&gt;Important! &lt;/span&gt;&lt;/b&gt;\"><span class=\"autonumber\"><span><b><span style=\"color: #dd1e31;\" class=\"mcFormatColor\">Important!</span></b></span></span>As a part of Digital Services Act (DSA) requirements, all custom policies will become global (and no longer marketplace-specific) on April 3, 2023. A seller will be able to apply any custom policy to listings on any eBay marketplace where they sell.<br/><br/>Due to this change, the X-EBAY-C-MARKETPLACE-ID request header is no longer relevant. If this header is passed in after April 3, it will just be ignored in all four methods.</p></div>
* customPolicyRequest CustomPolicyRequest Request to update a current custom policy.
* no response value expected for this operation
* */
const updateCustomPolicy = ({ customUnderscorepolicyUnderscoreid, xEBAYCMARKETPLACEID, customPolicyRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        customUnderscorepolicyUnderscoreid,
        xEBAYCMARKETPLACEID,
        customPolicyRequest,
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
  createCustomPolicy,
  getCustomPolicies,
  getCustomPolicy,
  updateCustomPolicy,
};
