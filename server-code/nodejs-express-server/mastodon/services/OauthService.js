/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Displays an authorization form to the user. If approved, it will create and return an authorization code, then redirect to the desired redirect_uri, or show the authorization code if urn:ietf:wg:oauth:2.0:oob was requested. The authorization code can be used while requesting a token to obtain access to user-level methods.
*
* responseUnderscoretype String Should be set equal to code.
* clientUnderscoreid String Client ID, obtained during app registration.
* redirectUnderscoreuri String Set a URI to redirect the user to. If this parameter is set to urn:ietf:wg:oauth:2.0:oob then the authorization code will be shown instead. Must match one of the redirect URIs declared during app registration.
* scope String List of requested OAuth scopes, separated by spaces (or by pluses, if using query parameters). Must be a subset of scopes declared during app registration. If not provided, defaults to read. (optional)
* forceUnderscorelogin Boolean Added in 2.6.0. Forces the user to re-login, which is necessary for authorizing with multiple accounts from the same instance. (optional)
* no response value expected for this operation
* */
const oauthAuthorizeGET = ({ responseUnderscoretype, clientUnderscoreid, redirectUnderscoreuri, scope, forceUnderscorelogin }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        responseUnderscoretype,
        clientUnderscoreid,
        redirectUnderscoreuri,
        scope,
        forceUnderscorelogin,
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
* Revoke an access token to make it no longer valid for use.
*
* oauthRevokePostRequest OauthRevokePostRequest  (optional)
* no response value expected for this operation
* */
const oauthRevokePOST = ({ oauthRevokePostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        oauthRevokePostRequest,
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
* Returns an access token, to be used during API calls that are not public.
*
* oauthTokenPostRequest OauthTokenPostRequest  (optional)
* returns _oauth_token_post_200_response
* */
const oauthTokenPOST = ({ oauthTokenPostRequest }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        oauthTokenPostRequest,
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
  oauthAuthorizeGET,
  oauthRevokePOST,
  oauthTokenPOST,
};
