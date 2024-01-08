/* eslint-disable no-unused-vars */
const Service = require('./Service');

/**
* Get Publication ID
* Returns the unique `publication_id` for the given `publication_slug`.  **Note:** You can find the `publication_slug` from the publication's homepage URL. - medium.com/_**publication_slug** 
*
* publicationUnderscoreslug String It's a lowercased hyphen-separated unique string alloted to each Medium Publication.
* returns _publication_id_for__publication_slug__get_200_response
* */
const publicationIdForPublicationSlugGET = ({ publicationUnderscoreslug }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        publicationUnderscoreslug,
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
* Get Publication Articles
* Returns the list of `articles_ids`, of the latest 25 articles, posted in that publication. 
*
* publicationUnderscoreid String It's a unique hash id assigned to every Medium Publication.
* from String To get the articles before specified date and time. (optional)
* returns _publication__publication_id__articles_get_200_response
* */
const publicationPublicationIdArticlesGET = ({ publicationUnderscoreid, from }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        publicationUnderscoreid,
        from,
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
* Get Publication Info
* Returns the publication related information such as *Publication name, Tagline, Description, Tags, Followers Count, Twitter username, Instagram username, Facebook Page name, etc …*  **Note:** If you don't know the `publication_id`, you can get it from any article published by it. Use endpoint \"/article/{article_id}\" to retrieve the `publication_id`. 
*
* publicationUnderscoreid String It's a unique hash id assigned to every Medium Publication.
* returns _publication__publication_id__get_200_response
* */
const publicationPublicationIdGET = ({ publicationUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        publicationUnderscoreid,
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
* Get Publication Newsletter
* Returns the newsletter related information such as *id, name, description, slug, creator_id, subscribers, image_url, etc …*  **Note:** If you don't know the `publication_id`, you can get it from any article published by it. Use endpoint \"/article/{article_id}\" to retrieve the `publication_id`. 
*
* publicationUnderscoreid String It's a unique hash id assigned to every Medium Publication.
* returns _publication__publication_id__newsletter_get_200_response
* */
const publicationPublicationIdNewsletterGET = ({ publicationUnderscoreid }) => new Promise(
  async (resolve, reject) => {
    try {
      resolve(Service.successResponse({
        publicationUnderscoreid,
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
  publicationIdForPublicationSlugGET,
  publicationPublicationIdArticlesGET,
  publicationPublicationIdGET,
  publicationPublicationIdNewsletterGET,
};
