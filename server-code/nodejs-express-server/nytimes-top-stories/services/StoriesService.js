/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Top Stories
* The Top Stories API returns a list of articles and associated images currently on the specified section.  Support JSON and JSONP. 
*
* section String The section the story appears in.
* format String if this is JSONP or JSON
* callback String The name of the function the API call results will be passed to. Required when using JSONP. This parameter has only one valid value per section. The format is {section_name}TopStoriesCallback.  (optional)
* returns __section___format__get_200_response
* */
const section_formatGET = ({ section, format, callback }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        section,
        format,
        callback,
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
  section_formatGET,
};
