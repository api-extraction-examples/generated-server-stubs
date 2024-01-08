from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.publication_type import PublicationType
from openapi_server import util

from openapi_server.models.publication_type import PublicationType  # noqa: E501

class PublicationTypeSearchResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, items=None, items_per_page=None, total_results=None):  # noqa: E501
        """PublicationTypeSearchResult - a model defined in OpenAPI

        :param items: The items of this PublicationTypeSearchResult.  # noqa: E501
        :type items: List[PublicationType]
        :param items_per_page: The items_per_page of this PublicationTypeSearchResult.  # noqa: E501
        :type items_per_page: int
        :param total_results: The total_results of this PublicationTypeSearchResult.  # noqa: E501
        :type total_results: int
        """
        self.openapi_types = {
            'items': List[PublicationType],
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
    def from_dict(cls, dikt) -> 'PublicationTypeSearchResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PublicationTypeSearchResult of this PublicationTypeSearchResult.  # noqa: E501
        :rtype: PublicationTypeSearchResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def items(self) -> List[PublicationType]:
        """Gets the items of this PublicationTypeSearchResult.


        :return: The items of this PublicationTypeSearchResult.
        :rtype: List[PublicationType]
        """
        return self._items

    @items.setter
    def items(self, items: List[PublicationType]):
        """Sets the items of this PublicationTypeSearchResult.


        :param items: The items of this PublicationTypeSearchResult.
        :type items: List[PublicationType]
        """

        self._items = items

    @property
    def items_per_page(self) -> int:
        """Gets the items_per_page of this PublicationTypeSearchResult.


        :return: The items_per_page of this PublicationTypeSearchResult.
        :rtype: int
        """
        return self._items_per_page

    @items_per_page.setter
    def items_per_page(self, items_per_page: int):
        """Sets the items_per_page of this PublicationTypeSearchResult.


        :param items_per_page: The items_per_page of this PublicationTypeSearchResult.
        :type items_per_page: int
        """

        self._items_per_page = items_per_page

    @property
    def total_results(self) -> int:
        """Gets the total_results of this PublicationTypeSearchResult.


        :return: The total_results of this PublicationTypeSearchResult.
        :rtype: int
        """
        return self._total_results

    @total_results.setter
    def total_results(self, total_results: int):
        """Sets the total_results of this PublicationTypeSearchResult.


        :param total_results: The total_results of this PublicationTypeSearchResult.
        :type total_results: int
        """

        self._total_results = total_results