from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.connection_collection_item import ConnectionCollectionItem
from openapi_server import util

from openapi_server.models.connection_collection_item import ConnectionCollectionItem  # noqa: E501

class ConnectionCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_entries=None, connections=None):  # noqa: E501
        """ConnectionCollection - a model defined in OpenAPI

        :param total_entries: The total_entries of this ConnectionCollection.  # noqa: E501
        :type total_entries: int
        :param connections: The connections of this ConnectionCollection.  # noqa: E501
        :type connections: List[ConnectionCollectionItem]
        """
        self.openapi_types = {
            'total_entries': int,
            'connections': List[ConnectionCollectionItem]
        }

        self.attribute_map = {
            'total_entries': 'total_entries',
            'connections': 'connections'
        }

        self._total_entries = total_entries
        self._connections = connections

    @classmethod
    def from_dict(cls, dikt) -> 'ConnectionCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConnectionCollection of this ConnectionCollection.  # noqa: E501
        :rtype: ConnectionCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_entries(self) -> int:
        """Gets the total_entries of this ConnectionCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :return: The total_entries of this ConnectionCollection.
        :rtype: int
        """
        return self._total_entries

    @total_entries.setter
    def total_entries(self, total_entries: int):
        """Sets the total_entries of this ConnectionCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :param total_entries: The total_entries of this ConnectionCollection.
        :type total_entries: int
        """

        self._total_entries = total_entries

    @property
    def connections(self) -> List[ConnectionCollectionItem]:
        """Gets the connections of this ConnectionCollection.


        :return: The connections of this ConnectionCollection.
        :rtype: List[ConnectionCollectionItem]
        """
        return self._connections

    @connections.setter
    def connections(self, connections: List[ConnectionCollectionItem]):
        """Sets the connections of this ConnectionCollection.


        :param connections: The connections of this ConnectionCollection.
        :type connections: List[ConnectionCollectionItem]
        """

        self._connections = connections
