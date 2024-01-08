/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Favourite Episode or Clip
* Remove User favourite 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio favourite types: Clips or Episodes
* pid String pid
* returns PersonalisedRadioSuccessResponse
* */
const deletePersonalisedRadioByActivityTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
* Followed Brand or Series
* Remove 'brand' or 'series' items from a users iPlayer Radio follows 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio follows types: Brands or Series
* pid String pid
* returns PersonalisedRadioSuccessResponse
* */
const deletePersonalisedRadioFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
* Favourite Episode or Clip
* Check to see if a single clip or episode entity is in a users favourites - determines UX of add button.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio favourite types: Clips or Episodes
* pid String pid
* showUnderscoreallUnderscoreactivity Boolean Include items which have been 'soft' unfavourited in response. I.e items with UAS type of 'unfavourited' (optional)
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioByActivityTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid, showUnderscoreallUnderscoreactivity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
        showUnderscoreallUnderscoreactivity,
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
* Favourite Episodes and Clips
* List of favourited episodes and clips for a given user for iPlayer Radio.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* sort String Sort order for Personalised Radio results (optional)
* showUnderscoreallUnderscoreactivity Boolean Include items which have been 'soft' unfavourited in response. I.e items with UAS type of 'unfavourited' (optional)
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioFavourites = ({ authorization, xAuthenticationProvider, xAPIKey, offset, limit, sort, showUnderscoreallUnderscoreactivity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        offset,
        limit,
        sort,
        showUnderscoreallUnderscoreactivity,
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
* Favourite Episodes and Clips by Type
* List of followed 'clips' or 'episode' items for a given iPlayer Radio user  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio favourite types: Clips or Episodes
* sort String Sort order for Personalised Radio results (optional)
* showUnderscoreallUnderscoreactivity Boolean Include items which have been 'soft' unfavourited in response. I.e items with UAS type of 'unfavourited' (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioFavouritesByType = ({ authorization, xAuthenticationProvider, xAPIKey, type, sort, showUnderscoreallUnderscoreactivity, offset, limit }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        sort,
        showUnderscoreallUnderscoreactivity,
        offset,
        limit,
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
* Followed Brands and Series
* List of favourited brands and series for a given user for iPlayer Radio.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* sort String Sort order for Personalised Radio results (optional)
* showUnderscoreallUnderscoreactivity Boolean Include items which have been 'soft' unfollowed in response. I.e items with UAS type of 'unfollowed' (optional)
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioFollows = ({ authorization, xAuthenticationProvider, xAPIKey, offset, limit, sort, showUnderscoreallUnderscoreactivity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        offset,
        limit,
        sort,
        showUnderscoreallUnderscoreactivity,
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
* Followed Brands or Series by Type
* List of followed 'brand' or 'series' items for a given iPlayer Radio user  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio follows types: Brands or Series
* sort String Sort order for Personalised Radio results (optional)
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* showUnderscoreallUnderscoreactivity Boolean Include items which have been 'soft' unfollowed in response. I.e items with UAS type of 'unfollowed' (optional)
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioFollowsByType = ({ authorization, xAuthenticationProvider, xAPIKey, type, sort, offset, limit, showUnderscoreallUnderscoreactivity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        sort,
        offset,
        limit,
        showUnderscoreallUnderscoreactivity,
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
* Followed Brand or Series
* Check to see if a single brand or series entity is in a users follows - determines UX of add button. 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio follows types: Brands or Series
* pid String pid
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
* Played Episode or Clip
* Returns mixed episode and clip plays for a given BBC iPlayer radio user.  N.B.  Swagger schemas cannot currently handle multiple combinations of object in an array i.e. a mix of Episode and Clip Summaries so we are defining data as a Programme Summary here.  This will be resolved in V3 with full support for  anyOf https://www.openapis.org/blog/2017/01/24/a-new-year-a-new-specification 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* offset Integer Paginated results offset (optional)
* limit Integer Paginated results limit (optional)
* sort String Sort order for Personalised Radio results (optional)
* showUnderscoreallUnderscoreactivity Boolean Include expired/unavailable items (optional)
* returns PersonalisedRadioResponse
* */
const getPersonalisedRadioPlays = ({ authorization, xAuthenticationProvider, xAPIKey, offset, limit, sort, showUnderscoreallUnderscoreactivity }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        offset,
        limit,
        sort,
        showUnderscoreallUnderscoreactivity,
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
* Favourite Episodes and Clips
* Add User favourites  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action favourited or unfavourited
* returns PersonalisedRadioSuccessResponse
* */
const postPersonalisedRadioBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
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
* Favourite Episode or Clip
* Add User favourite  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio favourite types: Clips or Episodes
* pid String pid
* body PersonalisedRadioRequest Action favourited or unfavourited
* returns PersonalisedRadioSuccessResponse
* */
const postPersonalisedRadioByActivityTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
* Followed Brands and Series
* Add 'brand' or 'series' items to a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action followed or unfollowed
* returns PersonalisedRadioSuccessResponse
* */
const postPersonalisedRadioFollowsBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
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
* Followed Brand or Series
* Add 'brand' or 'series' items from a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio follows types: Brands or Series
* pid String pid
* body PersonalisedRadioRequest Action followed or unfollowed
* returns PersonalisedRadioSuccessResponse
* */
const postPersonalisedRadioFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
* Favourite Episodes and Clips
* Update user favourites  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action favourited or unfavourited
* returns PersonalisedRadioSuccessResponse
* */
const putPersonalisedRadioBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
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
* Favourite Episode or Clip
* Update user favourite  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio favourite types: Clips or Episodes
* pid String pid
* body PersonalisedRadioRequest Action favourited or unfavourited
* returns PersonalisedRadioSuccessResponse
* */
const putPersonalisedRadioByActivityTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
* Followed Brands and Series
* Update 'brands' or 'series' items from a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* body List Action followed or unfollowed
* returns PersonalisedRadioSuccessResponse
* */
const putPersonalisedRadioFollowsBatch = ({ authorization, xAuthenticationProvider, xAPIKey, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
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
* Followed Brand or Series
* Update 'brand' or 'series' items from a users iPlayer Radio follows  N.B. Any HTML tags submitted in metadata will be removed 
*
* authorization String Bearer OAUTH_TOKEN
* xAuthenticationProvider String Authentication type
* xAPIKey String API_KEY
* type String Supported Radio follows types: Brands or Series
* pid String pid
* body PersonalisedRadioRequest Action followed or unfollowed
* returns PersonalisedRadioSuccessResponse
* */
const putPersonalisedRadioFollowsByTypeById = ({ authorization, xAuthenticationProvider, xAPIKey, type, pid, body }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        authorization,
        xAuthenticationProvider,
        xAPIKey,
        type,
        pid,
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
  deletePersonalisedRadioByActivityTypeById,
  deletePersonalisedRadioFollowsByTypeById,
  getPersonalisedRadioByActivityTypeById,
  getPersonalisedRadioFavourites,
  getPersonalisedRadioFavouritesByType,
  getPersonalisedRadioFollows,
  getPersonalisedRadioFollowsByType,
  getPersonalisedRadioFollowsByTypeById,
  getPersonalisedRadioPlays,
  postPersonalisedRadioBatch,
  postPersonalisedRadioByActivityTypeById,
  postPersonalisedRadioFollowsBatch,
  postPersonalisedRadioFollowsByTypeById,
  putPersonalisedRadioBatch,
  putPersonalisedRadioByActivityTypeById,
  putPersonalisedRadioFollowsBatch,
  putPersonalisedRadioFollowsByTypeById,
};
