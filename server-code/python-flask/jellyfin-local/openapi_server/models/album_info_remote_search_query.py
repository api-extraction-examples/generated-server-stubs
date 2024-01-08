from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.album_info import AlbumInfo
from openapi_server import util

from openapi_server.models.album_info import AlbumInfo  # noqa: E501

class AlbumInfoRemoteSearchQuery(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, include_disabled_providers=None, item_id=None, search_info=None, search_provider_name=None):  # noqa: E501
        """AlbumInfoRemoteSearchQuery - a model defined in OpenAPI

        :param include_disabled_providers: The include_disabled_providers of this AlbumInfoRemoteSearchQuery.  # noqa: E501
        :type include_disabled_providers: bool
        :param item_id: The item_id of this AlbumInfoRemoteSearchQuery.  # noqa: E501
        :type item_id: str
        :param search_info: The search_info of this AlbumInfoRemoteSearchQuery.  # noqa: E501
        :type search_info: AlbumInfo
        :param search_provider_name: The search_provider_name of this AlbumInfoRemoteSearchQuery.  # noqa: E501
        :type search_provider_name: str
        """
        self.openapi_types = {
            'include_disabled_providers': bool,
            'item_id': str,
            'search_info': AlbumInfo,
            'search_provider_name': str
        }

        self.attribute_map = {
            'include_disabled_providers': 'IncludeDisabledProviders',
            'item_id': 'ItemId',
            'search_info': 'SearchInfo',
            'search_provider_name': 'SearchProviderName'
        }

        self._include_disabled_providers = include_disabled_providers
        self._item_id = item_id
        self._search_info = search_info
        self._search_provider_name = search_provider_name

    @classmethod
    def from_dict(cls, dikt) -> 'AlbumInfoRemoteSearchQuery':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AlbumInfoRemoteSearchQuery of this AlbumInfoRemoteSearchQuery.  # noqa: E501
        :rtype: AlbumInfoRemoteSearchQuery
        """
        return util.deserialize_model(dikt, cls)

    @property
    def include_disabled_providers(self) -> bool:
        """Gets the include_disabled_providers of this AlbumInfoRemoteSearchQuery.

        Gets or sets a value indicating whether disabled providers should be included.  # noqa: E501

        :return: The include_disabled_providers of this AlbumInfoRemoteSearchQuery.
        :rtype: bool
        """
        return self._include_disabled_providers

    @include_disabled_providers.setter
    def include_disabled_providers(self, include_disabled_providers: bool):
        """Sets the include_disabled_providers of this AlbumInfoRemoteSearchQuery.

        Gets or sets a value indicating whether disabled providers should be included.  # noqa: E501

        :param include_disabled_providers: The include_disabled_providers of this AlbumInfoRemoteSearchQuery.
        :type include_disabled_providers: bool
        """

        self._include_disabled_providers = include_disabled_providers

    @property
    def item_id(self) -> str:
        """Gets the item_id of this AlbumInfoRemoteSearchQuery.


        :return: The item_id of this AlbumInfoRemoteSearchQuery.
        :rtype: str
        """
        return self._item_id

    @item_id.setter
    def item_id(self, item_id: str):
        """Sets the item_id of this AlbumInfoRemoteSearchQuery.


        :param item_id: The item_id of this AlbumInfoRemoteSearchQuery.
        :type item_id: str
        """

        self._item_id = item_id

    @property
    def search_info(self) -> AlbumInfo:
        """Gets the search_info of this AlbumInfoRemoteSearchQuery.


        :return: The search_info of this AlbumInfoRemoteSearchQuery.
        :rtype: AlbumInfo
        """
        return self._search_info

    @search_info.setter
    def search_info(self, search_info: AlbumInfo):
        """Sets the search_info of this AlbumInfoRemoteSearchQuery.


        :param search_info: The search_info of this AlbumInfoRemoteSearchQuery.
        :type search_info: AlbumInfo
        """

        self._search_info = search_info

    @property
    def search_provider_name(self) -> str:
        """Gets the search_provider_name of this AlbumInfoRemoteSearchQuery.

        Will only search within the given provider when set.  # noqa: E501

        :return: The search_provider_name of this AlbumInfoRemoteSearchQuery.
        :rtype: str
        """
        return self._search_provider_name

    @search_provider_name.setter
    def search_provider_name(self, search_provider_name: str):
        """Sets the search_provider_name of this AlbumInfoRemoteSearchQuery.

        Will only search within the given provider when set.  # noqa: E501

        :param search_provider_name: The search_provider_name of this AlbumInfoRemoteSearchQuery.
        :type search_provider_name: str
        """

        self._search_provider_name = search_provider_name
