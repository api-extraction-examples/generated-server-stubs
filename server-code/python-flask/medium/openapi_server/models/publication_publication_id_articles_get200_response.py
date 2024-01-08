from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PublicationPublicationIdArticlesGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, publication_articles=None):  # noqa: E501
        """PublicationPublicationIdArticlesGet200Response - a model defined in OpenAPI

        :param publication_articles: The publication_articles of this PublicationPublicationIdArticlesGet200Response.  # noqa: E501
        :type publication_articles: List[str]
        """
        self.openapi_types = {
            'publication_articles': List[str]
        }

        self.attribute_map = {
            'publication_articles': 'publication_articles'
        }

        self._publication_articles = publication_articles

    @classmethod
    def from_dict(cls, dikt) -> 'PublicationPublicationIdArticlesGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _publication__publication_id__articles_get_200_response of this PublicationPublicationIdArticlesGet200Response.  # noqa: E501
        :rtype: PublicationPublicationIdArticlesGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def publication_articles(self) -> List[str]:
        """Gets the publication_articles of this PublicationPublicationIdArticlesGet200Response.


        :return: The publication_articles of this PublicationPublicationIdArticlesGet200Response.
        :rtype: List[str]
        """
        return self._publication_articles

    @publication_articles.setter
    def publication_articles(self, publication_articles: List[str]):
        """Sets the publication_articles of this PublicationPublicationIdArticlesGet200Response.


        :param publication_articles: The publication_articles of this PublicationPublicationIdArticlesGet200Response.
        :type publication_articles: List[str]
        """

        self._publication_articles = publication_articles
