from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_role import CustomRole
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.custom_role import CustomRole  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501

class CustomRoles(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, items=None):  # noqa: E501
        """CustomRoles - a model defined in OpenAPI

        :param links: The links of this CustomRoles.  # noqa: E501
        :type links: Links
        :param items: The items of this CustomRoles.  # noqa: E501
        :type items: List[CustomRole]
        """
        self.openapi_types = {
            'links': Links,
            'items': List[CustomRole]
        }

        self.attribute_map = {
            'links': '_links',
            'items': 'items'
        }

        self._links = links
        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'CustomRoles':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomRoles of this CustomRoles.  # noqa: E501
        :rtype: CustomRoles
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this CustomRoles.


        :return: The links of this CustomRoles.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this CustomRoles.


        :param links: The links of this CustomRoles.
        :type links: Links
        """

        self._links = links

    @property
    def items(self) -> List[CustomRole]:
        """Gets the items of this CustomRoles.


        :return: The items of this CustomRoles.
        :rtype: List[CustomRole]
        """
        return self._items

    @items.setter
    def items(self, items: List[CustomRole]):
        """Sets the items of this CustomRoles.


        :param items: The items of this CustomRoles.
        :type items: List[CustomRole]
        """

        self._items = items
