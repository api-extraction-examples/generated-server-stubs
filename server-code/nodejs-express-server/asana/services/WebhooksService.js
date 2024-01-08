/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Establish a webhook
* Establishing a webhook is a two-part process. First, a simple HTTP POST request initiates the creation similar to creating any other resource.  Next, in the middle of this request comes the confirmation handshake. When a webhook is created, we will send a test POST to the target with an `X-Hook-Secret` header. The target must respond with a `200 OK` or `204 No Content` and a matching `X-Hook-Secret` header to confirm that this webhook subscription is indeed expected. We strongly recommend storing this secret to be used to verify future webhook event signatures.  The POST request to create the webhook will then return with the status of the request. If you do not acknowledge the webhook’s confirmation handshake it will fail to setup, and you will receive an error in response to your attempt to create it. This means you need to be able to receive and complete the webhook *while* the POST request is in-flight (in other words, have a server that can handle requests asynchronously).  Invalid hostnames like localhost will recieve a 403 Forbidden status code.  ``` # Request curl -H \"Authorization: Bearer <personal_access_token>\" \\ -X POST https://app.asana.com/api/1.0/webhooks \\ -d \"resource=8675309\" \\ -d \"target=https://example.com/receive-webhook/7654\" ```  ``` # Handshake sent to https://example.com/ POST /receive-webhook/7654 X-Hook-Secret: b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81 ```  ``` # Handshake response sent by example.com HTTP/1.1 200 X-Hook-Secret: b537207f20cbfa02357cf448134da559e8bd39d61597dcd5631b8012eae53e81 ```  ``` # Response HTTP/1.1 201 {   \"data\": {     \"gid\": \"43214\",     \"resource\": {       \"gid\": \"8675309\",       \"name\": \"Bugs\"     },     \"target\": \"https://example.com/receive-webhook/7654\",     \"active\": false,     \"last_success_at\": null,     \"last_failure_at\": null,     \"last_failure_content\": null   } } ```
*
* createWebhookRequest CreateWebhookRequest The webhook workspace and target.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createWebhook_201_response
* */
const createWebhook = ({ createWebhookRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        createWebhookRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
* Delete a webhook
* This method *permanently* removes a webhook. Note that it may be possible to receive a request that was already in flight after deleting the webhook, but no further requests will be issued.
*
* webhookUnderscoregid String Globally unique identifier for the webhook.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns deleteAttachment_200_response
* */
const deleteWebhook = ({ webhookUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        webhookUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
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
* Get a webhook
* Returns the full record for the given webhook.
*
* webhookUnderscoregid String Globally unique identifier for the webhook.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createWebhook_201_response
* */
const getWebhook = ({ webhookUnderscoregid, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        webhookUnderscoregid,
        optUnderscorepretty,
        optUnderscorefields,
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
* Get multiple webhooks
* Get the compact representation of all webhooks your app has registered for the authenticated user in the given workspace.
*
* workspace String The workspace to query for webhooks in.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* limit Integer Results per page. The number of objects to return per page. The value must be between 1 and 100. (optional)
* offset String Offset token. An offset to the next page returned by the API. A pagination request will return an offset token, which can be used as an input parameter to the next request. If an offset is not passed in, the API will return the first page of results. 'Note: You can only pass in an offset that was returned to you via a previously paginated request.' (optional)
* resource String Only return webhooks for the given resource. (optional)
* returns getWebhooks_200_response
* */
const getWebhooks = ({ workspace, optUnderscorepretty, optUnderscorefields, limit, offset, resource }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        workspace,
        optUnderscorepretty,
        optUnderscorefields,
        limit,
        offset,
        resource,
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
* Update a webhook
* An existing webhook's filters can be updated by making a PUT request on the URL for that webhook. Note that the webhook's previous `filters` array will be completely overwritten by the `filters` sent in the PUT request.
*
* webhookUnderscoregid String Globally unique identifier for the webhook.
* updateWebhookRequest UpdateWebhookRequest The updated filters for the webhook.
* optUnderscorepretty Boolean Provides “pretty” output. Provides the response in a “pretty” format. In the case of JSON this means doing proper line breaking and indentation to make it readable. This will take extra time and increase the response size so it is advisable only to use this during debugging. (optional)
* optUnderscorefields List Defines fields to return. Some requests return *compact* representations of objects in order to conserve resources and complete the request more efficiently. Other times requests return more information than you may need. This option allows you to list the exact set of fields that the API should be sure to return for the objects. The field names should be provided as paths, described below. The id of included objects will always be returned, regardless of the field options. (optional)
* returns createWebhook_201_response
* */
const updateWebhook = ({ webhookUnderscoregid, updateWebhookRequest, optUnderscorepretty, optUnderscorefields }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        webhookUnderscoregid,
        updateWebhookRequest,
        optUnderscorepretty,
        optUnderscorefields,
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
  createWebhook,
  deleteWebhook,
  getWebhook,
  getWebhooks,
  updateWebhook,
};
