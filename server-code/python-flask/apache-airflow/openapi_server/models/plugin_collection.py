from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.plugin_collection_item import PluginCollectionItem
from openapi_server import util

from openapi_server.models.plugin_collection_item import PluginCollectionItem  # noqa: E501

class PluginCollection(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, total_entries=None, plugins=None):  # noqa: E501
        """PluginCollection - a model defined in OpenAPI

        :param total_entries: The total_entries of this PluginCollection.  # noqa: E501
        :type total_entries: int
        :param plugins: The plugins of this PluginCollection.  # noqa: E501
        :type plugins: List[PluginCollectionItem]
        """
        self.openapi_types = {
            'total_entries': int,
            'plugins': List[PluginCollectionItem]
        }

        self.attribute_map = {
            'total_entries': 'total_entries',
            'plugins': 'plugins'
        }

        self._total_entries = total_entries
        self._plugins = plugins

    @classmethod
    def from_dict(cls, dikt) -> 'PluginCollection':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PluginCollection of this PluginCollection.  # noqa: E501
        :rtype: PluginCollection
        """
        return util.deserialize_model(dikt, cls)

    @property
    def total_entries(self) -> int:
        """Gets the total_entries of this PluginCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :return: The total_entries of this PluginCollection.
        :rtype: int
        """
        return self._total_entries

    @total_entries.setter
    def total_entries(self, total_entries: int):
        """Sets the total_entries of this PluginCollection.

        Count of total objects in the current result set before pagination parameters (limit, offset) are applied.   # noqa: E501

        :param total_entries: The total_entries of this PluginCollection.
        :type total_entries: int
        """

        self._total_entries = total_entries

    @property
    def plugins(self) -> List[PluginCollectionItem]:
        """Gets the plugins of this PluginCollection.


        :return: The plugins of this PluginCollection.
        :rtype: List[PluginCollectionItem]
        """
        return self._plugins

    @plugins.setter
    def plugins(self, plugins: List[PluginCollectionItem]):
        """Sets the plugins of this PluginCollection.


        :param plugins: The plugins of this PluginCollection.
        :type plugins: List[PluginCollectionItem]
        """

        self._plugins = plugins