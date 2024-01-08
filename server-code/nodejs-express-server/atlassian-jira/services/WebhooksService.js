/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Delete webhooks by ID
* Removes webhooks by ID. Only webhooks registered by the calling app are removed. If webhooks created by other apps are specified, they are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
*
* containerForWebhookIDs ContainerForWebhookIDs 
* no response value expected for this operation
* */
const deleteWebhookById = ({ containerForWebhookIDs }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        containerForWebhookIDs,
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
* Get dynamic webhooks for app
* Returns a [paginated](#pagination) list of the webhooks registered by the calling app.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
*
* startAt Long The index of the first item to return in a page of results (page offset). (optional)
* maxResults Integer The maximum number of items to return per page. (optional)
* returns PageBeanWebhook
* */
const getDynamicWebhooksForApp = ({ startAt, maxResults }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        startAt,
        maxResults,
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
* Get failed webhooks
* Returns webhooks that have recently failed to be delivered to the requesting app after the maximum number of retries.  After 72 hours the failure may no longer be returned by this operation.  The oldest failure is returned first.  This method uses a cursor-based pagination. To request the next page use the failure time of the last webhook on the list as the `failedAfter` value or use the URL provided in `next`.  **[Permissions](#permissions) required:** Only [Connect apps](https://developer.atlassian.com/cloud/jira/platform/index/#connect-apps) can use this operation.
*
* maxResults Integer The maximum number of webhooks to return per page. If obeying the maxResults directive would result in records with the same failure time being split across pages, the directive is ignored and all records with the same failure time included on the page. (optional)
* after Long The time after which any webhook failure must have occurred for the record to be returned, expressed as milliseconds since the UNIX epoch. (optional)
* returns FailedWebhooks
* */
const getFailedWebhooks = ({ maxResults, after }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        maxResults,
        after,
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
* Extend webhook life
* Extends the life of webhook. Webhooks registered through the REST API expire after 30 days. Call this operation to keep them alive.  Unrecognized webhook IDs (those that are not found or belong to other apps) are ignored.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
*
* containerForWebhookIDs ContainerForWebhookIDs 
* returns WebhooksExpirationDate
* */
const refreshWebhooks = ({ containerForWebhookIDs }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        containerForWebhookIDs,
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
* Register dynamic webhooks
* Registers webhooks.  **NOTE:** for non-public OAuth apps, webhooks are delivered only if there is a match between the app owner and the user who registered a dynamic webhook.  **[Permissions](#permissions) required:** Only [Connect](https://developer.atlassian.com/cloud/jira/platform/#connect-apps) and [OAuth 2.0](https://developer.atlassian.com/cloud/jira/platform/oauth-2-3lo-apps) apps can use this operation.
*
* webhookRegistrationDetails WebhookRegistrationDetails 
* returns ContainerForRegisteredWebhooks
* */
const registerDynamicWebhooks = ({ webhookRegistrationDetails }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        webhookRegistrationDetails,
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
  deleteWebhookById,
  getDynamicWebhooksForApp,
  getFailedWebhooks,
  refreshWebhooks,
  registerDynamicWebhooks,
};
