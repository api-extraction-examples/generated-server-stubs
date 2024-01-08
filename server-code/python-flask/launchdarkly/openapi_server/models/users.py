from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.links import Links
from openapi_server.models.user_record import UserRecord
from openapi_server import util

from openapi_server.models.links import Links  # noqa: E501
from openapi_server.models.user_record import UserRecord  # noqa: E501

class Users(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, items=None, total_count=None):  # noqa: E501
        """Users - a model defined in OpenAPI

        :param links: The links of this Users.  # noqa: E501
        :type links: Links
        :param items: The items of this Users.  # noqa: E501
        :type items: List[UserRecord]
        :param total_count: The total_count of this Users.  # noqa: E501
        :type total_count: float
        """
        self.openapi_types = {
            'links': Links,
            'items': List[UserRecord],
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
    def from_dict(cls, dikt) -> 'Users':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Users of this Users.  # noqa: E501
        :rtype: Users
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this Users.


        :return: The links of this Users.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this Users.


        :param links: The links of this Users.
        :type links: Links
        """

        self._links = links

    @property
    def items(self) -> List[UserRecord]:
        """Gets the items of this Users.


        :return: The items of this Users.
        :rtype: List[UserRecord]
        """
        return self._items

    @items.setter
    def items(self, items: List[UserRecord]):
        """Sets the items of this Users.


        :param items: The items of this Users.
        :type items: List[UserRecord]
        """

        self._items = items

    @property
    def total_count(self) -> float:
        """Gets the total_count of this Users.


        :return: The total_count of this Users.
        :rtype: float
        """
        return self._total_count

    @total_count.setter
    def total_count(self, total_count: float):
        """Sets the total_count of this Users.


        :param total_count: The total_count of this Users.
        :type total_count: float
        """

        self._total_count = total_count