from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.stage_summary import StageSummary
from openapi_server import util

from openapi_server.models.stage_summary import StageSummary  # noqa: E501

class StageSummarySearchResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None, items_per_page=None, total_results=None):  # noqa: E501
        """StageSummarySearchResult - a model defined in OpenAPI

        :param items: The items of this StageSummarySearchResult.  # noqa: E501
        :type items: List[StageSummary]
        :param items_per_page: The items_per_page of this StageSummarySearchResult.  # noqa: E501
        :type items_per_page: int
        :param total_results: The total_results of this StageSummarySearchResult.  # noqa: E501
        :type total_results: int
        """
        self.openapi_types = {
            'items': List[StageSummary],
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
    def from_dict(cls, dikt) -> 'StageSummarySearchResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The StageSummarySearchResult of this StageSummarySearchResult.  # noqa: E501
        :rtype: StageSummarySearchResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[StageSummary]:
        """Gets the items of this StageSummarySearchResult.


        :return: The items of this StageSummarySearchResult.
        :rtype: List[StageSummary]
        """
        return self._items

    @items.setter
    def items(self, items: List[StageSummary]):
        """Sets the items of this StageSummarySearchResult.


        :param items: The items of this StageSummarySearchResult.
        :type items: List[StageSummary]
        """

        self._items = items

    @property
    def items_per_page(self) -> int:
        """Gets the items_per_page of this StageSummarySearchResult.


        :return: The items_per_page of this StageSummarySearchResult.
        :rtype: int
        """
        return self._items_per_page

    @items_per_page.setter
    def items_per_page(self, items_per_page: int):
        """Sets the items_per_page of this StageSummarySearchResult.


        :param items_per_page: The items_per_page of this StageSummarySearchResult.
        :type items_per_page: int
        """

        self._items_per_page = items_per_page

    @property
    def total_results(self) -> int:
        """Gets the total_results of this StageSummarySearchResult.


        :return: The total_results of this StageSummarySearchResult.
        :rtype: int
        """
        return self._total_results

    @total_results.setter
    def total_results(self, total_results: int):
        """Sets the total_results of this StageSummarySearchResult.


        :param total_results: The total_results of this StageSummarySearchResult.
        :type total_results: int
        """

        self._total_results = total_results