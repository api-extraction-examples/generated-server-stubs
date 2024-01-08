from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.news_articles_summary import NewsArticlesSummary
from openapi_server import util

from openapi_server.models.news_articles_summary import NewsArticlesSummary  # noqa: E501

class NewsArticlesSummarySearchResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None, items_per_page=None, total_results=None):  # noqa: E501
        """NewsArticlesSummarySearchResult - a model defined in OpenAPI

        :param items: The items of this NewsArticlesSummarySearchResult.  # noqa: E501
        :type items: List[NewsArticlesSummary]
        :param items_per_page: The items_per_page of this NewsArticlesSummarySearchResult.  # noqa: E501
        :type items_per_page: int
        :param total_results: The total_results of this NewsArticlesSummarySearchResult.  # noqa: E501
        :type total_results: int
        """
        self.openapi_types = {
            'items': List[NewsArticlesSummary],
            'items_per_page': int,
            'total_results': int
        }

        self.attribute_map = {
            'items': 'items',
            'items_per_page': 'itemsPerPage',
            'total_results': 'totalResults'
        }

        self._items = items
        self._items_per_page = items_per_page
        self._total_results = total_results

    @classmethod
    def from_dict(cls, dikt) -> 'NewsArticlesSummarySearchResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NewsArticlesSummarySearchResult of this NewsArticlesSummarySearchResult.  # noqa: E501
        :rtype: NewsArticlesSummarySearchResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[NewsArticlesSummary]:
        """Gets the items of this NewsArticlesSummarySearchResult.


        :return: The items of this NewsArticlesSummarySearchResult.
        :rtype: List[NewsArticlesSummary]
        """
        return self._items

    @items.setter
    def items(self, items: List[NewsArticlesSummary]):
        """Sets the items of this NewsArticlesSummarySearchResult.


        :param items: The items of this NewsArticlesSummarySearchResult.
        :type items: List[NewsArticlesSummary]
        """

        self._items = items

    @property
    def items_per_page(self) -> int:
        """Gets the items_per_page of this NewsArticlesSummarySearchResult.


        :return: The items_per_page of this NewsArticlesSummarySearchResult.
        :rtype: int
        """
        return self._items_per_page

    @items_per_page.setter
    def items_per_page(self, items_per_page: int):
        """Sets the items_per_page of this NewsArticlesSummarySearchResult.


        :param items_per_page: The items_per_page of this NewsArticlesSummarySearchResult.
        :type items_per_page: int
        """

        self._items_per_page = items_per_page

    @property
    def total_results(self) -> int:
        """Gets the total_results of this NewsArticlesSummarySearchResult.


        :return: The total_results of this NewsArticlesSummarySearchResult.
        :rtype: int
        """
        return self._total_results

    @total_results.setter
    def total_results(self, total_results: int):
        """Sets the total_results of this NewsArticlesSummarySearchResult.


        :param total_results: The total_results of this NewsArticlesSummarySearchResult.
        :type total_results: int
        """

        self._total_results = total_results
