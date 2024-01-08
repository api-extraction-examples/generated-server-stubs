from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SearchArticlesQueryQueryGet200Response(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, articles=None, search_query=None):  # noqa: E501
        """SearchArticlesQueryQueryGet200Response - a model defined in OpenAPI

        :param articles: The articles of this SearchArticlesQueryQueryGet200Response.  # noqa: E501
        :type articles: List[str]
        :param search_query: The search_query of this SearchArticlesQueryQueryGet200Response.  # noqa: E501
        :type search_query: str
        """
        self.openapi_types = {
            'articles': List[str],
            'search_query': str
        }

        self.attribute_map = {
            'articles': 'articles',
            'search_query': 'search_query'
        }

        self._articles = articles
        self._search_query = search_query

    @classmethod
    def from_dict(cls, dikt) -> 'SearchArticlesQueryQueryGet200Response':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The _search_articles_query__query__get_200_response of this SearchArticlesQueryQueryGet200Response.  # noqa: E501
        :rtype: SearchArticlesQueryQueryGet200Response
        """
        return util.deserialize_model(dikt, cls)

    @property
    def articles(self) -> List[str]:
        """Gets the articles of this SearchArticlesQueryQueryGet200Response.


        :return: The articles of this SearchArticlesQueryQueryGet200Response.
        :rtype: List[str]
        """
        return self._articles

    @articles.setter
    def articles(self, articles: List[str]):
        """Sets the articles of this SearchArticlesQueryQueryGet200Response.


        :param articles: The articles of this SearchArticlesQueryQueryGet200Response.
        :type articles: List[str]
        """

        self._articles = articles

    @property
    def search_query(self) -> str:
        """Gets the search_query of this SearchArticlesQueryQueryGet200Response.


        :return: The search_query of this SearchArticlesQueryQueryGet200Response.
        :rtype: str
        """
        return self._search_query

    @search_query.setter
    def search_query(self, search_query: str):
        """Sets the search_query of this SearchArticlesQueryQueryGet200Response.


        :param search_query: The search_query of this SearchArticlesQueryQueryGet200Response.
        :type search_query: str
        """

        self._search_query = search_query
