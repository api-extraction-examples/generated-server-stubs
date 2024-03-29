from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.feature_flag import FeatureFlag
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.feature_flag import FeatureFlag  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501

class FeatureFlags(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, items=None, total_count=None):  # noqa: E501
        """FeatureFlags - a model defined in OpenAPI

        :param links: The links of this FeatureFlags.  # noqa: E501
        :type links: Links
        :param items: The items of this FeatureFlags.  # noqa: E501
        :type items: List[FeatureFlag]
        :param total_count: The total_count of this FeatureFlags.  # noqa: E501
        :type total_count: float
        """
        self.openapi_types = {
            'links': Links,
            'items': List[FeatureFlag],
            'total_count': float
        }

        self.attribute_map = {
            'links': '_links',
            'items': 'items',
            'total_count': 'totalCount'
        }

        self._links = links
        self._items = items
        self._total_count = total_count

    @classmethod
    def from_dict(cls, dikt) -> 'FeatureFlags':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FeatureFlags of this FeatureFlags.  # noqa: E501
        :rtype: FeatureFlags
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this FeatureFlags.


        :return: The links of this FeatureFlags.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this FeatureFlags.


        :param links: The links of this FeatureFlags.
        :type links: Links
        """

        self._links = links

    @property
    def items(self) -> List[FeatureFlag]:
        """Gets the items of this FeatureFlags.


        :return: The items of this FeatureFlags.
        :rtype: List[FeatureFlag]
        """
        return self._items

    @items.setter
    def items(self, items: List[FeatureFlag]):
        """Sets the items of this FeatureFlags.


        :param items: The items of this FeatureFlags.
        :type items: List[FeatureFlag]
        """

        self._items = items

    @property
    def total_count(self) -> float:
        """Gets the total_count of this FeatureFlags.


        :return: The total_count of this FeatureFlags.
        :rtype: float
        """
        return self._total_count

    @total_count.setter
    def total_count(self, total_count: float):
        """Sets the total_count of this FeatureFlags.


        :param total_count: The total_count of this FeatureFlags.
        :type total_count: float
        """

        self._total_count = total_count
