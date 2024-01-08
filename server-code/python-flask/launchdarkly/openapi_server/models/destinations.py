from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.destination import Destination
from openapi_server.models.links import Links
from openapi_server import util

from openapi_server.models.destination import Destination  # noqa: E501
from openapi_server.models.links import Links  # noqa: E501

class Destinations(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, links=None, items=None):  # noqa: E501
        """Destinations - a model defined in OpenAPI

        :param links: The links of this Destinations.  # noqa: E501
        :type links: Links
        :param items: The items of this Destinations.  # noqa: E501
        :type items: List[Destination]
        """
        self.openapi_types = {
            'links': Links,
            'items': List[Destination]
        }

        self.attribute_map = {
            'links': '_links',
            'items': 'items'
        }

        self._links = links
        self._items = items

    @classmethod
    def from_dict(cls, dikt) -> 'Destinations':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Destinations of this Destinations.  # noqa: E501
        :rtype: Destinations
        """
        return util.deserialize_model(dikt, cls)

    @property
    def links(self) -> Links:
        """Gets the links of this Destinations.


        :return: The links of this Destinations.
        :rtype: Links
        """
        return self._links

    @links.setter
    def links(self, links: Links):
        """Sets the links of this Destinations.


        :param links: The links of this Destinations.
        :type links: Links
        """

        self._links = links

    @property
    def items(self) -> List[Destination]:
        """Gets the items of this Destinations.


        :return: The items of this Destinations.
        :rtype: List[Destination]
        """
        return self._items

    @items.setter
    def items(self, items: List[Destination]):
        """Sets the items of this Destinations.


        :param items: The items of this Destinations.
        :type items: List[Destination]
        """

        self._items = items
