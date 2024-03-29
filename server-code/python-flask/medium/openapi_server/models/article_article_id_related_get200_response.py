from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ArticleArticleIdRelatedGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, id=None, related_articles=None):  # noqa: E501
        """ArticleArticleIdRelatedGet200Response - a model defined in OpenAPI

        :param id: The id of this ArticleArticleIdRelatedGet200Response.  # noqa: E501
        :type id: str
        :param related_articles: The related_articles of this ArticleArticleIdRelatedGet200Response.  # noqa: E501
        :type related_articles: List[str]
        """
        self.openapi_types = {
            'id': str,
            'related_articles': List[str]
        }

        self.attribute_map = {
            'id': 'id',
            'related_articles': 'related_articles'
        }

        self._id = id
        self._related_articles = related_articles

    @classmethod
    def from_dict(cls, dikt) -> 'ArticleArticleIdRelatedGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _article__article_id__related_get_200_response of this ArticleArticleIdRelatedGet200Response.  # noqa: E501
        :rtype: ArticleArticleIdRelatedGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def id(self) -> str:
        """Gets the id of this ArticleArticleIdRelatedGet200Response.


        :return: The id of this ArticleArticleIdRelatedGet200Response.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this ArticleArticleIdRelatedGet200Response.


        :param id: The id of this ArticleArticleIdRelatedGet200Response.
        :type id: str
        """

        self._id = id

    @property
    def related_articles(self) -> List[str]:
        """Gets the related_articles of this ArticleArticleIdRelatedGet200Response.


        :return: The related_articles of this ArticleArticleIdRelatedGet200Response.
        :rtype: List[str]
        """
        return self._related_articles

    @related_articles.setter
    def related_articles(self, related_articles: List[str]):
        """Sets the related_articles of this ArticleArticleIdRelatedGet200Response.


        :param related_articles: The related_articles of this ArticleArticleIdRelatedGet200Response.
        :type related_articles: List[str]
        """

        self._related_articles = related_articles
